package com.todestrieb.jdetailedpane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Todestrieb
 */
public class JDetailedPane {

    private final static String LINEBREAK = System.getProperty("line.separator");

    /**
     * Shows a detailed error dialog.
     *
     * @param title Dialog title
     * @param message Text or message shown in the dialog
     * @param details Text or message shown when "Show details" check box is
     * checked
     */
    public static void showErrorDialog(String title, String message, String details) {
        final JTextArea textPane = new JTextArea();

        textPane.setForeground(Color.LIGHT_GRAY);
        textPane.setBackground(Color.BLACK);

        textPane.setText(LINEBREAK + details + LINEBREAK);
        textPane.setEditable(false);

        final JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setAlignmentX(0);

        final JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        final JDialog dialog = new JOptionPane(
                content,
                JOptionPane.ERROR_MESSAGE,
                JOptionPane.DEFAULT_OPTION).createDialog(null, title);

        JLabel text = new JLabel(message);
        text.setBorder(new EmptyBorder(10, 10, 10, 10));
        text.setAlignmentX(0);
        Dimension labelSize = text.getPreferredSize();
        labelSize.setSize(300, labelSize.height);
        text.setPreferredSize(labelSize);
        content.add(text);

        JCheckBox cb = new JCheckBox(new AbstractAction() {

            private static final long serialVersionUID = 1L;

            {
                this.putValue(Action.SELECTED_KEY, false);
                this.putValue(Action.NAME, "Show details");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Boolean) this.getValue(Action.SELECTED_KEY)) {
                    content.add(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                } else {
                    content.remove(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                }
                content.invalidate();
                dialog.invalidate();
                dialog.pack();
            }
        });
        content.add(cb);

        dialog.setResizable(false);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

    /**
     * Shows a detailed information dialog.
     *
     * @param title Dialog title
     * @param message Text or message shown in the dialog
     * @param details Text or message shown when "Show details" check box is
     * checked
     */
    public static void showInformationDialog(String title, String message, String details) {
        final JTextArea textPane = new JTextArea();

        textPane.setForeground(Color.LIGHT_GRAY);
        textPane.setBackground(Color.BLACK);

        textPane.setText(LINEBREAK + details + LINEBREAK);
        textPane.setEditable(false);

        final JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setAlignmentX(0);

        final JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        final JDialog dialog = new JOptionPane(
                content,
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION).createDialog(null, title);

        JLabel text = new JLabel(message);
        text.setBorder(new EmptyBorder(10, 10, 10, 10));
        text.setAlignmentX(0);
        Dimension labelSize = text.getPreferredSize();
        labelSize.setSize(300, labelSize.height);
        text.setPreferredSize(labelSize);
        content.add(text);

        JCheckBox cb = new JCheckBox(new AbstractAction() {

            private static final long serialVersionUID = 1L;

            {
                this.putValue(Action.SELECTED_KEY, false);
                this.putValue(Action.NAME, "Show details");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Boolean) this.getValue(Action.SELECTED_KEY)) {
                    content.add(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                } else {
                    content.remove(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                }
                content.invalidate();
                dialog.invalidate();
                dialog.pack();
            }
        });
        content.add(cb);

        dialog.setResizable(false);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

    /**
     * Shows a detailed question dialog.
     *
     * @param title Dialog title
     * @param message Text or message shown in the dialog
     * @param details Text or message shown when "Show details" check box is
     * checked
     */
    public static void showQuestionDialog(String title, String message, String details) {
        final JTextArea textPane = new JTextArea();

        textPane.setForeground(Color.LIGHT_GRAY);
        textPane.setBackground(Color.BLACK);

        textPane.setText(LINEBREAK + details + LINEBREAK);
        textPane.setEditable(false);

        final JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setAlignmentX(0);

        final JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        final JDialog dialog = new JOptionPane(
                content,
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.DEFAULT_OPTION).createDialog(null, title);

        JLabel text = new JLabel(message);
        text.setBorder(new EmptyBorder(10, 10, 10, 10));
        text.setAlignmentX(0);
        Dimension labelSize = text.getPreferredSize();
        labelSize.setSize(300, labelSize.height);
        text.setPreferredSize(labelSize);
        content.add(text);

        JCheckBox cb = new JCheckBox(new AbstractAction() {

            private static final long serialVersionUID = 1L;

            {
                this.putValue(Action.SELECTED_KEY, false);
                this.putValue(Action.NAME, "Show details");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Boolean) this.getValue(Action.SELECTED_KEY)) {
                    content.add(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                } else {
                    content.remove(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                }
                content.invalidate();
                dialog.invalidate();
                dialog.pack();
            }
        });
        content.add(cb);

        dialog.setResizable(false);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

    /**
     * Shows a detailed warning dialog.
     *
     * @param title Dialog title
     * @param message Text or message shown in the dialog
     * @param details Text or message shown when "Show details" check box is
     * checked
     */
    public static void showWarningDialog(String title, String message, String details) {
        final JTextArea textPane = new JTextArea();

        textPane.setForeground(Color.LIGHT_GRAY);
        textPane.setBackground(Color.BLACK);

        textPane.setText(LINEBREAK + details + LINEBREAK);
        textPane.setEditable(false);

        final JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setAlignmentX(0);

        final JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        final JDialog dialog = new JOptionPane(
                content,
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.DEFAULT_OPTION).createDialog(null, title);

        JLabel text = new JLabel(message);
        text.setBorder(new EmptyBorder(10, 10, 10, 10));
        text.setAlignmentX(0);
        Dimension labelSize = text.getPreferredSize();
        labelSize.setSize(300, labelSize.height);
        text.setPreferredSize(labelSize);
        content.add(text);

        JCheckBox cb = new JCheckBox(new AbstractAction() {

            private static final long serialVersionUID = 1L;

            {
                this.putValue(Action.SELECTED_KEY, false);
                this.putValue(Action.NAME, "Show details");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Boolean) this.getValue(Action.SELECTED_KEY)) {
                    content.add(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                } else {
                    content.remove(scrollPane);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                }
                content.invalidate();
                dialog.invalidate();
                dialog.pack();
            }
        });
        content.add(cb);

        dialog.setResizable(false);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}

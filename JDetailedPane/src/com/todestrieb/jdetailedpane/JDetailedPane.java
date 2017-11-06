package com.todestrieb.jdetailedpane;

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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Todestrieb
 */
public class JDetailedPane {

    public static void showErrorDialog(String title, String message, String details) {
        final JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");

        textPane.setText(details);
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
                } else {
                    content.remove(scrollPane);
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

    public static void showInformationDialog(String title, String message, String details) {
        final JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");

        textPane.setText(details);
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
                } else {
                    content.remove(scrollPane);
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

    public static void showQuestionDialog(String title, String message, String details) {
        final JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");

        textPane.setText(details);
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
                } else {
                    content.remove(scrollPane);
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

    public static void showWarningDialog(String title, String message, String details) {
        final JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");

        textPane.setText(details);
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
                } else {
                    content.remove(scrollPane);
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

package com.todestrieb.swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JCustomPanel
        extends JPanel {

    private int mode = 1;

    private Image image = new ImageIcon(getClass().getResource("default.jpg")).getImage();

    private Icon icon;
    private float transparency = 0.5F;

    private Color gradient1 = new Color(66, 111, 166);
    private Color gradient2 = new Color(103, 174, 118);

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (this.mode == 1) {
            if (getImage() != null) {
                g2.drawImage(getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        } else if (this.mode == 2) {
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            AlphaComposite old = (AlphaComposite) g2.getComposite();
            g2.setComposite(AlphaComposite.SrcOver.derive(getTransparency()));
            super.paintComponent(g);
            g2.setComposite(old);
        } else if (this.mode == 3) {
            Rectangle clip = g2.getClipBounds();
            g2.setPaint(new GradientPaint(0.0F, 0.0F, this.gradient1.darker(), getWidth(), 0.0F, this.gradient2.darker()));
            g2.fillRect(clip.x, clip.y, clip.width, clip.height);
        } else if (this.mode == 4) {
            if (getImage() != null) {
                g2.drawImage(getImage(), 0, 0, getWidth(), getHeight(), null);
            }
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            AlphaComposite old = (AlphaComposite) g2.getComposite();
            g2.setComposite(AlphaComposite.SrcOver.derive(getTransparency()));
            super.paintComponent(g);
            g2.setComposite(old);
        }
    }

    public void setPanelMode(int m) {
        if ((this.mode == 4) || (this.mode == 1) || (this.mode == 2) || (this.mode == 3)) {
            this.mode = m;
        } else {
            this.mode = 0;
        }
    }

    public int getPanelMode() {
        return this.mode;
    }

    private Image getImage() {
        return this.image;
    }

    private void setImage(Image image) {
        this.image = image;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        setImage(((ImageIcon) icon).getImage());
    }

    public float getTransparency() {
        return this.transparency;
    }

    public void setTransparency(float transparency) {
        if ((transparency > 1.0F) || (transparency < 0.0F)) {
            this.transparency = 0.5F;
        } else {
            this.transparency = transparency;
        }
    }

    public void setGradientColor1(Color c) {
        this.gradient1 = c;
    }

    public Color getGradientColor1() {
        return this.gradient1;
    }

    public void setGradientColor2(Color c) {
        this.gradient2 = c;
    }

    public Color getGradientColor2() {
        return this.gradient2;
    }
}

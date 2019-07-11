package com.todestrieb.swing;

import java.awt.Image;
import java.beans.SimpleBeanInfo;

public class JCustomPanelBeanInfo extends SimpleBeanInfo {

    Image icon;
    Image icon32;
    Image iconM;
    Image icon32M;

    public JCustomPanelBeanInfo() {
        this.icon = loadImage("/com/todestrieb/resources/ico16.gif");
        this.icon32 = loadImage("/com/todestrieb/resources/ico32.gif");
        this.iconM = loadImage("/com/todestrieb/resources/ico16m.gif");
        this.icon32M = loadImage("/com/todestrieb/resources/ico32m.gif");
    }

    public Image getIcon(int i) {
        switch (i) {
            case 1:
                return this.icon;

            case 2:
                return this.icon32;

            case 3:
                return this.iconM;

            case 4:
                return this.icon32M;
        }
        return null;
    }
}

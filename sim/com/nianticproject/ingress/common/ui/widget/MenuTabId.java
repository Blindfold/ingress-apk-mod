package com.nianticproject.ingress.common.ui.widget;

import broot.ingress.mod.Entry;

public enum MenuTabId {

    MOD_ABOUT, MOD_ITEMS, INVENTORY, AGENT, INTEL, MISSIONS, RECRUIT, PASSCODE, DEVICE;

    public String toString() {
        String ret = Entry.MenuTabId_onToString(this);
        return ret != null ? ret : super.toString();
    }

    public String getText2() {
        switch (this) {
            case RECRUIT:
                return "[5]";
        }
        return "";
    }
}

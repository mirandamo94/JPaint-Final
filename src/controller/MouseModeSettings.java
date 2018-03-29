package controller;

import viewInterfaces.IDialogChoice;

public class MouseModeSettings implements IDialogChoice{
	private MouseMode currentMode;

    void setCurrentMode(MouseMode draw) {
        this.currentMode = draw;
    }

    public MouseMode getCurrentMode() {
        return currentMode;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Mode";
    }

    @Override
    public String getDialogText() {
        return "Select a Mode:";
    }

    @Override
    public Object[] getDialogOptions() {
        return MouseMode.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentMode();
    }
}

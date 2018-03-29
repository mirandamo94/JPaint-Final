package controller;

import viewInterfaces.IDialogChoice;

import java.util.Arrays;
import java.util.List;

public class ShadingTypeSettings implements IDialogChoice {
	private ShadingType currentShade;

    void setCurrentShade(ShadingType filled) {
        this.currentShade = filled;
    }

    public ShadingType getCurrentShade() {
        return currentShade;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Shading Option";
    }

    @Override
    public String getDialogText() {
        return "Select a Shading Option:";
    }

    @Override
    public Object[] getDialogOptions() {
        return ShadingType.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentShade();
    }
}

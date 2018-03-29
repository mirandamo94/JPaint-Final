package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

import java.util.Arrays;

public class SelectMouseModeCommand implements ICommand {
    private final MouseModeSettings _mouseSettings;
    private final UIModule _uiModule;
    SelectMouseModeCommand(MouseModeSettings mouseSettings, UIModule uiModule){
        _mouseSettings = mouseSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        MouseMode modeChoice = _uiModule.getDialogResponse(_mouseSettings);
        _mouseSettings.setCurrentMode(modeChoice);
    }
}
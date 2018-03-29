package main;

import controller.ApplicationSettings;
import model.ShapeList;
import view.UIFactory;
import view.UIType;
import viewInterfaces.InvalidUIException;
import viewInterfaces.UIModule;

public class UISelector {
    public UIModule getUi(String arg) throws InvalidUIException {
        UIType uiType;
        uiType = getUiType(arg);
        ShapeList shapeList=null;
		ApplicationSettings settings=null;
		UIModule ui = UIFactory.createUI(uiType,settings,shapeList);
        return ui;
    }

    private UIType getUiType(String uiArgument) throws IllegalArgumentException {
        String[] argParts = uiArgument.split("=");
        if(!argParts[0].equalsIgnoreCase("-ui"))
            throw new IllegalArgumentException("Did not pass in the correct switch");

        try {
            UIType uiType = UIType.valueOf(argParts[1].toUpperCase());
            return uiType;
        } catch (NullPointerException ex) {
            throw new IllegalArgumentException("Must specify GUI or CMD for -ui switch");
        }
    }
}

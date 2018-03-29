package controller;

import viewInterfaces.EventName;
import viewInterfaces.UIModule;

public class JPaintController implements IPaintController {
    private final UIModule _uiModule;
    private final ApplicationSettings _settings = new ApplicationSettings();

    public JPaintController(UIModule uiModule, ApplicationSettings settings){
        _uiModule = uiModule;
        _settings.getDrawShapeSettings().setCurrentShape(ShapeType.ELLIPSE);
    }

    @Override
    public void run() {
        _uiModule.addEvent(EventName.CHOOSE_SHAPE, new SelectShapeCommand(_settings.getDrawShapeSettings(), _uiModule));
    }
}

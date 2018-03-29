package controller;

public class ApplicationSettings {
	
    private ShapeSettings drawShapeSettings = new ShapeSettings();
    private ShadingTypeSettings shadeSettings= new ShadingTypeSettings();
    private SelectPrimaryColorCommand primaryColorcommand= new SelectPrimaryColorCommand();
    private SelectSecondaryColorCommand secondaryColorcommand= new SelectSecondaryColorCommand();
    private MouseModeSettings mouseSettings= new MouseModeSettings();
    
    public ShapeSettings getDrawShapeSettings() {
        return drawShapeSettings;
    }


	public ShadingTypeSettings getShadingTypeSettings() {
		return shadeSettings;
	}


	public SelectPrimaryColorCommand getPrimaryColorSettings() {
		return primaryColorcommand;
	}


	public SelectSecondaryColorCommand getSecondaryColorSettings() {
		return secondaryColorcommand;
	}

	public MouseModeSettings getMouseSettings(){
		return mouseSettings;
	}
}

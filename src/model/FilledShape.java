package model;

import viewInterfaces.IViewShape;
import modelInterfaces.IDisplayableShape;
import view.GuiUiModule.PaintCanvas;

public class FilledShape implements IDisplayableShape {
	private final IViewShape viewShape;
	public FilledShape(IViewShape viewShape){
		this.viewShape=viewShape;
	}
	
	@Override
	public void display(){
		viewShape.displayFilled(viewShape.getPrimaryColor());
	}

	@Override
	public void toUpdate(PaintCanvas canvas) {
		// TODO Auto-generated method stub
		
	}
}

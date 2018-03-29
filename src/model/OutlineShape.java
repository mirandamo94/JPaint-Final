package model;

import viewInterfaces.IViewShape;
import modelInterfaces.IDisplayableShape;
import view.GuiUiModule.PaintCanvas;

public class OutlineShape implements IDisplayableShape {
	private final IViewShape viewShape;
	
	public OutlineShape(IViewShape viewShape){
		this.viewShape=viewShape;
	}
	
	@Override
	public void display(){
		viewShape.displayOutline(viewShape.getPrimaryColor());
	}

	@Override
	public void toUpdate(PaintCanvas canvas) {
		// TODO Auto-generated method stub
		
	}
}

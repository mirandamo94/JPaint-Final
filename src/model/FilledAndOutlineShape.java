package model;

import viewInterfaces.IViewShape;
import modelInterfaces.IDisplayableShape;
import view.GuiUiModule.PaintCanvas;

public class FilledAndOutlineShape implements IDisplayableShape {
	private final IViewShape viewShape;
	
	public FilledAndOutlineShape(IViewShape viewShape){
		this.viewShape=viewShape;
	}
	
	@Override
	public void display(){
		viewShape.displayFilled(viewShape.getPrimaryColor());
		viewShape.displayOutline(viewShape.getSecondaryColor());
	}

	@Override
	public void toUpdate(PaintCanvas canvas) {
		// TODO Auto-generated method stub
		
	}
}

package view;

import java.awt.Graphics;

import controller.ColorAdapter;
import controller.Shape;
import controller.ShapeType;
import viewInterfaces.IViewShape;

public class ViewShape implements IViewShape {

	/*ViewShape(we will have some objects that defines behavior, 
	 * tells us how to draw with drawRect(), fillRect(), and the data for those shapes)*/
	
	public ViewShape(ShapeType currentShape, Shape shape){
	} 
	@Override
	public void displayOutline(ColorAdapter color) {
		
	}

	@Override
	public void displayFilled(ColorAdapter color) {
		
	}

	@Override
	public ColorAdapter getPrimaryColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColorAdapter getSecondaryColor() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

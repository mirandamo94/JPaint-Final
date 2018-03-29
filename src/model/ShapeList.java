package model;

import java.util.ArrayList;
import java.util.List;

import controller.ShadingType;
import modelInterfaces.IDisplayableShape;
import modelInterfaces.IShapeList;
import view.GuiUiModule.PaintCanvas;
import viewInterfaces.IViewShape;

/*My persistence layer. This is a list of IDisplayableshapes. 
 * It also implements the observer pattern. The ShapeList is the subject, 
 * and the PaintCanvas subscribes to updates. 
 * Every time I add a new Shape to my Shape List, I update my observer (PaintCanvas)!
 */
public class ShapeList implements IShapeList {
	
	private final static List<IDisplayableShape> shapeList = new ArrayList<IDisplayableShape>();
	
	@Override
	public void addToList(IDisplayableShape displayableShape) {
		shapeList.add(displayableShape);
	}
	@Override
	public void readInput(PaintCanvas canvas){
		notifyObserver(canvas);
	}
	@Override
	public void notifyObserver(PaintCanvas canvas) {
		for (IDisplayableShape displayableShape: shapeList){
			displayableShape.toUpdate(canvas);
		}
		
	}
	

	
}



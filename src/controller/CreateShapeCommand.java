package controller;

import controller.Point;
import modelInterfaces.IShapeFactory;
import viewInterfaces.IStartAndEndPointCommand;

public class CreateShapeCommand implements IStartAndEndPointCommand{
	private final IShapeFactory shapeFactory;
	
	public CreateShapeCommand(IShapeFactory shapeFactory){
		this.shapeFactory = shapeFactory;
	}
	
	public void run(Point startingPoint, Point endingPoint) throws Exception {
		shapeFactory.create(startingPoint, endingPoint);
	}

	
	
	
}

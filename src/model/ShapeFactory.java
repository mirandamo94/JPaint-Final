package model;

import controller.*;
import modelInterfaces.IDisplayableShape;
import modelInterfaces.IDisplayableShapeFactory;
import modelInterfaces.IShapeFactory;
import modelInterfaces.IShapeList;
import viewInterfaces.IViewShape;
import modelInterfaces.IViewShapeFactory;
import view.DisplayableShapeFactory;
import view.GUIViewShapeFactory;

public class ShapeFactory implements IShapeFactory{
	private final ApplicationSettings settings;
	private final IShapeList shapeList;
	private final IViewShapeFactory viewShapeFactory;
	private final IDisplayableShapeFactory displayableShapeFactory;
	
	public ShapeFactory(ApplicationSettings settings, IShapeList shapeList, IViewShapeFactory viewShapeFactory, IDisplayableShapeFactory displayableShapeFactory){
		this.settings=settings;
		this.shapeList=shapeList;
		this.viewShapeFactory=viewShapeFactory;
		this.displayableShapeFactory=displayableShapeFactory;
	}

	public void create(Point startingPoint, Point endingPoint) throws Exception{
		Point adjustedStartingPoint= getAdjustedStartingPoint(startingPoint,endingPoint);
		Point adjustingEndingPoint= getAdjustedEndingPoint(startingPoint, endingPoint);
		IViewShape viewShape=getIViewShape(adjustedStartingPoint,adjustingEndingPoint);
		IDisplayableShape displayableShape=getIDisplayableShape(viewShape);
		shapeList.addToList(displayableShape);
	}
	
	private Point getAdjustedStartingPoint(Point startingPoint, Point endingPoint){
		int startingX=Math.min(startingPoint.getX(), endingPoint.getX());
		int startingY=Math.min(startingPoint.getY(), endingPoint.getY());
		return new Point(startingX, startingY);
	}
	private Point getAdjustedEndingPoint(Point startingPoint, Point endingPoint){
		int startingX=Math.min(endingPoint.getX(), endingPoint.getX());
		int startingY=Math.min(startingPoint.getY(), endingPoint.getY());
		return new Point(startingX, startingY);
	}
	
	private IViewShape getIViewShape(Point startingPoint, Point endingPoint) throws Exception{
		ShapeType currentShape=settings.getDrawShapeSettings().getCurrentShape();
		Shape shape= createShape(startingPoint, endingPoint);
		return viewShapeFactory.createViewShape(currentShape, shape);
	}
	
	private IDisplayableShape getIDisplayableShape(IViewShape viewShape) throws Exception{
		ShadingType currentShading=settings.getShadingTypeSettings().getCurrentShade();
		return displayableShapeFactory.createDisplayShape(currentShading, viewShape);
	}
	
	private Shape createShape(Point startingPoint, Point endingPoint){
		ColorAdapter primaryColor= settings.getPrimaryColorSettings().getCurrentPrimaryColor();
		ColorAdapter secondaryColor=settings.getSecondaryColorSettings().getCurrentSecondaryColor();
		return new Shape(primaryColor, secondaryColor, startingPoint, endingPoint);
	}

	
}

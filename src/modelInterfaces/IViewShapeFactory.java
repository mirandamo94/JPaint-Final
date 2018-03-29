package modelInterfaces;

import controller.Shape;
import controller.ShapeType;
import viewInterfaces.IViewShape;

public interface IViewShapeFactory {

	IViewShape createViewShape(ShapeType currentShape, Shape shape) throws Exception;

}

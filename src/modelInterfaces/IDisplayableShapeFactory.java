package modelInterfaces;

import controller.ShadingType;
import viewInterfaces.IViewShape;
public interface IDisplayableShapeFactory {
	
	IDisplayableShape createDisplayShape(ShadingType currentShading, IViewShape viewShape) throws Exception;	
}

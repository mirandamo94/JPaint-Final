package view;
import controller.Shape;
import controller.ShapeType;
import viewInterfaces.IViewShape;
import modelInterfaces.IViewShapeFactory;
import view.GuiUiModule.GuiEllipse;
import view.GuiUiModule.GuiRectangle;
import view.GuiUiModule.GuiTriangle;
import view.GuiUiModule.PaintCanvas;

public class GUIViewShapeFactory implements IViewShapeFactory{
	
	private final PaintCanvas canvas;
	public GUIViewShapeFactory(PaintCanvas canvas){
		this.canvas=canvas;
	}
	
	@Override
	public IViewShape createViewShape(ShapeType currentShape, Shape shape) throws Exception{
		//switchStatement
		switch (currentShape){
		case ELLIPSE:
			return new GuiEllipse(shape, canvas);
		case RECTANGLE:
			return new GuiRectangle(shape, canvas);
		case TRIANGLE:
			return new GuiTriangle(shape, canvas);
		default:
			throw new Exception("Incorrect ViewShape!");
		}
	}
}

package view.GuiUiModule;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

import controller.ColorAdapter;
import controller.Shape;
import viewInterfaces.IViewShape;
public class GuiTriangle implements IViewShape{
	
	private Shape shape;
	private PaintCanvas canvas;
	private int xPoly[]={shape.getStartX(),shape.getEndX(),shape.getStartX()};
	private int yPoly[]={shape.getStartY(),shape.getEndY(),shape.getEndY()};
	
	public GuiTriangle(Shape shape, PaintCanvas canvas){
		this.shape=shape;
		this.canvas=canvas;
	}
	
	public void displayOutline(ColorAdapter color){
		Graphics2D graphics=canvas.getGraphics2D();
		graphics.setStroke(new BasicStroke(5));
		graphics.setColor(color.getColor());
		graphics.drawPolygon(xPoly, yPoly, 3);
	}
	
	public void displayFilled(ColorAdapter color){
		Graphics2D graphics=canvas.getGraphics2D();
		graphics.setColor(color.getColor());
		graphics.fillPolygon(xPoly, yPoly, 3);
	}
	
	public ColorAdapter getPrimaryColor(){
		return shape.getPrimaryColor();
	}
	
	public ColorAdapter getSecondaryColor(){
		return shape.getSecondaryColor();
	}
	
	

}
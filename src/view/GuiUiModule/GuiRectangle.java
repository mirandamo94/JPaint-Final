
package view.GuiUiModule;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

import controller.ColorAdapter;
import controller.Shape;
import viewInterfaces.IViewShape;
public class GuiRectangle implements IViewShape{
	private Shape shape;
	private PaintCanvas canvas;
	
	public GuiRectangle(Shape shape, PaintCanvas canvas){
		this.shape=shape;
		this.canvas=canvas;
	}
	public void displayOutline(ColorAdapter color){
		Graphics2D graphics=canvas.getGraphics2D();
		graphics.setStroke(new BasicStroke(5));
		graphics.setColor(color.getColor());
		graphics.drawRect(shape.getStartX(), shape.getStartY(), shape.getWidth(), shape.getHeight());
	}
	
	public void displayFilled(ColorAdapter color){
		Graphics2D graphics=canvas.getGraphics2D();
		graphics.setColor(color.getColor());
		graphics.fillRect(shape.getStartX(), shape.getStartY(), shape.getWidth(), shape.getHeight());
	}
	@Override
	public ColorAdapter getPrimaryColor(){
		return shape.getPrimaryColor();
	}
	
	@Override
	public ColorAdapter getSecondaryColor(){
		return shape.getSecondaryColor();
	}
	
	

}
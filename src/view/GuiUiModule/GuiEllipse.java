package view.GuiUiModule;

import controller.ColorAdapter;
import controller.Shape;
import viewInterfaces.IViewShape;

import java.awt.*;

public class GuiEllipse implements IViewShape {

    private Shape shape;
    private PaintCanvas canvas;

    public GuiEllipse(Shape shape, PaintCanvas canvas) {
        this.shape = shape;
        this.canvas = canvas;
    }

    @Override
    public void displayOutline(ColorAdapter color) {
        Graphics2D graphics = canvas.getGraphics2D();
        graphics.setStroke(new BasicStroke(5));
        graphics.setColor(color.getColor());
        graphics.drawOval(shape.getStartX(), shape.getStartY(), shape.getWidth(), shape.getHeight());
    }

    @Override
    public void displayFilled(ColorAdapter color) {
        Graphics2D graphics = canvas.getGraphics2D();
        graphics.setColor(color.getColor());
        graphics.fillOval(shape.getStartX(), shape.getStartY(), shape.getWidth(), shape.getHeight());
    }
    
    public ColorAdapter getPrimaryColor(){
		return shape.getPrimaryColor();
	}
	
	public ColorAdapter getSecondaryColor(){
		return shape.getSecondaryColor();
	}
	

   
}
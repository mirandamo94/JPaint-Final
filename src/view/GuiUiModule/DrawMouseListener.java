package view.GuiUiModule;

import controller.Point;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import viewInterfaces.IStartAndEndPointCommand;


//DrawMouseListener myListener = new DrawMouseListener();


public class DrawMouseListener extends MouseInputAdapter{
	private Point startingPoint;
	private Point endingPoint;
	private final IStartAndEndPointCommand command;
	
	
	
	public DrawMouseListener(IStartAndEndPointCommand command){
		this.command=command;
	}
	
	
	@Override
	public void mousePressed(MouseEvent mouseEvent){
		startingPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
	}
	
	 
	 
	@Override
	public void mouseReleased(MouseEvent mouseEvent){
		endingPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
		try {
			command.run(startingPoint, endingPoint);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public void mouseEntered(MouseEvent mouseEvent) { }   
    public void mouseExited(MouseEvent mouseEvent) { }   
    public void mouseMoved(MouseEvent mouseEvent) { }
    public void mouseClicked(MouseEvent mouseEvent) { }
    
    
        }


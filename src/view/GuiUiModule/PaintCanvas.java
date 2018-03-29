package view.GuiUiModule;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JComponent;

import modelInterfaces.IDisplayableShape;
import modelInterfaces.IShapeListObserver;
import viewInterfaces.IStartAndEndPointCommand;

public class PaintCanvas extends JComponent implements IShapeListObserver{
	
	private IStartAndEndPointCommand command;
	DrawMouseListener myListener = new DrawMouseListener(command);

	//myListener.addMouseMotionListener(myListener)= new MouseMotionAdapter();
	
		
	
	public PaintCanvas() {
        // Constructor: set background color to white set up listeners to respond to mouse actions
      setBackground(Color.white);
     // DrawMouseListener d= new DrawMouseListener(IStartAndEndPointCommand command);
      
   }
	/*
	@Override
	public void toUpdate (List<IDisplayableShape> shapes){
		for (IDisplayableShape shape: shapes){
			shape.display();
		}
		repaint();
	}
	*/
	public Graphics2D getGraphics2D(){
		return (Graphics2D)getGraphics();
	}
		
	//@Override
	//public void paint(Graphics graphics){
       /* Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setColor(Color.black);
        graphics2d.fillRect(12, 13, 200, 400);
        graphics2d.setStroke(new BasicStroke(5));
        graphics2d.setColor(Color.blue);
        graphics2d.drawRect(12, 13, 200, 400);}*/
		  
        
    // My Observer (PaintCanvas) will receive the update call from ShapeList 
    // and iterate though the list of IDisplayableShapes, 
    // calling "display" on each one.   
	
	         //}
	/*public void actionPerformed(MouseEvent mouseEevnt) {
        // Called to respond to action events.  The three shape-adding
        // buttons have been set up to send action events to this canvas.
        // Respond by adding the appropriate shape to the canvas.
    if (evt.getSource() instanceof JComboBox) {
       switch ( ((JComboBox)evt.getSource()).getSelectedIndex() ) {
          case 0: currentColor = Color.red;     break;
          case 1: currentColor = Color.green;   break;
          case 2: currentColor = Color.blue;    break;
          case 3: currentColor = Color.cyan;    break;
          case 4: currentColor = Color.magenta; break;
          case 5: currentColor = Color.yellow;  break;
          case 6: currentColor = Color.black;   break;
          case 7: currentColor = Color.white;   break;
       }
    }
    else {
       String command = evt.getActionCommand();
       if (command.equals("Rect"))
          addShape(new RectShape());
       else if (command.equals("Oval"))
          addShape(new OvalShape());
       else if (command.equals("RoundRect"))
          addShape(new RoundRectShape());
       }
 }

 void addShape(Shape shape) {
        // Add the shape to the canvas, and set its size/position and color.
        // The shape is added at the top-left corner, with size 80-by-50.
        // Then redraw the canvas to show the newly added shape.
    shape.setColor(currentColor);
    shape.reshape(3,3,80,50);
    shapes.add(shape);
    repaint();
 }*/

	
	


	


	@Override
	public void toUpdate(List<IDisplayableShape> shapes) {
		// TODO Auto-generated method stub
		
	}
}
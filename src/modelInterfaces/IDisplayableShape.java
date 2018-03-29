package modelInterfaces;
import controller.ColorAdapter;
import view.GuiUiModule.PaintCanvas;

public interface IDisplayableShape {
	
	void display();
	void toUpdate(PaintCanvas canvas);
}

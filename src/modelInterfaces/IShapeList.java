package modelInterfaces;

import view.GuiUiModule.PaintCanvas;

public interface IShapeList {


	void readInput(PaintCanvas canvas);
	void addToList(IDisplayableShape displayableShape);
	void notifyObserver(PaintCanvas canvas);
	

}

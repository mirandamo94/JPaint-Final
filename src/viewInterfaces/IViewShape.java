package viewInterfaces;

import java.awt.Graphics;

import controller.ColorAdapter;

public interface IViewShape {

	void displayOutline(ColorAdapter color);

	void displayFilled(ColorAdapter color);

	ColorAdapter getPrimaryColor();

	ColorAdapter getSecondaryColor();

	


}

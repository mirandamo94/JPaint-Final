package controller;

import java.awt.Color;

import viewInterfaces.IDialogChoice;

public class ColorSettings {
	
	public static ColorAdapter[] availableColors={
			new ColorAdapter(Color.BLACK, "BLACK"),
			new ColorAdapter(Color.BLUE, "BLUE"),
			new ColorAdapter(Color.RED, "RED"),
			new ColorAdapter(Color.WHITE, "WHITE"),
			new ColorAdapter(Color.YELLOW, "YELLOW"),
			new ColorAdapter(Color.GREEN, "GREEN"),
			new ColorAdapter(Color.GRAY, "GRAY"),
			new ColorAdapter(Color.LIGHT_GRAY, "LIGHT_GRAY"),
			new ColorAdapter(Color.CYAN, "CYAN"),
			new ColorAdapter(Color.DARK_GRAY, "DARKGRAY"),
			new ColorAdapter(Color.PINK, "PINK"),
			new ColorAdapter(Color.MAGENTA, "MAGENTA"),
	};
}

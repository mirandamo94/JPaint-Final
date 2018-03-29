package controller;

import java.awt.Color;

public class ColorAdapter {
	
	private Color colorName;
	
	
	public ColorAdapter(Color color, String colorName){
		this.colorName=color;
	}
	public Color getColor() {
		return colorName;
	}
	
	public String toString(){
		return colorName.toString();
	}
	public static ColorAdapter[] values() {
		return null;
	}
	
	
	
	

}

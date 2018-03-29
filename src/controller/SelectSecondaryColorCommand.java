package controller;

import java.util.List;

import viewInterfaces.IDialogChoice;

public class SelectSecondaryColorCommand implements IDialogChoice{
	
	List<ColorAdapter> colors;
	
	void setSecondaryColorType(ColorAdapter color){
		
	}
	
	public ColorAdapter getCurrentSecondaryColor(){
		return null;
	}
	@Override 
	public String getDialogTitle(){
		return "Select a Secondary Color";
	}
	@Override
	public String getDialogText(){
		return "Select a Secondary Color";
	}
	@Override
	public ColorAdapter[] getDialogOptions(){
		for (ColorAdapter colors:colors){
			colors.toString();
		}
		return ColorAdapter.values();
	}
	
	@Override
	public Object getDefaultChoice(){
		return getCurrentSecondaryColor();
	}

}

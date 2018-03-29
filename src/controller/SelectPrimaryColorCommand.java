package controller;

import java.util.List;

import viewInterfaces.IDialogChoice;

public class SelectPrimaryColorCommand implements IDialogChoice{
	
	ColorAdapter[] color;
	
	void setPrimaryColorType(ColorAdapter color){
		
	}
	
	public ColorAdapter getCurrentPrimaryColor(){
		return null;
	}
	@Override 
	public String getDialogTitle(){
		return "Select a Primary Color";
	}
	@Override
	public String getDialogText(){
		return "Select a Primary Color";
	}
	@Override
	public ColorAdapter[] getDialogOptions(){
		for (ColorAdapter colors:color){
			colors.toString();
		}
		return color;
	}
	
	@Override
	public Object getDefaultChoice(){
		return getCurrentPrimaryColor();
	}

	

}
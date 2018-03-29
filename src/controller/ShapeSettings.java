package controller;

import viewInterfaces.IDialogChoice;

import java.util.Arrays;
import java.util.List;

public class ShapeSettings implements IDialogChoice {
	private ShapeType currentShape;

    void setCurrentShape(ShapeType ellipse) {
        this.currentShape = ellipse;
    }

    public ShapeType getCurrentShape() {
        return currentShape;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Shape";
    }

    @Override
    public String getDialogText() {
        return "Select a Shape:";
    }

    @Override
    public Object[] getDialogOptions() {
        return Shape.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentShape();
    }


}

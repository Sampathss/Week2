package com.lewis.assignments.doorknobfactorydesign;

public class VeluxDoorKnob implements DoorKnob{
	public String colour;
	public String shapes;
	public String type;
	
	@Override
	public String getColour() {
		return colour;
	}

	@Override
	public String getShapes() {
		return shapes;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public void setShapes(String shapes) {
		this.shapes = shapes;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Velux DoorKnob";
	}
}
package com.lewis.assignments.doorknobfactorydesign;

public abstract class Main {

	public static void main(String[] args) {
		DoorKnobFactory fortuneDoorKnobFactory = new FortuneDoorKnobFactory();
		
		DoorKnob fortuneDoorKnob1 = fortuneDoorKnobFactory.getDoorKnob();
		DoorKnob fortuneDoorKnob2 = fortuneDoorKnobFactory.getDoorKnob();
		
		fortuneDoorKnob1.setColour("Brown");
		fortuneDoorKnob1.setShapes("Flat");
		fortuneDoorKnob1.setType("Exterior");

		fortuneDoorKnob2.setColour("Red");
		fortuneDoorKnob2.setShapes("Round");
		fortuneDoorKnob2.setType("KeyedEntry");
		
		System.out.println("Fortune1 doorknob Colour : "+fortuneDoorKnob1.getColour());
		System.out.println("Fortune1 Shapes			 : "+fortuneDoorKnob1.getShapes());
		System.out.println("Fortune1 Type   		 : "+fortuneDoorKnob1.getType());
		System.out.println("============================================");
		System.out.println("Fortune2 doorknob Colour : "+fortuneDoorKnob2.getColour());
		System.out.println("Fortune2 Shapes			 : "+fortuneDoorKnob2.getShapes());
		System.out.println("Fortune2 Type			 : "+fortuneDoorKnob2.getType());
		System.out.println("============================================");
		DoorKnobFactory veluxDoorKnobFactory = new VeluxDoorKnobFactory();
		
		DoorKnob veluxDoorKnob1 = veluxDoorKnobFactory.getDoorKnob();
		DoorKnob veluxDoorKnob2 = veluxDoorKnobFactory.getDoorKnob();
		
		veluxDoorKnob1.setColour("Grey");
		veluxDoorKnob1.setShapes("Scroll");
		veluxDoorKnob1.setType("Interior");

		veluxDoorKnob2.setColour("Black");
		veluxDoorKnob2.setShapes("Drop");
		veluxDoorKnob2.setType("Privacy");
		
		System.out.println("velux1 doorknob Colour	: "+veluxDoorKnob1.getColour());
		System.out.println("velux1 Shapes			: "+veluxDoorKnob1.getShapes());
		System.out.println("velux1 Type				: "+veluxDoorKnob1.getType());
		System.out.println("============================================");
		System.out.println("velux2 doorknob Colour	: "+veluxDoorKnob2.getColour());
		System.out.println("velux2 Shapes			: "+veluxDoorKnob2.getShapes());
		System.out.println("velux2 Type				: "+veluxDoorKnob2.getType());
		System.out.println("============================================");
	}
}

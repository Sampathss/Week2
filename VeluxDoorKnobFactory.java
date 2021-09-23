package com.lewis.assignments.doorknobfactorydesign;

public class VeluxDoorKnobFactory implements DoorKnobFactory {

	DoorKnob doorknob;

	@Override
	public DoorKnob getDoorKnob() {
		doorknob = new VeluxDoorKnob();
		return doorknob;
	}

}
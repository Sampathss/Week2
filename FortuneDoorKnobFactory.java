package com.lewis.assignments.doorknobfactorydesign;

public class FortuneDoorKnobFactory implements DoorKnobFactory {
	DoorKnob doorknob;

	@Override
	public DoorKnob getDoorKnob() {
		doorknob = new FortuneDoorKnob();
		return doorknob;
	}
}
package com.marakana.objects;
public class Laptop {
	String model;
	int size;
	Memory[] memory;
	Disk[] disks;
	String[] applications;
	boolean on;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}
}

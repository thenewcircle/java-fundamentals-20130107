package com.marakana.objects;

public class Laptop {
	private final String model;
	private final int size;
	private final Memory[] memory;
	private final Disk[] disks;
	private String[] applications;
	private boolean on;

	public Laptop(String model, int size, Memory[] memory, Disk[] disks) {
		this.model = model;
		this.size = size;
		this.memory = memory;
		this.disks = disks;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public boolean isOn() {
		return on;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public Memory[] getMemory() {
		return memory;
	}

	public Disk[] getDisks() {
		return disks;
	}

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

}

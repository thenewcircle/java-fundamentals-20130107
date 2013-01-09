package com.marakana.objects;
public class Laptop {
	private String model;
	private int size;
	private Memory[] memory;
	private Disk[] disks;
	private String[] applications;
	private boolean on;

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

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Memory[] getMemory() {
		return memory;
	}

	public void setMemory(Memory[] memory) {
		this.memory = memory;
	}

	public Disk[] getDisks() {
		return disks;
	}

	public void setDisks(Disk[] disks) {
		this.disks = disks;
	}

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

}

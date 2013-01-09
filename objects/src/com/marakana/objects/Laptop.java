package com.marakana.objects;

import java.util.Arrays;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(disks);
		result = prime * result + Arrays.hashCode(memory);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (!Arrays.equals(disks, other.disks))
			return false;
		if (!Arrays.equals(memory, other.memory))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}

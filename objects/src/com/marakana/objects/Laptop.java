package com.marakana.objects;

import java.util.Arrays;

public class Laptop {
	private final String model;
	private final int size;
	private final Storage[] storage;
	private String[] applications;
	private boolean on;

	public Laptop(String model, int size, Storage[] storage) {
		this.model = model;
		this.size = size;
		this.storage = storage;
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

	public Storage[] getStorage() {
		return storage;
	}

	public String[] getApplications() {
		return applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	public int totalStorage() {
		// TODO
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + size;
		result = prime * result + Arrays.hashCode(storage);
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
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (size != other.size)
			return false;
		if (!Arrays.equals(storage, other.storage))
			return false;
		return true;
	}

}

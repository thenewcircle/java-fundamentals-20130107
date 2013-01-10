package com.marakana.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

	private final String model;
	private final List<Storage> storage;
	private final Set<String> applications = new HashSet<String>();
	private boolean on;

	public Computer(String model, List<Storage> storage) {
		this.model = model;
		this.storage = new ArrayList<Storage>(storage);
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

	public List<Storage> getStorage() {
		return Collections.unmodifiableList(storage);
	}

	public Set<String> getApplications() {
		return Collections.unmodifiableSet(applications);
	}

	public void installApplication(String application) {
		applications.add(application);
	}

	public void uninstallApplication(String application) {
		applications.remove(application);
	}

	public int totalStorage() {
		int total = 0;
		for (Storage s : storage) {
			total += s.getSize();
		}
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Computer))
			return false;
		Computer other = (Computer) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		return true;
	}

}
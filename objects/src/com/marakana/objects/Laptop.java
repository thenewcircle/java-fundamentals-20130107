package com.marakana.objects;

import java.util.List;

public class Laptop extends Computer {
	private final int size;
	public Laptop(String model, List<Storage> storage, int size) {
		super(model, storage);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (size != other.size)
			return false;
		return true;
	}

}

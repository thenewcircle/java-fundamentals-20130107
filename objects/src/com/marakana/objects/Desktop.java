package com.marakana.objects;

import java.util.List;

public class Desktop extends Computer {

	private final String formFactor;

	public Desktop(String model, List<Storage> storage, String formFactor) {
		super(model, storage);
		this.formFactor = formFactor;
	}

	public String getFormFactor() {
		return formFactor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((formFactor == null) ? 0 : formFactor.hashCode());
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
		Desktop other = (Desktop) obj;
		if (formFactor == null) {
			if (other.formFactor != null)
				return false;
		} else if (!formFactor.equals(other.formFactor))
			return false;
		return true;
	}

}

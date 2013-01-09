package com.marakana.objects;

public class Memory {
	private final int size;
	private final String type;

	public Memory(int size, String type) {
		this.size = size;
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public String getType() {
		return type;
	}
}

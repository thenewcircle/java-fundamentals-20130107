package com.marakana.objects;

public class Memory extends Storage {

	public Memory(int size, String type) {
		super(size, type);
	}

	@Override
	public int getSize() {
		return size / 1024;
	}

}

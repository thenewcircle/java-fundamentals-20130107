package com.marakana.objects;

public enum Month {
	JANUARY {
		public int days() {
			return 31;
		}
	},
	FEBRUARY {
		public int days() {
			return 28;
		}
	},
	MARCH {
		public int days() {
			return 31;
		}
	},
	APRIL {
		public int days() {
			return 30;
		}
	};

	public abstract int days();

	public static void main(String[] args) {
		System.out.println(JANUARY.days());
	}
}

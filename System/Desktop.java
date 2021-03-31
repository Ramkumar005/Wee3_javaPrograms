package org.System;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("It's size is 13 inches");
	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();

		obj.computerModel();
		obj.desktopSize();

	}

}

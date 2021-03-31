package com.Abstract;

public class Desktop implements HardWare,Software{

	public void desktopModel() {
		System.out.println("NoteBook");
	}

	public void softwareResources() {
		System.out.println("software Installed");
	}

	public void hardwareResources() {
		System.out.println("Hardware Installed");
	}
	
	public static void main(String[] args) {
		
		Desktop dsk = new Desktop();
		
		dsk.desktopModel();
		dsk.softwareResources();
		dsk.hardwareResources();
		
		
		
		
	}
}


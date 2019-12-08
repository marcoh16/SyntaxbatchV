package com.class29;

public abstract class Task {
	public abstract void open();
	public void edit() {
		System.out.println("im edit");
		
	}
	public void close() {
		System.out.println("im close");
	}
}

class javaFile extends Task{
	@Override
	public void open() {
	System.out.println("open .java file");
	}
}
	
	
class wordFile extends Task{
	@Override
	public void open() {
		System.out.println("open wordfile ");
	}
	
}
class PDFFile extends Task{
	@Override
	public void open() {
		System.out.println("open pdffile");
	}
}

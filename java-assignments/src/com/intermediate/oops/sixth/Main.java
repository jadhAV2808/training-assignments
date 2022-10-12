package com.intermediate.oops.sixth;

public class Main {

	public static void main(String[] args) {
		Persistence file=new FilePersistence();
		Persistence data=new DatabasePersistence();
		
		file.persist();
		data.persist();
	}

}

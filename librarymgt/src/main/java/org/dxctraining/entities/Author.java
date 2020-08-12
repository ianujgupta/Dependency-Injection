package org.dxctraining.entities;

public class Author {
	private String id;
	private String name;
	
	public Author(String id,String name){	
		this.id=id;
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setId(String id){
		this.id=id;
	}

	public String getId() {
		return id;
	}
}

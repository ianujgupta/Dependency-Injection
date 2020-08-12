package org.dxctraining.exceptions;

public class BookNotFoundException extends RuntimeException {	 
		public BookNotFoundException(String msg){
			super(msg);
		}	
}

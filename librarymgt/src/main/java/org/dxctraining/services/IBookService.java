package org.dxctraining.services;
import org.dxctraining.entities.*;
import java.util.List;

public interface IBookService {

	public void addBook(Book book);

	public Book bookDetails(Book book);

	public void remove(String id);

	public Book updateBook(String id, double cost);
	
	public Book updateBookName(String id,String Name);

	public Book findBookById(String id);

	 List<Book> findAllBook();
	
}

package org.dxctraining.dao;
import org.dxctraining.entities.Book;
import java.util.*;

public interface IBookImpl {
	
	void addBook(Book book);

	Book bookDetails(Book book);

	void remove(String id);
	
	public Book updateBookName(String id, String name);

	public Book findBookById(String id);

	 List<Book> findAllBooks();

	Book updateBook(String id, double cost);
}

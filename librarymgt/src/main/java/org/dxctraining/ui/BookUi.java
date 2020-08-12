package org.dxctraining.ui;

import java.util.List;

import javax.annotation.PostConstruct;

import org.dxctraining.entities.Author;
import org.dxctraining.entities.Book;
import org.dxctraining.exceptions.BookNotFoundException;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.dxctraining.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BookUi {
	@Autowired
	private IBookService bookService;
	@PostConstruct
	private void runUi() {

		try {
			Author author1 = new Author("linux", "Linus Torvald");
			Author author2 = new Author("java", "james Gosling");
			Author author3 = new Author("C", "yashwant kanetkar");
			Author author4 = new Author("C++", "xyz");

			Book book1 = new Book("11", "Mohan", 2000, author1);
			Book book2 = new Book("22", "Sohan", 3000, author2);
			Book book3 = new Book("33", "Rohan", 4000, author3);
			Book book4 = new Book("44", "Gohan", 5000, author4);
			bookService.addBook(book1);
			bookService.addBook(book2);
			bookService.addBook(book3);
			bookService.addBook(book4);

		} catch (BookNotFoundException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (InvalidArgumentException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		displayAll();
	}

	public void displayAll() {
		List<Book> list = bookService.findAllBook();
		for (Book book : list) {
			display(book);
		}
	}

	public void display(Book book) {
		System.out.println("*******Book and Author Details*************");
		System.out.println("book-- " + book.getId() + " " + book.getName() + " " + book.getCost());
		Author author = book.getAuthor();
		System.out.println("Author " + author.getName() + " Id=" + author.getId());

	}
}

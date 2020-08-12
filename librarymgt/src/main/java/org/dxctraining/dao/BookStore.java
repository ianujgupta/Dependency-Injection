package org.dxctraining.dao;

import java.util.HashMap;
import java.util.Map;

import org.dxctraining.entities.Book;

public class BookStore {
	private static Map<String, Book> store = new HashMap<>();

	public static Map<String, Book> getStore() {
		return store;
	}
}

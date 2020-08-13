package com.dxctraining.dao;
import com.dxctraining.entities.Item;

public interface IItemDao {

	    Item findItemById(int id);

	    Item update(Item item);

	    Item save(Item item);

	    void remove(int id);
	}

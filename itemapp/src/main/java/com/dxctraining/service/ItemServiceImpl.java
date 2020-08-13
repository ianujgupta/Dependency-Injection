package com.dxctraining.service;

import com.dxctraining.dao.IItemDao;
import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// transactional will inform spring that it has to open transaction at every method in this class
@Transactional
@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private IItemDao dao; 

    @Override
    public Item findItemById(int id) {
    	Item item= dao.findItemById(id);
        return item;
    }


    @Override
    public Item update(Item item) {
        validate(item);
        item=dao.update(item);
        return item;
    }

    @Override
    public Item save(Item item) {
        validate(item);
        item=dao.save(item);
        return item;
    }

    @Override
    public void remove(int id) {
       dao.remove(id);
    }

    public void validate(Object arg){
        if(arg==null){
            throw new InvalidArgumentException("argument is null");
        }
    
	}


}
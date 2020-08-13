package com.dxctraining.dao;

import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.ItemNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public  class ItemDaoImpl implements IItemDao{

    //equivalent to @Autowired
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Item findItemById(int idArg) {
        Item employee=entityManager.find(Item.class,idArg);
        if(employee==null){
            throw new ItemNotFoundException("item not found for id="+idArg);
        }
        return employee;
    }

    @Override
    public Item update(Item item) {
        item=entityManager.merge(item);
        return item;
    }

    @Override
    public Item save(Item item) {
        entityManager.persist(item);//insertion
        return item;
    }

    @Override
    public void remove(int id) {
     Item item= findItemById(id) ;
     entityManager.remove(item);
    }
}
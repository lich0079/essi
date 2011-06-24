package com.joinbright.grsm.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO {


    public List findAllObjects(Class clazz);

    public Object findObjectById(Class clazz, Serializable id);

    public void saveObject(Object o);

    public void removeObject(Object o);

    public void updateObject(Object o);


}


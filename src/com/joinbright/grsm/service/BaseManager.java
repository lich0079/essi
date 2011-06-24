package com.joinbright.grsm.service;

import com.joinbright.grsm.dao.BaseDAO;


public interface BaseManager {

    /**
     * Expose the setDAO method for testing purposes
     * 
     * @param dao
     */
    public void setDAO(BaseDAO dao);

}

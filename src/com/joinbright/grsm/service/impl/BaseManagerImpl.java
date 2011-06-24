/**
 * 
 */
package com.joinbright.grsm.service.impl;

import org.apache.log4j.Logger;

import com.joinbright.grsm.dao.BaseDAO;
import com.joinbright.grsm.service.BaseManager;


/**
 * @author baiyj Jan 18, 2008
 * 
 */
public class BaseManagerImpl implements BaseManager {

    protected final Logger logger = Logger.getLogger(getClass());

	protected BaseDAO dao;

	public void setDAO(BaseDAO dao) {
		this.dao = dao;

	}

}

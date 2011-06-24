package com.joinbright.grsm.dao.impl.ibatis;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.joinbright.grsm.dao.BaseDAO;



/**
 * iBATIS的DAO实现基类
 * 
 * 注意，如果要使用这个基类，在编写iBATIS映射文件的时候，需要遵守一定的命名规则
 * 1、namespace请取值为类名
 * 2、SQL语句的id请统一命名为：save/update/findAll/findById
 * 
 * @author Administrator
 *
 */
public class BaseDAOImpl extends SqlMapClientDaoSupport implements BaseDAO {

	public void removeObject(Object entity) {
		getSqlMapClientTemplate().update(entity.getClass().getSimpleName()+".remove", entity);
	}

	public List findAllObjects(Class entityClass) {
		return getSqlMapClientTemplate().queryForList(entityClass.getSimpleName()+".findAll");
	}

	public Object findObjectById(Class entityClass, Serializable id) {
		return getSqlMapClientTemplate().queryForObject(entityClass.getSimpleName()+".findById",id);
	}

	public void saveObject(Object entity) {
		getSqlMapClientTemplate().insert(entity.getClass().getSimpleName()+".save", entity);
	}

	public void updateObject(Object entity) {
		getSqlMapClientTemplate().insert(entity.getClass().getSimpleName()+".update", entity);
	}

}

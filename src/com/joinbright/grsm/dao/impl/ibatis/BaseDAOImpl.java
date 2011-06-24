package com.joinbright.grsm.dao.impl.ibatis;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.joinbright.grsm.dao.BaseDAO;



/**
 * iBATIS��DAOʵ�ֻ���
 * 
 * ע�⣬���Ҫʹ��������࣬�ڱ�дiBATISӳ���ļ���ʱ����Ҫ����һ������������
 * 1��namespace��ȡֵΪ����
 * 2��SQL����id��ͳһ����Ϊ��save/update/findAll/findById
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

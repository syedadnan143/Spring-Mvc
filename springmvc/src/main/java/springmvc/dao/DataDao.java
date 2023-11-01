package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Data;
@Repository
public class DataDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
    public int saveData(Data data) {	
    int id =	(Integer)this.hibernateTemplate.save(data);
    return id;
	 
 }
}

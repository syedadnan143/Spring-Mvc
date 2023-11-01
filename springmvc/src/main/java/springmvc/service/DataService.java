package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.DataDao;
import springmvc.model.Data;
@Service
public class DataService {
	@Autowired
     private DataDao dataDao;
	public int createData(Data data) {
		return this.dataDao.saveData(data);
		
	}
}

package hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hospital.dao.*;
import hospital.model.*;

@Service
public class Services implements IServices {

	@Autowired
	public IPatientDao Dao;

	@Transactional
	public void add(Patient pt) {
		Dao.add(pt);
		
	}
	@Transactional
	public void delete(Patient pt) {
		Dao.delete(pt);
		
	}
	@Transactional
	public void update(Patient pt) {
		Dao.update(pt);
		
	}
	@Transactional
	public List<Patient> selection() {
		return Dao.selection();
	}
	
	
	
}
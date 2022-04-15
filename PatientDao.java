package hospital.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hospital.model.*;
@Repository
public class PatientDao implements IPatientDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Patient pt) {
		sessionFactory.getCurrentSession().save(pt);
		
	}

	public void delete(Patient pt) {
		sessionFactory.getCurrentSession().delete(pt);
		
	}

	public void update(Patient pt) {
		sessionFactory.getCurrentSession().update(pt);
		
	}

	public List<Patient> selection() {
		List<Patient> pt = (List<Patient>) sessionFactory.getCurrentSession()
                .createCriteria(Patient.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return pt;
	}

	
}

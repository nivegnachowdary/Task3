package hospital.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import hospital.model.*;
@Repository
public interface IPatientDao {
	
	void add(Patient pt);
	void delete(Patient pt);
	void update(Patient pt);
	List<Patient> selection();
}
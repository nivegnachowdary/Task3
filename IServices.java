package hospital.services;

import java.util.List;

import hospital.model.*;

public interface IServices {
	void add(Patient pt);
	void delete(Patient pt);
	void update(Patient pt);
	List<Patient> selection();
}
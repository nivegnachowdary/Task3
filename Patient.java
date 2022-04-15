package hospital.model;

import javax.persistence.*;


@Table(name = "Patient")
@Entity

public class Patient {
	@Id
	private int id;

	@Column(name = "FirstName")
	private String firstname;

	@Column(name = "LastName")
	private String lastname;

	@Column(name = "Mobile")
	private String mobile;
	
	@Column(name = "WardName")
	private String wardname;

	public Patient() {
	}

	
	
	public Patient(int id, String firstname, String lastname, String mobile, String wardname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.wardname = wardname;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWardname() {
		return wardname;
	}

	public void setWardname(String wardname) {
		this.wardname = wardname;
	}

	
}

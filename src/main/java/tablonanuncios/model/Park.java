package tablonanuncios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Park {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idpark;
	@Id
	private String name;
	private String telephone;
	private String address;
	private String email;
	

	public Park() {
	}

	public Park(String name, String telephone, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}
	
	public long getIdpark() {
		return idpark;
	}

	public void setIdpark(long idpark) {
		this.idpark = idpark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Park [Id=" + idpark + ", Name=" + name + ", Address=" + address + ", Telephone="
				+ telephone + ", Email=" + email + "]";
	}
}

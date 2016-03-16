//package bd-practica1;
package tablonanuncios.model;

import java.awt.image.BufferedImage;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idperson;
	@Id
	private String name;
	@Id
	private String lastname;
	private String email;
	private String telephone;
	private String movile;

	public enum Job{
					MANAGEMENT(1), SURVEILLANCE(2), PRESERVATION(3), RESEARCH(4);
					private int value;
					private Job (int value) { this.value = value; }
					public int getValue() { return value; }
					public void setValue(int value) { this.value = value; }			
					}
	private BufferedImage image;

	public Person() {
	}

	public Person(String name, String lastname, String email, String telephone, String movile, BufferedImage image) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
		this.movile = movile;
		this.image = image;
	}
	
	public long getIdperson() {
		return idperson;
	}

	public void setIdperson(long idperson) {
		this.idperson = idperson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getMovile() {
		return movile;
	}

	public void setMovile(String movile) {
		this.movile = movile;
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Person [Id=" + idperson + ", Name=" + name + ", Lastname=" + lastname + ", Email=" + email + 
				", Telephone=" + telephone + ", Movile=" + movile + ", Image=" + image +"]";
	}
}
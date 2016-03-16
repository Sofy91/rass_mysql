//package bd-practica1;
package tablonanuncios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idarea;
	@Id
	private String name;
	private int length;
	private String description;

	public Area() {
	}

	public Area(String name, int length, String description) {
		this.name = name;
		this.length = length;
		this.description = description;
	}
	
	public long getIdarea() {
		return idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Area [Id=" + idarea + ", Name=" + name + ", Length=" + length + ", Description=" + description + "]";
	}

}

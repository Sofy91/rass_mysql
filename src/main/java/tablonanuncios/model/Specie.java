//package bd-practica1;
package tablonanuncios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Specie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idspecie;
	@Id
	private String name;
	private String scientificName;
	private Set<String> areas = new HashSet<>();
	private BufferedImage image;

	public enum Type{
	    ANIMAL(1), VEGETABLE(2), FUNGUS(3);
	    private int value;
	    private Type (int value) { this.value = value; }
		public int getValue() { return value; }
		public void setValue(int value) { this.value = value; }
	}
	
	public Specie() {
	}

	public Specie(String name, String scientificName, Set<String> areas, BufferedImage image) {
		this.name = name;
		this.scientificName = scientificName;
		this.areas = areas;
		this.image = image;
	}
	
	public long getIdspecie() {
		return idspecie;
	}

	public void setIspecie(long idspecie) {
		this.idspecie = idspecie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public Set<String> getAreas() {
		return areas;
	}

	public void setAreas(Set<String> areas) {
		this.areas = areas;
	}
	
	@Override
	public String toString() {
		return "Specie [Id=" + idspecie + ", Name=" + name + ", Scientific Name=" + scientificName + 
				", Areas=" + areas.toString() + ", Image=" + image + "]";
	}
}

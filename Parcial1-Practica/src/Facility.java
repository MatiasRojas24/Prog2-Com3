
public class Facility {

	private String category;
	private String location;
	private String name;
	private String type;
	private Campus campus;
	public Facility(){
	}

	public Facility(String category, String location, String name, String type) {
		this.category = category;
		this.location = location;
		this.name = name;
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}
}
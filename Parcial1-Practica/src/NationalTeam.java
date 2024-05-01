import java.util.ArrayList;

public class NationalTeam {

	private String color;
	private String country;
	private ArrayList<Athlete> athletes;

	public NationalTeam(){
	}
	public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.athletes = new ArrayList<Athlete>();
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Athlete> getAthletes() {
		return athletes;
	}

	public void addAthletes(Athlete athlete) {
		this.athletes.add(athlete);
	}
}
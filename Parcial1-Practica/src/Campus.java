import java.util.ArrayList;

public class Campus {

	private String date;
	private String hour;
	private int phase;
	private ArrayList<Trial> trials;
	private ArrayList<Facility> facilities;

	public Campus(){
	}

	public Campus(String date, String hour, int phase, Facility facility) {
		this.date = date;
		this.hour = hour;
		this.phase = phase;
		this.trials = new ArrayList<>();
		this.facilities = new ArrayList<>();
		this.facilities.add(facility);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public ArrayList<Trial> getTrials() {
		return trials;
	}

	public void addTrials(Trial trials) {
		this.trials.add(trials);
	}

	public ArrayList<Facility> getFacilities() {
		return facilities;
	}

	public void addFacilities(Facility facilities) {
		this.facilities.add(facilities);
	}
}
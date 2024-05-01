import java.util.ArrayList;

public class Trial {

	private int code;
	private String title;
	private ArrayList<Athlete> participants;
	private Campus campus;
	public Trial(){

	}
	public Trial(int code, String title) {
		this.code = code;
		this.title = title;
		this.participants = new ArrayList<>();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Athlete> getParticipants() {
		return participants;
	}
	public void addAthletes(Athlete athlete){
		this.participants.add(athlete);
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}
}
import java.lang.Math;
import java.util.Random;
public class Athlete extends Person implements Contract{

	private int age;
	private double height;
	private double weight;

	public Athlete(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Athlete(int dni, String name, int age, double height, double weight) {
		super(dni, name);
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI(){
		return this.weight / Math.pow(this.height, 2);
	}

	public double takePulses(){
		Random random = new Random();
		double randomDouble = random.nextDouble(60,100);
		return Math.round(randomDouble * Math.pow(10, 2)) / Math.pow(10, 2);
	}


	public boolean thereIsExtraWeight(double weight){
        return calculateBMI() >= 25;
	}

}
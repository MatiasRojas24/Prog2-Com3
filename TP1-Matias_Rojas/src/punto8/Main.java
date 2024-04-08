package punto8;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Juan Mansilla",44,600000,"d1");
        Worker w1 = new Worker("Roberto Arias", 37, 420000,"a1");
        w1.work();
        m1.work();
        m1.organizeActivities();
        w1.produce();
    }
}

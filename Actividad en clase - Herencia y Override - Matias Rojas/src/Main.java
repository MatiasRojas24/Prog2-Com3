public class Main {
    public static void main(String[] args) {
        Executive e1 = new Executive("Juan Silva", "35346201");
        Official of1 = new Official("Carlos Mansilla","37823675",27);
        System.out.println(e1);
        System.out.println(of1);
        e1.trabajar();
        of1.trabajar();
        of1.cobrarSueldo();
    }
}

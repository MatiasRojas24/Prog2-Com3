public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("Caballero sagrado",1);
        Rogue r1 = new Rogue("Ladrón",100);
        Mage m1 = new Mage("Mago de fuego",100);
        System.out.println(w1);
        System.out.println(r1);
        System.out.println(m1);

        w1.defend(m1.attack());
        m1.defend(r1.attack());
    }
}

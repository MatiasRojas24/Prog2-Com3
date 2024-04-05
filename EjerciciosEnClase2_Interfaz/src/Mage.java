import java.util.Random;

public class Mage extends BaseCharacter{
    private String weapon;
    private int hp;
    private int mana;
    private int attackDamage;
    private int armor;
    private int agility;

    public Mage(String name, int level) {
        super(name, level);
        if (level < 0 ){setLevel(1);}
        if (level > 100){setLevel(100);}
        this.weapon = "Fire Staff";
        this.hp = 200 * getLevel();
        this.mana = 100 * getLevel();
        this.attackDamage = 20 * getLevel();
        this.armor = 5 * getLevel();
        this.agility = 7 * getLevel();
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    @Override
    public String toString() {
        return "Mago: "+getName()+"\n Nivel: "+getLevel()+"\n Puntos de vida: "+hp+"\n Maná: "+mana+"\n Daño de ataque: "+attackDamage+"\n Armadura: "+armor+"\n Agilidad: "+agility+"\n Arma: "+weapon+"\n";    }
    @Override
    public int attack() {
        Random random = new Random();
        int damage = this.attackDamage;
        int critChance = random.nextInt(10)+1;
        if (critChance > 8) {
            System.out.println(getName() + " atacó con un critico");
            System.out.println();
            return damage*2;
        } else {
            System.out.println(getName() + " atacó sin critico");
            System.out.println();
            return damage;
        }
    }

    @Override
    public void defend(int damage) {
        int damageDigits = String.valueOf(damage).length();
        double Reduction = Math.pow(10,damageDigits+1);
        double damageReceived = Math.abs((damage * (1 - this.armor / Reduction)));
        setHp(this.hp - (int) damageReceived);
        System.out.println(getName() + " recibió " + damageReceived + " puntos de daño");
        System.out.println();
        if (this.hp <= 0) {
            System.out.println(getName() + " ha muerto");
            System.out.println();
        }else{
            System.out.println(getName()+" Tiene "+this.hp+" puntos de vida restantes");
            System.out.println();
        }
    }
}

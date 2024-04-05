public class BaseCharacter implements Character{
    private String name;
    private int level;

    public BaseCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void defend(int damage) {
    }
}

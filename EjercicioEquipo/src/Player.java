public class Player {
    private String name;
    private String position;
    private int shirtNum;

    public Player() {
    }

    public Player(String name, String position, int shirtNum) {
        this.name = name;
        this.position = position;
        this.shirtNum = shirtNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShirtNum() {
        return shirtNum;
    }

    public void setShirtNum(int shirtNum) {
        this.shirtNum = shirtNum;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + name + '\n' +
                "Posición: " + position + '\n' +
                "Número de camiseta: " + shirtNum + '\n';
    }
}

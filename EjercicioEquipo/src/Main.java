public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Iker Casillas","Arquero",1);
        Player p2 = new Player("Lionel Messi","Delantero",10);
        Player p3 = new Player("Cristian Romero","Defensa",17);

        Team t1 = new Team(new Player[]{p1, p2, p3});
        for (Player player : t1){
            System.out.println(player);
        }

    }
}

import java.util.Iterator;
public class Team implements Iterable<Player> {
    private Player[] players;

    public Team(Player[] players) {
        this.players = players;
    }

    @Override
    public Iterator<Player> iterator() {
        return new pIterator();
    }
    public class pIterator implements Iterator<Player>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < players.length;
        }

        @Override
        public Player next() {
            return players[index++];
        }
    }
}

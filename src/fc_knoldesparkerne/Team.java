package fc_knoldesparkerne;

import java.util.ArrayList;

/**
 *
 * @author RODA
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private Player coach;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getCoach() {
        return coach;
    }
    
    public void setCoach(Player player){
        this.coach = player;
    }
    
    public void add(Player player){
        players.add(player);
    }
    
    public void remove(Player player){
        players.remove(player);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (!this.name.equalsIgnoreCase(other.name)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        return name;
    }
}

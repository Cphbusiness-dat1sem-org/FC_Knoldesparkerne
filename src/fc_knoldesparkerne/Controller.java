package fc_knoldesparkerne;

import java.util.ArrayList;

/**
 * 
 * @author RODA
 */
public class Controller {
    
    public ArrayList<Player> getPlayers(Team team){
        team.
    }

    public Player getPlayer(Team team, String playername){
        throw new UnsupportedOperationException();
    }

    public Player getCoach(ArrayList<Team> teams, String teamname){
        throw new UnsupportedOperationException();
    }

    public ArrayList<Player> notPaid(Team team, int year){
        throw new UnsupportedOperationException();
    }
    
    public boolean isCoach(ArrayList<Team> teams, Player player){
        throw new UnsupportedOperationException();
    }

    public int getPaymentPerAge(int age){
        throw new UnsupportedOperationException();
    }
    
    public int calculatePayment(Player player, ArrayList<Team> teams, int year){
        throw new UnsupportedOperationException();
    }

    public int getExpectedRevenue(Team team, int year){
        throw new UnsupportedOperationException();
    }

    public int missingRevenue(ArrayList<Team> teams, int year){
        throw new UnsupportedOperationException();
    }

}

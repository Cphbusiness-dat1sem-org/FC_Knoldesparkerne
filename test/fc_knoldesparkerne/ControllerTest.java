//package fc_knoldesparkerne;
//
//import java.util.ArrayList;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author RODA
// */
//public class ControllerTest {
//    private Controller c;
//    private Team teamSanta, teamMonster;
//    private Player[] santaPlayers, monsterPlayers;
//    private Player santaCoach, monsterCoach;
//    private ArrayList<Team> teams;
//    
//    @Before
//    public void setUp() {
//        c = new Controller();
//        
//        teamSanta = new Team("Santa");
//        santaPlayers = new Player[8];
//        santaPlayers[0] = new Player("Dasher", 2012);
//        santaPlayers[1] = new Player("Dancer", 2012);
//        santaPlayers[2] = new Player("Prancer", 2012);
//        santaPlayers[3] = new Player("Vixen", 2012);
//        santaPlayers[4] = new Player("Comet", 2012);
//        santaPlayers[5] = new Player("Cupid", 2012);
//        santaPlayers[6] = new Player("Thunder", 2012);
//        santaPlayers[7] = new Player("Lightning", 2012);
//        for(Player p : santaPlayers) { teamSanta.add(p); }
//        santaCoach = new Player("Rudolph", 2005);
//        teamSanta.setCoach(santaCoach);
//        for(Player p : santaPlayers) { 
//            for(int year = 2015; year <= 2018; year++){
//                p.registerPayment(year); 
//            }
//        }
//        
//        teamMonster = new Team("Monsters");
//        monsterPlayers = new Player[6];
//        monsterPlayers[0] = new Player("Dracula", 2012);
//        monsterPlayers[1] = new Player("The invisible man", 2012);
//        monsterPlayers[2] = new Player("Mummy", 2012);
//        monsterPlayers[3] = new Player("Wolfie", 2012);
//        monsterPlayers[4] = new Player("Frankie the Fish", 2012);
//        monsterPlayers[5] = new Player("The Easter bunny", 2012);
//        for(Player p : monsterPlayers) { teamMonster.add(p); }
//        monsterCoach = new Player("Frankenstein", 2005);
//        teamMonster.setCoach(monsterCoach);
//        for(Player p : monsterPlayers) { 
//            if(p.equals(monsterPlayers[1])) continue;
//            if(p.equals(monsterPlayers[4])) continue;
//            for(int year = 2015; year <= 2018; year++){
//                p.registerPayment(year); 
//            }
//        }
//        
//        teams = new ArrayList<>();
//        teams.add(teamSanta);
//        teams.add(teamMonster);
//    }
//
//    @Test
//    public void testGetPlayers() {
//        assertEquals(8, c.getPlayers(teamSanta).size());
//        assertFalse(c.getPlayers(teamSanta).isEmpty());
//    }
//
//    @Test
//    public void testGetPlayer() {
//        assertEquals(santaPlayers[3], c.getPlayer(teamSanta, "vixen"));
//        assertNotEquals(santaPlayers[3], c.getPlayer(teamSanta, "dancer"));
//    }
//
//    @Test
//    public void testGetCoach() {
//        assertEquals(santaCoach, c.getCoach(teams, "Santa"));
//        assertNotEquals(monsterCoach, c.getCoach(teams, "Santa"));
//    }
//
//    @Test
//    public void testNotPaid() {
//        ArrayList<Player> res = c.notPaid(teamMonster, 2017);
//        assertFalse(res.isEmpty());
//        assertEquals(2, res.size());
//        assertEquals(monsterPlayers[1], res.get(0));
//        assertEquals(monsterPlayers[4], res.get(1));
//    }
//
//    @Test
//    public void testIsCoach() {
//        assertTrue(c.isCoach(teams, santaCoach));
//        assertFalse(c.isCoach(teams, santaPlayers[3]));
//    }
//
//    @Test
//    public void testGetPaymentPerAge() {
//        int age = 2018 - santaPlayers[0].getBirthYear();
//        assertEquals(450, c.getPaymentPerAge(age));
//        
//        age = 2018 - santaCoach.getBirthYear();
//        assertEquals(650, c.getPaymentPerAge(age));
//    }
//
//    @Test
//    public void testCalculatePayment() {
//        assertEquals(450, c.calculatePayment(santaPlayers[0], teams, 2018));
//        assertEquals(0, c.calculatePayment(santaCoach, teams, 2018));
//    }
//
//    @Test
//    public void testGetExpectedRevenue() {
//        assertEquals(3600, c.getExpectedRevenue(teamSanta, 2019));
//        assertEquals(2700, c.getExpectedRevenue(teamMonster, 2019));
//    }
//
//    @Test
//    public void testMissingRevenue() {
//        assertEquals(900, c.missingRevenue(teams, 2018));
//        assertEquals(6300, c.missingRevenue(teams, 2019));
//    }
//}

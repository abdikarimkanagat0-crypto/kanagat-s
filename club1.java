package club;

import java.util.ArrayList;

public class club1 {
    public static void main(String[] args) {
        Player Puyoll = new Player("10 mln","Цп",1970);
        Player player = new Player();
        System.out.println(Puyoll.getPrice()+" "+ Puyoll.getPosition()+" "+ Puyoll.getYear());
        ArrayList<Player> team = new ArrayList<>();
        for (int i = 0;i<10;i++){
            team.add(new Player());
            System.out.println("Player added");
        }
        Player Figo = team.get(team.size()-1);
        Figo.setPosition("LW");
        System.out.println(Figo.getPosition());

        Player Messi = team.get(team.size()-1);
        Messi.setPosition("RW");
        System.out.println(Messi.getPosition());
        System.out.println(Puyoll);
    }
}


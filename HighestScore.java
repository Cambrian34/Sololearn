import java.util.*; 

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        Object current=0;
        Iterator hm = players.entrySet().iterator();
        while(hm.hasNext()){
            Map.Entry El = (Map.Entry)hm.next();
            if((int)El.getValue() > (int)current){
                current = El.getValue();
            }
        }
        Object en =current;
        players.forEach((key, value) -> {
    if (value.equals(en)) {
        System.out.print(key);
    }
});
       // System.out.println(players.keySet());
    }
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}

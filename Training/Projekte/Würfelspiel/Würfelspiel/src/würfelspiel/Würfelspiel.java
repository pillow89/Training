package würfelspiel;

/**
 *
 * @author jonas
 */
public class Würfelspiel {
    
    /*
    
    boolean => true/false
    char => einzelnes Zeichen
    
    byte => sehr kleine Zahl
    short => kleine Zahl
    int => normale Zahl
    long => sehr große Zahl
    
    float => kommazahlen
    double => große Kommazahlen
    
    */
    
    public static int getChance(int chance) {
        return 50 - ((chance - 1) * 10);
    }
    
    // String
    
    public static void main(String[] args) {

        int money = 100;
        byte input = 25;
        byte round = 1;
        int dice = (int)(Math.random() * 6 + 1);
        
        int chanceMaximum = 6 - dice;
        int chanceMinimum = 1 - dice;
        
        if (chanceMinimum < 0) {
            chanceMinimum *= (-1);
        }
        
        int goalMaximum = getChance(chanceMaximum);
        int goalMinimum = getChance(chanceMinimum);
        
        
        /*   
        
        1/6  -> 50
        2/6 ->  40 
        3/6 ->  30
        4/6 -> 20
        5/6 -> 10
              
        
          1   höher: 2,3,4,5,6 -> 5/6
              niedriger: geht nicht.
        
          6  höher: geht nicht
             niedriger: 5/6
        
          2 höher: 4/6
            niedriger: 1/6
        */
        
        System.out.println("Der Computer würfelt " + dice);
        System.out.println("Folgende Möglichkeiten stehen zur Verfügung:");
        
        if (chanceMaximum == 0) {
            System.out.println("hoeher-> geht nicht.");
        } else {
            System.out.println("hoeher-> Gewinn: " + goalMaximum);
        }
        
        if (chanceMinimum == 0) {
            System.out.println("niedriger-> geht nicht.");
        } else {
            System.out.println("niedriger-> Gewinn: " + goalMinimum);    
        }
        
        System.out.println("gleich-> Gewinn: 50");
        
    }

}
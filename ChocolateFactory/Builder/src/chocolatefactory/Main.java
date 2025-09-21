package chocolatefactory;

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        
        boiler.fill();
        boiler.mix();
        boiler.drain();
        
 
    }
}

package chocolatefactory;

public class ChocolateBoiler {
    private boolean empty; //Indica si esta vacio
    private boolean heating;//Indica si la resistencia esta encendida

    // Instancia unica
    private static ChocolateBoiler instance;

  //Constructor privado
    private ChocolateBoiler() {
        empty = true;
        heating = false; 
    }
    //Metodo para obtener la instancia unica
    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    //Llenar solo si esta vacio y resistencia apagada
    public void fill() {
        if (empty && !heating) {
            empty = false;
            System.out.println("El boiler se llenó con chocolate y leche.");
        } else {
            System.out.println("No se puede llenar: debe estar vacío y la resistencia apagada.");
        }
    }
    //Iniciar mezcla solo si esta lleno y resistencia apagada
    public void mix() {
        if (!empty && !heating) {
            heating = true;
            System.out.println("El boiler inicia el proceso de mezcla.");
        } else {
            System.out.println("No se puede mezclar: debe estar lleno y la resistencia apagada.");
        }
    }
    // Vaciar solo si no esta vacio y resistencia encendida 
    public void drain() {
        if (!empty && heating) {
            empty = true;
            heating = false;
            System.out.println("El boiler se vació después de mezclar.");
        } else {
            System.out.println("No se puede vaciar: debe estar lleno y la resistencia encendida.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isHot() {
        return heating;
    }
}

    
    







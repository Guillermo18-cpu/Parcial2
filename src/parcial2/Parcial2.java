package parcial2;

public class Parcial2 {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Escamas de fuego", "ShenLong"); // En este caso se esta creando las criaturas de clase criatura
        Mago mago = new Mago("Bomba atomica", "Harry Potter");
        Guerrero guerrero = new Guerrero("Espadas del caos", "Kratos");
        
        System.out.println("---------Batalla 1----------");
        simularBatalla(dragon, mago); // Aqui lo que esta haciendo es el metodo simular batalla es agrupar las criaturas para generar las batallas entre ellas
        dragon.setSalud(100);
        mago.setSalud(100);
        System.out.println("\n");
        System.out.println("---------Batalla 2----------");
        simularBatalla(mago, guerrero);
        guerrero.setSalud(100);
        System.out.println("\n");
        System.out.println("---------Batalla 3----------");
        simularBatalla(dragon, guerrero);
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("\n----------Batalla entre " + c1.getNombre() + " y " + c2.getNombre()+"----------");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
        }
        
        if (c1.estaViva()) {
            System.out.println("----------"+c1.getNombre() + " ha ganado la batalla con " + c1.getSalud() + " de salud restante.----------");
        } else {
            System.out.println("----------"+c2.getNombre() + " ha ganado la batalla con " + c2.getSalud() + " de salud restante.----------");
        }
    }
}


    


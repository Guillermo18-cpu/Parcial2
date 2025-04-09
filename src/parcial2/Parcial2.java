package parcial2;

public class Parcial2 {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Escamas de fuego", "ShenLong"); // En este caso se esta creando las criaturas que heredan de la clase Criatura
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

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("\n----------Batalla entre " + criatura1.getNombre() + " y " + criatura2.getNombre() + "----------");

        // Esta condicion permite que la batalla se ejecute mientras ambas criatura esten vivas
        while (criatura1.estaViva() && criatura2.estaViva()) {
            criatura1.atacar(criatura2); // La primera criatura ataca a la segunda
            if (criatura2.estaViva()) {
                criatura2.atacar(criatura1); // Si la segunda criatura sigue con vida, contraataca
            }
        }

        // Se muestra por pantalla la criatura que gano la batalla y cuanta vida le queda
        if (criatura1.estaViva()) {
            System.out.println("----------" + criatura1.getNombre() + " ha ganado la batalla con " + criatura1.getSalud() + " de salud restante.----------");
        } else {
            System.out.println("----------" + criatura2.getNombre() + " ha ganado la batalla con " + criatura2.getSalud() + " de salud restante.----------");
        }
    }
}
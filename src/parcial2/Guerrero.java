package parcial2;

public class Guerrero extends Criatura {

    //Se creo una variable privada tipo String.
    private String arma;

    //Se creo el metodo constructor atrayendo las variables de la clase "Criatura" junto con la variable "arma" de la clase "Guerrero".
    public Guerrero(String arma, String nombre) {
        super(nombre, 100, 25);
        this.arma = arma;
    }

    // Se crearon los metodos get y set de la variable "arma"
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    //se sobreescribe el metodo defender
    @Override
    public void defender(int daño) {
        setSalud(getSalud() - daño);
        System.out.println("\n" + getNombre() + " intenta bloquear el ataque del " + arma + " causando " + daño + " de dano y queda con una vida de " + getSalud());

    }

    //se sobreescribe el metodo atacar
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " ataca con su " + arma + " a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

}
package parcial2;

public class Dragon extends Criatura {

    //Se creo una variable privada tipo String.
    private String escamas;

    //Se creo el metodo constructor atrayendo las variables de la clase "Criatura" junto con la variable "arma" de la clase "Dragon".
    public Dragon(String escamas, String nombre) {
        super(nombre, 100, 25);
        this.escamas = escamas;
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    //se sobreescribe el metodo defender
    @Override
    public void defender(int daño) {
        super.setSalud(super.getSalud() - daño);
        System.out.println("\n" + getNombre() + " intenta bloquear el ataque con sus escamas, pero no lo logra y recibe " + daño + " de dano y queda con una vida de " + getSalud());
    }

    //se sobreescribe el metodo atacar, recordemos que la criatura es dragon, por ende su daño se duplica
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2;
        System.out.println("\n" + getNombre() + " lanza un aliento de fuego a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

}
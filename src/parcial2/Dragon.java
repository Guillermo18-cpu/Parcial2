package parcial2;

public class Dragon extends Criatura {

    //Se creo una variable privada tipo String.
    private String escamas;

    //Se creo el metodo constructor atrayendo las variables de la clase "Criatura" junto con la variable "arma" de la clase "Dragon".
    public Dragon(String escamas, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
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
        System.out.println(getNombre() + " intenta bloquear el ataque con sus escamas, pero no lo logra y recibe " + daño + " de daño.");
    }

    //se sobreescribe el metodo atacar, recordemos que la criatura es dragon, por ende su daño se duplica
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2;
        System.out.println(getNombre() + " lanza un aliento de fuego a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

}

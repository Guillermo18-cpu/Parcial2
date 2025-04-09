package parcial2;

public class Mago extends Criatura {

    // Se creo una variable tipo String.
    private String hechizo;

    // Se creo el metodod constructor extrayendo las variables de la clase Criatura
    public Mago(String hechizo, String nombre) {
        super(nombre, 100, 25);
        this.hechizo = hechizo;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println("-" + getNombre() + " ataca con su " + hechizo + " a " + objetivo.getNombre());
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        super.setSalud(super.getSalud() - daño);
        System.out.println("-" + getNombre() + " bloquea el ataque con su hechizo, pero no lo logra y recibe " + daño + " de dano y queda con una vida de " + getSalud());
    }

}
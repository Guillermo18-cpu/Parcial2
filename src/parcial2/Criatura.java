package parcial2;

public abstract class Criatura {

    //se definen los atributos de la clase abstracta.
    private String nombre;
    private int salud, fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    //getters y setters para poder llamar las variables de esta clase en otras.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    //Crean los metodos abstractos que posteriormente se implementaran en otras clases.
    public abstract void atacar(Criatura objetivo);

    public abstract void defender(int daño);

    //Validacion para saber si la criatura esta viva y si asi lo es retorna un valor booleano (true or false).
    public boolean estaViva() {
        if (this.salud > 0) {
            return true;
        } else {
            return false;
        }
    }
}
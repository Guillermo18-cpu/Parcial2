package parcial2;
public abstract class Criatura {
    String nombre;
    int salud, fuerza;

    public abstract void atacar();
    public abstract void defender();

    public boolean estaViva(int salud) {
        if (salud > 0) {
            return true;
        }else {
            return false;
        }
    }

}

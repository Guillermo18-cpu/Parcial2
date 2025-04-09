package parcial2;

public abstract class Guerrero extends Criatura {
    //Se creo una variable tipo String.
    private String arma;
    //Se creo el metodo constructor atrayendo las variables de la clase "Criatura" junto con la variable "arma" de la clase "Guerrero".
    public Guerrero(String arma, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }
    // Se crearon los metodos get y set de la variable "arma"
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    

    // 
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() + 5;
        System.out.println(getNombre() + " ataca con su " + arma + " a " + objetivo.getNombre());
        objetivo.defender(daño);
    }
 
    @Override
    public void defender (int daño){
    
        
    }

}

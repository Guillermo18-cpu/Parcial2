
package parcial2;


public abstract class Dragon extends Criatura{
    private String escamas;

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


    
    

}

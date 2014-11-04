
public class DatosEstadisticos {

    float tiempo;
    
    public DatosEstadisticos() {
        tiempo = 0;
    }
    
    public void añadeTiempo(float tiempo) {
        this.tiempo += tiempo;
    }
    
    public void estableceTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public float dameTiempo() {
        return tiempo;
    }
}

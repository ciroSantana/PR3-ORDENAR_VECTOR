public class CalculadorEstadisticas {

    private DatosEstadisticos[] vector;
    private DatosEstadisticos[][] matriz;
    
    public DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector metodo, int  tam_vector) {
        vector = new DatosEstadisticos[6];
        
        metodo.ordena(GeneraCaso.generaVector(tam_vector, false), vector[0]);
        
        for (int i = 0; i < 11; i++) {
            metodo.ordena(GeneraCaso.generaVector(tam_vector, true), vector[1]);
        
        }
        vector[1].estableceTiempo(vector[1].dameTiempo()/10);
        
        return vector;
    }
    
    public DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        matriz = new DatosEstadisticos[tam_vectores.length][2];
        
        
        for (int i = 0; i < tam_vectores.length; i++) {
            matriz[i] = estadisticaOrdenaVector(m, tam_vectores[i]);
        }
        
        return matriz;
    }
}
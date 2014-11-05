public class CalculadorEstadisticas {

    private DatosEstadisticos[] vector;
    private DatosEstadisticos[][] matriz;
    
    public DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector metodo, int  tam_vector) {
        vector = new DatosEstadisticos[2];
        vector[0] = new DatosEstadisticos();
        vector[1] = new DatosEstadisticos();
        
        metodo.ordena(GeneraCaso.generaVector(tam_vector, false), vector[0]);
        float acumulador = 0;
        
        for (int i = 0; i < 10; i++) {
            metodo.ordena(GeneraCaso.generaVector(tam_vector, true), vector[1]);
            
            acumulador += vector[1].dameTiempo();
        
        }
        vector[1].estableceTiempo(acumulador/10);
        
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
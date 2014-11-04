public class MuestraResultados {

    public static void main(String[] args) {
        
        System.out.print("Orden     Inverso Tiempo (s)");
        System.out.println("    Aleatorio Tiempo(s)");
        DatosEstadisticos estadisticas = new DatosEstadisticos();
        int[] v;

        for (int i = 1000; i <= 32000; i = i*2) {
            
            new Ordenar1Vector().ordena(GeneraCaso.generaVector(i, false), estadisticas);
            
            float aleatorio = 7  ;
            System.out.printf("%6d            %5.2f", i, estadisticas.dameTiempo()/1000);
            
            new Ordenar1Vector().ordena(GeneraCaso.generaVector(i, true), estadisticas);
            
            System.out.printf("           %5.2f\n", estadisticas.tiempo/1000);
        }
    }



}
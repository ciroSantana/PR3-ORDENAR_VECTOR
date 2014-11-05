
public class MuestraResultados {

    public static void main(String[] args) {

        System.out.print("Orden     Inverso Tiempo (s)");
        System.out.println("    Aleatorio Tiempo(s)");
        int[] v = {1000, 2000, 4000, 8000, 16000, 32000};
        DatosEstadisticos[][] test;
        CalculadorEstadisticas calculadorEstadisticas = new CalculadorEstadisticas();
        
        test = calculadorEstadisticas.estadisticasOrdenaVectores(new OrdenarVector() {
            Ordenar1Vector ordenar1Vector = new Ordenar1Vector();

            @Override
            public String nombreMetodo() {
                return ordenar1Vector.nombreMetodo();
            }

            @Override
            public void ordena(int[] v, DatosEstadisticos de) {
                ordenar1Vector.ordena(v, de);
            }
        }, v);

        for (int i = 0; i < test.length; i++) {
            System.out.printf("%6d            %5.2f", v[i], test[i][0].dameTiempo());
            System.out.printf("           %5.2f\n", test[i][1].dameTiempo());
        }

//        for (int i = 1000; i <= 32000; i = i*2) {
//            
//            new Ordenar1Vector().ordena(GeneraCaso.generaVector(i, false), estadisticas);
//            
//            System.out.printf("%6d            %5.2f", i, estadisticas.dameTiempo());
//            
//            new Ordenar1Vector().ordena(GeneraCaso.generaVector(i, true), estadisticas);
//            
//            System.out.printf("           %5.2f\n", estadisticas.dameTiempo());
//        }
    }

}

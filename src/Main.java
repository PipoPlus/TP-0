import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Tiempo no Anemico
        System.out.println("Tiempo no Anemico:");
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();

        System.out.println(tiempoNoAnemico.fechaLarga());
        System.out.println(tiempoNoAnemico.fechaCorta());
        System.out.println("");



        //Tiempo Anemico
        System.out.println("Tiempo Anemico:");

        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        //Uso de la clase TimeService para cumplir con lo requerido
        System.out.println(TimeService.fechaCorta(tiempoAnemico.getFecha()));
        System.out.println(TimeService.fechaLarga(tiempoAnemico.getFecha()));
        System.out.println("");



        //Uso de la clase Record
        System.out.println("Tiempo Record");
        TiempoRecord tiempoRecord = new TiempoRecord(new Date());

        System.out.println(TimeService.fechaCorta(tiempoRecord.fecha()));
        System.out.println(TimeService.fechaLarga(tiempoRecord.fecha()));


    }
}
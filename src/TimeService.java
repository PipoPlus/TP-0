import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeService {


    public static String fechaCorta (Date fecha){

        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        return formatoCorto.format(fecha);
    }

    public static String fechaLarga(Date fecha){

        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        return formatoLargo.format(fecha);
    }





}

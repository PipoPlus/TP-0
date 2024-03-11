import java.text.SimpleDateFormat;
import java.util.Date;

public class TiempoNoAnemico {

    private Date fecha;

    public TiempoNoAnemico(){
        this.fecha = new Date();
    }

    public String fechaCorta (){

        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        return formatoCorto.format(fecha);
    }

    public String fechaLarga(){

        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        return formatoLargo.format(fecha);
    }





}
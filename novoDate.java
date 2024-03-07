import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class novoDate {
    public static void main(String[] args) throws ParseException {
        Date data1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date atentadoTerrorista = sdf.parse("11/09/2002");
        sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(atentadoTerrorista);
        System.out.println(sdf.format(data1));
    }
}

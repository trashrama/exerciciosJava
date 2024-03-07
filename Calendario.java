import java.util.Calendar;
import java.util.Date;

public class Calendario {
    // Somar dias com uma data, ai vc usa um calendario
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_WEEK,-7);

        data = cal.getTime();
        System.out.println(data);

        int ano = cal.get(Calendar.YEAR);
        System.out.println(ano);
    }


}

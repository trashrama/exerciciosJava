import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private int numQuarto;
    private Date checkIn;
    private Date checkOut;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Reserva{" +
                "numQuarto=" + numQuarto +
                ", checkIn=" + sdf.format(checkIn) +
                ", checkOut=" + sdf.format(checkOut) +
                ", duracao=" + duracao()+
                '}';
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Reserva(int numQuarto, Date checkIn, Date checkOut) throws DateException{
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public long duracao(){
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkin, Date checkout) throws DateException{
        Date d = new Date();
        if (checkin.after(checkout)) {
            throw new DateException("Datas inválidas!");
        }
        else if(checkin.before(d) || checkout.before(d)){
            throw new DateException("Erro! O check-in não pode ser anterior a hoje");
        }else{
            this.checkIn = checkin;
            this.checkOut = checkout;
        };

    }
}



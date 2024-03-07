import java.util.Date;
public class Reserva {
    private int numQuarto;
    private Date checkIn;
    private Date checkOut;

    @Override
    public String toString() {
        return "Reserva{" +
                "numQuarto=" + numQuarto +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
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

    public Reserva(int numQuarto, Date checkIn, Date checkOut){
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public int duracao(){
        System.out.println("oi");
        return 1;
    }

    public void atualizarDatas(Date checkin, Date checkout){
        this.checkIn = checkin;
        this.checkOut = checkout;
    }
}



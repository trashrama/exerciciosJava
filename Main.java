import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class Main {


    public static void main(String[] args) throws DateException {
        Reserva res = lerDatas();
        System.out.println(res);
    }

    public static Reserva lerDatas() throws DateException{
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int numQuarto;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrada;
        Date dataSaida;
        Date hoje = new Date();

        try {
            System.out.println("Número do quarto: ");
            numQuarto = in.nextInt();
            System.out.println("Check in: ");
            dataEntrada = sdf.parse(sc.nextLine());
            System.out.println("Check out: ");
            dataSaida = sdf.parse(sc.nextLine());


            if (dataEntrada.after(dataSaida)) {
                System.out.println("Datas inválidas!");
            }
            if (dataEntrada.before(hoje) || dataSaida.before(hoje)) {
                System.out.println("Erro:  O check-in não pode ser anterior a hoje");
                throw new RuntimeException("Erro!");
            }

            return new Reserva(numQuarto, dataEntrada, dataSaida);

        } catch (ParseException e){
            System.out.println("Formato de Data Inválido!");
            throw new DateException("Erro!");
        }catch (IllegalArgumentException e){
            throw new DateException("Erro");
        }

    }




}
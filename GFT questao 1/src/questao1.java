import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class questao1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pessoa1 = sdf.parse("2002-09-28");
        Date pessoa2 = sdf.parse("2002-09-07");
        System.out.println("Data-1: " + sdf.format(pessoa1));
        System.out.println("Data-2: " + sdf.format(pessoa2));
        if(pessoa1.compareTo(pessoa2) > 0) {
            System.out.println("Pessoa-1 é 21 dias mais velha do que a Pessoa-2");
        } else if(pessoa1.compareTo(pessoa2) < 0) {
            System.out.println("Pessoa-1 é 21 dias mais nova do que a Pessoa-2");
        } else if(pessoa1.compareTo(pessoa2) == 0) {
            System.out.println("Pessoa-1 e a Pessoa-2 tem a mesma idade");
        }
    }
}







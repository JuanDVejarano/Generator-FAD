import java.util.Scanner;

public class View {

    Scanner catchConsol = new Scanner(System.in);

    // Metodo para Imprimir mensajes por consola
    public void viewMesage(String sms) {
        System.out.println(sms);
    }

    // Metodo para capturar textos sin espacios en consola
    public String getStringSimple() {
        String catchString = catchConsol.next();
        return catchString;
    }

    // Metodo para capturar numeros por consola
    public int getNumber() {
        Integer catchNumber = catchConsol.nextInt();
        return catchNumber;
    }
}

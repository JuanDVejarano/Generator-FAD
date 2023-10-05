import java.util.Scanner;

public class View {

    Scanner catchConsol = new Scanner(System.in);

    // Metodo para Imprimir mensajes por consola
    public void viewMesage(String sms) {
        System.out.println(sms);
    }

    // Me permite imprimir un arreglo
    public void viewMesage(String[] array) {
        String sms = "";
        for (String string : array) {
            sms = sms + string + ",";
        }
        System.out.println(sms);
    }

    // Me permite imprimir un arreglo con una desripcion antes
    public void viewMesage(String prefixSms, String[] array) {
        String sms = "";
        for (String string : array) {
            sms = sms + string + ",";
        }
        System.out.println(prefixSms + " " + sms);
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

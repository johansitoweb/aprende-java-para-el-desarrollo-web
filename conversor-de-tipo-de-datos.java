// ConversorTipos.java
public class ConversorTipos {
    public static void main(String[] args) {
        String numeroComoCadena = "123";
        int numero = Integer.parseInt(numeroComoCadena);
        System.out.println("Número convertido: " + numero);

        double decimal = 45.67;
        String decimalComoCadena = String.valueOf(decimal);
        System.out.println("Decimal como cadena: " + decimalComoCadena);
    }
}

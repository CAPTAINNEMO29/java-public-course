
public class ManejoErrores {

    public static void main(String[] args) {
        // el codigo se parara en el primer error que encuentre
        int[] array = new int[20];
        try {
            array[-3] = 24;
            int b = 0;
            int a = 23 / b;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println(" Error de índice en un array ");
        } catch (ArithmeticException excepcion) {
            System.out.println(" no es divisible entre 0");
        // finally siempre se ejecutara
        } finally {
            System.out.println("Se ejecuta finally");
        }
    }
}

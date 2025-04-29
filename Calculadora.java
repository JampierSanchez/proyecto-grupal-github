public class Calculadora {
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma enteros 2 + 3 = " + calc.sumar(2, 3));
        System.out.println("Suma dobles 2.5 + 3.7 = " + calc.sumar(2.5, 3.7));
    }
}

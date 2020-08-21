import javax.swing.JOptionPane;

public class calPOO {

    static double num1, num2, suma, resta, mult, div, mov, raiz, raiz1, raiz2;

    public static void main(String[] args) {
        int opcion = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(">> Introduzca un número."));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(">> Introduzca otro o el mismo número"));

        opcion = Integer.parseInt(JOptionPane.showInputDialog(">> Opción 1: Sumar" + "\n" + ">> Opción 2: Restar" + "\n" + ">> Opción 3: Multiplicar" + "\n" + ">> Opción 4: Dividir" + "\n" + ">> Opción 5: Módulo" + "\n" + ">> Opción 6: Raíz cuadrada"));

        switch (opcion){
            case 1: {
                suma();
                break;
            }
            case 2: {
                resta();
                break;
            }
            case 3: {
                mult();
                break;
            }
            case 4: {
                div();
                break;
            }
            case 5: {
                mov();
                break;
            }
            case 6: {
                raizC();
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, ">> Error, las opciones van del 1 al 6.");
                break;
            }
        }
    }

    public static void suma(){
        suma = num1 + num2;
        JOptionPane.showMessageDialog(null, "> La suma de: " + num1 + " + " + num2 + " es: " + suma);
    }
    public static void resta(){
        resta = num1 - num2;
        JOptionPane.showMessageDialog(null, "> La resta de: " + num1 + " - " + num2 + " es: " + resta);
    }
    public static void mult(){
        mult = num1 * num2;
        JOptionPane.showMessageDialog(null, "> La multiplicación de: " + num1 + " * " + num2 + " es: " + mult);
    }
    public static void div(){
        div = num1 / num2;
        JOptionPane.showMessageDialog(null, "> La división de: " + num1 + " / " + num2 + " es: " + div);
    }
    public static void mov(){
        mov = num1 % num2;
        JOptionPane.showMessageDialog(null, "> El módulo de: " + num1 + " % " + num2 + " es: " + mov);
    }
    public static void raizC(){
        raiz1 = Math.sqrt(num1 + num2);
        raiz = Math.sqrt(num1);
        raiz2 = Math.sqrt(num2);
        JOptionPane.showMessageDialog(null, "> La suma de la raiz cuadrada de: " + num1 + " + " + num2 + " es: " + raiz + "\n" + "> La raíz cuadrada del primer número introducido es: " + raiz1 + "\n" + "> La raíz cuadrada del segundo número introducido es: " + raiz2);
    }
}

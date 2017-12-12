package proxectointervalo;

import javax.swing.JOptionPane;

public class Division {
    private int num;
    private int den;

    public Division(){
    
    }
    public Division(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void dividir() throws MiExcepcion{
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
            den = Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
            if (num<20 || num>100){
                throw new MiExcepcion("O NUMERADOR NON ESTA NO INTERVALO DESEXADO");
            }
            System.out.println(num+" / "+den+" = "+num/den);
        }catch(NumberFormatException e1){
            System.out.println("No se ha introducido ningun numero");
        }
    }
}

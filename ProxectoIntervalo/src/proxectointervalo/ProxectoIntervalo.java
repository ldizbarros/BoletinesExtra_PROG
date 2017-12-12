package proxectointervalo;

/**Codificar un progrma que lea 2 numeros e calcule unha division, 
 * de xeito que o numerador ten que estar entre 20 e 100 
 * se non e caso capturaremos a excepcion.
 */
public class ProxectoIntervalo {

    public static void main(String[] args) {
        Division d1 = new Division();
        try{
            d1.dividir();
        }catch(MiExcepcion e1){
            System.out.println(e1.getMessage());
        }
    }
    
}

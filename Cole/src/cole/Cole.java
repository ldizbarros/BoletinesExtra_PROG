package cole;

/**Codifica un programa e fai o correspondente diagrama de clases:
 * Temos una clase estudante cos atributos: nome,direccon,nomeCole e nivel
 * Clase ensinante con: nome,direccion e materia
 * Clase estudanteInternacional con: nome,direccion,nomeCole,nivel e pais
 * En cada clase debe levar constructor, getters e setters e toString.
 * Na case princial, crea un obxecto de cada clase e visualiza totos os atributos.
 * Cambialle o nivel ao estudiante e cambialle a materia ao ensisnante (volvemos a visualizar).
 */
public class Cole {

    public static void main(String[] args) {
        Persoa p1=new Persoa("Rogelio Lopez","Avenida La Diablesa");
        System.out.println(p1.toString());
        Estudante e1=new Estudante("Los Alces","1º ESO","Roberta Fernandez","Calle Brasil");
        System.out.println(e1.toString());
        Ensinante en1=new Ensinante("Ingles","Casimiro Miranda","Calle Boa vista");
        System.out.println(en1.toString());
        EstudanteInternacional ei1 = new EstudanteInternacional("Francia","Los Alces","2º ESO","Pierre Hollante","Rue Bordeaux");
        System.out.println(ei1.toString());
        
        e1.setNivel("2º ESO");
        System.out.println(e1.toString());
        en1.setMateria("Frances");
        System.out.println(en1.toString());
    }
    
}

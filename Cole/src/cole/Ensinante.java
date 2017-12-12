package cole;

public class Ensinante extends Persoa{
    private String materia;

    public Ensinante(String materia, String nome, String direcion) {
        super(nome, direcion);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Ensinante: \n Nome: "+super.getNome()+"\n Direccion: "+super.getDirecion()
                +"\n Materia: "+materia;
    }
    
    
}

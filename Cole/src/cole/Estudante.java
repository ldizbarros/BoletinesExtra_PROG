package cole;

public class Estudante extends Persoa{
    private String nomeCole;
    private String nivel;

    public Estudante(String nomeCole, String nivel, String nome, String direcion) {
        super(nome, direcion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Estudante: \n Nome: "+super.getNome()+"\n Direccion: "+super.getDirecion()+""
                + "\n Nome Cole: "+nomeCole+"\n Nivel: "+nivel;
    }
    
    
}

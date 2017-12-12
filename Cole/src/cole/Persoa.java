package cole;

public class Persoa {
    private String nome;
    private String direcion;

    public Persoa(String nome, String direcion) {
        this.nome = nome;
        this.direcion = direcion;
    }

    public String getNome() {
        return nome;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    @Override
    public String toString() {
        return "Persoa:\n Nome: "+nome+"\n Direccion: "+direcion;
    }
    
    
}

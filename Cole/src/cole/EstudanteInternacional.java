package cole;

public class EstudanteInternacional extends Estudante{
    private String pais;

    public EstudanteInternacional(String pais, String nomeCole, String nivel, String nome, String direcion) {
        super(nomeCole, nivel, nome, direcion);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estudante Internacional: \n Nome: "+super.getNome()+"\n Direccion: "+super.getDirecion()+""
                + "\n Nome Cole: "+super.getNomeCole()+"\n Nivel: "+super.getNivel()
                + "\n Pais: "+pais;
    }
    
    
}

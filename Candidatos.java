public class Candidatos {
    private String nome;
    private int numero,votos;

    public Candidatos(String nome, int numero){
        this.numero = numero;
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public int setNumero(int numero){
        return this.numero  = numero;
    }
    public int setVotos(int votos){
        return this.votos = votos;
    }
    public int getVotos(){
        return votos;
    }
    public int incrementarVotos(){
        return votos++;
    }
}

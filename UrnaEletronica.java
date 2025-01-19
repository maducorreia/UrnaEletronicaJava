import java.util.ArrayList;

    public class UrnaEletronica{
        
        private ArrayList <Candidatos> candidatos;
        private int votosNulos;

        public UrnaEletronica(){
            candidatos = new ArrayList<>();
            votosNulos = 0;
            
            candidatos.add(new Candidatos("Ada Lovelace", 01));
            candidatos.add(new Candidatos("Alan Turing", 02));
            candidatos.add(new Candidatos("Marie Curie", 03));
            candidatos.add(new Candidatos("Albert Einstein", 04));
            candidatos.add(new Candidatos(" Ludwig van Beethoven", 05));
        }
        public ArrayList<Candidatos> getCandidatos() {
        return candidatos;
    }

            public void receberVoto(int numero) {
            boolean votoValido = false;

            for (Candidatos candidato : candidatos) {
                if (candidato.getNumero() == numero) {
                    candidato.incrementarVotos();
                    votoValido = true;
                    break;
                }
            }

            if (!votoValido) {
                votosNulos++;
        }
    }
        public void apurarResultados() {
            System.out.println("\nResultado da Votação:");

            int totalVotos = 0;

            for (Candidatos candidato : candidatos) {
                int votos = candidato.getVotos();
                double percentual = totalVotos > 0 ? (votos * 100) / totalVotos : 0;
                System.out.printf("%s: %d votos (%.2f%%)\n", candidato.getNome(), votos, percentual);
            }
        
            System.out.printf("Votos nulos: %d\n" + votosNulos);

            Candidatos vencedor = null;
            boolean empate = false;

            for (Candidatos candidato : candidatos){
                if (vencedor == null || candidato.getVotos()> vencedor.getVotos()) {
                    vencedor = candidato;
                    empate = false;
                } else if (candidato.getVotos() == vencedor.getVotos()) {
                    empate = true;
                }
            }
            
            if (empate) {
                System.out.printf("Empate entre candidatos com maior número de votos.");
            } else if (vencedor != null) {
                    System.out.printf("Vencedor: " + vencedor.getNome());
                }
            }
        public int getVotosNulos() {
            return votosNulos;
    }
    
}
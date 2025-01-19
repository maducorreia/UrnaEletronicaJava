//do-while
//totalVotos01...(variável) 
//totalVotosNulos
//totalVotosApurados

import java.util.Scanner;

public class Votos extends UrnaEletronica {

    public Votos(){

    }
        int totalVotosApurados = 0;
        int totalVotosValidos = 0;
        int totalVotosNulos = 0;
        int totalVotos01 = 0;
        int totalVotos02 = 0;
        int totalVotos03 = 0;
        int totalVotos04 = 0;
        int totalVotos05 = 0;

   public void resultado() {
        System.out.println("Resultado da votação: ");
        System.out.println("1ª Candidato - Ada Lovelace: " + totalVotos01 + " votos " + ((totalVotos01 * 100) / totalVotosApurados) + "%");
        System.out.println("2ª Candidato - Alan Turing : " + totalVotos02 + " votos " + ((totalVotos02 * 100) / totalVotosApurados) + "%");
        System.out.println("3ª Candidato - Marie Curie: " + totalVotos03 + " votos " + ((totalVotos03 * 100) / totalVotosApurados) + "%");
        System.out.println("4ª Candidato - Albert Einstein: " + totalVotos04 + " votos " +  ((totalVotos04 * 100) / totalVotosApurados) + "%");
        System.out.println("5ª Candidato - Ludwig van Beethoven: " + totalVotos05 + " votos "  + ((totalVotos05 * 100) / totalVotosApurados) + "%");
        System.out.println("Votos nulos: " + totalVotosNulos + " votos " + ((totalVotosNulos * 100) / totalVotosApurados)+"%");
    }
    public Votos(String voto){
    }

    public void getVotos(){
        Scanner sc = new Scanner(System.in);

        while(totalVotosApurados < 10){
            
            System.out.println("\nDigite o número do seu candidato: ");
            String voto = sc.nextLine();

            System.out.println("\nInforme o proximo Candidato:" );

            if (voto.equals("01") || voto.equals("02") || voto.equals("03") || voto.equals("04") || voto.equals("05")) {
                totalVotosValidos++;
            }
            if (!voto.equals("01") && !voto.equals("02") && !voto.equals("03") && !voto.equals("04") && !voto.equals("05")) {
                totalVotosNulos++;
            }
            if (voto.equals("01")) {
                totalVotos01++;
            } 
            else if (voto.equals("02")) {
                totalVotos02++;
            } 
            else if (voto.equals("03")) {
                totalVotos03++;
            } 
            else if (voto.equals("04")) {
                totalVotos04++;
            } 
            else if (voto.equals("05")) {
                totalVotos05++;
            }
            totalVotosApurados++;
            }
           
        }
}

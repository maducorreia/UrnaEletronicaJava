import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        Votos urna = new Votos();
        urna.getVotos();
        urna.resultado();
    }
}

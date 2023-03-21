import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        System.out.println("inserisci il seme");
        String seed= input.nextLine();
        System.out.println("inserisci La carta");
        String card= input.nextLine();
        Card carta= new Card(card, seed);
        System.out.println(carta.getDescription());
    }
}

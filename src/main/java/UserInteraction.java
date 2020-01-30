import java.io.IOException;

public class UserInteraction {
    public static void interactWithUser (Colours[] userCombination) throws IOException {
        for(int i = 0; i < 4; i++){
            System.out.print("Position " + (i + 1) + ": ");
            // trim wegen Leerzeichen
            String userInput = Main.br.readLine().trim().toUpperCase();



            userCombination[i] =
                    String farbe = userCombination[i];
            switch(farbe){
                case "rot":
                    break;
                case "blau":
                    break;
                case "pink":
                    break;
                case "grün":
                    break;
                case "orange":
                    break;
                case "weiss":
                    break;
                case "grau":
                    break;
                case "gelb":
                    break;
                default:
                    System.out.println("Ungültige Eingabe! Versuchen Sie es nochmals.");
                    i--;
                    break;
            }
        }
    }
}

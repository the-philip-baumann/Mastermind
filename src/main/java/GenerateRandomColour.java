import java.util.Random;

public class GenerateRandomColour {
    private static Colours[] farbenKombination = new Colours[4];

    public static Colours[] generateRandomColour () {
        for(int i = 0; i < 4; i++){
            Random rand = new Random();
            int pick = rand.nextInt(Colours.values().length);
            farbenKombination[i] = Colours.values()[pick];
        }
        return farbenKombination;
    }
}

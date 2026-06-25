public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }
    public static int remainingMinutesInOven(int actualMinutes){
        int calculateRemainingMinutesInOven = expectedMinutesInOven() - actualMinutes;
        return calculateRemainingMinutesInOven;
    }

    public static int preparationTimeInMinutes(int numberOfLayers){
        int timePerLayer = numberOfLayers * 2; // each layer takes 2 minutes to prepare
        return timePerLayer;
    }
    public static int totalTimeInMinutes(int numberOfLayers,int actualMinutes){
        return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
    }
}

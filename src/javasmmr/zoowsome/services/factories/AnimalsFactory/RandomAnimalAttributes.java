package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.WaterType;

import java.util.Random;

public class RandomAnimalAttributes {

    private static final Random random = new Random();

    public static int randomNumberOfLegs() {
        return random.nextInt(8);
    }


    public static String randomName() { return getAlphaNumericString(10); }


    static String getAlphaNumericString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }


    public static float randomBodyTemperature() {
        return 35.0f + random.nextFloat() * (40.0f - 35.0f);
    }


    public static float randomBodyHairPercentage() {
        return random.nextFloat() * 100;
    }


    public static boolean randomLaysEggs() {
        return random.nextBoolean();
    }


    public static int randomFlightAltitude() { return random.nextInt(5001); }


    public static boolean randomMigrates() { return random.nextBoolean(); }


    public static int randomSwimDepth() { return random.nextInt(1001); }


    public static WaterType randomWaterType() { return random.nextBoolean() ? WaterType.SALTWATER : WaterType.FRESHWATER; }


    public static boolean randomCanFly() { return random.nextBoolean(); }


    public static boolean randomIsDangerous() { return random.nextBoolean(); }
}

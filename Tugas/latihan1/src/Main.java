import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Farmer farmer1 = new farmer();
        Farmer farmer2 = new farmer();
        plant plant1 = new plant();
        plant plant2 = new plant();

        farmer1.name = "Crazy dave";
        farmer2.name = "sober dove";

        plant1.name = "Sunflower";
        plant2.name = "Mushroom";

        farmer1.favorite = plant1.name;
        farmer2.favorite = plant2.name;

        System.out.println("Hello world!");
        System.out.println("Current date and time: " + new Date());

        farmer1.talk();
        farmer2.talk();
    }
}
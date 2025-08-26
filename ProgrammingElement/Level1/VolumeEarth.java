package ProgrammingElement.Level1;

public class VolumeEarth {
    public static void main(String[] args) 
    {
        double radius = 6378;
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the Earth in cubic kilometers is %.2f km³ and in cubic miles is %.2f mi³.%n", volume, volume * 0.239);
    
    }
}

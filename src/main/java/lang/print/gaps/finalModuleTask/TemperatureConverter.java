package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheit = temperatureCelsius * 1.8 + 32;
        System.out.println(temperatureFahrenheit);
    }
    public static void main(String[] args){
        toFahrenheit(+2);
    }
}

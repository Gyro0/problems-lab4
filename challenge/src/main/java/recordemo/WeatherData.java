package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        //
        return (double) (temperatureCelsius*9/5 +32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s", 
                temperatureCelsius, 
                temperatureFahrenheit(), 
                conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       //
       double c;
       c=(tempFahrenheit-32)*5/9;
       return new WeatherData(c, conditions);
    }

    public static void main(String[] args) {
        WeatherData data1 = new WeatherData(25.0,"Sunny" );
        WeatherData data2 = WeatherData.fromFahrenheit(50,"Cloudy" );
        System.out.println(data1.getSummary());
        System.out.println(data2.getSummary());


    }
}

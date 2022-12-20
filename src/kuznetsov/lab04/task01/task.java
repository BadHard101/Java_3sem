package kuznetsov.lab04.task01;

public class task {
    public static void main(String[] args) {
        Seasons season = Seasons.autumn;
        i_like(season);
        System.out.println(" its average temp is " + season.getTemperature() + " C and it is " + season.getDescription());
        for(Seasons seasons : Seasons.values()){
            System.out.println(seasons + ": " + seasons.getTemperature() + " (average" +
                    " temperature is " + seasons.getDescription() + ")");
        }
    }

    public enum Seasons{
        autumn(9),
        winter(-5),
        spring(13),
        summer(23) {
            public String getDescription() { return "warm season"; }
        };

        private final double temperature;
        private Seasons(double temperature){
            this.temperature = temperature;
        }

        public String getDescription(){
            return "cold season";
        }

        public double getTemperature() {
            return temperature;
        }
    }

    public static void i_like(Seasons season) {
        switch (season) {
            case autumn -> System.out.print("i like autumn");
            case spring -> System.out.print("i like spring");
            case summer -> System.out.print("i like summer");
            case winter -> System.out.print("i like winter");
        }
    }
}
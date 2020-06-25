package practices;

public class pr1 {
    public static void main(String[] args) {
        double pounds = 100;
        double kg = calPoundsToKg(pounds);
        System.out.println(kg);
    }

    private static double calPoundsToKg(double pounds) {
        return pounds * 0.45359237;
    }
}

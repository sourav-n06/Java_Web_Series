public class Metric {
    public static float kmtoMile(float km) {
        return km /1.5f;
    }
    public static float miletoKm(float mile) {
        return mile *1.5f;
    }
    public static void main(String[] args) {
        System.out.println( " 100 kms = "+kmtoMile(100) + "miles");
        System.out.println("100 miles = "+ miletoKm(100) + "kms");
    }
}

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Or", 32, "07/01/1989");
        DriverLicense driverLicense1 = new DriverLicense(driver1, LocalDate.of(2021,8,20), false);
        Driver driver2 = new Driver("Yossi", 28, "12/06/1993");
        DriverLicense driverLicense2 = new DriverLicense(driver2, LocalDate.of(2022, 5, 12), true);


        System.out.println(driverLicense1.toString());
        System.out.println();
        System.out.println(driverLicense2.toString());
        System.out.println();
        driverLicense1.isExpired();
        driverLicense2.isExpired();

    }
}

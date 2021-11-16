import java.time.LocalDate;

public class DriverLicense {

    private Driver driver;
    private LocalDate expiryDate;
    private boolean isSuspended;


    public DriverLicense( Driver driver, LocalDate expiryDate, boolean isSuspended) {
        this.driver = driver;
        this.expiryDate = expiryDate;
        this.isSuspended = isSuspended;

    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "driver=" + driver +
                ", expiryDate='" + expiryDate + '\'' +
                ", isSuspended=" + isSuspended +
                '}';
    }


            public void isExpired(){
            if (expiryDate.compareTo(LocalDate.now()) < 0){
                System.out.println( driver + " - " + " Your driver license is expired!");
            } else{
                System.out.println( driver + " - " + " Your driver license is valid!");
            }


            }
}

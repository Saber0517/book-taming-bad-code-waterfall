package tbc.waterfall;

/**
 * Created by ben on 14-2-25.
 */
public class HotelWorldClocksRunner {
    public static void main(String[] args) {
        TimeSubject utcTime = new UtcTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("sydney", new CityClock(10));
        utcTime.attach("newYork", new CityClock(-5));
        Clock phoneClock = new PhoneClock(utcTime);

        phoneClock.setLocalTime(9);

        utcTime.printTimeOfAllClocks();
    }
}

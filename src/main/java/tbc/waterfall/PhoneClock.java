package tbc.waterfall;

/**
 * Created by ben on 14-2-25.
 */
public class PhoneClock extends Clock {
    @Override
    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}

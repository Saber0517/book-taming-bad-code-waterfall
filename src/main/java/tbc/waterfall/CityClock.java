package tbc.waterfall;

/**
 * Created by ben on 14-2-25.
 */
public class CityClock extends Clock {
    public CityClock(int utcOffset) {
        super();
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}

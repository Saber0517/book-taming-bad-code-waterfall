package tbc.waterfall;

/**
 * Created by ben on 14-2-24.
 */
public abstract class Clock {
    protected int UTC_OFFSET;
    protected int localTime = 0;

    public Clock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    public abstract void setLocalTime(int localTime);

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}

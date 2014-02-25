package tbc.waterfall;

/**
 * Created by ben on 14-2-25.
 */
public class UtcTime extends TimeSubject {
    private int utcZeroTime;

    @Override
    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }
}

package ScratchPaper;

import java.util.Objects;

public class Call {
    private int urgencyLevel;
    private double waitingDuration;

    public Call(int urgencyLevel, double waitingDuration) {
        this.urgencyLevel = urgencyLevel;
        this.waitingDuration = waitingDuration;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    public double getWaitingDuration() {
        return waitingDuration;
    }

    @Override
    public String toString() {
        return "Call{urgency=" + urgencyLevel + ", waiting=" + waitingDuration + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(urgencyLevel, waitingDuration);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Call call = (Call) obj;
        if (urgencyLevel == call.getUrgencyLevel()
                && Double.compare(waitingDuration, call.getWaitingDuration()) == 0) {
            return true;
        }
        return false;
    }
}

package ScratchPaper;

import java.util.Comparator;

public class CallComparator implements Comparator<Call> {
    @Override
    public int compare (Call c1, Call c2) {
        int urgencyComparison = Integer.compare(c2.getUrgencyLevel(), c1.getUrgencyLevel());

        if (urgencyComparison == 0) {
            return Double.compare(c2.getWaitingDuration(), c1.getWaitingDuration());
        }

        System.out.println("call comparator: " + urgencyComparison);
        return urgencyComparison;
    }
}

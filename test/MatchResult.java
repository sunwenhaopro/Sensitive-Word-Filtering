package test;



/**
 * Created by berg on 2023/6/18.
 */

public class MatchResult {

    private int startIndex;

    public MatchResult(int startIndex, int endIndex) {
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    public int startIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int endIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    private int endIndex;

    @Override
    public String toString() {
        return "MatchResult{" +
                "startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                '}';
    }
}

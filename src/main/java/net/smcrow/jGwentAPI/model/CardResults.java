package net.smcrow.jGwentAPI.model;

import java.util.List;

/**
 * Model for the card results that come back from doing a query.
 * @author Steve Crow (steve@smcrow.net)
 */
public class CardResults {
    int count;
    List<Card> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Card> getResults() {
        return results;
    }

    public void setResults(List<Card> results) {
        this.results = results;
    }
}

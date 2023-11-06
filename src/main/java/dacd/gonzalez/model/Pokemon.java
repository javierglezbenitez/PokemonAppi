package dacd.gonzalez.model;

import java.net.URL;
import java.util.ArrayList;

public class Pokemon {
    private  final int count;
    private final String next;
    private  final String previous;
    private  final ArrayList<Results> results;

    public Pokemon(int count, String next, String previous, ArrayList<Results> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public ArrayList<Results> getResults() {
        return results;
    }
}

package mbmwat.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class MatchesData {

    private int count;
    private List<Match> matches = null;

    public MatchesData() {
    }

    public MatchesData(int count, List<Match> matches) {
        this.count = count;
        this.matches = matches;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}

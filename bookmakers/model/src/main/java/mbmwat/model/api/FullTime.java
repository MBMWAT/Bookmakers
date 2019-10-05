package mbmwat.model.api;

public class FullTime {

    private int homeTeam;
    private int awayTeam;

    public FullTime() {
    }

    public FullTime(int homeTeam, int awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(int homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(int awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullTime fullTime = (FullTime) o;

        if (homeTeam != fullTime.homeTeam) return false;
        return awayTeam == fullTime.awayTeam;
    }

    @Override
    public int hashCode() {
        int result = homeTeam;
        result = 31 * result + awayTeam;
        return result;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                '}';
    }
}

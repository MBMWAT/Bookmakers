package mbmwat.model.api;


public class Score {

    private String winner;
    private String duration;
    private FullTime fullTime;
/*    private HalfTime halfTime;
    private ExtraTime extraTime;
    private Penalties penalties;*/

    public Score() {
    }

    public Score(String winner, String duration, FullTime fullTime) {
        this.winner = winner;
        this.duration = duration;
        this.fullTime = fullTime;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public FullTime getFullTime() {
        return fullTime;
    }

    public void setFullTime(FullTime fullTime) {
        this.fullTime = fullTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (winner != null ? !winner.equals(score.winner) : score.winner != null) return false;
        if (duration != null ? !duration.equals(score.duration) : score.duration != null) return false;
        return fullTime != null ? fullTime.equals(score.fullTime) : score.fullTime == null;
    }

    @Override
    public int hashCode() {
        int result = winner != null ? winner.hashCode() : 0;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (fullTime != null ? fullTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Score{" +
                "winner='" + winner + '\'' +
                ", duration='" + duration + '\'' +
                ", fullTime=" + fullTime +
                '}';
    }
}

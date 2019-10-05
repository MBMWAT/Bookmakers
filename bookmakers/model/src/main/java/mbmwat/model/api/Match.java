package mbmwat.model.api;

public class Match {

    private int id;
    private Competition competition;
/*    private Season season;*/
    private String utcDate;
    private String status;
    private int matchday;
    private String stage;
    private String group;
    private String lastUpdated;
    private Score score;
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;

    public Match(int id, Competition competition, String utcDate, String status, int matchday, String stage, String group, String lastUpdated, Score score, HomeTeam homeTeam, AwayTeam awayTeam) {
        this.id = id;
        this.competition = competition;
        this.utcDate = utcDate;
        this.status = status;
        this.matchday = matchday;
        this.stage = stage;
        this.group = group;
        this.lastUpdated = lastUpdated;
        this.score = score;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public String getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(String utcDate) {
        this.utcDate = utcDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Match match = (Match) o;

        if (id != match.id) return false;
        if (matchday != match.matchday) return false;
        if (competition != null ? !competition.equals(match.competition) : match.competition != null) return false;
        if (utcDate != null ? !utcDate.equals(match.utcDate) : match.utcDate != null) return false;
        if (status != null ? !status.equals(match.status) : match.status != null) return false;
        if (stage != null ? !stage.equals(match.stage) : match.stage != null) return false;
        if (group != null ? !group.equals(match.group) : match.group != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(match.lastUpdated) : match.lastUpdated != null) return false;
        if (score != null ? !score.equals(match.score) : match.score != null) return false;
        if (homeTeam != null ? !homeTeam.equals(match.homeTeam) : match.homeTeam != null) return false;
        return awayTeam != null ? awayTeam.equals(match.awayTeam) : match.awayTeam == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (competition != null ? competition.hashCode() : 0);
        result = 31 * result + (utcDate != null ? utcDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + matchday;
        result = 31 * result + (stage != null ? stage.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (homeTeam != null ? homeTeam.hashCode() : 0);
        result = 31 * result + (awayTeam != null ? awayTeam.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", competition=" + competition +
                ", utcDate='" + utcDate + '\'' +
                ", status='" + status + '\'' +
                ", matchday=" + matchday +
                ", stage='" + stage + '\'' +
                ", group='" + group + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", score=" + score +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                '}';
    }
}

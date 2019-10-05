package mbmwat.model.api;

public class AwayTeam {

    private int id;
    private String name;

    public AwayTeam() {
    }

    public AwayTeam(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AwayTeam awayTeam = (AwayTeam) o;

        if (id != awayTeam.id) return false;
        return name != null ? name.equals(awayTeam.name) : awayTeam.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AwayTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

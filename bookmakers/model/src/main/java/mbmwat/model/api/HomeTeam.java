package mbmwat.model.api;


public class HomeTeam {

    private int id;
    private String name;

    public HomeTeam() {
    }

    public HomeTeam(int id, String name) {
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

        HomeTeam homeTeam = (HomeTeam) o;

        if (id != homeTeam.id) return false;
        return name != null ? name.equals(homeTeam.name) : homeTeam.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HomeTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

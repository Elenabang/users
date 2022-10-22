package Model;

public class Data {
    public int id;

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public String email;
    public String first_name;
    public String last_name;
    public String avatar;
}

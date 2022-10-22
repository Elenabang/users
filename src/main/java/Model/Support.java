package Model;

public class Support {
    public String url;

    @Override
    public String toString() {
        return "Support{" +
                "url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String text;
}

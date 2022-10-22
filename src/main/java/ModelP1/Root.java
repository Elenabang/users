package ModelP1;

import java.util.ArrayList;

public class Root {
    @Override
    public String toString() {
        return "Root2{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                ", support=" + support +
                '}';
    }

    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList <Datum> data;
    public Support support;
}

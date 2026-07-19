package CollectionsFramework;
import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

    private List<T> list;

    public Repository() {
        list = new ArrayList<>();
    }

    // Add Object
    public void add(T obj) {
        list.add(obj);
    }

    // Remove Object
    public void remove(T obj) {
        list.remove(obj);
    }

    // Display Objects
    public void display() {

        for (T obj : list) {
            System.out.println(obj);
        }
    }

    // Return List (Used in Streams)
    public List<T> getAll() {
        return list;
    }
}
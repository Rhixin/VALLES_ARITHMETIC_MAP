package Map;

import java.util.ArrayList;

public class ZhazMap<T, U> {
    ArrayList<T> keys;
    ArrayList<U> values;

    public ZhazMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(T key, U value) {
        if(keys.contains(key)) {
            values.set(keys.indexOf(key), value);
            return;
        }

        keys.add(key);
        values.add(value);
    }

    public U get(T key) {
        if(keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }

        return null;
    }

    public U remove(T key) {
        if(keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            return values.remove(index);
        }

        return null;
    }

    // Custom print method to display contents
    public void print() {
        if(keys.isEmpty()) {
            System.out.println("\nNo items in the map!");
            return;
        }

        System.out.println("\n~~~~~ Contents of the Map ~~~~~");
        for(int i = 0; i < keys.size(); i++) {
            System.out.println("Key: " + keys.get(i) + " | Value: " + values.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

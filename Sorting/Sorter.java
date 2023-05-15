import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Sorter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sorter {
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> array) {
        for (int x = array.size() - 1; x > 1; x--) {
            for (int y = 0; y < x; y++) {
                if (array.get(y + 1) < array.get(y)) {
                    System.out.println(array);
                    switchArray(array, y + 1, y);
                }
            }
        }
        System.out.println(array.toString());
        return array;
    }
    public ArrayList<Integer> switchArray(ArrayList<Integer> array, int x, int y) {
        int temp = array.get(y);
        array.set(y, array.get(x));
        array.set(x, array.get(temp));
        return array;
    }
}

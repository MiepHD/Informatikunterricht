
/**
 * Beschreiben Sie hier die Klasse Sorter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sorter
{
    public int[] bubbleSort(int[] array)
    {
        for (int x = array.length - 1; x > 1; x--) {
            for (int y = 0; y < x; y++) {
                if (array[y + 1] < array[y]) {
                    System.out.println(array);
                    switchArray(array, y + 1, y);
                }
            }
        }
        System.out.println(array.toString());
        return array;
    }
    public int[] switchArray(int[] array, int x, int y) {
        int temp = array[y];
        array[y] = array[x];
        array[x] = temp;
        return array;
    }
}

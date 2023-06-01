package task4;

import java.util.List;

public class ConvertArray {

    private final int[] array;
    private final List<String> list;

    public ConvertArray(List<String> strings) {
        this.array = new int[strings.size()];
        this.list = strings;
    }

    public void convert() {
        for (int i = 0; i < list.size(); i++) {
            array[i] = Integer.parseInt(list.get(i));
        }
    }

    public int[] getArray() {
        return array;
    }
}

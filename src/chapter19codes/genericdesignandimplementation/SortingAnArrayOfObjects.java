package chapter19codes.genericdesignandimplementation;

public class SortingAnArrayOfObjects {
    public static void main(String[] args) {
        Integer[] integers = {new Integer(2), new Integer(4), new Integer(3)};
        Double[] doubles = {new Double(3.4), new Double(1.3), new Double(-22.1)};
        Character[] characters = {new Character('a'), new Character('J'), new Character('r')};
        String[] stringArray = {"Tom", "Susan", "Kim"};

        sortArray(integers);
        sortArray(doubles);
        sortArray(characters);
        sortArray(stringArray);


        System.out.println();
        System.out.print("Sorted Integer objects: ");
        printList(integers);
        System.out.print("Sorted Double objects: ");
        printList(doubles);
        System.out.print("Sorted Character objects: ");
        printList(characters);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }

    /**
     * The generic type is defined as <E extends Comparable<E>> This has two meanings.
     * First, it specifies that E is a subtype of Comparable. Second, it specifies that the
     * elements to be compared are of the E type as well.
     *     * @param e
     * @param <E>
     */
    public static <E extends  Comparable<E>> void sortArray(E[] e) {
        E currentMin;
        int currentMinIndex;
        int size = e.length;
        for (int i = 0;i<size-1;i++){
            currentMin = e[i];
            currentMinIndex = i;

            for (int j =i+1;j<size;j++){
                if(currentMin.compareTo(e[j])>0){
                    currentMin = e[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
            e[currentMinIndex] = e[i];
            e[i]= currentMin;
            }

        }


    }

    public static <E> void printList(E[] e) {
        int size = e.length;
        for (int i = 0; i < size; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();

    }
}

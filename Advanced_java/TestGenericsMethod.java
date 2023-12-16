public class TestGenericsMethod {
    public static <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.println(element);
        }
        // System.out.println();
}


public static void main(String[] args) {
    Integer[] intArray={10,20,30,40,50};
    Character[] charArray={'S','E','-','A','S','T','U'};
    printArray(intArray);
    printArray(charArray);
}
}
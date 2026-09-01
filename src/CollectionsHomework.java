import java.util.HashSet;

public class CollectionsHomework {
    public static void main(String[] args) {
        //Nothing in the main method will be tested
    }

    //Question 1 — Find largest and smallest
    public static int[] findLargestAndSmallest(int[] array) {
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > largest){
                largest = array[i];
            }
            if (array[i] > smallest){
                smallest = array[i];
            }
        }
        return new int[] {largest, smallest};
    }


    //Question 2 — Remove duplicates
    public static Object[] removeDuplicatesFromArray(int[] array) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int number : array){
            numbers.add(number);
        }
        return numbers.toArray();
    }

    //Question 3 — Sum of Two Largest
    public static int sumOfTwoLargest(int[] array) {
        if (array.length == 0){ return 0; }
        if (array.length == 1){ return array[0]; }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return largest + secondLargest;
    }

    //BONUS QUESTION: Merge Sorted Arrays
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int validValues1 = 0;
        for (int number : array1){
            if (number > 0){
                validValues1++;
            }
        }

        int i = validValues1 - 1;
        int j = array2.length -1;
        int k = array1.length -1;

        while (j >= 0 && i >=0){
            if(array1[i] > array2[j]){
                array1[k] = array1[i];
                i--;
            } else {
                array1[k] = array2[j];
                j--;
            }
            k--;
        }

        while (j >= 0){
            array1[k] = array2[j];
            j--;
            k--;
        }
        return array1;
    }
}

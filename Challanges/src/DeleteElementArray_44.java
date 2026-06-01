import java.util.Scanner;

public class DeleteElementArray_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array input
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int index = 0;
        System.out.println("Enter elements:");
        while (index < size) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        // delete element input
        System.out.print("Enter element to delete: ");
        int elementToDelete = scanner.nextInt();

        int[] updatedArray = removeElement(numbers, elementToDelete);

        // print result
        System.out.println("New Array:");
        int printIndex = 0;
        while (printIndex < updatedArray.length) {
            System.out.print(updatedArray[printIndex] + " ");
            printIndex++;
        }
    }

    public static int[] removeElement(int[] numbers, int elementToDelete) {
        int currentIndex = 0;
        int occurrenceCount = 0;

        // Step 1: count occurrences
        while (currentIndex < numbers.length) {
            if (numbers[currentIndex] == elementToDelete) {
                occurrenceCount++;
            }
            currentIndex++;
        }

        // if element not found
        if (occurrenceCount == 0) {
            return numbers;
        }

        // Step 2: create new array
        int[] resultArray = new int[numbers.length - occurrenceCount];

        // Step 3: copy elements
        int sourceIndex = 0;
        int destinationIndex = 0;

        while (sourceIndex < numbers.length) {
            if (numbers[sourceIndex] != elementToDelete) {
                resultArray[destinationIndex] = numbers[sourceIndex];
                destinationIndex++;
            }
            sourceIndex++;
        }

        return resultArray;
    }
}
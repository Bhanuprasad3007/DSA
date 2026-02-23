public class Largest_number {
    public static int findLargestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] numbers = {3, 5, 7, 2, 8};
        int largest = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
public class Main {

    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();

       // int arr[] = {120, 3, 120, 0, 35, 1001, 8, 84, 75, 155};
        int arr[] = {120, 120, 120};
        int n = arr.length;
        secondLargestElement.secondHighest(arr, n);
    }
}

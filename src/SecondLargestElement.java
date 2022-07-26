public class SecondLargestElement {

    public static void secondHighest(int arr[], int size)
    {
        int largest, secondLargest;

        if (size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        largest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] < largest)
            {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + secondLargest);
    }
}

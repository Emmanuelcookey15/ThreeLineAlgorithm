public class QuestionTwo {


    void rotate(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            rotatebyOne(arr, arr.length);
    }

    void rotatebyOne(int arr[], int arraryLength)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arraryLength - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        QuestionTwo rotate = new QuestionTwo();
        int arr[] = {2,3,4,5,6};
        rotate.rotate(arr, 3);
        rotate.printArray(arr);
    }





}

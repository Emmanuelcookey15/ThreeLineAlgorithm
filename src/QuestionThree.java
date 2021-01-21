import java.util.ArrayList;

public class QuestionThree {

    static int[] cellCompete(int cells[], int days){
        for(int i = 1; i <= days; i++) {
            int[] dayValue = new int[cells.length];

            int leftData;
            int rightData;
            for(int j = 0; j < cells.length; j++){
                if (j == 0){
                    leftData = 0;
                }else{
                    leftData = cells[j - 1];
                }

                if (j == cells.length - 1){
                    rightData = 0;
                }else{
                    rightData = cells[j + 1];
                }

                if (leftData == rightData) {
                    dayValue[j] = 0;
                } else {
                    dayValue[j] = 1;
                }

            }

            cells = dayValue;
        }

        return cells;
    }

    void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args)
    {
        QuestionThree algo = new QuestionThree();
        int arr[] = {1,0,0,0,0,1,0,0};
        int brr[] = {1,1,1,0,1,1,1,1};
        int newArr[] = algo.cellCompete(arr, 1); // [0,1,0,0,1,0,1,0]
        algo.printArray(newArr);
        int newBrr[] = cellCompete(brr, 2); // [0,0,0,0,0,1,1,0]
        algo.printArray(newBrr);
    }

}

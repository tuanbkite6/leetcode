
import java.util.Scanner;

public class minmax {
    public static int maxValue(int[] number){
    
        //  Find the max value of array
        int max = number[0] ;
    for (int i = 1 ; i < number.length ; i++){
        if(number[i] >= max){
            max = number[i];
        }
    }
    return max;
    };
    public static int findMinValue(int[] number){
        int min = number[0];
        for(int i = 0 ; i < number.length; i++){
            if(number[i] < min){
                min = number[i];
            }
        }
        return min ;
    }
    public static void swap(int[]arr,int a ,int b ){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp ;
    }
// Buble sort to arrange array 
    public static int[] bubleSort(int[] number){
        int temp = number[0] ;
for (int i = 0; i < number.length - 1; i++){
    for (int j = i+1; j < number.length; j++){
        if(number[i]>number[j]){
            swap(number,number[i], number[j]);
        }
    }
}
return number;
    };
 
    //Selection sort to arrange array , select the smallest element of the array, push it to the top and start checking the new array from the next index to the end
public static int[] selectionSort(int[] arr){
   for(int i = 0 ; i < arr.length - 1 ; i++){
    int minIndex =  i ;
    for (int j = i + 1 ; j < arr.length ; j++){
        if(arr[j] < arr[minIndex]){
            minIndex = j ; 
        }
    }
    swap(arr, i, minIndex);
   }
    return arr;
}
//Merge sort to arrange array
public static int[] merge(int[] arr){
    
    
    return arr;
}

public static int[] mergeSort(int[] arr){
    
    
    return arr;
} 

 //Quicksort to arrange array , Idea of this algorithm is select the target value, after select use loop 
 public static int[] quickSort(int[] arr){
    return arr;

}

//Heapsort to arrange array 
public static int[] heapSort(int[] arr){



    return arr ;
}
    //InsertSort to arrange the array, select target and compare it with all value of sorted array 
    public static int[] inserSort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int target = arr[i];
            int j = i -1;
          while(j>= 0 && arr[j] > target){
            arr[j+1] = arr[j];
            j--;
          }
        arr[j+1] = target;
           }
        return arr;
    };

    public static int binarySearch(int[] arr, int searchNum){
        int head = 0 ;
        int last = arr.length -1  ;
        while(head <= last){
            int mid = head + (last - head )/2 ;
            if(searchNum == arr[mid]){
                return mid ;
            }
            else if (searchNum > arr[mid]){
                head = mid+1;
            }else{
                last = mid - 1;
            }
        }
        return -1;
    };

    //　Print array
    public static  void  printArray(int[] arr){
        System.out.println("The array after sorting is : " );
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter number of array :33");
    int any = scanner.nextInt();
    if (any <= 0){
        System.out.println("Invalid array size,please try again later");
        return;
    }
    int []number = new int[any];
    for(int i = 0 ; i < any; i++){
        System.out.println("Please enter value of number " + (i+1));
       number[i] = scanner.nextInt(); 
    }
    // System.out.println("Enter value which want to search, please: ");
    // int searchNum= scanner.nextInt();


//Calulate avarage value of the array 
//     int sum = 0 ;
//     for (int i = 0; i < any ; i++) {
//         sum += number[i];
//     }
//     int avr = sum / any ;
// System.out.println("Average of array is " + avr );


//Linear seach
// int searchIdx = 0;
// for(int i = 0  ; i < any ; i++){
//     if(number[i] == searchNum){
//          searchIdx = i ;
         
//     }else
// System.out.println("Target value can't find, so sorry");

// }
// System.out.println("Search value of index is " + searchIdx);


//Binary search
// bubleSort(number);
// int result = binarySearch(number, searchNum);
// if (result == -1 ){
//     System.out.println("Search value have not exist");
// }else{
//     System.out.println("Search value of index is :" + (result+1));
// }

// int[] result = inserSort(number);
int[] result = selectionSort(number);
printArray(result);

    scanner.close();
}    
}

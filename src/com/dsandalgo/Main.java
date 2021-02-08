package com.dsandalgo;

public class Main {

    public static void main(String[] args) {

         int[] intArray = {20,35,-15,7,55,1,-22};

        //the last unsorted index will be the last value in the array,
        // last unsorted index is greater than 0
        for( int lastUnsortedIndex =  intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            //bubble the largestvalue to the end of the array
            for(int i =0 ;i < lastUnsortedIndex; i++){
                if( intArray[i] >  intArray[i =1]){
                    swap( intArray, i, i+1);
                }
            }
        }
        for(int i =0; i < intArray.length; i++ ){
            System.out.println(intArray[i]);
        }

    }


 

    //swap method to swap elements
    //has to be pub;ic because we will call it from the mai method,
    //takes 3 parameters, the int[] array to take the arrays , the indexes I and j and the elements to be swapped
    public static void swap(int[] Array, int i, int j){
        //check wether i == J, if i ==J nothing to be done.
        if(i == j){
            return;
        }
        //create temporary variable to store i
        int temp = Array[i];
        Array[i]= Array[j]; //assign the value of array i to j if j != i
        Array[j] =temp; //temp takes J value and what is at I becomes J vice versa
    }
}

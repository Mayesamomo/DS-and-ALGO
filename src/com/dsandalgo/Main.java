package com.dsandalgo;

public class Main {

    public static void main(String[] args) {


    }


    public static void bubbleSort(int[] array){

        for( int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            for
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

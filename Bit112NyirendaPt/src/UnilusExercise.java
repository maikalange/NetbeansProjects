/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
public class UnilusExercise {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            printStar(i);
        }

        int result = smallestNumber(-2, 3, -1);

        System.out.println(result);
    }

    private static void printStar(int i) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private static int smallestNumber(int i, int j, int k) {
        int[] numbers = {i,j,k};

       return  BubbleSort(numbers)[numbers.length-1];

    }
    
    
    
    public static int[] ExchangeSort(int [] num){
        
        int temp;
        
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                
                if (num[i]<num[j]) {
                   temp=num[i];
                   num[i] = num[j];
                   num[j] =temp;
                }
            }
            
        }
        return num;
        
    }

    public static int[] BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
     return num;
}
    
}

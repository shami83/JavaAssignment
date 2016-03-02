package com.example.loop.star;

/*
 * 
 * This class display trangle as follows
 * 
 *         *
 *        * *
 *      * * * * 
 *    * * * * * *      
 */

public class DisplayTrangle {
	
	public void triagle_center(int max){//max means maximum star having
        int n=max/2;
        
        /*This loop prints Top star  as  max star is 20 so i first row we have 19 single blanks and one star to complete left hand
         * So n = 20/2 = 10 
         * 
         * For first row middle point is 11 th position so 19 single blanks one * 
         * 
         * 
         * Row onwards
         * 
         * star = row number * 2 if 1st row 2 stars
         * double blank = middle pos - row number;= 10-1=9 double blanks
         * 
         * as middle pos is  11.        * 
         * 
         * 
         * *\
         * 
         */
        
        for(int m=0;m<((2*n)-1);m++){//for upper star
            System.out.print(" ");
        }
        System.out.println("*");

        for(int j=1;j<=n;j++){
            for(int i=1;i<=n-j; i++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*j;k++){
            System.out.print("* ");
            }

            System.out.println();
        }


    }
	
	
	public static void main(String[] args) {
		
		DisplayTrangle ref = new DisplayTrangle();
		ref.triagle_center(20);
		
	}


}

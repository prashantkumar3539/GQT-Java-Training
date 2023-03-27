package GqtCodes;

import java.util.Scanner;

/*
// Alphbet A
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                if ((i==0 && j<=n/2)||
                		j==0 || j==n/2 ||
                		(i== n/2 && j< n/2 || 
                		(j== 0 && i>=(3*n)/4)
                		)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

}
*/

//-------------------------------------------------------------------


//Alphbet B
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
         for (int j = 0; j <= n-1; j++) {
             if (j==0 || (j==n/2 && i!=0 && i !=n/2) &&
            		 i != (n-1) ||
            		 (i==n/2 && j<n/2) || 
            		 (i==0 && j<n/2) ||
            		 (i== n-1) && j < n/2) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }

	}

}


//-------------------------------------------------------------------

/*
//Alphbet C
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
         for (int j = 0; j <= n-1; j++) {
             if ((i==0 && j<=n/2)||
             		j==0 || j==n/2 ||
             		(i== n/2 && j< n/2 || 
             		(j== 0 && i>=(3*n)/4)
             		)) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }

	}

}
*/
// -------------------------------------------------------------------
/*
//Alphbet J

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
         for (int j = 0; j <= n-1; j++) {
             if ((i==0 && j<n/2)||
             		j==n/4 ||
             		(i== n-1 && j< n/4 || 
             		(j== 0 && i>=(3*n)/4)
             		)) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }

	}

}

*/
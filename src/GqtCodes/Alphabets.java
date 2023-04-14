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

/*
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
*/


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
//Alphbet D
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


/*
// Alphabet E
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
         for (int j = 0; j <= n-1; j++) {
             if ((j==1 ||
            		 (i==0 && j<n/2) ||
            		 (j==n/2 && i!= 0 && i !=n-1) ||
            		 (i== n-1 && j<n/2))) {
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


/*
// Program for writing PRASHANT 
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
			//Logic for P
         for (int j = 0; j <= n-1; j++) {
             if (i==0 && j<(n/2) ||
            		 (j==0) ||
            		 (i==n/2 && j<n/2) || 
            		 (j==n/2 && i>0 && i<n/2))
            		  {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         } 
         //Logic for R
         for (int j = 0; j <= n-1; j++) {
             if (i==0 && j<(n/2) ||
            		 (j==0) ||
            		 (i==n/2 && j<n/2) || 
            		 (j==n/2 && i>0 && i<n/2)||
            		 i-j==n/2)
            		  {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         //Logic for A
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
         //Logic for S
         for (int j = 0; j <= n-1; j++) {
             if ((i==0 && j!=0 && j<=n/2)||
             		(j==0 && i!=0 && i<n/2) || 
             		(i==n/2 && j!=0 && j<n/2) ||
             		(j==n/2 && i>n/2 && i!= n-1) ||
             		(i==n-1 && j<n/2 && j!=n/2)){
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         //Logic for H
         for (int j = 0; j <= n-1; j++) {
             if (j==0 ||
            		i==n/2 && j<=n/2 ||
            		j==n/2){
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         //Logic for A
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
//         
         //Logic for N
         for (int j = 0; j <= n-1; j++) {
             if ((j==0)||
            		 j== n-1 || 
             		(j==i)
             		) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.print("        ");
         //Logic for T
         
         for (int j = 0; j <= n-1; j++) {
             if ((i==0 )||
             		j== n/2 
             		) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
             }
         }
         //
         System.out.println();
     }

	}

}
*/

//-------------------------------------------------------------------

/*
//Alphbet E
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
       for (int j = 0; j <= n-1; j++) {
           if (j==0 ||
        		   i==0 && j<=n/2 ||
        		   i==n/2 && j<=n/2 ||
        		   i==n-1 && j<=n/2) {
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

/*
//Alphbet F
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
     for (int j = 0; j <= n-1; j++) {
         if (j==0 ||
      		   i==0 && j<=n/2 ||
      		   i==n/2 && j<=n/2 
      		   ) {
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
/*
//---------------------------------------------------------------------------
//Alphbet G
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
     for (int j = 0; j <= n-1; j++) {
         if ((i==0 && j<=n/2 && j!=0)||
        		 j==0 && i!=0 && i!=(n-1) ||
        		 i==n/2 && j>n/4 && j<n/2 ||
        		 j==n/2 && i>=n/2 && i !=0||
        		 (i==n-1 && j<=n/2 && j!=0)
      		   ) {
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
// G.R. NARENDRA 

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= sc.nextInt();
		for (int i = 0; i <=n-1; i++) {
			//G
     for (int j = 0; j <= n-1; j++) {
         if ((i==0 && j<=n/2 && j!=0)||
        		 j==0 && i!=0 && i!=(n-1) ||
        		 i==n/2 && j>n/4 && j<n/2 ||
        		 j==n/2 && i>=n/2 && i !=0||
        		 (i==n-1 && j<=n/2 && j!=0)
      		   ) {
             System.out.print("# ");
         } else {
             System.out.print("  ");
         }
     }
     System.out.println();
 }

	}

}


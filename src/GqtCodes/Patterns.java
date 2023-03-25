package GqtCodes;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <=5; i++) {
//		System.out.println(i+" Hello Prashant Kumar");
//		
//	}
	// -------------------------         -------------------------------------------
	
//	int i=1;
//	while(i<=5) {
//		System.out.println(i+". Prashant Kumar");
//		i++;
//	}

	// -------------------------         -------------------------------------------

//	int i=1;
//	do {
//		System.out.println(i+". Hello Prashant Kumar");
//		i++;
//	}while(i<=5);
	// -------------------------         -------------------------------------------
//	int count=1;
//	
//	for(int i=1;i<=5;i++){
//		System.out.print(count+" ");
//		count+=5;
//	}
	
	// -------------------------         -------------------------------------------
//	int count=25;
//	
//	for(int i=1;i<=5;i++){
//		System.out.print(count+" ");
//		count-=5;
//	}
//}
	/*
	  	25 20 15 10 5 
	  */
//-------------------------         -------------------------------------------
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n;j++) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//		
//	}
//}
/*
 1 1 1 1 1 
 2 2 2 2 2 
 3 3 3 3 3 
 4 4 4 4 4 
 5 5 5 5 5 
 */
	

//=================================================================
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	int count = 1;
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n;j++) {
//			System.out.print(count+"	");
//			count++;
//		}
//		System.out.println();
//	}
	/*  OUTPUT
		1	2	3	4	5	
		6	7	8	9	10	
		11	12	13	14	15	
		16	17	18	19	20	
		21	22	23	24	25
	 */
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	int count = n*n;
//	for (int i=1;i<=n;i++) {
//		System.out.print(count+"	");
//			count*=n;
//		}
//		System.out.println();
//	}
//
	/*  OUTPUT
	25	24	23	22	21	
	20	19	18	17	16	
	15	14	13	12	11	
	10	9	8	7	6	
	5	4	3	2	1
	 */
	
//-----------------------------------------------------	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	int count = n*n;
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n;j++) {
//			System.out.print(count+"	");
//			count--;
//			
//		}
//		System.out.println();
//	}
//}
	/*  OUTPUT
	25	24	23	22	21	
	20	19	18	17	16	
	15	14	13	12	11	
	10	9	8	7	6	
	5	4	3	2	1
	 */
	
//	-----------------------------------------------------------------
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n;j++) {
//			System.out.print("$ ");	
//		}
//		System.out.println();
//	}
//	
//	}

/*  OUTPUT
	$ $ $ $ $ 
	$ $ $ $ $ 
	$ $ $ $ $ 
	$ $ $ $ $ 
	$ $ $ $ $
	 */
//-------------------------------------------------------------------
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n;j++) {
//			System.out.print("$ ");	
//		}
//		for (int j=1;j<=n;j++) {
//			System.out.print("# ");	
//		}
//		System.out.println();
//		
//		
//	}
//	
//}
	/*   OUTPUT
	$ $ $ $ $ # # # # # 
	$ $ $ $ $ # # # # # 
	$ $ $ $ $ # # # # # 
	$ $ $ $ $ # # # # # 
	$ $ $ $ $ # # # # # 
		 */
//-------------------------------------------------------------------------------
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=i;j++) {
//			System.out.print("@ ");	
//		}
//		System.out.println();
//		
//		
//	}
//	
//}
/*   OUTPUT
	@ 
	@ @ 
	@ @ @ 
	@ @ @ @ 
	@ @ @ @ @ 
	@ @ @ @ @ @  
 */
	
	//-------------------------------------------------------
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=n-i+1;j++) {
//			System.out.print("@ ");	
//		}
//		System.out.println();
//		
//		
//	}
//	
//}
/*   OUTPUT
		@ @ @ @ @ 
		@ @ @ @ 
		@ @ @ 
		@ @ 
		@ 
 */
//---------------------------------------------------------
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the value of n: ");
//int n= sc.nextInt();
//for (int i=1;i<=n;i++) {
//	for (int j=1;j<=i;j++) {
//		System.out.print(i+" ");	
//	}
//	System.out.println();
//	
//	
//}
//
//}
/*   OUTPUT
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
 
*/
//-------------------------------------------------------
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=i;j++) {
//			System.out.print(j+" ");	
//		}
//		System.out.println();
//		
//		
//	}
//	
//}
/*   OUTPUT
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
	 
 */
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the value of n: ");
//	int n= sc.nextInt();
//	int count = 1;
//	for (int i=1;i<=n;i++) {
//		for (int j=1;j<=i;j++) {
//			System.out.print(count+"	");	
//			count++;
//		}
//		System.out.println();
//		
//		
//	}
//	
//}

/*   OUTPUT
	1	
	2	3	
	4	5	6	
	7	8	9	10	
	11	12	13	14	15	

	 
 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int n= sc.nextInt();
	for (int i=1;i<=n;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print("& ");	
		}
		for (int j=1;j<=n;j++) {
			System.out.print("# ");	
		}
		System.out.println();
//		
//		
	}
//	
//}
/*   OUTPUT
		& # # # # # 
		& & # # # # # 
		& & & # # # # # 
		& & & & # # # # # 
		& & & & & # # # # #  
 */
//---------------------------------------------------


	}

}

import java.util.Scanner;

class Warmup {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
        	
	int day;	
	System.out.print("enter day number : ");
	day = sc.nextInt();
	
	switch(day){
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		default:
		System.out.println("Sunday!!!");
		};

       }
   }






/*
	int a,b,sum;
	
	System.out.print("enter A : ");
	a = sc.nextInt();
	System.out.println();
	System.out.print("enter B : ");
	b = sc.nextInt();
	
	sum = a+b;	
	System.out.println("sum is " + sum);

*/




/*      System.out.println("Vedika Tech Labs");
	
	int num = 5;
	for (int i=1; i<=10; i++) {
	  System.out.println(i*num);
	}
*/


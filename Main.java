// import java.util.Scanner;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Length: ");
//         int length=sc.nextInt();
//         System.out.print("Breadth: ");
//         int breadth=sc.nextInt();
//         int area=length*breadth;
//         System.out.println("Area: " + area);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Student Details:");
//         System.out.print("ID: ");
//         String ID=sc.nextLine();
//         System.out.print("Name: ");
//         String Name=sc.nextLine();
//         System.out.print("Department: ");
//         String Dept=sc.nextLine();
//         System.out.print("Age: ");
//         int Age=sc.nextInt();


//     }
// }

// class Main {
//     public static void main(Stringmm[] args) {
//         String A="Car";
//         String B= "Name";
//         String C= A + B;
//         int D = C.length();
//         String E= C.toUpperCase();
//         System.out.println("Uppercase: " + E);
//         System.out.println("Length: " + D);
//         System.out.println("Concatenation: " + C);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Length: ");
//         int length=sc.nextInt();
//         System.out.print("Breadth: ");
//         int breadth=sc.nextInt();
//         int area=length*breadth;
//         System.out.println("Area: " + area);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         int A=20;
//         int B=20;
//         int C=20;
//         if(A>B && A>C){
//             System.out.println("A is greater");
//         }
//         if(B>A && B>C){
//             System.out.println("B is greater");
//         }
//         if(C>A && C>B){
//             System.out.println("C is greater");
//         }
//         else if(A==B && A==C){
//             System.out.println("All are equal");
//         }
//     }
// }

// class Main{
//     void great(){
//         System.out.println("Java Method ");

//     }
//     int getnumber(){
//         return 5;
//     }
//     void showsum (int a, int b){
// 	System.out.println("Sum " +(a+b)); 
// }

//  int multiply (int a, int b){
// 	return a*b;
// }
// public static void main(String[] args){
// 	Main obj=new Main();
// 	obj.great();
// 	int num=obj.getnumber();
// 	System.out.println("Return Number "+num);
// 	obj.showsum(5,3);
// 	int result=obj.multiply(4,5);
// 	System.out.println("Multiplied " +result);
// }
// }

class Main {
    public void fact1() {
		int n = 5, f = 1;
		while (n > 0) {
			f = f*n;
			n--;
}
System.out.println(f);
  }
  void fact2(int n) {
		int f = 1;
		while (n > 0) {
			f = f*n;
			n--;
}
System.out.println(f);
  }
  int fact3(int n) {
		int f = 1;	
		while (n > 0) {
			f = f*n;
			n--;
}
return f;
  }
     void fact4() {
		int n = 5, f = 1;
		while (n > 0) {
			f = f*n;
			n--;
}
return f;
  }
  public static void main(String[] args) {
		Main obj = new Main();
		obj.fact1();
		obj.fact2(6);
		int result = obj.fact3(7);
		int result2 = obj.fact4();
		System.out.println(result);
		System.out.println(result2);
	}
  
}



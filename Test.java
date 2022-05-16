package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 Student ss[] = new Student[2];
		 
		 for(int i=0; i<ss.length; i++)
		 {
			 Student s = new Student();
			 System.out.println("Enter all input here");
			 s.setId(sc.nextInt());
			 s.setName(sc.next());
			 ss[i] = s;
		 }
		 for (int i=0; i<ss.length; i++)
		 {
			 System.out.println(ss[i].getId());
			 System.out.println(ss[i].getName());
		 }

	}

}

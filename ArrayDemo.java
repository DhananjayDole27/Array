package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int b[] = new int [5];
		int h =10;
		for(int i=0; i<b.length;i++)
		{
			b[i] = h;
			h= h+20;
			System.out.println(b[i]);
		}

	}

}

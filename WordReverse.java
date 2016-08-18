# wordreverse
import java.util.Scanner;


public class WordReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String rev=" ";
		for(int i=0;i<s1.length;i++)
		{
			StringBuffer sb=new StringBuffer(s1[i]);
			rev+=sb.reverse().toString()+" ";
		}
		System.out.println(rev);
	}

}

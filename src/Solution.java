//
////import java.util.LinkedList;
////import java.util.Queue;
//import java.util.Scanner;
//
//public class Solution {
//	static String a;
//	static char b[];
////	static int c[];
////	static Queue<Point> q = new LinkedList<Point>();
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextLine();
//		b = new char[a.length()];
////		c = new int[a.length()];
//		b = a.toCharArray();
//		
//
//		// 일단 배열에다가 각 알파벳 넣어주고...
//
//	}
//
//}
//
//class Point {
//	char x;
//	int y;
//
//	Point(char x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//}
import java.util.Scanner;

public class Solution {
	static String a;
	static int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i) - 'A' + 1;
			System.out.print(b + " ");
		}
	}

}
package hashmaps;

import java.util.Scanner;
import java.util.Stack;

public class Zad3 {

	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		Scanner scan=new Scanner(System.in);
		char[] line=scan.nextLine().toCharArray();
		for(int i=0;i<line.length;i++) {
			if(line[i]=='(' ||line[i]=='[' ||line[i]=='{') {
				stack.add(line[i]);
			}else if(line[i]==')' && stack.peek()=='(') {
				stack.pop();
			}else if(line[i]=='}' && stack.peek()=='{') {
				stack.pop();
			}else if(line[i]==']' && stack.peek()=='[') {
				stack.pop();
			}
		}
		System.out.println(stack.isEmpty());
		scan.close();
	}

}

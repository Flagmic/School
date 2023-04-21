package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad_4 {

	public static int[][] makeMatrix(File file,boolean isMatrix1) throws IOException {
			Scanner scan=new Scanner(file);
			int lineNumber=0;
			while(scan.hasNext()){
				String line=scan.nextLine();
				String[] numbers=line.split(" ");
				int[] Numbers=new int[numbers.length];
				for(int i=0;i<Numbers.length;i++) {
					Numbers[i]=Integer.parseInt(numbers[i]);
				}
				int[][]matrix=createMatrix(file,Numbers[0],Numbers[1],lineNumber,scan);
				if(isMatrix1) {
				return matrix;
				}
				else {
					isMatrix1=true;
				}
			}
			return null;
	}
	public static int[][] multiply(int[][]matrix1,int[][]matrix2){
		int[][] matrix3=new int[matrix1.length][matrix2[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix2[0].length;j++) {
				for(int k=0;k<matrix2.length;k++) {
					matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		print(matrix3);
		return matrix3;
	}
	
	
	public static int[][] createMatrix(File file,int i, int j,int lineNumber,Scanner scan) throws FileNotFoundException {
		int[][] matrix=new int[i][j];
		for(int a=0;a<i+lineNumber;a++) {
			String line=scan.nextLine();
			if(a<lineNumber) continue;
			String[] numbersString=line.split(" ");
			for(int b=0;b<numbersString.length;b++) {
				matrix[a-lineNumber][b]=Integer.parseInt(numbersString[b]);
			}
		}
		return matrix;
	}
	
	public static void write(File file,int[][] matrix) throws IOException{
		FileWriter fw=new FileWriter(file);
		fw.write(matrix.length+" "+matrix[0].length+'\n');
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				fw.write(matrix[i][j]+" ");
			}
			fw.write('\n');
		}
		fw.close();
	}

//	 works with the line number having to be the line of the matrix size
	 
	
	public static void main(String[] args){
		File file=new File("file input.txt");
		File file2=new File("file output.txt");
		try {
			int[][] matrix1=makeMatrix(file,true);
			int[][] matrix2=makeMatrix(file,false);
			int[][] matrix3=multiply(matrix1,matrix2);
			write(file2,matrix3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void print(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

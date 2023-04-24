public class Recursion {
    public static int factorial(int i){
        if(i==1) return i;
        return i*factorial(i-1);
    }
    public static int sum(int i){
        if(i==1) return 1;
        return sum(i-1)+factorial(i);
    }
    public static int sumNumbers(int i){
        if(i==0) return 0;
        return i%10+sumNumbers(i/10);
    }
    public static int sumArr(int arr[],int i,int k){
        if(i==arr.length) return 0;
        if(sumNumbers(arr[i])>k){
            return sumArr(arr,i+1,k)+arr[i];
        }
        else return sumArr(arr, i+1, k);
    }
    public static void printSymbol(int i,char c){
        if(i==0){
        System.out.println();
        return;
        }    
        System.out.print(c);
        printSymbol(i-1,c);
    }
    public static void withoutNewLine(int i,char c){
        if(i==0)return;
        System.out.print(c);
        withoutNewLine(i-1,c);
    }
    public static void printPyramid(int i,int n){
        if(i==0) return;
        withoutNewLine(i, ' ');
        printSymbol(n+1, '*');
        printPyramid(i-1, n+2);
    }
    
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(sumNumbers(1243));
        int[] arr={41,67,29,689};
        System.out.println(sumArr(arr,0,10));
        // printSymbol(4, '*');
        int n=5;
        printPyramid(n, n-1);
    }
}

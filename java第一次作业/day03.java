
import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a=sc.nextInt();
        isPalindrome(a);
    }
    public static void isPalindrome(int num){
        int i=0,n=0,b;
        b=num;
        while(num>0){
            n=n*10+num%10;
            i++;
            num/=10;
        }
        System.out.println(n==b?"Yes":"No");
    }
}

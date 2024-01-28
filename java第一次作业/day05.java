import java.util.Scanner;

public class day05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        arraysDemo();
    }
    public static void arraysDemo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入十个数字");
        int[] a=new int[20];
        int min=0,max=0;
        for(int i=1;i<=10;i++){
            a[i]= sc.nextInt();
            if(i==1){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min+max);
    }
}

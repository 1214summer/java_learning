public class day04 {
    public static void main(String[] args) {
        ShuiXianHua();
    }
    public static void ShuiXianHua(){
        int i,j,k,l;
        for(i=100;i<=999;i++){
            j=i%10;
            k=i/10%10;
            l=i/100;
            if(j*j*j+k*k*k+l*l*l==i){
                System.out.print(i+" ");
            }
        }
    }
}

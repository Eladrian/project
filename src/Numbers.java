/**
 * Created by tmp on 12.05.2016.
 */
public class Numbers {
    public static void main(String[] args) {
        for(int i=1; i<101;i++){
            if((i%5==0)&&(i%7!=0)){
                System.out.println('A');
            }
            if((i%5!=0)&&(i%7==0)){
                System.out.println('B');
            }
            if((i%5==0)&&(i%7==0)){
                System.out.println("ABBA");
            }
            if((i%5!=0)&&(i%7!=0)) {
                System.out.println(i);
            }
        }
    }
}

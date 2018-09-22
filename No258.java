public class No258 {
    public static void main(String []args){
        System.out.println(Solution.addDigits(40));
    }
}
class Solution {
    public static int addDigits(int num) {
        if(num<10)
            return num;
        while(num>9){
            int temp2=0;
            while (num!=0){
                temp2+=num%10;
                num/=10;
            }
            num=temp2;
        }
        return num;

    }
}
//class Solution {
//    public int addDigits(int num) {
//        return num==0?0:(num%9==0?9:(num%9));
//    }
//}

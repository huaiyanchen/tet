package Java;
//倒序输出数字

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字");
        int aaa = sc.nextInt();
        System.out.println(s.reverse(aaa));
    }
}
class Solution {
    public int reverse(int x) {
        long a = 0;
        int b =0;
        if(x>=0){
            b=(x+"").length();//正数
        }
        else{
            b=(x+"").length()-1;//负数有一个负号
        }
        while (x!=0){
            for(int i=0;i<b;i++){
                int a1 = x%10;//当前最后一位数字 ，负数则显示的是负数-25%10 等于 -5
                x=(x-a1)/10;//把最后一位数字剔除掉的新数字
                a += (int) (a1*Math.pow(10,b-i-1));  //相当于将每次的最后一位乘以当前位在十进制中的权重。234 = 2*10^2+3*10^1+4*10^0
            }
        }
        if((a>Math.pow(2,31)-1)||(a<(-1)*Math.pow(2,31))){  //超过范围的返回0
            return 0;
        }
        return (int) a;
    }
}

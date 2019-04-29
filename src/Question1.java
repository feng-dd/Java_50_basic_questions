import java.util.Scanner;

/**
 *  第一题:
 *  有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 *  结果是:月-对-生  1-1,2-1,3-2,4-3,5-5,6-8,7-13
 *  分析:从三月开始 a[n] = a[n-1]+a[n-2],使用递归
 */

public class Question1 {
  public static void main(String[] args){
    System.out.print("请输入查询的月份:");
    Scanner scanner=new Scanner(System.in);
    int m = scanner.nextInt();//获取输入的整数
    System.out.println("第"+m+"个月兔子总数为"+count(m));
    scanner.close();
  }

  private static int count(int m) {
    // 1,2月份是定值
    if(m == 1 || m == 2){
      return 1;
    }else{
      return count(m-1)+count(m-2);
    }
  }
}

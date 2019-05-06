import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 程序分析：12 和 8
 *    最大公约数 bigDivisor : 4  大除小，小除余(循环)，直到余=0，大的数为最大公约数
 *    最小公倍数 multiple : 24   m * n / bigDivisor
 */
public class Question6 {
  public static void main(String[] args){
    int bigDivisor=0; //定义最大公约数
    int multiple=0; //定义最小公倍数
    int temp = 1; //暂存数
    System.out.print("请输入第一个正整数:");
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.print("请输入第二个正整数:");
    int n = scanner.nextInt();
    multiple = m * n;

    if(m < n){ //使得 m 永远大于 n
      temp = m;
      m = n;
      n = temp;
    }
    while (temp != 0) { //求余结果不等于零，就一直循环
      temp = m % n; //求余
      m = n;  //大的数已经没用了，小数给m
      n = temp; // 余数给n
    }
    bigDivisor = m; //最后一次求余结果为零时，被求余的数
    multiple = multiple / bigDivisor;
    System.out.println("最大公约数是："+ bigDivisor );
    System.out.println("最小公倍数是："+ multiple );
    scanner.close();
  }
}

import java.util.Scanner;

/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 分析：
 * 1.如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可
 * 2.如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步
 * 3.如果n不能被k整除，则用k+1作为k的值,重复执行第一步
 */
public class Question04 {
  public static void main(String[] args){
    System.out.print("请输入正整数:");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 2; i <= num; i++) {
      while(num%i==0 && num !=i){
        num = num/i;
        System.out.print(i+"*");
      }
      if(num == i){//上面的都不能整除，说明这是一个质数
        System.out.print(i);
      }
    }
  }
}













/**
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 * 程序分析：
 *      因子：一个数可以被因子整除,且因子不会大于这个数的一半
 */
public class Question9 {
  public static void main(String[] args){
    System.out.print("1000 以内的所有完数有：");
    for (int i = 1; i < 1000 ; i++) {
      int sum = 0;//因子和,每换一个数，就要重置，所以定义在 for 循环
      for (int j = 1; j < i/2 + 1; j++) {
        if(i % j == 0){
          sum = sum+j;
          if(sum == i)
            System.out.print(i+" ");
        }
      }
    }
  }
}

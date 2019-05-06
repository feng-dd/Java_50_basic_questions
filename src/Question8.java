import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中 a 是一个数字，出现的最大个数为 n
 *      例如2+22+222+2222+22222(此时共有5个数相加)
 *      输出结果的形式如：2+22+222=246；
 * 程序分析：1.接收两个数
 *          2.2和22之间查20，22和222之间查200，依次类推
 *          3.将需要加入的数存放到数组中
 */
public class Question8 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("输入a：");
    int a = sc.nextInt();
    System.out.print("输入n：");
    int n = sc.nextInt();
    int sum = 0;
    int[] arr=new int[n];//创建数组长度为输入的项数
    arr[0] = a; //第一个数为 a
    int i = 1;//循环因子
    while(i < n){
      a*= 10;
      arr[i] = arr[i-1] + a;
      i++;
    }
    for(int s : arr){
      sum += s;
      System.out.print(s);
      if(s == arr[n-1])
        break;
      System.out.print(" + ");
    }
    System.out.print(" = " + sum + ";");
  }
}

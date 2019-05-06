import java.util.Scanner;

/**
 * 题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
 *      再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
 *
 */
public class Question10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("输入h：");
    int h = sc.nextInt();
    System.out.print("输入n：");
    int n = sc.nextInt();
    int[] arr=new int[n];//创建数组长度为输入的次数
    int i = 1;//循环因子
    arr[0] = h / 2;
    int sum = arr[0];
    while(i < n){
      arr[i] = arr[i-1]/2;
      sum = sum + arr[i];
      i++;
    }
    System.out.println("第"+ n +"次落地时，共经过" +  sum + "米,第" + n + "次反弹" + arr[n-1] + "米");
  }
}

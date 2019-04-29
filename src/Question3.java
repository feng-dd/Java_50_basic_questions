/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Question3 {
  public static void main(String[] args){
    System.out.print("属于水仙花数的有：");
    int sum = 0;//水仙花数
    for (int i = 100; i < 1000; i++) {
      if(isDaffodil(i)){
        System.out.print(i+" ");
        sum++;
        if(sum%10==0){//每10行换行
          System.out.println();
        }
      }
    }
  }

  private static boolean isDaffodil(int i) {
    int one = i/100;//求得百位
    int two = i/10%10;//求得十位
    int three = i%10;//求得个位
    int sum = (one*one*one)+(two*two*two)+(three*three*three);
    if(sum == i){
      return true;
    }
    return false;
  }
}

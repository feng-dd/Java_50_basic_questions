/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数
 * 分析：
 *    素数：只能被1或本身整除的数，如：3,5,7,11,131...
 *    判断素数的方法：用一个数分别去除2到自身 Math.sqrt(10)
 */
public class Question02 {
  public static void main(String[] args){
    int count = 0;
    for (int i = 100; i < 200; i++) {
      if(isOrNo(i)) {//如果是素数
        System.out.print(i + " ");
        count++;
        if (count % 10 == 0) {//每10行换行
          System.out.println();
        }
      }
    }
    System.out.println("共"+count+"个素数");
  }

  private static boolean isOrNo(int i) {
    for(int j=2;j<Math.sqrt(i);j++){//从2开始除
      if(i%j==0) //如果能整除，说明不是素数
      return false;
    }
    return true;
  }
}

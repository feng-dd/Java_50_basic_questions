import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数
 * 程序分析：利用 ASCII 码确认字符的类型
 *  数字：48~57
 *  字母：(大写)65~90、(小写)97~122
 *  空格：32
 */
public class Question07 {
  public static void main(String[] args){
    int num = 0;//数字的个数
    int letter = 0;//字母的个数
    int space = 0;//空格的个数
    int others = 0;//其他的个数
    System.out.println("请输入一段字符串：");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] chars = str.toCharArray(); //转换为字符数组
    for (int i = 0; i < chars.length ; i++) {
      if(chars[i] >=48 && chars[i] <= 57) num ++;
      else if((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) letter ++;
      else if(chars[i] == 32) space ++;
      else others ++;
    }
    System.out.println("数字："+ num +"个，字母："+ letter +"个，空格："+ space +"个，其他："+ others +"个");
    sc.close();
  }
}

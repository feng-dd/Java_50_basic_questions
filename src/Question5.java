import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子
 */
public class Question5 {
  public static void main(String[] args){
    System.out.print("请输入学生成绩:");
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();
    String level = score >= 90 ? "A":score >= 60 ? "B":"C";
    System.out.println("成绩属于"+level+"等级");
    scanner.close();
  }
}

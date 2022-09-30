import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vector v = new Vector<>();

        int maxScore =0;

        while(true){
            System.out.print("请输入学生的成绩：");
            int score = scan.nextInt();
            
            if(score>=0){
                // Integer intScore = new Integer(score);
                // v.addElement(intScore);
                v.addElement(score);
            } else{
                break;
            }

            if(maxScore<score){
                maxScore=score;
            }
            
        }

        String level;
        for(int i = 0; i<v.size(); i++){
            Object obj = v.elementAt(i);
            // Integer intScore = (Integer)obj;
            // int score = intScore.intValue();
            int score = (int)obj;
            if(maxScore-score<=10){
                level = "A";
            } else if(maxScore-score<=20){
                level = "B";
            } else if(maxScore-score<=30){
                level = "C";
            } else{
                level = "D";
            }
            System.out.println("学生"+(i+1)+"的成绩是"+score+"，等级是"+level);
        }
        

    }
}

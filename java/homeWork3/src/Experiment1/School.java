package Experiment1;

/**
 * Created by zfl on 2016/10/12.
 */
public class School implements ComputerAversge {
    public double computed (int num,double score[]){
        double sum = 0.0;
        for( int i = 0; i<num;i++){
            sum = sum + score[i];
        }
        return sum/num;
    }
}

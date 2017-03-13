package Experiment1;

import java.util.Arrays;

/**
 * Created by zfl on 2016/10/12.
 */
public class Gymnastics implements ComputerAversge {
    public double computed(int num,double score[]){
        double sum = 0.0;
        Arrays.sort(score);
        for(int i = 1;i<num-1;i++){
            sum = sum + score[i];
        }
        return sum/(num-2);
    }
}

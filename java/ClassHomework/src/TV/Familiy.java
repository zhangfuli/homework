package TV;

/**
 * Created by zfl on 2016/9/21.
 */
public class Familiy {
    public TV homeTV;
    public void buyTV(TV tv){
        this.homeTV = tv;
    }
    public void remoteControl(int channel){
        this.homeTV.setChannel(channel);
    }
    public void setTV(){
        System.out.println("新买的电视的频道为"+this.homeTV.getChannel());
    }
}

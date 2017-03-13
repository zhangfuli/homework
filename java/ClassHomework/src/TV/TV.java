package TV;

/**
 * Created by zfl on 2016/9/21.
 */
public class TV {
    int channel;
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }
    public void showChannel(){
        System.out.println("channel:"+ this.channel);
    }
}

/**
 * Created by zfl on 2016/9/14.
 */
public class Lader {
    float   above,bottom,height,area;
    Lader(float above,float bottom,float height){
        this.above = above;
        this.bottom = bottom;
        this.height = height;
    }
    float computerArea(){
        area = (above+bottom)*height/2.0f;
        return area;
    }
    void setHeight(float h){
        height =h;
    }
}

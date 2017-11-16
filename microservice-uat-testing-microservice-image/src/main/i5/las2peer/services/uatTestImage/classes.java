package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;

public class classes {

    class music {

    public music() {}
    
    private String musicName;

    public void setmusicName(String setValue) {
        this.musicName = setValue;
    }

    public String getmusicName() {
        return this.musicName;
    }
    private int musicId;

    public void setmusicId(int setValue) {
        this.musicId = setValue;
    }

    public int getmusicId() {
        return this.musicId;
    }
    private String musicUrl;

    public void setmusicUrl(String setValue) {
        this.musicUrl = setValue;
    }

    public String getmusicUrl() {
        return this.musicUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("musicName", this.musicName); 
        jo.put("musicId", this.musicId); 
        jo.put("musicUrl", this.musicUrl); 

        return jo;
    }

}
    class image {

    public image() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

}
    class imageMusic {

    public imageMusic() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

}

    
}

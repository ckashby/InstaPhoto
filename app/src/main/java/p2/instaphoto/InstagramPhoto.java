package p2.instaphoto;

/**
 * Created by p2 on 9/14/14.
 */
public class InstagramPhoto {
    // username, caption, image_url, height, likes_count
    public String username;
    public String caption;
    public String imageUrl;
    public int imageHeight;
    public int likesCount;

    // default behavior is to call toString method
    public String toString() {
        return "Aloha " + username;
    }

}

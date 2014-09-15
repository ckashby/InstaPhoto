package p2.instaphoto;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by p2 on 9/15/14.
 */
public class InstagramPhotosAdapter extends ArrayAdapter<InstagramPhoto> {
    public InstagramPhotosAdapter(Context context, List<InstagramPhoto> photos) {
        super(context, android.R.layout.simple_list_item_1, photos);
    }

    // getView method (int position)
    // Default, takes the model (InstagramPhoto) toString

}

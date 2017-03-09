package android.ali.com.newsapp.data;

import android.ali.com.newsapp.NewsApp;
import android.ali.com.newsapp.R;
import android.ali.com.newsapp.adapters.NewsAdapter.ROW_TYPE;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Paul on 3/3/17.
 */

public class OverviewObj extends RowObj {

    public String title;

    public String description;

    public String source;

    public String imageUrl;

    public String articleUrl;

    public OverviewObj(String source, String title, String description, String imageUrl, String articleUrl) {
        super(ROW_TYPE.NEWS_OVERVIEW.ordinal());
        this.source = source;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.articleUrl = articleUrl;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        OcrViewHolder holder;

        if(convertView==null){

            /****** Inflate tabitem.xml file for each row ( Defined below ) *******/
            LayoutInflater inflater = (LayoutInflater) NewsApp.getInstance().getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.row_overview, null);

            /****** View Holder Object to contain tabitem.xml file elements ******/
            holder = new OcrViewHolder();
            holder.title = (TextView) vi.findViewById(R.id.title);
            holder.description = (TextView) vi.findViewById(R.id.description);
            holder.source = (TextView) vi.findViewById(R.id.source);
            holder.image = (ImageView) vi.findViewById(R.id.image);

            vi.setTag( holder );
        } else {
            holder = (OcrViewHolder) vi.getTag();
        }

        holder.title.setText(title);
        holder.description.setText(description);
        holder.source.setText(source);

        Glide.with(NewsApp.getInstance())
                .load(imageUrl)
                .into(holder.image);

        return vi;
    }

    /********* Create a holder Class to contain inflated xml file elements *********/
    public static class OcrViewHolder {
        public TextView title;
        public TextView description;
        public TextView source;
        public ImageView image;
    }
}

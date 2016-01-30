package it.jaschke.alexandria;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailViewHolder {
    public TextView book_title;
    public TextView book_sub_title;
    public TextView book_desc;
    public TextView author;
    public ImageView book_cover;
    public TextView category;

    public DetailViewHolder(View view) {
        book_title     = (TextView)  view.findViewById(R.id.fullBookTitle);
        book_sub_title = (TextView)  view.findViewById(R.id.fullBookSubTitle);
        book_desc      = (TextView)  view.findViewById(R.id.fullBookDesc);
        author         = (TextView)  view.findViewById(R.id.authors);
        book_cover     = (ImageView) view.findViewById(R.id.fullBookCover);
        category       = (TextView)  view.findViewById(R.id.categories);
    }
}
package it.jaschke.alexandria.api;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import it.jaschke.alexandria.R;

public class ViewHolder {
    public final ImageView bookCover;
    public final TextView bookTitle;
    public final TextView bookSubTitle;

    public ViewHolder(View view) {
        bookCover    = (ImageView) view.findViewById(R.id.fullBookCover);
        bookTitle    = (TextView)  view.findViewById(R.id.listBookTitle);
        bookSubTitle = (TextView)  view.findViewById(R.id.listBookSubTitle);
    }
}
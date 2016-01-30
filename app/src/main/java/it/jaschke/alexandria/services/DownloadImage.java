package it.jaschke.alexandria.services;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

public class DownloadImage extends AsyncTask<String, Void, Bitmap> {
    public static final String LOG_TAG = DownloadImage.class.getSimpleName();
    ImageView bmImage;

    public DownloadImage(ImageView bmImage) { this.bmImage = bmImage; }

    protected Bitmap doInBackground(String... urls) {
        String urlDisplay = urls[0];
        Bitmap bookCover = null;

        try {
            InputStream in = new java.net.URL(urlDisplay).openStream();
            bookCover = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage());
            e.printStackTrace();
        }

        return bookCover;
    }

    protected void onPostExecute(Bitmap result) { bmImage.setImageBitmap(result); }
}
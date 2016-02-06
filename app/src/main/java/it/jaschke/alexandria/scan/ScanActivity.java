package it.jaschke.alexandria.scan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.jaschke.alexandria.R;
import me.dm7.barcodescanner.zbar.BarcodeFormat;
import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;

public class ScanActivity extends BaseScannerActivity implements ZBarScannerView.ResultHandler{
    private ZBarScannerView mScannerView;
    public static final String LOG_TAG = ScanActivity.class.getSimpleName();
    public static final String RESULT_STRING = "scanresult";

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_scanner);
        //setupToolbar();

        ViewGroup contentFrame = (ViewGroup) findViewById(R.id.content_frame);
        mScannerView = new ZBarScannerView(this);
        contentFrame.addView(mScannerView);
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);

        List<BarcodeFormat> list = Arrays.asList(BarcodeFormat.EAN13);
        mScannerView.setFormats(list);

        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result rawResult) {
        Log.w(LOG_TAG, rawResult.getContents()); // Print scan results
        Log.w(LOG_TAG, rawResult.getBarcodeFormat().getName()); // print scan format

        Intent intent = new Intent();
        intent.putExtra(RESULT_STRING, rawResult.getContents());
        setResult(Activity.RESULT_OK, intent);

        finish();
    }
}
package com.urja.hemendra.imagechooser;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.edmodo.cropper.CropImageView;

public class CropActivity extends AppCompatActivity {
    private CropImageView cropImageView;
    private static final String TAG = CropActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: asuchi............");
        setContentView(R.layout.activity_crop);

        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("bitmapImage");
        cropImageView.setImageBitmap(bitmap);
    }
}

//7008996831
//700899

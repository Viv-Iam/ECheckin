package com.innovach.echeckin.qr;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.innovach.echeckin.R;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.support.v7.appcompat.R.id.text;
import static com.innovach.echeckin.R.id.image;

public class GeneratorActivity extends AppCompatActivity {
    @Bind(R.id.text) EditText mText;
    @Bind(R.id.gen_btn) Button mGen_Btn;
    @Bind(image) ImageView mImage;
    String text2Qr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        ButterKnife.bind(this);

        mGen_Btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                text2Qr = mText.getText().toString().trim();
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try{
                    BitMatrix bitMatrix = multiFormatWriter.encode("text2Qr", BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    mImage.setImageBitmap(bitmap);
                }
                catch (WriterException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

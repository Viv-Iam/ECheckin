//package com.innovach.echeckin.qr;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.google.zxing.integration.android.IntentIntegrator;
//import com.google.zxing.integration.android.IntentResult;
//import com.innovach.echeckin.R;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//
//public class ReaderActivity extends AppCompatActivity {
//    @Bind(R.id.scan_btn) Button mScan_Btn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_reader);
//        ButterKnife.bind(this);
//
//        final Activity activity = this;
//        mScan_Btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//                    public void onClick(View view) {
//                IntentIntegrator intergrator = new IntentIntegrator(activity);
//                intergrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
//                intergrator.setPrompt("Scan");
//                intergrator.setCameraId(0);
//                intergrator.setBeepEnabled(false);
////                intergrator.setBarcodeImageEnabled(false);
//                intergrator.initiateScan();
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
//        if(result != null) {
//            if(result.getContents()==null) {
//                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
//            } else {
//                Toast.makeText(this, result.getContents(),Toast.LENGTH_LONG).show();
//            }
//        }else {
//            super.onActivityResult(requestCode, resultCode, data);
//
//        }
//    }
//}

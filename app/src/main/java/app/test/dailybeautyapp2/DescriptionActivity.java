package app.test.dailybeautyapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class DescriptionActivity extends AppCompatActivity {
    ImageView imageView, back,share;
    TextView textView, textViewDes,tv_appbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        imageView = findViewById(R.id.des_img_eyes_rv);
        back = findViewById(R.id.des_img_back);
        share=findViewById(R.id.des_share);
        textView = findViewById(R.id.des_txt_eyes_rv);
        textViewDes = findViewById(R.id.description_text);
        tv_appbar= findViewById(R.id.des_textView_appbar);

        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
            }
        });
        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("product_image");
        imageView.setImageResource(image);
        String data = bundle.getString("product_name");
        String des = bundle.getString("des");
        String title = bundle.getString("title");
        textView.setText(data);
        textViewDes.setText(des);
        tv_appbar.setText(title);
    }
}
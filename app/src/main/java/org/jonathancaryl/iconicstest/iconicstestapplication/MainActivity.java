package org.jonathancaryl.iconicstest.iconicstestapplication;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

import com.mikepenz.iconics.context.IconicsLayoutInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text_view);
        SpannableStringBuilder builder = new SpannableStringBuilder(getString(R.string.hello_world));
        builder.setSpan(new ForegroundColorSpan(0xffff0000), 0, builder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(builder);
    }
}

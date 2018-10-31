package ru.geekbrains.Sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.base.Sprite;
import ru.geekbrains.math.Rect;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;

public class Play extends Sprite {
    public Play(TextureAtlas atlas) {
        super(atlas.findRegion("play"));
    }
    @Override
    public void resize(Rect worldBounds) {
        pos.set(worldBounds.pos);
    }


//    public class Play extends AppCompatActivity {
//
//        private TextView helloTv;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            helloTv = (TextView) findViewById(R.id.hello_tv);
//            Button helloBtn = (Button) findViewById(R.id.hello_btn);
//
//            helloBtn.setOnClickListener(onClickListener);
//        }
//
//
//        private final View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        };
//
//    }
}










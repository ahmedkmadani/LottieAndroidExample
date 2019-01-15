package com.example.ahmedk.lottieandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView mLottieAnimationView;
    String mAnimFile = "world_locations.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLottieAnimationView = findViewById(R.id.lottie_animation_view);
        playAnim();
    }

    //function to play animation from assets folder

    private void playAnim() {
        LottieComposition.Factory.fromAssetFileName(this, mAnimFile, composition -> {
            mLottieAnimationView.setComposition(composition);
            mLottieAnimationView.playAnimation();
        });
    };

    //Destroy animation on activity destroy 

    @Override
    protected void onDestroy() {
        mLottieAnimationView.cancelAnimation();
        mLottieAnimationView = null;
        super.onDestroy();
    }
}





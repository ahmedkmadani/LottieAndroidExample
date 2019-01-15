# LottieAndroidExample
Render After Effects animations on Android , using Lottie http://airbnb.io/lottie/

Lottie is mobile library for Android parse Adobe after effect animation exported as JSON with Bodymovin and render them into
the mobile 


###### Implemnation : 

          dependencies {
            implementation 'com.airbnb.android:lottie:$lottieVersion'
          }
          
         
         
###### Layout : 
  
          <com.airbnb.lottie.LottieAnimationView
                android:id="@+id/lottie_animation_view"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:lottie_autoPlay="true"
                app:lottie_fileName="empty_status.json"
                app:lottie_loop="true" />
  
  
  
  ###### Activity : 
  
            String mAnimFile = "world_locations.json";

             playAnim();

             private void playAnim() {
                  LottieComposition.Factory.fromAssetFileName(this, mAnimFile, composition -> {
                      mLottieAnimationView.setComposition(composition);
                      mLottieAnimationView.playAnimation();
                  });
              };

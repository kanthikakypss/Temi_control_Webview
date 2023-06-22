package com.example.temi2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import com.github.nkzawa.emitter.Emitter;
import com.robotemi.sdk.Robot;

public class MainActivity extends AppCompatActivity {
//    Button button;
//    Button stop;
//    MediaPlayer mediaPlayer;

    /*
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://192.168.4.210:4000");

        } catch (URISyntaxException e) {}
    } */

    Button btnA, btnHome,btnB,btnC,btnNext;
    private Robot robot;
    TextView check;
    private  String Home = "home base";
    private  String locationa = "a";
    private  String locationb = "b";

    private  String locationc = "c";


    final Handler handler = new Handler();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        robot = Robot.getInstance();

        btnA = findViewById(R.id.buttonA);
        btnB = findViewById(R.id.buttonB);
        btnC = findViewById(R.id.buttonC);
        btnHome = findViewById(R.id.buttonnhome);
//        btnNext = findViewById(R.id.next);
        /*check = findViewById(R.id.textView);*/

        // for (String location : robot.getLocations()) {
        //     if (location.equals(locationa.toLowerCase().trim())) {
        //         handler.postDelayed(new Runnable() {
        //             @Override
        //             public void run() {
        //                 robot.goTo(locationa.toLowerCase().trim());
        //                 Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        //                 startActivity(intent1);
        //             }
                    
        //         }, 2000);continue;
        //     }
        // }

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(Home.trim())) {
                        robot.goTo(Home.trim());
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(locationa.trim())) {
                        robot.goTo(locationa.trim());
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(locationb.trim())) {
                        robot.goTo(locationb.trim());
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String location : robot.getLocations()) {
                    if (location.equals(locationc.trim())) {
                        robot.goTo(locationc.trim());
                    }
                }
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });

//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    openActivity2();
//                }catch (Exception e ){
//                    check.setText(e.toString());
//                    e.printStackTrace();
//                }
//            }
//        });
    }

    public void openActivity2() {
        Intent intent4 = new Intent(this, Activity2.class);
        startActivity(intent4);
    }

   /* private Emitter.Listener temp = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());

                }
            });
        }
    }; */

    /*@Override
    private void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.google.com");
    }  */


    /*Button temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = findViewById(R.id.temp);
    } */
    /*
    private Emitter.Listener Tilt = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play face");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    WebViewww();
                }
            });
        }
    };

    private void WebViewww() {
       // @Override
        //protected void onCreate(Bundle savedInstanceState) {
          //  super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
             webb = findViewById(R.id.textView2);
            // webbb = findViewById(R.id.imageFilterView);

        }
        private class Callback extends WebViewClient {
            //@Override
            public boolean shouldOverridekeyEvent(WebView view, KeyEvent event) {
                return false;
            }
        } */



    /*private Emitter.Listener Tilt = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play face");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    open();
                }
            });
        }
    }; */

    private Emitter.Listener Forward  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "Forward");

                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.skidJoy();

                    // add the message to view

                }
            });
        }
    };

    private Emitter.Listener Spin_L  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "Spin_Left");

                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.turnBy(20);

                    // add the message to view

                }
            });
        }
    };

    private Emitter.Listener Spin_R  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "Spin_Right");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.turnBy(-20);

                    // add the message to view

                }
            });
        }
    };

    /* private Emitter.Listener Stop  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "Spin_Right");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.stopMovement();

                    // add the message to view

                }
            });
        }
    }; */
    private Emitter.Listener Go_Home = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "go Home");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());


                    //play video
                    temiSDK.goTo(TemiSDK.HOME_BASE_LOCATION);

                }
            });
        }
    };
/*
    private Emitter.Listener Go_A  = new Emitter.Listener() {  //ของจริงงงง
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "goa");

                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //temiSDK.goTo("goa",false);
                    temiSDK.goTo(TemiSDK.ACTION_HOME_A);
                    // add the message to view

                }
            });
        }
    }; */
    private Emitter.Listener Go_B  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "gob");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //temiSDK.goTo("b",false);
                    temiSDK.goTo(TemiSDK.ACTION_HOME_B);
                    // add the message to view

                }
            });
        }
    };
    private Emitter.Listener Go_C  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "goc");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //temiSDK.goTo("b",false);
                    temiSDK.goTo(TemiSDK.ACTION_HOME_C);
                    // add the message to view

                }
            });
        }
    };

    private Emitter.Listener Go_D  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "god");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //temiSDK.goTo("b",false);
                    temiSDK.goTo(TemiSDK.ACTION_HOME_D);
                    // add the message to view

                }
            });
        }
    };

    private Emitter.Listener Spin_180  = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "Spin_Right");


                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.turnBy(180);

                    // add the message to view

                }
            });
        }
    };

    private Emitter.Listener Play_welcome = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");

                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //play video

                    playWelcome();
                    //temiSDK.speak("Hi i am Temi, Nice to meet you. I have a cool academic Engineering program for you to see. Please take a look at our new brochure.",false);

                }
            });
        }
    };

     private Emitter.Listener Play_song_temi = new Emitter.Listener() { //Test เพลง
         @Override
         public void call(final Object... args) {
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Log.d("myTag", "play video");
                     final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                     //play video
                     playWelcome_temi();

                 }
             });
         }
     };

   /* private Emitter.Listener Play_song_temi2 = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //play video
                    playWelcome_temi2();

                }
            });
        }
    };

    private Emitter.Listener Play_song_temi3 = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //play video
                    playWelcome_temi3();

                }
            });
        }
    };

    private Emitter.Listener Play_song_temi4 = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //play video
                    playWelcome_temi4();

                }
            });
        }
    }; */

    /*  private Emitter.Listener Play_welcome_temi = new Emitter.Listener() {
          @Override
          public void call(final Object... args) {
              runOnUiThread(new Runnable() {
                  @Override
                  public void run() {
                      Log.d("myTag", "play video");
                      final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                      //play video
                      playWelcome_temi();
                      temiSDK.speak("Hi i am Temi, Nice to meet you.",false);

                  }
              });
          }
      }; */
    private Emitter.Listener Play_thank = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());


                    //play video

                    //temiSDK.speak("Thank you so much. I'm very happy to talk with you today. Hope to see you again.",false);
                    playThank();
                }
            });
        }
    };

    /* private Emitter.Listener Play_thank_temi = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play video");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());


                    //play video
                    playThank_temi();
                    temiSDK.speak("Thank you so much. I'm very happy to talk with you today. Hope to see you again.",false);

                }
            });
        }
    };*/
   /* private Emitter.Listener Go_Home = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "go Home");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());


                    //play video
                    temiSDK.goTo(TemiSDK.HOME_BASE_LOCATION);

                }
            });
        }
    }; */
    /*private Emitter.Listener  Tilt = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "go Home");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    temiSDK.tiltAngle(23);


                    new CountDownTimer(1000, 1000) {

                        public void onTick(long millisUntilFinished) {

                        }

                        public void onFinish() {
                            temiSDK.tiltAngle(55);
                        }
                    }.start();

                }
            });
        }
    }; */
   /* private Emitter.Listener  dance = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "go Home");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());

                    temiSDK.turnBy(-25);


                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {

                        }

                        public void onFinish() {
                            temiSDK.turnBy(18);
                        }
                    }.start();

                }
            });
        }
    }; */
    private Emitter.Listener Play_face = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.d("myTag", "play face");
                    final TemiSDK temiSDK = new TemiSDK(getApplicationContext());
                    //play face
                    runUI();

                }
            });
        }
    };


    private void runUI(){
        final VideoView vv = (VideoView) findViewById(R.id.videoView2);

        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + +R.raw.step10);
        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();
    }

    private void playWelcome() {
        final VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });


        String path = "android.resource://" + getPackageName() + "/" + R.raw.welcome_s;
        videoView.setVideoPath(path);
        videoView.start();
    }

     private void playWelcome_temi() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        videoView.setVideoPath(path);
        videoView.start();
    }

    /*private void playWelcome_temi2() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        videoView.setVideoPath(path);
        videoView.start();
    }

    private void playWelcome_temi3() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video3;
        videoView.setVideoPath(path);
        videoView.start();
    }

    private void playWelcome_temi4() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video4;
        videoView.setVideoPath(path);
        videoView.start();
    } */


   /* private void playWelcome_temi() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.welcome_ns;
        videoView.setVideoPath(path);
        videoView.start();
    } */

    private void playThank() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.thank_s;
        videoView.setVideoPath(path);
        videoView.start();
    }

    /*private <val> void open() {

        try {
        Intent intent = null;
        val intent = Intent().setClassName("com.robotemi.browser", "com.robotemi.browser.MainActivity")
        intent.putExtra("url", "https://github.com");
        intent.putExtra("source", "intent");
        intent.putExtra("navBar", "SHOW");
        intent.putExtra("reset", "OFF");
        startActivity(intent);
        }

        catch {}
    }/*

    /*private void playThank_temi() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) { mp.setLooping(false);
            }
        });
        String path = "android.resource://" + getPackageName() + "/" + R.raw.thank_ns;
        videoView.setVideoPath(path);
        videoView.start();
    } */

}
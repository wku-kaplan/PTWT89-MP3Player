package sg.com.kaplan.mp3player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer =  MediaPlayer.create(this, R.raw.bg);

        final Button b = (Button) findViewById(R.id.button);
        b.setText("Play"); //set text programmatically
        b.setOnClickListener(new View.OnClickListener() {
            Boolean isPlaying = false;
            @Override
            public void onClick(View view) {
                if(isPlaying) {
                    mediaPlayer.pause();
                    b.setText("Resume");
                } else {
                    mediaPlayer.start();
                    b.setText("Pause");
                }

                isPlaying = !isPlaying;
            }
        });

    }
}

package tk.varshith.rolldice;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewRoll1, imageViewRoll2;
    private Button buttonclick;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewRoll1 = findViewById(R.id.image1);
        imageViewRoll2 = findViewById(R.id.image2);
        buttonclick = findViewById(R.id.rollbutton);
        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diceroll1();
                diceroll2();
            }
        });
    }

    public void diceroll1() {

        int randomnum1 = random.nextInt(6) + 1;
        switch (randomnum1) {
            case 1:
                imageViewRoll1.setImageResource(R.drawable.one);
                break;
            case 2:
                imageViewRoll1.setImageResource(R.drawable.two);
                break;
            case 3:
                imageViewRoll1.setImageResource(R.drawable.three);
                break;
            case 4:
                imageViewRoll1.setImageResource(R.drawable.four);
                break;
            case 5:
                imageViewRoll1.setImageResource(R.drawable.five);
                break;
            case 6:
                imageViewRoll1.setImageResource(R.drawable.six);
                break;
        }
//        diceroll2(randomnum1);
    }

    public void diceroll2() {
        int randomnum2 = random.nextInt(6) + 1;
        switch (randomnum2) {
            case 1:
                imageViewRoll2.setImageResource(R.drawable.one);
                break;
            case 2:
                imageViewRoll2.setImageResource(R.drawable.two);
                break;
            case 3:
                imageViewRoll2.setImageResource(R.drawable.three);
                break;
            case 4:
                imageViewRoll2.setImageResource(R.drawable.four);
                break;
            case 5:
                imageViewRoll2.setImageResource(R.drawable.five);
                break;
            case 6:
                imageViewRoll2.setImageResource(R.drawable.six);
                break;
        }

    }
}
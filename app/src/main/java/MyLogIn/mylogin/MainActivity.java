package MyLogIn.mylogin;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences=getSharedPreferences("MyLogIn.mylogin"MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putStringS("username","shivam.bhardwag_mca18@gla.ac.in");
        editor.putString("password","123456");
    }
}

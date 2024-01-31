package uqac.dim.nitflex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afficherStart(View v){
        Log.i("DIM", "La video a commencé!");

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // https://stackoverflow.com/questions/76334499/error-constant-expression-required-android-studio
        int id = item.getItemId();
        if (id == R.id.menu_preferences)
            return faireToast("Sélection des préférences");
        return super.onOptionsItemSelected(item);
    }
    private boolean faireToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        return true;
    }
}
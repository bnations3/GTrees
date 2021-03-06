package sendnodes.gtrees;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //private TextView mTextMessage;

    //private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
    //        = new BottomNavigationView.OnNavigationItemSelectedListener() {
    //
    //    @Override
    //    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    //        switch (item.getItemId()) {
    //           case R.id.navigation_home:
    //                mTextMessage.setText(R.string.title_home);
    //                return true;
    //            case R.id.navigation_dashboard:
    //                mTextMessage.setText(R.string.title_dashboard);
    //                return true;
    //            case R.id.navigation_notifications:
    //                mTextMessage.setText(R.string.title_notifications);
    //                return true;
    //        }
    //        return false;
    //    }
    //};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.title);

        Button toProjects = (Button) findViewById(R.id.projects);

        toProjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        projects.class));
            }
        });
    }

}

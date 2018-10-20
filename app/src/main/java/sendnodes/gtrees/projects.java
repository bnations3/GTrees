package sendnodes.gtrees;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

public class projects extends AppCompatActivity {

    private ArrayList<String> projectNames = new ArrayList<>();
    private static final String TAG = "projects";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_projects);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});
        fillProjectNames();
        Log.d(TAG, "onCreate: Location Names added to array");


    }

    private void fillProjectNames() {
        projectNames.add("Local Garden");
        projectNames.add("GT compost");
        projectNames.add("Local Trash pickup");

        initRecyclerView();
    }

    //Method to set up RecyclerView
    private void initRecyclerView() {
        RecyclerView recyclerview = findViewById(R.id.projectList);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(projectNames, this);
        recyclerview.setAdapter(adapter);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);
    }
}

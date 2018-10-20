package sendnodes.gtrees;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import sendnodes.gtrees.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> lTitles = new ArrayList<>();
    private Context context;


    public RecyclerViewAdapter(ArrayList<String> lTitles, Context context) {
        this.lTitles = lTitles;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item,
                viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.projectName.setText(lTitles.get(i));
        Log.d(TAG, "onBindViewHolder: Titles set for recycler view");

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + lTitles.get(i));

                Intent intent = new Intent(context, projects.class);
                intent.putExtra("project_name", lTitles.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lTitles.size();
    }

    //Holds items in memory for each individual entry
    //In this case, that would be the list items and the Location Names
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView projectName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            projectName = itemView.findViewById(R.id.project_name);
            parentLayout = itemView.findViewById(R.id.ItemLayout);

        }
    }
}

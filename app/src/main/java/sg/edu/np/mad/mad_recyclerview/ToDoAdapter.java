package sg.edu.np.mad.mad_recyclerview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ToDoAdapter extends RecyclerView.Adapter<ToDoViewHolder>{
    private ArrayList<ToDo> data;

    public ToDoAdapter(ArrayList<ToDo> inputData){
        data = inputData;
    }

    @NonNull
    @Override
    public ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_view,parent,false);
        return new ToDoViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewHolder holder, int position) {
        final ToDo toDo = data.get(position); //get the data  model based on position
        holder.toDoTxtView.setText((toDo.getToDoText()));

        holder.view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                View view = LayoutInflater.from(v.getContext()).inflate(R.layout.alert_dialog,null);
                TextView toDoTxt = view.findViewById(R.id.textView3);
                toDoTxt.setText(toDo.getToDoText()+"?");
                builder.setView(view)
                        .setTitle("Delete")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                data.remove(toDo);
                                notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setView(view);


                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }
    @Override
    public int getItemCount() {

        return data.size();
    }


}

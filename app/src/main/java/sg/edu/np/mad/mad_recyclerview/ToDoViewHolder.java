package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ToDoViewHolder extends RecyclerView.ViewHolder  {
    TextView toDoTxtView;
    CheckBox checkBox;
    View view;


    public ToDoViewHolder(View itemView){
        super(itemView);
        view = itemView;
        toDoTxtView = itemView.findViewById(R.id.textView);
        checkBox = itemView.findViewById(R.id.checkBox);
    }

}

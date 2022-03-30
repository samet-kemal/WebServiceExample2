package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.samet.webserviceexample2.R;

import java.util.List;

import Model.Information;

public class InformationAdapter extends BaseAdapter {
    List<Information> informationList;

    public InformationAdapter(List<Information> informationList, Context context) {
        this.informationList = informationList;
        this.context = context;
    }

    Context context;


    @Override
    public int getCount() {
       return informationList.size();
    }

    @Override
    public Object getItem(int i) {
        return informationList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);
        TextView userID=(TextView) view.findViewById(R.id.userIdTextView);
        TextView id=(TextView) view.findViewById(R.id.idTextView);
        TextView title=(TextView) view.findViewById(R.id.titleTextView);
        CheckBox completedCheck= (CheckBox) view.findViewById(R.id.completedCheckBox);

        userID.setText("USER ID = "+informationList.get(i).getStringUserId());
        id.setText("ID = "+informationList.get(i).getStringId());
        title.setText("TITLE = "+ informationList.get(i).getTitle());

        Boolean IsCompleted = informationList.get(i).getCompleted();
        if (IsCompleted){
            completedCheck.setChecked(true);
        }else {
            completedCheck.setChecked(false);
        }

        return view;
    }
}

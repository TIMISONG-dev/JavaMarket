package uniconteam.mymarket.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import uniconteam.mymarket.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> data1 = new HashMap<>();
        data1.put("icon", R.mipmap.ic_launcher);
        data1.put("title", "Булочка с маком");
        data1.put("cost", "20₽");
        list.add(data1);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("icon", R.mipmap.ic_launcher);
        data2.put("title", "Булочка с сыром");
        data2.put("cost", "40₽");
        list.add(data2);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("icon", R.mipmap.ic_launcher);
        data3.put("title", "Булочка с мясом");
        data3.put("cost", "80₽");
        list.add(data3);

        ListView listView = view.findViewById(R.id.listview);
        SimpleAdapter adapter = new SimpleAdapter(
                requireContext(),
                list,
                R.layout.listmarket,
                new String[]{"icon", "title", "cost"},
                new int[]{R.id.listIcon, R.id.listTitle, R.id.listCost}
        );
        listView.setAdapter(adapter);

        return view;
    }
}

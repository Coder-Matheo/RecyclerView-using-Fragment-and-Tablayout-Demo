package rob.myappcompany.recyclerviewusetablayoutfragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<Conact> lstContacts;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_fragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContacts = new ArrayList<>();
        lstContacts.add(new Conact("Franfurt 1", "(+12, +32)", R.drawable.fran1));
        lstContacts.add(new Conact("Franfurt 2", "(+17, +82)", R.drawable.fran2));
        lstContacts.add(new Conact("Franfurt 3", "(+120, +90)", R.drawable.fran3));
        lstContacts.add(new Conact("Franfurt 4", "(+28, +320)", R.drawable.fran4));


    }
}

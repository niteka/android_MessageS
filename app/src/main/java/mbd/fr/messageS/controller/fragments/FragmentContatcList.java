package mbd.fr.messageS.controller.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import mbd.fr.messageS.R;
import mbd.fr.messageS.controller.adapter.TextAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentContatcList.iCallable} interface
 * to handle interaction events.
 * Use the {@link FragmentContatcList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentContatcList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private iCallable mCallback;
    private RecyclerView recyclerView;
    Button bRegister;

    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;
    public interface iCallable {
        public void transfertData(String s);
    }

    public FragmentContatcList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentContatcList.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentContatcList newInstance(String param1, String param2) {
        FragmentContatcList fragment = new FragmentContatcList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> strs = new ArrayList<String>();
        strs.add("aime");
        strs.add("nag");
        strs.add("joe");
        strs.add("john");
        mAdapter = new TextAdapter(strs);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_contact_list, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //Gérer le touch sur la recycle view
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                View child = rv.findChildViewUnder(e.getX(), e.getY());
                int pos = rv.getChildAdapterPosition(child);

                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean b) {

            }
        });


        return inflater.inflate(R.layout.fragment_contact_list,container,false);
    }

                // TODO: Rename method, update argument and hook method into UI event

        @Override
        public void onAttach (Context context){
            super.onAttach(context);
            if (context instanceof iCallable) {
                mCallback = (iCallable) context;
            } else {
                throw new ClassCastException(context.toString()
                        + "must implement iCallable");
            }
        }

        @Override
        public void onDetach () {
            super.onDetach();
            mCallback = null;
        }
    }

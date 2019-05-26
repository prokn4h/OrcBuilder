package com.example.orcbuilder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TalentsFragment extends Fragment {

    private static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    private static final String TAG = "TalentsFragment";

    private int pageNumber;
    private String gameClass;
    private int firstPageBG;
    private int secondPageBG;
    private int thirdPageBG;
    private int firstPageView;
    private int secondPageView;
    private int thirdPageView;

    public static TalentsFragment newInstance(int page) {
        TalentsFragment talentsFragment = new TalentsFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        talentsFragment.setArguments(arguments);
        return talentsFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameClass = getActivity().getIntent().getExtras().getString("GAME_CLASS");
        firstPageBG = getActivity().getIntent().getExtras().getInt("FIRST_PAGE_BG");
        secondPageBG = getActivity().getIntent().getExtras().getInt("SECOND_PAGE_BG");
        thirdPageBG = getActivity().getIntent().getExtras().getInt("THIRD_PAGE_BG");
        firstPageView = getActivity().getIntent().getExtras().getInt("FIRST_PAGE_VIEW");
        secondPageView = getActivity().getIntent().getExtras().getInt("SECOND_PAGE_VIEW");
        thirdPageView = getActivity().getIntent().getExtras().getInt("THIRD_PAGE_VIEW");
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        switch (pageNumber) {
            case (0):
                //currentView = R.layout.fragment_warlock_affliction_talents;
                View view = inflater.inflate(firstPageView, container, false);
                ConstraintLayout specPage = view.findViewById(R.id.specPage);
                specPage.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                return view;
            case (1):
                //currentView = R.layout.fragment_warlock_demonology_talents;
                view = inflater.inflate(secondPageView, container, false);
                specPage = view.findViewById(R.id.specPage);
                specPage.setBackground(ContextCompat.getDrawable(getContext(), secondPageBG));
                return view;
            case (2):
                //currentView = R.layout.fragment_warlock_destruction_talents;
                view = inflater.inflate(thirdPageView, container, false);
                specPage = view.findViewById(R.id.specPage);
                specPage.setBackground(ContextCompat.getDrawable(getContext(), thirdPageBG));
                return view;
            default:
                //currentView = R.layout.fragment_warlock_affliction_talents;
                view = inflater.inflate(firstPageView, container, false);
                specPage = view.findViewById(R.id.specPage);
                specPage.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                return view;
        }

    }
}

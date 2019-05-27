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
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;


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
        /*firstPageView = getActivity().getIntent().getExtras().getInt("FIRST_PAGE_VIEW");
        secondPageView = getActivity().getIntent().getExtras().getInt("SECOND_PAGE_VIEW");
        thirdPageView = getActivity().getIntent().getExtras().getInt("THIRD_PAGE_VIEW");*/
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_talents, container, false);
        ScrollView specTree = view.findViewById(R.id.scrollingSpecPage);

        switch (pageNumber) {
            case (0):
                specTree.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                break;
            case (1):
                specTree.setBackground(ContextCompat.getDrawable(getContext(), secondPageBG));
                break;
            case (2):
                specTree.setBackground(ContextCompat.getDrawable(getContext(), thirdPageBG));
                break;
            default:
                specTree.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                break;
        }

    return view;
    }
}

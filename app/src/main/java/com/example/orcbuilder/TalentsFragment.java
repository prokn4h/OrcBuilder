package com.example.orcbuilder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TalentsFragment extends Fragment {

    private static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    private static final String TAG = "TalentsFragment";

    private int pageNumber;
    private String gameClass;
    private int firstPageBG;
    private int secondPageBG;
    private int thirdPageBG;

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
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_talents, container, false);

        TextView specPage = view.findViewById(R.id.specPage);

        switch (pageNumber) {
            case (0):
                specPage.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                break;
            case (1):
                specPage.setBackground(ContextCompat.getDrawable(getContext(), secondPageBG));
                break;
            case (2):
                specPage.setBackground(ContextCompat.getDrawable(getContext(), thirdPageBG));
                break;
            default:
                specPage.setBackground(ContextCompat.getDrawable(getContext(), firstPageBG));
                break;
        }

        return view;
    }
}

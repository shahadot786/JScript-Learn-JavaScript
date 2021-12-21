package com.javascript.jscript.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.QuizItemsAdapter;
import com.javascript.jscript.Adapter.QuizItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Quiz.QuizTopicListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class QuizFragment extends Fragment {
    ExpandableHeightGridView gridView , gridViewPro;
    View proView;
    ImageView proImage;
    private AdNetwork adNetwork;

    String[] itemsName = {"Basic","Advanced","Expert"};
    String[] itemsNamePro = {"Angular","Vue","React","Angular","Vue","React","Angular","Vue","React"};

    Integer[] itemImages = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_programs_advanced_image

    };

    TextView howTo;
    public QuizFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz,container,false);
        //find id
        howTo = view.findViewById(R.id.howTo);
        //pro codes
        proView = view.findViewById(R.id.quizProView);
        proImage = view.findViewById(R.id.quizProImage);
        //free
        gridView = view.findViewById(R.id.quiz_item_gridview);
        gridView.setExpanded(true);
        QuizItemsAdapter adapter = new QuizItemsAdapter(itemsName,itemImages,getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.quiz_item_gridview_pro);
        gridViewPro.setExpanded(true);
        QuizItemsAdapterPro adapter1 = new QuizItemsAdapterPro(itemsNamePro,itemImagesPro,getActivity());
        gridViewPro.setAdapter(adapter1);

        //check user upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proView.setVisibility(View.VISIBLE);
            proImage.setVisibility(View.VISIBLE);
        }else {
            proView.setVisibility(View.GONE);
            proImage.setVisibility(View.GONE);
        }
        //add network context initialization
        adNetwork = new AdNetwork(getActivity());
        //load ad
        adNetwork.loadInterstitialAd();
        //on click listener
        //how to
        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogStyle);
                dialog.setCancelable(false);
                dialog.setTitle("How to Play?");
                dialog.setMessage("1. Every quiz subjects has different types of quiz." +
                        "\n2. Every types of quiz has a 10 different questions." +
                        "\n3. Minimum 8 Correct Answer For Win.");
                dialog.setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                dialog.show();
            }
        });
        //click pro view
        proView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PremiumActivity.class));
            }
        });
        //items free
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), QuizTopicListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("quizItems","Basic");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("quizItems","Advanced");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("quizItems","Expert");
                        startActivity(intent);
                        break;

                }
                //show ad
                adNetwork.showInterstitialAd();
            }
        });

        //items pro
        gridViewPro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), QuizTopicListActivity.class);
                switch (i){
                    case 0:
                        intent.putExtra("quizItems","Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("quizItems","Vue");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("quizItems","React");
                        startActivity(intent);
                        break;

                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}
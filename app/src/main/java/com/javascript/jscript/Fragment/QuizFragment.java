package com.javascript.jscript.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Adapter.QuizItemsAdapter;
import com.javascript.jscript.Adapter.QuizItemsAdapterPro;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Quiz.QuizTopicListActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.Utils.ExpandableHeightGridView;

public class QuizFragment extends Fragment {
    ExpandableHeightGridView gridView, gridViewPro;
    View proView;
    ImageView proImage;
    String[] itemsName = {"Fundamental", "Basic", "Objects", "OOPs", "DOM", "BOM", "Advanced", "AJAX", "Typescript"};
    String[] itemsNamePro = {"Angular", "Vue Js", "Next Js", "React Js", "Ember Js", "Bootstrap", "Node Js", "Express Js", "Laravel", "jQuery"
            /*"Svelte Js","Gatsby","Nuxt Js","Spring Boot","Micronaut","Mocha"*/};
    Integer[] itemImages = {
            R.drawable.ic_fundamental_icon,
            R.drawable.ic_programs_basic_image,
            R.drawable.ic_objects_icon,
            R.drawable.ic_oops_icon,
            R.drawable.ic_dom_icon,
            R.drawable.ic_bom_icon,
            R.drawable.ic_programs_advanced_image,
            R.drawable.ic_ajax_icon,
            R.drawable.ic_typescript_icon,
            //R.drawable.ic_json_icon

    };
    Integer[] itemImagesPro = {
            R.drawable.ic_angular_icon,
            R.drawable.ic_js_vue_icon,
            R.drawable.ic_next_js,
            R.drawable.ic_react_icon,
            R.drawable.ic_emberjs_icon,
            R.drawable.ic_bootstrap_icon,
            R.drawable.ic_node_icon,
            R.drawable.ic_expressjs_icon,
            R.drawable.ic_laravel_icon,
            R.drawable.ic_jquery_icon
            /*
            R.drawable.ic_svelte_icon,
            R.drawable.ic_gatsbyjs_icon,
            R.drawable.ic_nuxt_icon,
            R.drawable.ic_springio_icon,
            R.drawable.ic_micronaut_icon,
            R.drawable.ic_mochajs_icon*/

    };
    TextView howTo;
    private AdNetwork adNetwork;

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
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        //find id
        howTo = view.findViewById(R.id.howTo);
        //pro animations
        ConstraintLayout proAnimation = view.findViewById(R.id.proAnimation);
        proAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent;
                intent = new Intent(context, PremiumActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        //pro codes
        proView = view.findViewById(R.id.quizProView);
        proImage = view.findViewById(R.id.quizProImage);
        //free
        gridView = view.findViewById(R.id.quiz_item_gridview);
        gridView.setExpanded(true);
        QuizItemsAdapter adapter = new QuizItemsAdapter(itemsName, itemImages, getActivity());
        gridView.setAdapter(adapter);

        //pro
        gridViewPro = view.findViewById(R.id.quiz_item_gridview_pro);
        gridViewPro.setExpanded(true);
        QuizItemsAdapterPro adapter1 = new QuizItemsAdapterPro(itemsNamePro, itemImagesPro, getActivity());
        gridViewPro.setAdapter(adapter1);

        //check user upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proView.setVisibility(View.VISIBLE);
            proImage.setVisibility(View.VISIBLE);
            proAnimation.setVisibility(View.VISIBLE);
        } else {
            proView.setVisibility(View.GONE);
            proImage.setVisibility(View.GONE);
            proAnimation.setVisibility(View.GONE);
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
                dialog.setMessage("" +
                        "=> Each subject has a different set of quiz\n" +
                        "=> Each set of quizzes has 10 different questions\n" +
                        "=> Minimum 8 Correct Answer For Win\n" +
                        "=> 3 Minutes to complete all the questions\n" +
                        "=> Watch an Ad for remove timer when finished time");
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
                switch (i) {
                    case 0:
                        intent.putExtra("quizItems", "Fundamental");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("quizItems", "Basic");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("quizItems", "Objects");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("quizItems", "OOPs");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("quizItems", "DOM");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("quizItems", "BOM");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("quizItems", "Advanced");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("quizItems", "AJAX");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("quizItems", "Typescript");
                        startActivity(intent);
                        break;
                    /*case 9:
                        intent.putExtra("quizItems","JSON");
                        startActivity(intent);
                        break;*/

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
                switch (i) {
                    case 0:
                        intent.putExtra("quizItems", "Angular");
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("quizItems", "Vue Js");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("quizItems", "Next Js");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("quizItems", "React Js");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("quizItems", "Ember Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("quizItems", "Bootstrap");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("quizItems", "Node Js");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("quizItems", "Express Js");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("quizItems", "Laravel");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("quizItems", "jQuery");
                        startActivity(intent);
                        break;
                    /*
                    case 14:
                        intent.putExtra("quizItems","Micronaut");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra("quizItems","Mocha Js");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("quizItems","Svelte Js");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("quizItems","Gatsby");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("quizItems","Nuxt Js");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra("quizItems","Spring Boot");
                        startActivity(intent);
                        break;
*/
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}
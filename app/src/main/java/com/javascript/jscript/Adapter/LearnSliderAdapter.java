package com.javascript.jscript.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.javascript.jscript.Activities.FeedBackActivity;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Activities.UpcomingCoursesActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class LearnSliderAdapter extends SliderViewAdapter<LearnSliderAdapter.SliderViewHolder> {
    private final int[] images;
    private final String[] slideText;

    public LearnSliderAdapter(int[] images, String[] slideText) {
        this.images = images;
        this.slideText = slideText;
    }


    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.textView.setText(slideText[position]);


        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            if (position == 0) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = view.getContext();
                        Intent intent;
                        intent = new Intent(context, PremiumActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                });
            }

        } else {
            if (position == 0) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = view.getContext();
                        Intent intent;
                        intent = new Intent(context, FeedBackActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                });
            }

        }

        if (position == 1) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent;
                    intent = new Intent(context, UpcomingCoursesActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                }
            });
        }
        /*if (position ==3){
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment learFragment = new ProgramsFragment();
                    activity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container,learFragment)
                            .addToBackStack(null).commit();

                }
            });
        }
        if (position ==4){
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment learFragment = new InterviewQAFragment();
                    activity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container,learFragment)
                            .addToBackStack(null).commit();

                }
            });
        }
        if (position ==5){
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment learFragment = new BooksFragment();
                    activity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container,learFragment)
                            .addToBackStack(null).commit();

                }
            });
        }*/


    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class SliderViewHolder extends SliderViewAdapter.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public SliderViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.sliderImage);
            textView = itemView.findViewById(R.id.slideText);

        }
    }

}

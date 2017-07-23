package com.androidtutorialpoint.cardviewtutorial;

        import android.content.ContentResolver;
        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.CivilActivity;
        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.CseActivity;
        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.EceActivity;
        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.EeeActivity;
        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.ItActivity;
        import com.androidtutorialpoint.cardviewtutorial.BranchActivities.MechActivity;

        import java.util.ArrayList;



public class CardFragment extends Fragment {

    ArrayList<WonderModel> listitems = new ArrayList<>();
    RecyclerView MyRecyclerView;
    String Wonders[] = {"Civil","CSE","EEE","ECE","IT","MECH","Instrumentation"};
    int  Images[] = {R.drawable.civil,R.drawable.cse,R.drawable.eee,R.drawable.ece,R.drawable.it,R.drawable.mech,R.drawable.colosseum};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeList();
        getActivity().setTitle("Admin");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_card, container, false);
        MyRecyclerView = (RecyclerView) view.findViewById(R.id.cardView);
        MyRecyclerView.setHasFixedSize(true);
        LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
        MyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        if (listitems.size() > 0 & MyRecyclerView != null) {
            MyRecyclerView.setAdapter(new MyAdapter(listitems));
        }
        MyRecyclerView.setLayoutManager(MyLayoutManager);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        private ArrayList<WonderModel> list;

        public MyAdapter(ArrayList<WonderModel> Data) {
            list = Data;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
            // create a new view
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recycle_items, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, int position) {

            holder.titleTextView.setText(list.get(position).getCardName());
            holder.coverImageView.setImageResource(list.get(position).getImageResourceId());
            holder.coverImageView.setTag(list.get(position).getImageResourceId());
            holder.likeImageView.setTag(R.drawable.ic_like);

        }

       @Override
        public int getItemCount() {
            return list.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public ImageView coverImageView;
        public ImageView likeImageView;
        public ImageView shareImageView;
        private final Context context;

        public MyViewHolder(View v) {
            super(v);
            titleTextView = (TextView) v.findViewById(R.id.titleTextView);
            context = v.getContext();
            coverImageView = (ImageView) v.findViewById(R.id.coverImageView);
            likeImageView = (ImageView) v.findViewById(R.id.likeImageView);
            shareImageView = (ImageView) v.findViewById(R.id.shareImageView);
            likeImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (getPosition() == 0){
                        Intent intent =  new Intent(context, CivilActivity.class);
                        context.startActivity(intent);
                    }

                    else if (getPosition() == 1){
                        Intent intent =  new Intent(context, CseActivity.class);
                        context.startActivity(intent);
                    }
                    else if (getPosition() == 2) {
                        Intent intent = new Intent(context, EeeActivity.class);
                        context.startActivity(intent);
                    }
                    else if (getPosition() == 3) {
                        Intent intent = new Intent(context, EceActivity.class);
                        context.startActivity(intent);
                    }

                    else if (getPosition() == 4) {
                        Intent intent = new Intent(context, ItActivity.class);
                        context.startActivity(intent);
                    }
                    else if (getPosition() == 5) {
                        Intent intent = new Intent(context, MechActivity.class);
                        context.startActivity(intent);
                    }

                }
            });



            shareImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {






                    Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                            "://" + getResources().getResourcePackageName(coverImageView.getId())
                            + '/' + "drawable" + '/' + getResources().getResourceEntryName((int)coverImageView.getTag()));


                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_STREAM,imageUri);
                    shareIntent.setType("image/jpeg");
                    startActivity(Intent.createChooser(shareIntent, getResources().getText(R.string.send_to)));



                }
            });



        }
    }

    public void initializeList() {
        listitems.clear();

        for(int i =0;i<7;i++){


            WonderModel item = new WonderModel();
            item.setCardName(Wonders[i]);
            item.setImageResourceId(Images[i]);
            item.setIsfav(0);
            item.setIsturned(0);
            listitems.add(item);

        }




    }
}

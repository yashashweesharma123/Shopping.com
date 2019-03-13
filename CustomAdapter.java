package test.ojassoft.com.ys;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by ojas-20 on 12/7/18.
 */

public class CustomAdapter extends RecyclerView.Adapter {
    ArrayList<String> itemNames;
    ArrayList<Integer> itemImages;
    Context context;
    //ProgressDialog pd;
    public CustomAdapter(Context context,ArrayList itemNames,ArrayList<Integer> itemImages){
        this.context=context;
        this.itemNames=itemNames;
        this.itemImages=itemImages;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,final int position) {
        ((MyViewHolder) holder).name.setText(itemNames.get(position));
        ((MyViewHolder) holder).image.setImageResource(itemImages.get(position));
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ThirdActivity.class);
                context.startActivity(intent);
            }
        });*/
    }
    @Override
    public int getItemCount(){
        return itemNames.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        CardView card_view;
        ProgressDialog pd;

        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.textview);
            image=(ImageView) itemView.findViewById(R.id.imageview);
            card_view=(CardView) itemView.findViewById(R.id.card_view);
            pd = new ProgressDialog(context);
            pd.setTitle("Loading Activity");
            pd.setMessage("Please Wait ...");
            pd.setMax(5);
            pd.setIndeterminate(false);
            pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            // final int position = getLayoutPosition();

            card_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    new  AsyncTask<Integer, Long, Boolean>() {


                        @Override
                        protected Boolean doInBackground(Integer... params) {

                            publishProgress(0L);
                            long start = System.currentTimeMillis();
                            long waitTime = params[0] * 1000;
                            try {
                                while (System.currentTimeMillis() - start < waitTime) {
                                    Thread.sleep(500);
                                    publishProgress(System.currentTimeMillis() - start);
                                }
                            } catch (Exception e) {
                                return false;
                            }
                            return true;

                        }

                        @Override
                        protected void onProgressUpdate(Long... values) {
                            if (values[0] == 0) {
                                pd.show();
                            } else {
                                pd.setProgress((int) (values[0] / 1000));
                            }
                        }
                        @Override
                        protected void onPostExecute(Boolean result) {
                            pd.dismiss();
                            callAct(getLayoutPosition());
                        }}.execute(5);}});}



    private void callAct(int pos){
        switch (pos){
            case 0:
                Intent intent=new Intent(context,FourthActivity.class);
                context.startActivity(intent);
                break;
            case 1:
                Intent intent1=new Intent(context,FifthActivity.class);
                context.startActivity(intent1);
                break;
            case 2:
                Intent intent2=new Intent(context,SixthActivity.class);
                context.startActivity(intent2);
                break;
            case 3:
                Intent intent3=new Intent(context,SeventhActivity.class);
                context.startActivity(intent3);
                break;
            case 4:
                Intent intent4=new Intent(context,EigthActivity.class);
                context.startActivity(intent4);
                break;
            case 5:
                Intent intent5=new Intent(context,NinthActivity.class);
                context.startActivity(intent5);
                break;




        }
    }
}}


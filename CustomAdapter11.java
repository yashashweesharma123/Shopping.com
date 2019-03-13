package test.ojassoft.com.ys;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ojas-20 on 13/7/18.
 */

public class CustomAdapter11  extends RecyclerView.Adapter {
    ArrayList<String> itemD;
    ArrayList<Integer> itemE;
    Context context;
    public CustomAdapter11(Context context,ArrayList itemD,ArrayList<Integer> itemE){
        this.context=context;
        this.itemD=itemD;
        this.itemE=itemE;
    }
    @Override
    public McViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wwwlayout, parent, false);
      McViewHolder mcViewHolder = new McViewHolder(view);
        return mcViewHolder;
    }
    @Override
    public  void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position){
        ((McViewHolder) holder).texte.setText(itemD.get(position));
        ((McViewHolder) holder).imagef.setImageBitmap(decodeSampledBitmapFromResource(context.getResources(),itemE.get(position),100,100));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,TwentytwoActivity.class);
                intent.putExtra("textview",itemD.get(position));
                intent.putExtra("imageview",itemE.get(position));
                context.startActivity(intent);
            }
        });


    }
    @Override
    public int getItemCount(){
        return itemD.size();
    }
    public class McViewHolder extends RecyclerView.ViewHolder{
        TextView texte;
        ImageView imagef;
        public McViewHolder(View itemView){
            super(itemView);
            texte=(TextView) itemView.findViewById(R.id.textview);
            imagef=(ImageView) itemView.findViewById(R.id.imageview);
        }
    }
    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }
    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }
}//





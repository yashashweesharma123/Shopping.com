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

public class CustomAdapter7 extends RecyclerView.Adapter {
    ArrayList<String> itemAAA;
    ArrayList<Integer> itemIII;
    Context context;
    public CustomAdapter7(Context context,ArrayList itemAAA,ArrayList<Integer> itemIII){
        this.context=context;
        this.itemAAA=itemAAA;
        this.itemIII=itemIII;
    }
    @Override
    public MaaaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mmlayout, parent, false);
       MaaaViewHolder maaaViewHolder = new MaaaViewHolder(view);
        return maaaViewHolder;
    }
    @Override
    public  void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position){
        ((MaaaViewHolder) holder).textaaa.setText(itemAAA.get(position));
        ((MaaaViewHolder) holder).imageaaa.setImageBitmap(decodeSampledBitmapFromResource(context.getResources(),itemIII.get(position),100,100));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,EighteenActivity.class);
                intent.putExtra("textview",itemAAA.get(position));
                intent.putExtra("imageview",itemIII.get(position));
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount(){
        return itemAAA.size();
    }
    public class MaaaViewHolder extends RecyclerView.ViewHolder{
        TextView textaaa;
        ImageView imageaaa;
        public MaaaViewHolder(View itemView){
            super(itemView);
            textaaa=(TextView) itemView.findViewById(R.id.textview);
            imageaaa=(ImageView) itemView.findViewById(R.id.imageview);
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



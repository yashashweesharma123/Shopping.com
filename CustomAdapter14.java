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

public class CustomAdapter14 extends RecyclerView.Adapter{
    ArrayList<String> eeNames;
    ArrayList<Integer> aaImages;
    Context context;
    public CustomAdapter14(Context context,ArrayList eeNames,ArrayList<Integer> aaImages){
        this.context=context;
        this.eeNames=eeNames;
        this.aaImages=aaImages;
    }
    @Override
    public MddViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rr_layout, parent, false);
        MddViewHolder mddViewHolder =new  MddViewHolder(view);
        return mddViewHolder;
    }
    @Override
    public  void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position){
        ((MddViewHolder) holder).textoo.setText(eeNames.get(position));
        ((MddViewHolder) holder).imageoo.setImageBitmap(decodeSampledBitmapFromResource(context.getResources(),aaImages.get(position),100,100));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,TwentyfiveActivity.class);
                intent.putExtra("textview",eeNames.get(position));
                intent.putExtra("imageview",aaImages.get(position));
                context.startActivity(intent);
            }
        });


    }
    @Override
    public int getItemCount(){
        return eeNames.size();
    }
    public class MddViewHolder extends RecyclerView.ViewHolder{
        TextView textoo;
        ImageView imageoo;
        public MddViewHolder(View itemView){
            super(itemView);
            textoo=(TextView) itemView.findViewById(R.id.textview);
            imageoo=(ImageView) itemView.findViewById(R.id.imageview);
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




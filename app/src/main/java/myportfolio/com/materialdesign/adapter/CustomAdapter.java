package myportfolio.com.materialdesign.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import myportfolio.com.materialdesign.ImageModel;
import myportfolio.com.materialdesign.R;

/**
 * Created by arputha_v on 3/13/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter {
    Activity mActivity;
    List<ImageModel> mImageModelList;

    public CustomAdapter(Activity activity, List<ImageModel> imageModelList) {
        this.mActivity = activity;
        this.mImageModelList = imageModelList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewGroup view = (ViewGroup) layoutInflater.inflate(R.layout.custom_layout, viewGroup, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        DataViewHolder mHolder = (DataViewHolder) holder;
        Picasso.get()
                .load(mImageModelList.get(position).getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(mHolder.mImage);
        mHolder.mTitle.setText(mImageModelList.get(position).getImageTitle());
        mHolder.mDescription.setText(mImageModelList.get(position).getImageDescription());

    }

    @Override
    public int getItemCount() {
        return mImageModelList.size();
    }

    private class DataViewHolder extends RecyclerView.ViewHolder {
        CardView cvImageContainer;
        ImageView mImage;
        TextView mTitle;
        TextView mDescription;


        public DataViewHolder(View view) {
            super(view);

            cvImageContainer = view.findViewById(R.id.cv_image_container);
            mImage = view.findViewById(R.id.iv_image);
            mTitle = view.findViewById(R.id.tv_title);
            mDescription = view.findViewById(R.id.tv_description);
        }
    }
}

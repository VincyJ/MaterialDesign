package myportfolio.com.materialdesign.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import myportfolio.com.materialdesign.ImageModel;
import myportfolio.com.materialdesign.R;

/**
 * Created by arputha_v on 3/13/2018.
 */

public class GridImageAdapeter extends BaseAdapter {

    private Context mContext;
    private List<ImageModel> mImageModelList;

    public GridImageAdapeter(Context mContext, List<ImageModel> mImageModelList) {
        this.mContext = mContext;
        this.mImageModelList = mImageModelList;
    }

    @Override
    public int getCount() {
        return mImageModelList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return mImageModelList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View rowView = convertView;
        if (rowView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            rowView = layoutInflater.inflate(R.layout.custom_grid_layout, viewGroup, false);
        }

        ImageView imageView = rowView.findViewById(R.id.iv_grid_image);
        TextView textView = rowView.findViewById(R.id.tv_title_text);

        if (!"".equals(mImageModelList.get(position).getImageUrl())) {
            Picasso.get()
                    .load(mImageModelList.get(position).getImageUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imageView);
        } else {
            imageView.setImageResource(R.mipmap.ic_launcher);
        }
        textView.setText(mImageModelList.get(position).getImageTitle());

        return rowView;
    }
}

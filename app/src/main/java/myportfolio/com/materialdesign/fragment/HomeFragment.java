package myportfolio.com.materialdesign.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import myportfolio.com.materialdesign.ImageModel;
import myportfolio.com.materialdesign.R;
import myportfolio.com.materialdesign.adapter.CustomAdapter;
import myportfolio.com.materialdesign.adapter.GridImageAdapeter;
import myportfolio.com.materialdesign.customviews.ScrollableGridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerView2;
    private ScrollableGridView mGridImage;
    private List<ImageModel> imageModelList;

    public HomeFragment() {
        // Required empty public constructor
    }

    public HomeFragment newInstance() {
        return new HomeFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return initializeView(inflater.inflate(R.layout.fragment_home, container, false));
    }

    private View initializeView(View view) {
        imageModelList = new ArrayList<>();
        imageModelList();
        mRecyclerView1 = view.findViewById(R.id.recycler_view1);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView1.setAdapter(new CustomAdapter(getActivity(), imageModelList));

        mRecyclerView2 = view.findViewById(R.id.recycler_view2);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView2.setAdapter(new CustomAdapter(getActivity(), imageModelList));

        mGridImage = view.findViewById(R.id.gv_images);
        mGridImage.setExpanded(true);
        mGridImage.setAdapter(new GridImageAdapeter(getActivity(), imageModelList));

        return view;
    }

    private void imageModelList() {
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/CadillacRanch_HeroImage.jpg", "CadillacRanch", "Rich delicious food"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/CoffeeTeaLTD_TenantImage.jpg", "CoffeeTeaLTD", "Coffe + tea Area"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/Hooters_HeroImage.jpg", "Hooters", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/RockyMountainChocolateFactory_TenantImage.jpg", "RockyMountainChocolateFactory", "Rick cocoa chocolate"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/TigerSushi_TenantImage.jpg", "TigerSushi", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/NorthwoodsCandyEmporium_TenantImage.jpg", "NorthwoodsCandyEmporium", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/MagicPanCrepeStand_TenantImage.jpg", "MagicPanCrepeStand", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/LindtChocolate_HeroImage.jpg", "LindtChocolate", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/PandaExpress_TenantImage.jpg", "PandaExpress", "Chicken chops"));
        imageModelList.add(new ImageModel("https://www.mallofamerica.com/sites/default/files/tenants/LongJohnSilvers_TenantImage.jpg", "LongJohnSilvers", "Chicken chops"));

    }

}

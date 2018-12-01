package com.ahmadsisfo.droid_windi;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

import com.ahmadsisfo.droid_windi.adapter.HomemenuAdapter;
import com.ahmadsisfo.droid_windi.model.Homemenu;

import java.util.ArrayList;
import java.util.List;

public class MateriActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomemenuAdapter adapter;
    private List<Homemenu> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(getIntent().getExtras().getString("name"));

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new HomemenuAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(1, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

    }

    @Override
    public Intent getSupportParentActivityIntent() {
        this.finish();
        return null;
    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.zatmakanan,
                R.drawable.pencernaanmanusia,
                R.drawable.pencernaanruminansia,
                R.drawable.gangguan,
        };

        String[] file = new String[]{
                "file:///android_asset/rangka.html",
                "file:///android_asset/tulang.html",
                "file:///android_asset/sendi.html",
                "file:///android_asset/gangguan.html",
        };

        Homemenu a = new Homemenu("Zat Makanan", 0, covers[0], file[0]);
        albumList.add(a);
        a = new Homemenu("Sistem Pencernaan Manusia", 1, covers[1], file[1]);
        albumList.add(a);
        a = new Homemenu("Sistem Pencernaan Ruminansia", 2, covers[2], file[2]);
        albumList.add(a);
        a = new Homemenu("Gangguan", 3, covers[3], file[3]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }
}

package com.drs24.recycleviewleftscrolldel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.IonSlidingViewClickListener{
    private RecyclerView mRecyclerView;

    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.drs24.recycleviewleftscrolldel.R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(com.drs24.recycleviewleftscrolldel.R.id.recyclerview);

        //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));//设置布局管理器
        mRecyclerView.setAdapter(mAdapter = new Adapter(this));//设置适配器
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());//设置控制Item增删的动画

    }

    /**
     * item正文的点击事件
     *
     * @param view
     * @param position
     */
    @Override
    public void onItemClick(View view, int position) {
        Log.e("item","item"+position);
        //点击item正文的代码逻辑
//        Toast.makeText(MainActivity.this, "请设置"+position, Toast.LENGTH_SHORT).show();
    }

    /**
     * item的左滑设置
     *
     * @param view
     * @param position
     */
    @Override
    public void onSetBtnCilck(View view, int position) {

        //“设置”点击事件的代码逻辑
        Toast.makeText(MainActivity.this, "请设置", Toast.LENGTH_LONG).show();
    }


    /**
     * item的左滑删除
     *
     * @param view
     * @param position
     */
    @Override
    public void onDeleteBtnCilck(View view, int position) {
        mAdapter.removeData(position);
        Log.e("del","item"+position);
    }

}

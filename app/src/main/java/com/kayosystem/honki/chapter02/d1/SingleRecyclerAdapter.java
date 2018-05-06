package com.kayosystem.honki.chapter02.d1;

import android.content.Context;
import android.media.SoundPool;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SingleRecyclerAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private List<Sound> mItemList = new ArrayList<>();
    ImageView imageView;
    LinearLayout linearLayout;

    private SoundPool mSoundPool;
    private int mSoundId;

    public SingleRecyclerAdapter(final Context context, final List<Sound> itemList) {
        mContext = context;
        mItemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new SingleViewHolder(view,mContext);
    }
    // ビューホルダーを生成するメソッドです。LayoutInflaterを使ってレイアウトXMLのビューオブジェクトを生成し、
    // それをコンストラクタの引数としてビューホルダーを生成し返却します。
    // このメソッドは、リストを生成する時に自動で実行されます。

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        TextView textItem = (TextView) holder.itemView.findViewById(R.id.item_name);
        ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.imageView);
        linearLayout = (LinearLayout) holder.itemView.findViewById(R.id.linearLayout);

        textItem.setText(mItemList.get(position).label);
        imageView.setImageResource(mItemList.get(position).drawableRes);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundId=mSoundPool.load(mContext,mItemList.get(position).raw,0);
                mSoundPool.play(mSoundId,1.0f,1.0f,0,0,1.0f);
            }
        });
    }
    // リストに表示するデータを設定するメソッドです。テキストに表示する文字を設定しています。
    // 設定する文字列は、RecyclerAdapterのコンストラクタに渡されたString型リストの値を使用しています

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
    //表示するリストの行数を返却するメソッドです。

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mSoundPool.release();
//    }


}

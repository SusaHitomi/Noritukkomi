package com.kayosystem.honki.chapter02.d1;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public enum Sound {    // enumは決まった組み合わせをそのままセットにするもの
    Laugh("笑い", R.drawable.laugh,R.raw.laugh),    //new Sound("笑い", R.drawable.idea);
    Vaudeville("なんでやねん！",R.drawable.nannde,R.raw.nandeyanen),
    Cat("ベシっ！",R.drawable.cat,R.raw.bisi),
    Bing("チーン",R.drawable.triangle,R.raw.tin1),
    Clap("拍手", R.drawable.clap, R.raw.cheer),
    Man("オッ！",R.drawable.man,R.raw.man),
    //Exclamation("びっくり！", R.drawable.exclamation, R.raw.betoben),
    Piano("ベートーベン", R.drawable.piano, R.raw.betoben),
    Stupid1("間抜け１",R.drawable.sick,R.raw.stupid1),
    Stupid2("間抜け２", R.drawable.dumb, R.raw.stupid2),
    Stupid3("間抜け３",R.drawable.sad,R.raw.stupid3),
    Stupid4("間抜け４",R.drawable.feelings,R.raw.stupid4),
    Question1("問題１",R.drawable.question1,R.raw.question1),
    Question2("問題2",R.drawable.question2,R.raw.question2),
    Correct("正解",R.drawable.circle,R.raw.correct),
    Incorrect("不正解",R.drawable.wrong,R.raw.correctno),
    Cracker("クラッカー", R.drawable.cracker, R.raw.dondonpafupafu),
    Trumpet("トランペット",R.drawable.trumpet,R.raw.trumpet1),
    Drum("ドラムロール", R.drawable.drum, R.raw.roll),
    Cymbal("シンバル", R.drawable.cymbal, R.raw.roll_finish1),
    Eee("えー", R.drawable.eee, R.raw.eee),
    Chick("コケコッコー", R.drawable.chick, R.raw.chicken_kokekokko),
    Wind("しらける", R.drawable.wind, R.raw.wind);



    String label;
    int drawableRes;
    int raw;


    // コンストラクタ,組み立てる
    Sound(String label, int drawableRes, int raw){
        this.label = label;
        this.drawableRes = drawableRes;
        this.raw = raw;

    }

}

// 作り方
//    public enum クラス名 {
//        セットの名前(“説明”、R.drawable.画像名),    ＊このクラスの0番目「,コンマ」
//        セットの名前(“説明”、R.drawable.画像名),    ＊1番目「,コンマ」
//           |
//        セットの名前(“説明”、R.drawable.画像名),    ＊ｎ番目「；セミコロン」
//
//        型名1 変数名2;    ＊上の()の左から1番目の型    "説明"    String文字型
//        型名2 変数名2;    ＊上の()の左から2番目の型    R.drawable    int画像型
//
//（コンストラクタ）
//        クラス名(型１、型２、...、型n) {
//            this.変数名1 = 変数名1;
//            this.変数名2 = 変数名2;
//        }
//    }
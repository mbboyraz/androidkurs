package com.example.mbura.androidkurs5;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String MAIN_TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment secfragment= new secondfragment();
        ft.add(R.id.fff ,secfragment,"jhgjggf");
        ft.commit();
        Log.e(MAIN_TAG,"onCreate");
        TextView txt= (TextView) findViewById(R.id.textView4);
    }
    @Override
    public void onAttachFragment(Fragment fragment) {   //Fragment ın activity ye eklenmek istediği zaman çağrılır.
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG,"onAttachFragment");
    }


    @Override
    public void onContentChanged() {        //Ekranın içerik görünümü her değiştiğinde çağrılır.
        super.onContentChanged();
        Log.e(MAIN_TAG,"onContentChanged");
    }

    @Override
    protected void onStart() {      //Activity kullanıcıya görünür olduğunda çağrılır. Activity ön plana çıkarsa onResume, arka plana giderse onStop öğesini izler.
        super.onStart();
        Log.e(MAIN_TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {      //Activity yeniden yaratılmaya ihtiyaç duyduğunda çağrılır ve
        super.onRestoreInstanceState(savedInstanceState);                   //SeveInstanceState ile kaydedilen veri varsa o verileri yoksa null değeri döndürür.
        Log.e(MAIN_TAG,"onRestoreInstanceState");

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {      //Activity başlaması bittiği zaman çağrılır.
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG,"onPostCreate");
    }

    @Override
    protected void onResume() {                             //Activity kullanıcı ile etkileşime geçmeye başladığında çağrılır.
        super.onResume();
        Log.e(MAIN_TAG,"onResume");
    }

    @Override
    protected void onPostResume() {                 //Resume işlemi tamamlandığında çağrılır.
        super.onPostResume();
        Log.e(MAIN_TAG,"onPostResume");
    }




    @Override
    protected void onPause() {          //Activity arka plana gönderildiğinde; ancak öldürülmediğinde çağrılır.
        super.onPause();
        Log.e(MAIN_TAG,"onPause");
    }

    @Override
    public void onAttachedToWindow() {           //  View Activity penceresine eklendiği zaman çağrılır.
        super.onAttachedToWindow();
        Log.e(MAIN_TAG,"onAttachedToWindow");
    }

    @Override
    protected void onRestart() {               // Geçerli Activity kullanıcıya yeniden görüntülendiği zaman onStop tan sonra çağrılır.

        super.onRestart();
        Log.e(MAIN_TAG,"onRestart");
    }

    @Override
    public void onBackPressed() {           //Cihaz üzerinde geri tuşuna basıldığı zaman çağrılır.
        super.onBackPressed();
        Log.e(MAIN_TAG,"onBackPressed");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {           //Kullanılan activity ölmeden hemen önce çağrılır.
        super.onSaveInstanceState(outState);                       //Kaydedilen durumalrı saklar ve onCreate veya RestoreInstanceState methodları çeğrıldığında verileri tekrar kullanılabilir.
        Log.e(MAIN_TAG,"onSaveInstanceState");
    }

    @Override
    protected void onDestroy() {                //Activity öldürüldüğü zaman çağrılır.
        super.onDestroy();
        Log.e(MAIN_TAG,"onDestroy");
    }

    @Override
    protected void onStop() {                   //Activity ekranda görünür olmadığı zaman çağrılır.
        super.onStop();                         //Başka bir activity nin sürdürülmesi için bu gereklidir.
        Log.e(MAIN_TAG,"onStop");

    }

    @Override
    public void onUserInteraction() {           //Activity de kullanıcı telefon ile etkileşime geçtiği her seferinde çağrılır.
        super.onUserInteraction();
        Log.e(MAIN_TAG,"onUserInteraction");
    }

    @Override
    protected void onUserLeaveHint() {          //Activity arka plana alınırken activity yaşam döngüsünün bir parçası olarak çağrılır.
        super.onUserLeaveHint();
        Log.e(MAIN_TAG,"onUserLeaveHint");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {         //Sistem içerisinde veri alışverişi veya mesaj gönder/al yapılmak için çağrılır.
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MAIN_TAG,"onActivityResult");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {       //Activity çalışırken sistem yapılanması değiştiği zaman sistem tarafından çağrılır.
        super.onConfigurationChanged(newConfig);                //manifest dosyasına android:configChanges="layoutDirection|locale" eklendiği zaman çağrılır.
        Log.e(MAIN_TAG,"onConfigurationChanged");
    }

}

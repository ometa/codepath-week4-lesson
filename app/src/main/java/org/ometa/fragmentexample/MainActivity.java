package org.ometa.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFirstClick(View view) {
        if (firstFragment == null) {
            firstFragment = new FirstFragment();
        }
        // 1. Get FragmentManager
        FragmentManager fm = getSupportFragmentManager();

        // 2. Create FragmentTransaction
        FragmentTransaction fTx = fm.beginTransaction();

        // 3. Using the transaction, add, replace fragment
        fTx.replace(R.id.fragment_container, firstFragment);

        // 3.5 batch up more stuff here, then commit.

        // 4. Commit transaction (add the txs to the end of the ui thread)
        fTx.commit();
    }

    public void onSecondClick(View view) {
        if (secondFragment == null) {
            secondFragment = new SecondFragment();
        }

        // 1. Get FragmentManager
        FragmentManager fm = getSupportFragmentManager();

        // 2. Create FragmentTransaction
        FragmentTransaction fTx = fm.beginTransaction();

        // 3. Using the transaction, add, replace fragment
        fTx.replace(R.id.fragment_container, secondFragment);

        // 3.5 batch up more stuff here, then commit.

        // 4. Commit transaction (add the txs to the end of the ui thread)
        fTx.commit();
    }
}

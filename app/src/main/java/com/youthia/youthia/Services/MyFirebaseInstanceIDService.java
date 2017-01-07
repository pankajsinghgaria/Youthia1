package com.youthia.youthia.Services;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";
    SharedPreferences mPref;

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on logcat
        Log.e(TAG, "Refreshed token: " + refreshedToken);
        addtoPref(refreshedToken);    

    }

    private void addtoPref(String refreshedToken) {
        mPref = getSharedPreferences("MyToken", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= mPref.edit();
        editor.putString("Token",refreshedToken);
        Boolean mStatus= editor.commit();
        Log.d("TAG Store",""+mStatus);
    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}

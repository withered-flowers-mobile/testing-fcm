package com.example.standard.testfcm;

import android.app.Service;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by standard on 9/4/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
  private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

  @Override
  public void onTokenRefresh() {
    super.onTokenRefresh();
    String newToken = FirebaseInstanceId.getInstance().getToken();

    Log.d(TAG, "onTokenRefresh: " + newToken);

    sendRegistrationToServer(newToken);
  }

  private void sendRegistrationToServer(String newToken) {

  }
}

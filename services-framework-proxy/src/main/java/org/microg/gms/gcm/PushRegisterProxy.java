/*
 * SPDX-FileCopyrightText: 2013 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.gcm;

import android.app.IntentService;
import android.content.Intent;

public class PushRegisterProxy extends IntentService {
    private static final String TAG = "GsfGcmRegisterProxy";

    public PushRegisterProxy() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        intent.setPackage("com.google.android.gms");
        startService(intent);
        stopSelf();
    }
}

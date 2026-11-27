package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.Df2;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends Df2 {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return Df2.completeWakefulIntent(intent);
    }
}

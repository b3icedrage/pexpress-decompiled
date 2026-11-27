package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzfa;
import defpackage.Df2;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends Df2 implements zzfa.zza {
    private zzfa zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzfa.zza
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        Df2.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfa(this);
        }
        this.zza.zza(context, intent);
    }
}

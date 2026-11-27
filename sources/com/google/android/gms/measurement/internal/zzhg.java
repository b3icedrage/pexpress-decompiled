package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C8045zW0;

/* JADX INFO: loaded from: classes.dex */
final class zzhg implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhx zzb;

    public zzhg(zzhx zzhxVar, Bundle bundle) {
        this.zzb = zzhxVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar = this.zzb;
        Bundle bundle = this.zza;
        zzhxVar.zzg();
        zzhxVar.zza();
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!zzhxVar.zzt.zzJ()) {
            C8045zW0.b(zzhxVar.zzt, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzhxVar.zzt.zzt().zzE(new zzac(bundle.getString("app_id"), "", new zzkw(strCheckNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhxVar.zzt.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

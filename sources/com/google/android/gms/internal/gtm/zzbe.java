package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
public final class zzbe extends com.google.android.gms.analytics.zzj {
    public final String toString() {
        HashMap map = new HashMap();
        map.put("category", null);
        map.put("action", null);
        map.put("label", null);
        map.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(null);
    }
}

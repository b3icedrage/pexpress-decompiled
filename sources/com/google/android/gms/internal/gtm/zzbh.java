package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.Z0;
import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
public final class zzbh extends com.google.android.gms.analytics.zzj {
    private int zza;

    public zzbh() {
        UUID uuidRandomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (uuidRandomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (uuidRandomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            b0.c("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Preconditions.checkNotZero(leastSignificantBits);
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("screenName", null);
        Boolean bool = Boolean.FALSE;
        map.put("interstitial", bool);
        map.put("automatic", bool);
        Z0.e(this.zza, map, "screenId", 0, "referrerScreenId");
        map.put("referrerScreenName", null);
        map.put("referrerUri", null);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbh zzbhVar = (zzbh) zzjVar;
        TextUtils.isEmpty(null);
        int i = this.zza;
        if (i != 0) {
            zzbhVar.zza = i;
        }
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        TextUtils.isEmpty(null);
    }

    public final int zzd() {
        return this.zza;
    }
}

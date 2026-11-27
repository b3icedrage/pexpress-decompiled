package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Tm2 implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ Um2 a;

    public Tm2(Um2 um2) {
        this.a = um2;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        Um2 um2 = this.a;
        if (um2.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = Pm2.a;
            String strZza = zzgo.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            um2.b.b(bundle2);
        }
    }
}

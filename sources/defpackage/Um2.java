package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Um2 {
    public final HashSet a;
    public final NO b;

    public Um2(AppMeasurementSdk appMeasurementSdk, NO no) {
        this.b = no;
        appMeasurementSdk.registerOnMeasurementEventListener(new Tm2(this));
        this.a = new HashSet();
    }
}

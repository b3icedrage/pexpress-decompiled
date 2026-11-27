package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class Zm2 {
    public final NO a;

    public Zm2(AppMeasurementSdk appMeasurementSdk, NO no) {
        this.a = no;
        appMeasurementSdk.registerOnMeasurementEventListener(new Wm2(this));
    }
}

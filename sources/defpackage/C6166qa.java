package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6166qa implements InterfaceC5746oa {
    public static volatile C6166qa c;

    @VisibleForTesting
    public final AppMeasurementSdk a;

    @VisibleForTesting
    public final ConcurrentHashMap b;

    public C6166qa(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.InterfaceC5746oa
    @NonNull
    @KeepForSdk
    public final Map<String, Object> a(boolean z) {
        return this.a.getUserProperties(null, null, z);
    }

    @Override // defpackage.InterfaceC5746oa
    @NonNull
    @KeepForSdk
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.getConditionalUserProperties("frc", "")) {
            HashSet hashSet = Pm2.a;
            Preconditions.checkNotNull(bundle);
            InterfaceC5746oa.a aVar = new InterfaceC5746oa.a();
            aVar.a = (String) Preconditions.checkNotNull((String) zzgn.zza(bundle, "origin", String.class, null));
            aVar.b = (String) Preconditions.checkNotNull((String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            aVar.c = zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            aVar.d = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            aVar.e = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            aVar.f = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            aVar.g = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            aVar.h = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            aVar.i = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            aVar.j = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            aVar.k = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            aVar.l = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            aVar.n = ((Boolean) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            aVar.o = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC5746oa
    @NonNull
    @KeepForSdk
    public final C7279vr c(@NonNull String str, @NonNull NO no) {
        Object zm2;
        Preconditions.checkNotNull(no);
        if (Pm2.c(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    zm2 = new Um2(appMeasurementSdk, no);
                } else {
                    zm2 = "clx".equals(str) ? new Zm2(appMeasurementSdk, no) : null;
                }
                if (zm2 != null) {
                    concurrentHashMap.put(str, zm2);
                    return new C7279vr();
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5746oa
    @KeepForSdk
    public final void d(@NonNull InterfaceC5746oa.a aVar) {
        HashSet hashSet = Pm2.a;
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = aVar.c;
        if ((obj == null || zzid.zza(obj) != null) && Pm2.c(str) && Pm2.d(str, aVar.b)) {
            String str2 = aVar.k;
            if (str2 == null || (Pm2.b(str2, aVar.l) && Pm2.a(str, aVar.k, aVar.l))) {
                String str3 = aVar.h;
                if (str3 == null || (Pm2.b(str3, aVar.i) && Pm2.a(str, aVar.h, aVar.i))) {
                    String str4 = aVar.f;
                    if (str4 == null || (Pm2.b(str4, aVar.g) && Pm2.a(str, aVar.f, aVar.g))) {
                        Bundle bundle = new Bundle();
                        String str5 = aVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = aVar.b;
                        if (str6 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
                        }
                        Object obj2 = aVar.c;
                        if (obj2 != null) {
                            zzgn.zzb(bundle, obj2);
                        }
                        String str7 = aVar.d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, aVar.e);
                        String str8 = aVar.f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = aVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = aVar.h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = aVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, aVar.j);
                        String str10 = aVar.k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = aVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, aVar.m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, aVar.n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, aVar.o);
                        this.a.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC5746oa
    @KeepForSdk
    public final void e(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (Pm2.c(str) && Pm2.b(str2, bundle) && Pm2.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    @Override // defpackage.InterfaceC5746oa
    @KeepForSdk
    public final int f() {
        return this.a.getMaxUserProperties("frc");
    }

    @Override // defpackage.InterfaceC5746oa
    @KeepForSdk
    public final void g(@NonNull String str) {
        this.a.clearConditionalUserProperty(str, null, null);
    }

    @Override // defpackage.InterfaceC5746oa
    @KeepForSdk
    public final void h(@NonNull String str) {
        if (Pm2.c(AppMeasurement.FCM_ORIGIN) && Pm2.d(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }
}

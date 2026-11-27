package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.JsonReader;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.tasks.OnFailureListener;
import io.sentry.android.core.util.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.Attributes;

/* JADX INFO: renamed from: qP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6133qP implements C6342rP.a, A42, OnFailureListener, AFe1mSDK, a.InterfaceC0383a {
    public static int b(Attributes attributes, int i) {
        return C2673aC1.f.b(attributes.getLocalName(i)).ordinal();
    }

    public static Object c(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    public static String e(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return str3 + str4;
    }

    @Override // io.sentry.android.core.util.a.InterfaceC0383a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.A42, defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        WZ0 wz0 = (WZ0) obj;
        wz0.getClass();
        C1142Hk1 c1142Hk1 = AbstractC6417rk1.a;
        c1142Hk1.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c1142Hk1.a(wz0, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.C6342rP.a
    public Object d(JsonReader jsonReader) {
        return C6342rP.a(jsonReader);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public Map fetch(Uri uri) {
        return AFf1zSDK.w_(uri);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.c("Fetching FCM registration token failed", new Throwable(it));
    }
}

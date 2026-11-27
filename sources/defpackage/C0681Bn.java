package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681Bn implements C6973uP0.a, InterfaceC1608Nj0, TextInputLayout.f {
    public static AJ0 b(Class cls, String str, String str2, C2251Vp1 c2251Vp1) {
        return c2251Vp1.e(new C3068c21(cls, str, str2));
    }

    public static String c(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static Map d(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static boolean e(Class cls, LinkedHashMap linkedHashMap) {
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        return linkedHashMap.containsKey(canonicalName);
    }

    @Override // defpackage.C6973uP0.a
    public String a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        return Boolean.valueOf(((SF0.c) obj).h.a == null);
    }
}

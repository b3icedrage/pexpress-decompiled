package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.sentry.util.B;
import io.sentry.util.l;
import io.sentry.util.v;
import java.util.LinkedHashMap;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4790k10 implements C6973uP0.a, l.a {
    public final /* synthetic */ int d;

    public /* synthetic */ C4790k10(int i) {
        this.d = i;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static Object d(Class cls, LinkedHashMap linkedHashMap) {
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Object obj = linkedHashMap.get(canonicalName);
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // defpackage.C6973uP0.a
    public String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        switch (this.d) {
            case 3:
                byte[] bArr = new byte[8];
                v.a().b(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    j = (j << 8) | ((long) (bArr[i] & 255));
                }
                char[] cArr = new char[16];
                B.a(cArr, j);
                return new String(cArr);
            default:
                return new Timer(true);
        }
    }
}

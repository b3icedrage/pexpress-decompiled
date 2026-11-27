package defpackage;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import io.sentry.ILogger;
import io.sentry.protocol.u;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4564j implements Continuation, MD1 {
    public final /* synthetic */ int d;

    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static C3027bp1 b(Object obj) {
        C1795Pt1.b(obj);
        return new C3027bp1();
    }

    public static String c(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String d(Uri uri, String str) {
        return str + uri;
    }

    public static String f(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static String g(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static void h(ConcurrentHashMap concurrentHashMap, String str, C6319rH0 c6319rH0, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        c6319rH0.c(str2);
        c6319rH0.g(iLogger, obj);
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        switch (this.d) {
            case 7:
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.m(VE.c("ws-trading-stopped"));
                scope.h(NG1.ERROR);
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "it");
                scope.o(u.e);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return 403;
    }
}

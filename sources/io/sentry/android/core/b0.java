package io.sentry.android.core;

import android.util.Log;
import defpackage.C0702Bu;
import defpackage.C2629a1;
import defpackage.NG1;
import defpackage.QF1;
import defpackage.SG1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    public static void a(@Nullable String str, @NotNull NG1 ng1, @Nullable String str2, @Nullable Throwable th) {
        C0702Bu c0702Bu = new C0702Bu();
        c0702Bu.k = "Logcat";
        c0702Bu.h = str2;
        c0702Bu.m = ng1;
        if (str != null) {
            c0702Bu.f(str, "tag");
        }
        if (th != null && th.getMessage() != null) {
            c0702Bu.f(th.getMessage(), "throwable");
        }
        QF1.e().g(c0702Bu);
    }

    public static void b(@NotNull SG1 sg1, @Nullable String str, @Nullable Throwable th) {
        if (QF1.e().p().getLogs().a) {
            String message = th != null ? th.getMessage() : null;
            io.sentry.logger.i iVar = new io.sentry.logger.i();
            iVar.a = "auto.log.logcat";
            if (th == null || message == null) {
                QF1.e().u().a(sg1, iVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.b bVarU = QF1.e().u();
            if (str != null) {
                message = C2629a1.b(str, "\n", message);
            }
            bVarU.a(sg1, iVar, message, new Object[0]);
        }
    }

    public static int c(@Nullable String str, @Nullable String str2) {
        a(str, NG1.ERROR, str2, null);
        b(SG1.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int d(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        a(str, NG1.ERROR, str2, th);
        b(SG1.ERROR, str2, th);
        return Log.e(str, str2, th);
    }

    public static int e(@Nullable String str, @Nullable String str2) {
        a(str, NG1.WARNING, str2, null);
        b(SG1.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static void f(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        a(str, NG1.WARNING, str2, th);
        b(SG1.WARN, str2, th);
    }

    public static void g(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        a(str, NG1.ERROR, str2, th);
        b(SG1.FATAL, str2, th);
        Log.wtf(str, str2, th);
    }
}

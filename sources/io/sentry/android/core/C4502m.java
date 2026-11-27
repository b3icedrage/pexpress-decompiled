package io.sentry.android.core;

import android.util.Log;
import defpackage.NG1;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4502m implements ILogger {

    /* JADX INFO: renamed from: io.sentry.android.core.m$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NG1.values().length];
            a = iArr;
            try {
                iArr[NG1.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NG1.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NG1.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[NG1.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[NG1.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // io.sentry.ILogger
    public final void a(@NotNull NG1 ng1, @NotNull String str, @Nullable Object... objArr) {
        int i = 5;
        if (objArr.length == 0) {
            int i2 = a.a[ng1.ordinal()];
            if (i2 == 1) {
                i = 4;
            } else if (i2 != 2) {
                i = i2 != 4 ? 3 : 7;
            }
            Log.println(i, "Sentry", str);
            return;
        }
        int i3 = a.a[ng1.ordinal()];
        if (i3 == 1) {
            i = 4;
        } else if (i3 != 2) {
            i = i3 != 4 ? 3 : 7;
        }
        Log.println(i, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public final boolean b(@Nullable NG1 ng1) {
        return true;
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull NG1 ng1, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        if (objArr.length == 0) {
            d(ng1, str, th);
        } else {
            d(ng1, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public final void d(@NotNull NG1 ng1, @NotNull String str, @Nullable Throwable th) {
        int i = a.a[ng1.ordinal()];
        if (i == 3) {
            Log.e("Sentry", str, th);
        } else {
            if (i != 4) {
                return;
            }
            Log.wtf("Sentry", str, th);
        }
    }
}

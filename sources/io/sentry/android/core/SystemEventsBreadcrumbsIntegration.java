package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.HandlerThread;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.RunnableC2411Xh;
import defpackage.RunnableC6951uI;
import defpackage.SD1;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements OB0, Closeable, AppState.a {

    @NotNull
    public final Context d;

    @Nullable
    public volatile b e;

    @Nullable
    public SentryAndroidOptions g;

    @Nullable
    public SD1 h;

    @NotNull
    public final String[] i;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public volatile IntentFilter l = null;
    public volatile HandlerThread m = null;

    @NotNull
    public final AtomicBoolean n = new AtomicBoolean(false);

    @NotNull
    public final C4527a o = new C4527a();

    @Nullable
    public a p;

    public static final class a {

        @Nullable
        public final Integer a;

        @Nullable
        public final Boolean b;

        public a(@Nullable Integer num, @Nullable Boolean bool) {
            this.a = num;
            this.b = bool;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.p.a(this.a, aVar.a) && io.sentry.util.p.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    public final class b extends BroadcastReceiver {

        @NotNull
        public final SD1 a;

        @NotNull
        public final SentryAndroidOptions b;

        @NotNull
        public final io.sentry.android.core.internal.util.i c = new io.sentry.android.core.internal.util.i(0, 60000);
        public final char[] d = new char[64];

        public b(@NotNull SD1 sd1, SentryAndroidOptions sentryAndroidOptions) {
            this.a = sd1;
            this.b = sentryAndroidOptions;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, @NotNull Intent intent) {
            a aVar;
            Bundle extras;
            int i;
            String action = intent.getAction();
            boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
            SentryAndroidOptions sentryAndroidOptions = this.b;
            String str = null;
            if (!zEquals) {
                aVar = null;
            } else {
                if (this.c.a()) {
                    return;
                }
                Float fB = J.b(intent, sentryAndroidOptions);
                aVar = new a(fB != null ? Integer.valueOf(fB.intValue()) : null, J.d(intent, sentryAndroidOptions));
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = SystemEventsBreadcrumbsIntegration.this;
                if (aVar.equals(systemEventsBreadcrumbsIntegration.p)) {
                    return;
                } else {
                    systemEventsBreadcrumbsIntegration.p = aVar;
                }
            }
            C0702Bu c0702Bu = new C0702Bu(System.currentTimeMillis());
            c0702Bu.i = "system";
            c0702Bu.k = "device.event";
            if (action != null) {
                int length = action.length();
                char[] cArr = this.d;
                int length2 = cArr.length;
                int i2 = length - 1;
                while (true) {
                    if (i2 >= 0) {
                        char cCharAt = action.charAt(i2);
                        if (cCharAt == '.') {
                            str = new String(cArr, length2, cArr.length - length2);
                            break;
                        }
                        if (length2 == 0) {
                            Charset charset = io.sentry.util.x.a;
                            int iLastIndexOf = action.lastIndexOf(".");
                            if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
                                str = action.substring(i);
                                break;
                            }
                            break;
                        }
                        length2--;
                        cArr[length2] = cCharAt;
                        i2--;
                    }
                    str = action;
                    break;
                }
            }
            if (str != null) {
                c0702Bu.f(str, "action");
            }
            if (aVar != null) {
                Integer num = aVar.a;
                if (num != null) {
                    c0702Bu.f(num, "level");
                }
                Boolean bool = aVar.b;
                if (bool != null) {
                    c0702Bu.f(bool, "charging");
                }
            } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                    }
                }
                c0702Bu.f(map, "extras");
            }
            c0702Bu.m = NG1.INFO;
            C0841Do0 c0841Do0 = new C0841Do0();
            c0841Do0.d(intent, "android:intent");
            this.a.l(c0702Bu, c0841Do0);
        }
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext == null ? context : applicationContext;
        this.i = strArr;
    }

    @Override // io.sentry.android.core.AppState.a
    public final void c() {
        if (this.h == null || this.g == null) {
            return;
        }
        this.k = false;
        g(this.h, this.g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            this.j = true;
            this.l = null;
            if (this.m != null) {
                this.m.quit();
            }
            this.m = null;
            c0404aA.close();
            AppState.i.k(this);
            k();
            SentryAndroidOptions sentryAndroidOptions = this.g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(NG1.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public final void f() {
        k();
    }

    public final void g(@NotNull SD1 sd1, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.j && !this.k && this.e == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC6951uI(this, sd1, sentryAndroidOptions, 1));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void k() {
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC2411Xh(this, 3));
        } catch (RejectedExecutionException unused) {
            l(this.g);
        }
    }

    public final void l(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            this.k = true;
            b bVar = this.e;
            this.e = null;
            c0404aA.close();
            if (bVar != null) {
                try {
                    this.d.unregisterReceiver(bVar);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                c0404aA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        this.h = sd1;
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.g.isEnableSystemEventBreadcrumbs()));
        if (this.g.isEnableSystemEventBreadcrumbs()) {
            AppState.i.c(this);
            if (F.e()) {
                g(this.h, this.g);
            }
        }
    }
}

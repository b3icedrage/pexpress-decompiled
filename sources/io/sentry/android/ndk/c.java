package io.sentry.android.ndk;

import com.appsflyer.internal.q;
import defpackage.C0702Bu;
import defpackage.C3561eO1;
import defpackage.JO;
import defpackage.KD1;
import defpackage.KO;
import defpackage.NG1;
import defpackage.OD1;
import defpackage.RunnableC6528sH;
import defpackage.WW;
import defpackage.Zj2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.F;
import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends OD1 {

    @NotNull
    public final SentryAndroidOptions a;

    @NotNull
    public final NativeScope b;

    public c(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        p.b(sentryAndroidOptions, "The SentryOptions object is required.");
        this.a = sentryAndroidOptions;
        this.b = nativeScope;
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void b(@NotNull final String str, @NotNull final String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b.getClass();
                    NativeScope.nativeSetTag(str, str2);
                }
            });
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void c(@Nullable F f) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new KO(3, this, f));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void g(@NotNull C0702Bu c0702Bu) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new WW(1, this, c0702Bu));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void j(@NotNull String str) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new JO(1, this, str));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void n(@NotNull String str, @NotNull String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new q(this, str, str2, 2));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void r(@Nullable C3561eO1 c3561eO1, @NotNull KD1 kd1) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (c3561eO1 == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Zj2(1, this, c3561eO1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void removeTag(@NotNull String str) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC6528sH(3, this, str));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }
}

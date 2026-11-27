package io.sentry.cache;

import defpackage.InterfaceC4089gu0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.r;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC4089gu0 {

    @NotNull
    public final SentryAndroidOptions a;

    public g(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void a(@NotNull Map<String, String> map) {
        i(map, "tags.json");
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void b(@Nullable r rVar) {
        if (rVar == null) {
            h("sdk-version.json");
        } else {
            i(rVar, "sdk-version.json");
        }
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void c(@Nullable String str) {
        if (str == null) {
            h("dist.json");
        } else {
            i(str, "dist.json");
        }
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void d(@Nullable Double d) {
        if (d == null) {
            h("replay-error-sample-rate.json");
        } else {
            i(d.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void e(@Nullable String str) {
        if (str == null) {
            h("environment.json");
        } else {
            i(str, "environment.json");
        }
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void f(@Nullable String str) {
        if (str == null) {
            h("proguard-uuid.json");
        } else {
            i(str, "proguard-uuid.json");
        }
    }

    @Override // defpackage.InterfaceC4089gu0
    public final void g(@Nullable String str) {
        if (str == null) {
            h("release.json");
        } else {
            i(str, "release.json");
        }
    }

    public final void h(@NotNull String str) {
        c.a(this.a, ".options-cache", str);
    }

    public final <T> void i(@NotNull T t, @NotNull String str) {
        c.d(this.a, t, ".options-cache", str);
    }
}

package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6993uW implements InterfaceC6033pv0 {

    @NotNull
    public final SentryAndroidOptions a;

    public C6993uW(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // defpackage.InterfaceC6033pv0
    public final boolean a() {
        return LG1.d().c(this.a.getFatalLogger());
    }
}

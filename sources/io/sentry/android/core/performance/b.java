package io.sentry.android.core.performance;

import android.os.Build;
import android.os.Looper;
import defpackage.AbstractC3118cG1;
import defpackage.EnumC6511sB0;
import defpackage.InterfaceC2347Wu0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public final String a;

    @Nullable
    public AbstractC3118cG1 b = null;

    @Nullable
    public AbstractC3118cG1 c = null;

    @Nullable
    public InterfaceC2347Wu0 d = null;

    @Nullable
    public InterfaceC2347Wu0 e = null;

    public b(@NotNull String str) {
        this.a = str;
    }

    @NotNull
    public static InterfaceC2347Wu0 a(@NotNull InterfaceC2347Wu0 interfaceC2347Wu0, @NotNull String str, @NotNull AbstractC3118cG1 abstractC3118cG1) {
        InterfaceC2347Wu0 interfaceC2347Wu0V = interfaceC2347Wu0.v("activity.load", str, abstractC3118cG1, EnumC6511sB0.SENTRY);
        Thread thread = Looper.getMainLooper().getThread();
        io.sentry.android.core.internal.util.e eVar = io.sentry.android.core.internal.util.e.a;
        interfaceC2347Wu0V.m(Long.valueOf(Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId()), "thread.id");
        interfaceC2347Wu0V.m("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        interfaceC2347Wu0V.m(bool, "ui.contributes_to_ttid");
        interfaceC2347Wu0V.m(bool, "ui.contributes_to_ttfd");
        return interfaceC2347Wu0V;
    }
}

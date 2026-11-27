package io.sentry.android.replay.capture;

import defpackage.InterfaceC1015Fu0;
import defpackage.MD1;
import io.sentry.ILogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements MD1, io.sentry.util.l.a {
    public final /* synthetic */ Object d;

    @Override // io.sentry.util.l.a
    public Object b() {
        return Boolean.valueOf(io.sentry.util.m.b("androidx.core.app.FrameMetricsAggregator", (ILogger) this.d));
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o(((w) this.d).f());
    }

    public /* synthetic */ u(io.sentry.util.m mVar, ILogger iLogger) {
        this.d = iLogger;
    }
}

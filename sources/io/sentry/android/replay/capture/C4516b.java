package io.sentry.android.replay.capture;

import defpackage.ML0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4516b extends ML0 implements Function0<io.sentry.android.replay.util.h> {
    public final /* synthetic */ AbstractC4515a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4516b(AbstractC4515a abstractC4515a) {
        super(0);
        this.d = abstractC4515a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final io.sentry.android.replay.util.h invoke() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new AbstractC4515a.ThreadFactoryC0387a());
        Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return new io.sentry.android.replay.util.h(scheduledExecutorServiceNewSingleThreadScheduledExecutor, this.d.a);
    }
}

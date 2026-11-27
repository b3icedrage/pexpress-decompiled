package io.sentry.android.replay;

import defpackage.C2688aH1;
import defpackage.ML0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ML0 implements Function0<io.sentry.android.replay.util.h> {
    public final /* synthetic */ ReplayIntegration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReplayIntegration replayIntegration) {
        super(0);
        this.d = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final io.sentry.android.replay.util.h invoke() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.b());
        Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        C2688aH1 c2688aH1 = this.d.h;
        if (c2688aH1 != null) {
            return new io.sentry.android.replay.util.h(scheduledExecutorServiceNewSingleThreadScheduledExecutor, c2688aH1);
        }
        Intrinsics.l("options");
        throw null;
    }
}

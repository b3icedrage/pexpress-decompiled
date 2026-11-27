package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ZW implements ScheduledFutureC4006gX.b, MD1 {
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ZW(Object obj, Object obj2, long j, Object obj3) {
        this.e = obj;
        this.g = obj2;
        this.d = j;
        this.h = obj3;
    }

    @Override // defpackage.ScheduledFutureC4006gX.b
    public ScheduledFuture a(final ScheduledFutureC4006gX.a aVar) {
        final ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = (ScheduledExecutorServiceC3796fX) this.e;
        final Callable callable = (Callable) this.g;
        return scheduledExecutorServiceC3796fX.e.schedule(new Callable() { // from class: bX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX2 = scheduledExecutorServiceC3796fX;
                int i = 0;
                return scheduledExecutorServiceC3796fX2.d.submit(new RunnableC3586eX(i, callable, aVar));
            }
        }, this.d, (TimeUnit) this.h);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        String str;
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.m(VE.c("fgs-start-recovered"));
        scope.b("fgs.trigger", (String) this.e);
        ((C6530sH1) this.g).getClass();
        long j = this.d;
        if (j < 60000) {
            str = "1m";
        } else if (j < 600000) {
            str = "10m";
        } else {
            str = j < 3600000 ? "1h" : "over_1h";
        }
        scope.b("fgs.recovered_within", str);
        for (Map.Entry entry : this.h.entrySet()) {
            scope.n((String) entry.getKey(), entry.getValue().toString());
        }
    }
}

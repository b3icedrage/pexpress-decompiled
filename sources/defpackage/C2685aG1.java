package defpackage;

import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2685aG1 implements N80 {
    public final /* synthetic */ BB1 d;

    public C2685aG1(BB1 bb1) {
        this.d = bb1;
    }

    @Override // defpackage.N80
    public final EG1 f(EG1 event, C0841Do0 hint) {
        Object objA;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        NG1 ng1 = event.y;
        if (ng1 != null && ng1.ordinal() >= NG1.WARNING.ordinal()) {
            BB1 bb1 = this.d;
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                event.e.l("runtime_snapshot", bb1.a());
                objA = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                b0.f("SentryConfig", "snapshotProvider failed", thA);
            }
        }
        return event;
    }
}

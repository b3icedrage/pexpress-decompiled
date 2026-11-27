package defpackage;

import io.sentry.android.core.P;
import io.sentry.util.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4191hO1 implements l.a, MD1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4191hO1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return (String) this.e;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        CI1 session;
        switch (this.d) {
            case 1:
                AtomicLong atomicLong = ((P) this.e).d;
                if (atomicLong.get() == 0 && (session = scope.getSession()) != null && session.c() != null) {
                    atomicLong.set(session.c().getTime());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                ((C3027bp1) this.e).d = new ArrayList(scope.x());
                break;
        }
    }
}

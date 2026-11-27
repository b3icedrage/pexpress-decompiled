package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: dG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3327dG0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3327dG0(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Throwable th = (Throwable) obj;
                C3536eG0 c3536eG0 = (C3536eG0) this.e;
                if (th == null) {
                    if (!c3536eG0.d.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    c3536eG0.d.cancel(true);
                } else {
                    C6117qJ1<R> c6117qJ1 = c3536eG0.d;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c6117qJ1.k(th);
                }
                return Unit.a;
            default:
                ((AbstractC7841yY0) this.e).a.i(new C3457dt1<>(0, Long.valueOf(((Number) obj).longValue()), null, null, 29));
                return Unit.a;
        }
    }
}

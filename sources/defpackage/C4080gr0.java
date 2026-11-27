package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4080gr0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4080gr0(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Throwable th = (Throwable) obj;
                C4002gV1 c4002gV1 = (C4002gV1) this.e;
                if (th != null) {
                    C4290hr0.a.c("Cancelling request because engine Job failed with error: " + th);
                    CancellationException cancellationException = new CancellationException("Engine failed");
                    cancellationException.initCause(th);
                    c4002gV1.E(cancellationException);
                } else {
                    C4290hr0.a.c("Cancelling request because engine Job completed");
                    c4002gV1.X();
                }
                break;
            default:
                C0881Eb1 it = (C0881Eb1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C8062zb1) this.e).h = 0;
                break;
        }
        return Unit.a;
    }
}

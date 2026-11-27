package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: j21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4585j21 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ C4795k21 d;
    public final /* synthetic */ C4795k21.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4585j21(C4795k21 c4795k21, C4795k21.a aVar) {
        super(1);
        this.d = c4795k21;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4795k21.g;
        this.e.getClass();
        C4795k21 c4795k21 = this.d;
        atomicReferenceFieldUpdater.set(c4795k21, null);
        c4795k21.b(null);
        return Unit.a;
    }
}

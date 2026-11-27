package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7689xn0 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ C7899yn0 d;
    public final /* synthetic */ RunnableC7479wn0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7689xn0(C7899yn0 c7899yn0, RunnableC7479wn0 runnableC7479wn0) {
        super(1);
        this.d = c7899yn0;
        this.e = runnableC7479wn0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.d.g.removeCallbacks(this.e);
        return Unit.a;
    }
}

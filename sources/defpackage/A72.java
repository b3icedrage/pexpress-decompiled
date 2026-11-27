package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class A72 extends ML0 implements Function1<F72, Unit> {
    public final /* synthetic */ B72 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A72(B72 b72, long j) {
        super(1);
        this.d = b72;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(F72 f72) {
        F72 it = f72;
        Intrinsics.checkNotNullParameter(it, "it");
        B72 b72 = this.d;
        b72.getClass();
        b72.Q(5000L, new E72(b72, this.e));
        return Unit.a;
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Po0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1779Po0 extends ML0 implements Function1<C2013So0, C2013So0> {
    public final /* synthetic */ C1465Lo0 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1779Po0(long j, C1465Lo0 c1465Lo0) {
        super(1);
        this.d = c1465Lo0;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2013So0 invoke(C2013So0 c2013So0) {
        C2013So0 state = c2013So0;
        Intrinsics.checkNotNullParameter(state, "state");
        C6104qF0.f(false);
        EK1 ek1 = this.d.f;
        ek1.getClass();
        ek1.m.b(EK1.z[14], Long.valueOf(this.e));
        return C2013So0.a(state, null, false, this.e, 1);
    }
}

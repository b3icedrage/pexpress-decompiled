package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4239hd1 extends ML0 implements Function1<C4449id1, Unit> {
    public final /* synthetic */ C3819fd1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4239hd1(C3819fd1 c3819fd1) {
        super(1);
        this.d = c3819fd1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C4449id1 c4449id1) {
        C4449id1 it = c4449id1;
        Intrinsics.checkNotNullParameter(it, "it");
        EK1 ek1 = this.d.f;
        ek1.getClass();
        Intrinsics.checkNotNullParameter("", "<set-?>");
        ek1.q.b(EK1.z[19], "");
        return Unit.a;
    }
}

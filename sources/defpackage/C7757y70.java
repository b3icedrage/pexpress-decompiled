package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7757y70 extends IC {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7757y70(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        R70 r70 = R70.a;
        D70 d70 = R70.b;
        C01 c01 = C01.h;
        SC sc = SC.d;
        List list = C5653o60.d;
        VN1.a aVar = VN1.a;
        super(d70, name, c01, sc, list, C2720aS0.e);
        AC ac = new AC(this, null, InterfaceC2396Xc.a.a, true, InterfaceC1490Lx.a.d, aVar);
        ac.g1(list, C5323mZ.d);
        Intrinsics.checkNotNullExpressionValue(ac, "apply(...)");
        J70 j70B = R70.b(K70.SCOPE_FOR_ERROR_CLASS, ac.getName().d, "");
        Q70 q70 = Q70.ERROR_CLASS;
        ac.k = new O70(R70.d(q70, new String[0]), j70B, q70, list, false, new String[0]);
        T0(j70B, C5487nJ1.b(ac), ac);
    }

    @Override // defpackage.V, defpackage.O01
    @NotNull
    public final QY0 N(@NotNull T62 typeSubstitution, @NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return R70.b(K70.SCOPE_FOR_ERROR_CLASS, getName().d, typeSubstitution.toString());
    }

    @Override // defpackage.V
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final FC b(@NotNull X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // defpackage.V, defpackage.IU1
    public final InterfaceC5095lU b(X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // defpackage.IC
    @NotNull
    public final String toString() {
        String strE = getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        return strE;
    }
}

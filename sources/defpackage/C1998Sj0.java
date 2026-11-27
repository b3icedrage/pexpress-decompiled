package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Sj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1998Sj0 extends AbstractC1770Pl0 {
    @Override // defpackage.AbstractC1770Pl0
    @NotNull
    public final List<InterfaceC2076Tj0> h() {
        V v = this.b;
        Intrinsics.c(v, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        C1842Qj0 c1842Qj0 = (C1842Qj0) v;
        AbstractC3008bk0.a aVar = AbstractC3008bk0.a.c;
        AbstractC3008bk0 abstractC3008bk0 = c1842Qj0.k;
        if (Intrinsics.a(abstractC3008bk0, aVar)) {
            return VE.c(C2496Yj0.a.a(c1842Qj0, false));
        }
        return Intrinsics.a(abstractC3008bk0, AbstractC3008bk0.d.c) ? VE.c(C2496Yj0.a.a(c1842Qj0, true)) : C5653o60.d;
    }
}

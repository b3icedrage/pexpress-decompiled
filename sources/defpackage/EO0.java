package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EO0 extends C2574Zj0 implements Function1<C5638o21, Collection<? extends InterfaceC3765fM1>> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Collection<? extends InterfaceC3765fM1> invoke(C5638o21 c5638o21) {
        C5638o21 p0 = c5638o21;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FO0) this.e).O(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(FO0.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class KZ extends C2574Zj0 implements Function1<C5638o21, AbstractC5706oM1> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC5706oM1 invoke(C5638o21 c5638o21) {
        C5638o21 p0 = c5638o21;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FZ) this.e).U0(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(FZ.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }
}

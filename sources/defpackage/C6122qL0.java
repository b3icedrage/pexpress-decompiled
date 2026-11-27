package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6122qL0 extends C2574Zj0 implements Function1<InterfaceC5702oL0, P92> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.functions.Function1
    public final P92 invoke(InterfaceC5702oL0 interfaceC5702oL0) {
        InterfaceC5702oL0 p0 = interfaceC5702oL0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((AbstractC5912pL0) this.e).w(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(AbstractC5912pL0.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }
}

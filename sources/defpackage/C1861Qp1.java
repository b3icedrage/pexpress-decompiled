package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1861Qp1 extends C2574Zj0 implements Function2<OY0, C2575Zj1, InterfaceC3765fM1> {
    public static final C1861Qp1 m = new C1861Qp1(2);

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC3765fM1 invoke(OY0 oy0, C2575Zj1 c2575Zj1) {
        OY0 p0 = oy0;
        C2575Zj1 p1 = c2575Zj1;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return p0.e(p1);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(OY0.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
}

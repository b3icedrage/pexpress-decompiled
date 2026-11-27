package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E62 extends C2574Zj0 implements Function2<AbstractC4649jL0, AbstractC4649jL0, Boolean> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(AbstractC4649jL0 abstractC4649jL0, AbstractC4649jL0 abstractC4649jL1) {
        AbstractC4649jL0 p0 = abstractC4649jL0;
        AbstractC4649jL0 p1 = abstractC4649jL1;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return Boolean.valueOf(((C7115v41) this.e).c(p0, p1));
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(C7115v41.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JZ extends C2574Zj0 implements Function1<C4267hk1, AbstractC5706oM1> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC5706oM1 invoke(C4267hk1 c4267hk1) {
        C4267hk1 p0 = c4267hk1;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((C7334w62) this.e).d(p0, true);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(Intrinsics.a.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }
}

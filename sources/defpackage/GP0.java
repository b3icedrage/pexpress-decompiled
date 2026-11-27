package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class GP0 extends C2784ak0 implements Function2<InterfaceC7394wP0.a, InterfaceC7394wP0.a, Boolean> {
    public static final GP0 m = new GP0(2, MP0.class, "isEquivalentTo", "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(InterfaceC7394wP0.a aVar, InterfaceC7394wP0.a aVar2) {
        InterfaceC7394wP0.a p1 = aVar;
        InterfaceC7394wP0.a p2 = aVar2;
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return Boolean.valueOf(MP0.g(p1, p2));
    }
}

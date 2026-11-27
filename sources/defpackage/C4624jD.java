package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4624jD extends C6075q62.c.a {
    public final /* synthetic */ InterfaceC4366iD a;
    public final /* synthetic */ X62 b;

    public C4624jD(InterfaceC4366iD interfaceC4366iD, X62 x62) {
        this.a = interfaceC4366iD;
        this.b = x62;
    }

    @Override // defpackage.C6075q62.c
    public final InterfaceC6126qM1 a(C6075q62 state, InterfaceC5702oL0 type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC4366iD interfaceC4366iD = this.a;
        AbstractC5706oM1 abstractC5706oM1R = interfaceC4366iD.r(type);
        Intrinsics.c(abstractC5706oM1R, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        AbstractC4649jL0 abstractC4649jL0H = this.b.h(abstractC5706oM1R, EnumC3610ed2.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(abstractC4649jL0H, "safeSubstitute(...)");
        AbstractC5706oM1 abstractC5706oM1N = interfaceC4366iD.n(abstractC4649jL0H);
        Intrinsics.checkNotNull(abstractC5706oM1N);
        return abstractC5706oM1N;
    }
}

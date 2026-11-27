package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148Hm1 extends ML0 implements Function1<C1774Pm1, Unit> {
    public final /* synthetic */ C0992Fm1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148Hm1(C0992Fm1 c0992Fm1) {
        super(1);
        this.d = c0992Fm1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 it = c1774Pm1;
        Intrinsics.checkNotNullParameter(it, "it");
        this.d.f.f("");
        return Unit.a;
    }
}

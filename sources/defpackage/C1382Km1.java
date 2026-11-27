package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Km1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1382Km1 extends ML0 implements Function1<C1774Pm1, Unit> {
    public final /* synthetic */ C0992Fm1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382Km1(C0992Fm1 c0992Fm1, String str) {
        super(1);
        this.d = c0992Fm1;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 it = c1774Pm1;
        Intrinsics.checkNotNullParameter(it, "it");
        this.d.f.f(this.e);
        return Unit.a;
    }
}

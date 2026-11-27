package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Cr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0773Cr1 extends ML0 implements Function1<Boolean, Unit> {
    public final /* synthetic */ EY0 d;
    public final /* synthetic */ C0929Er1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773Cr1(EY0 ey0, C0929Er1 c0929Er1) {
        super(1);
        this.d = ey0;
        this.e = c0929Er1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.d.j(this.e);
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3870fr0 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ A20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3870fr0(A20 a20) {
        super(1);
        this.d = a20;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.d.b();
        return Unit.a;
    }
}

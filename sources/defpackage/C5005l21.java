package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5005l21 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ C4795k21 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5005l21(C4795k21 c4795k21, Object obj) {
        super(1);
        this.d = c4795k21;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.d.b(this.e);
        return Unit.a;
    }
}

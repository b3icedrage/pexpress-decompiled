package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ka2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4906ka2 extends ML0 implements Function1<Long, Unit> {
    public final /* synthetic */ C4228ha2 d;
    public final /* synthetic */ C1351Kc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4906ka2(C4228ha2 c4228ha2, C1351Kc0 c1351Kc0) {
        super(1);
        this.d = c4228ha2;
        this.e = c1351Kc0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long l2 = l;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            C1351Kc0 c1351Kc0 = this.e;
            C4228ha2 c4228ha2 = this.d;
            c4228ha2.getClass();
            c4228ha2.Q(0L, new C4696ja2(c1351Kc0, jLongValue));
        }
        return Unit.a;
    }
}

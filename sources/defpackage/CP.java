package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CP extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CP(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                AP ap = (AP) this.e;
                ((Boolean) ap.b.e.getValue()).getClass();
                Unit unitP = ap.a.p();
                return unitP == MN.d ? unitP : Unit.a;
            default:
                C1491Lx0 p0 = (C1491Lx0) obj;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C0718Bz0) this.e).o(p0);
                return Unit.a;
        }
    }
}

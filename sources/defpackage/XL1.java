package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class XL1 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ ZS d;
    public final /* synthetic */ ZL1<Object> e;
    public final /* synthetic */ C2722aT g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XL1(ZS zs, ZL1 zl1, C2722aT c2722aT) {
        super(1);
        this.d = zs;
        this.e = zl1;
        this.g = c2722aT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Unit unit;
        Throwable th2 = th;
        this.d.invoke(th2);
        ZL1<Object> zl1 = this.e;
        zl1.c.k(th2, false);
        do {
            Object objE = zl1.c.e();
            unit = null;
            if (objE instanceof C3308dA.b) {
                objE = null;
            }
            if (objE != null) {
                this.g.invoke(objE, th2);
                unit = Unit.a;
            }
        } while (unit != null);
        return Unit.a;
    }
}

package defpackage;

import com.base.feature.analytics.reporters.ReporterBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: gs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$watchLogout$1", f = "ReporterBase.kt", l = {112}, m = "invokeSuspend")
public final class C4084gs1 extends AW1 implements Function2<Unit, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ReporterBase e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4084gs1(ReporterBase reporterBase, JM<? super C4084gs1> jm) {
        super(2, jm);
        this.e = reporterBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4084gs1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, JM<? super Unit> jm) {
        return ((C4084gs1) create(unit, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objZ;
        C7624xW c7624xW;
        MN mn = MN.d;
        int i = this.d;
        ReporterBase reporterBase = this.e;
        GP1 gp1 = reporterBase.k;
        if (i == 0) {
            C1795Pt1.b(obj);
            Boolean bool = Boolean.FALSE;
            gp1.getClass();
            gp1.m(null, bool);
            this.d = 1;
            C4693ja c4693ja = reporterBase.i;
            if (c4693ja != null) {
                c4693ja.k(null);
                C5189lv.k(c4693ja.c, c4693ja.d, new C4225ha(c4693ja, null), 2);
            }
            C4693ja c4693ja2 = reporterBase.i;
            if (c4693ja2 == null || (c7624xW = c4693ja2.n) == null || (objZ = c7624xW.z(this)) != mn) {
                objZ = Unit.a;
            }
            if (objZ == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        Boolean bool2 = Boolean.TRUE;
        gp1.getClass();
        gp1.m(null, bool2);
        return Unit.a;
    }
}

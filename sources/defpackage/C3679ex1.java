package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ex1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.indicators.RobotIndicatorViewModelBase$changeIndicatorAfterLoaded$1", f = "RobotIndicatorViewModelBase.kt", l = {RequestError.NETWORK_FAILURE}, m = "invokeSuspend")
public final class C3679ex1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3889fx1 e;

    /* JADX INFO: renamed from: ex1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C3889fx1 d;

        public a(C3889fx1 c3889fx1) {
            this.d = c3889fx1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            C3889fx1 c3889fx1 = this.d;
            GP1 gp1 = c3889fx1.i;
            gp1.getClass();
            gp1.m(null, bool);
            if (!zBooleanValue) {
                ReporterApi.a.b(c3889fx1.f, EnumC5028l80.g0, null, WE.f(EnumC5326ma.e, EnumC5326ma.g), 10);
                c3889fx1.e.a();
                C2936bP1 c2936bP1 = c3889fx1.h;
                if (c2936bP1 != null) {
                    c2936bP1.l(null);
                }
                c3889fx1.h = null;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3679ex1(C3889fx1 c3889fx1, JM<? super C3679ex1> jm) {
        super(2, jm);
        this.e = c3889fx1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3679ex1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        ((C3679ex1) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C3889fx1 c3889fx1 = this.e;
            C1699On1 c1699On1 = c3889fx1.d.g;
            a aVar = new a(c3889fx1);
            this.d = 1;
            if (c1699On1.d.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }
}

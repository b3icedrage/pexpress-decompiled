package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ra1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$initialize$1", f = "NisyReporterBase.kt", l = {38}, m = "invokeSuspend")
public final class C6377ra1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C0807Dd e;
    public final /* synthetic */ C6797ta1 g;

    /* JADX INFO: renamed from: ra1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C6797ta1 d;

        public a(C6797ta1 c6797ta1) {
            this.d = c6797ta1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            this.d.c = (InterfaceC6168qa1.a) obj;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6377ra1(C0807Dd c0807Dd, C6797ta1 c6797ta1, JM jm) {
        super(2, jm);
        this.e = c0807Dd;
        this.g = c6797ta1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6377ra1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6377ra1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g);
            this.d = 1;
            if (this.e.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

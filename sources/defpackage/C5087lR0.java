package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$initValueUpdates$2", f = "LoadChartUseCaseBase.kt", l = {113}, m = "invokeSuspend")
public final class C5087lR0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC6396rf0<CF> e;
    public final /* synthetic */ C4667jR0 g;

    /* JADX INFO: renamed from: lR0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4667jR0 d;

        public a(C4667jR0 c4667jR0) {
            this.d = c4667jR0;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            CF cf = (CF) obj;
            C4667jR0 c4667jR0 = this.d;
            c4667jR0.e.d(cf.b);
            c4667jR0.e.c(cf.c);
            c4667jR0.g.a(cf.d);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5087lR0(InterfaceC6396rf0<CF> interfaceC6396rf0, C4667jR0 c4667jR0, JM<? super C5087lR0> jm) {
        super(2, jm);
        this.e = interfaceC6396rf0;
        this.g = c4667jR0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5087lR0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5087lR0) create(kn, jm)).invokeSuspend(Unit.a);
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

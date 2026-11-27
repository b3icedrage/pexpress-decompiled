package defpackage;

import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$startTimer$2", f = "Trader.kt", l = {1388}, m = "invokeSuspend")
public final class I12 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ S02<H32> e;

    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$startTimer$2$1", f = "Trader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
        public /* synthetic */ int d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, JM<? super Boolean> jm) {
            return ((a) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d >= 0);
        }
    }

    public static final class b<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ S02<T> d;

        public b(S02<T> s02) {
            this.d = s02;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            int iIntValue = ((Number) obj).intValue();
            S02<T> s02 = this.d;
            Integer num = new Integer(iIntValue);
            GP1 gp1 = s02.J;
            gp1.getClass();
            gp1.m(null, num);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I12(S02<H32> s02, JM<? super I12> jm) {
        super(2, jm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new I12(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((I12) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        S02<H32> s02 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            if (s02.e.a == null) {
                return Unit.a;
            }
            C1752Pf0 c1752Pf0 = new C1752Pf0(new C1883Qx(new C4465ih2(s02.r0, null), e.d, -2, EnumC1796Pu.d), new a(2, null));
            b bVar = new b(s02);
            this.d = 1;
            if (c1752Pf0.c(bVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        GP1 gp1 = s02.J;
        if (((Number) gp1.getValue()).intValue() != 0) {
            Integer num = new Integer(0);
            gp1.getClass();
            gp1.m(null, num);
        }
        return Unit.a;
    }
}

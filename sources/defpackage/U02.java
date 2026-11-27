package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$awaitBalanceSettled$settled$1", f = "Trader.kt", l = {967}, m = "invokeSuspend")
public final class U02 extends AW1 implements Function2<KN, JM<? super C6945uG>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC6396rf0<C6945uG> e;
    public final /* synthetic */ C2513Yp g;
    public final /* synthetic */ S02<H32> h;

    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$awaitBalanceSettled$settled$1$1", f = "Trader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<C6945uG, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ C2513Yp e;
        public final /* synthetic */ S02<H32> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2513Yp c2513Yp, S02<H32> s02, JM<? super a> jm) {
            super(2, jm);
            this.e = c2513Yp;
            this.g = s02;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.e, this.g, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6945uG c6945uG, JM<? super Boolean> jm) {
            return ((a) create(c6945uG, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            boolean z;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6945uG c6945uG = (C6945uG) this.d;
            if (c6945uG != null) {
                IntRange intRange = S02.u0;
                double d = this.g.f0 == EnumC4164hF1.h ? c6945uG.j : c6945uG.k;
                C2513Yp c2513Yp = this.e;
                Intrinsics.checkNotNullParameter(c2513Yp, "<this>");
                if (Math.abs(d - c2513Yp.a) < 0.005d || d != c2513Yp.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U02(InterfaceC6396rf0<C6945uG> interfaceC6396rf0, C2513Yp c2513Yp, S02<H32> s02, JM<? super U02> jm) {
        super(2, jm);
        this.e = interfaceC6396rf0;
        this.g = c2513Yp;
        this.h = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new U02(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C6945uG> jm) {
        return ((U02) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        a aVar = new a(this.g, this.h, null);
        this.d = 1;
        Object objP = C4466ii.p(this.e, aVar, this);
        return objP == mn ? mn : objP;
    }
}

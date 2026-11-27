package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: x32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startListeningForTrader$1", f = "TradingNotificationController.kt", l = {67}, m = "invokeSuspend")
public final class C7533x32 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ D32 g;

    /* JADX INFO: renamed from: x32$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startListeningForTrader$1$1", f = "TradingNotificationController.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ D32 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D32 d32, JM<? super a> jm) {
            super(2, jm);
            this.e = d32;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                D32 d32 = this.e;
                Object objC = C4466ii.m(d32.e.l()).c(new C1515Mf0(new C6063q32(d32), new C2590Zo1()), this);
                if (objC != MN.d) {
                    objC = Unit.a;
                }
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    /* JADX INFO: renamed from: x32$b */
    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startListeningForTrader$1$2", f = "TradingNotificationController.kt", l = {72}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ D32 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D32 d32, JM<? super b> jm) {
            super(2, jm);
            this.e = d32;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
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
                return Unit.a;
            }
            C1795Pt1.b(obj);
            this.d = 1;
            D32.a(this.e, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: x32$c */
    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startListeningForTrader$1$3", f = "TradingNotificationController.kt", l = {75}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ D32 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D32 d32, JM<? super c> jm) {
            super(2, jm);
            this.g = d32;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            c cVar = new c(this.g, jm);
            cVar.e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
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
                return Unit.a;
            }
            C1795Pt1.b(obj);
            KN kn = (KN) this.e;
            this.d = 1;
            D32.b(this.g, kn, this);
            return mn;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7533x32(D32 d32, JM<? super C7533x32> jm) {
        super(2, jm);
        this.g = d32;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7533x32 c7533x32 = new C7533x32(this.g, jm);
        c7533x32.e = obj;
        return c7533x32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7533x32) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        KN kn;
        MN mn = MN.d;
        int i = this.d;
        D32 d32 = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            KN kn2 = (KN) this.e;
            d32.d.g(true);
            GP1 gp1 = d32.a.i;
            this.e = kn2;
            this.d = 1;
            if (C7236vf0.a(gp1, this) == mn) {
                return mn;
            }
            kn = kn2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kn = (KN) this.e;
            C1795Pt1.b(obj);
        }
        C5189lv.k(kn, null, new a(d32, null), 3);
        C5189lv.k(kn, null, new b(d32, null), 3);
        C5189lv.k(kn, null, new c(d32, null), 3);
        return Unit.a;
    }
}

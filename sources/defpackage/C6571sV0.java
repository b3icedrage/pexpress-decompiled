package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initLogoutListener$2", f = "MainActivity.kt", l = {576}, m = "invokeSuspend")
public final class C6571sV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX INFO: renamed from: sV0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ ActivityC6781tV0 d;

        public a(ActivityC6781tV0 activityC6781tV0) {
            this.d = activityC6781tV0;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final /* bridge */ /* synthetic */ Object a(Object obj, JM jm) {
            return b(jm);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(JM jm) {
            C6361rV0 c6361rV0;
            a<T> aVar;
            if (jm instanceof C6361rV0) {
                c6361rV0 = (C6361rV0) jm;
                int i = c6361rV0.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c6361rV0.h = i - Integer.MIN_VALUE;
                } else {
                    c6361rV0 = new C6361rV0(this, jm);
                }
            } else {
                c6361rV0 = new C6361rV0(this, jm);
            }
            Object obj = c6361rV0.e;
            MN mn = MN.d;
            int i2 = c6361rV0.h;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                ActivityC6781tV0 activityC6781tV0 = this.d;
                ReporterApi reporterApiV = activityC6781tV0.v();
                EnumC5028l80 enumC5028l80 = EnumC5028l80.o;
                L80 l80 = L80.MAX_PROFIT;
                ReporterApi.a.b(reporterApiV, enumC5028l80, new C1510Md1("Logout"), null, 12);
                c6361rV0.d = this;
                c6361rV0.h = 1;
                activityC6781tV0.u().a.f();
                C3733fC<C5673oB1> c3733fCU = activityC6781tV0.u();
                InterfaceC3951gE1 interfaceC3951gE1 = activityC6781tV0.i;
                if (interfaceC3951gE1 == null) {
                    Intrinsics.l("screensProvider");
                    throw null;
                }
                c3733fCU.a.e(interfaceC3951gE1.g());
                if (Unit.a == mn) {
                    return mn;
                }
                aVar = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = c6361rV0.d;
                C1795Pt1.b(obj);
            }
            aVar.d.w().x();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6571sV0(ActivityC6781tV0 activityC6781tV0, JM<? super C6571sV0> jm) {
        super(2, jm);
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6571sV0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
        ((C6571sV0) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw EK.c(obj);
        }
        C1795Pt1.b(obj);
        ActivityC6781tV0 activityC6781tV0 = this.e;
        C4923kf c4923kf = activityC6781tV0.m;
        if (c4923kf == null) {
            Intrinsics.l("appDataRepository");
            throw null;
        }
        C6120qK1 c6120qK1 = c4923kf.v;
        a aVar = new a(activityC6781tV0);
        this.d = 1;
        c6120qK1.getClass();
        C6120qK1.o(c6120qK1, aVar, this);
        return mn;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initLogoutListener$1", f = "MainActivity.kt", l = {573}, m = "invokeSuspend")
public final class C6152qV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX INFO: renamed from: qV0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ ActivityC6781tV0 d;

        public a(ActivityC6781tV0 activityC6781tV0) {
            this.d = activityC6781tV0;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            C6355rT0 c6355rT0 = this.d.u;
            if (c6355rT0 != null) {
                Object objA = c6355rT0.a(true, jm);
                return objA == MN.d ? objA : Unit.a;
            }
            Intrinsics.l("logoutManager");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6152qV0(ActivityC6781tV0 activityC6781tV0, JM<? super C6152qV0> jm) {
        super(2, jm);
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6152qV0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
        ((C6152qV0) create(kn, jm)).invokeSuspend(Unit.a);
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
        C6120qK1 c6120qK1 = c4923kf.w;
        a aVar = new a(activityC6781tV0);
        this.d = 1;
        c6120qK1.getClass();
        C6120qK1.o(c6120qK1, aVar, this);
        return mn;
    }
}

package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMinMaxBet;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Mk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.GetBetMinMaxValuesUseCaseImpl$execute$2", f = "GetBetMinMaxValuesUseCaseImpl.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION, ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "invokeSuspend")
public final class C1530Mk0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1611Nk0 e;

    /* JADX INFO: renamed from: Mk0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C1611Nk0 d;

        public a(C1611Nk0 c1611Nk0) {
            this.d = c1611Nk0;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            Object objA = C1611Nk0.a(this.d, (CommonMinMaxBet) ((ResultOk) obj).a(), jm);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530Mk0(C1611Nk0 c1611Nk0, JM<? super C1530Mk0> jm) {
        super(2, jm);
        this.e = c1611Nk0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1530Mk0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1530Mk0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r6.c(r1, r5) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            Nk0 r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L42
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L2c
        L1e:
            defpackage.C1795Pt1.b(r6)
            L32 r6 = r2.a
            r5.d = r4
            java.lang.Object r6 = r6.f(r5)
            if (r6 != r0) goto L2c
            goto L41
        L2c:
            rf0 r6 = (defpackage.InterfaceC6396rf0) r6
            java.lang.String r1 = "trading.amount_limits"
            com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1 r6 = com.api.core.backend.domain.models.resultModels.CommonResultKt.c(r6, r1)
            Mk0$a r1 = new Mk0$a
            r1.<init>(r2)
            r5.d = r3
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1530Mk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

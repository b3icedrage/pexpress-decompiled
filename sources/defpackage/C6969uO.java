package defpackage;

import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: renamed from: uO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$subscribeOnCoupon$4", f = "CouponProviderBase.kt", l = {75}, m = "invokeSuspend")
public final class C6969uO extends AW1 implements InterfaceC1216Ij0<String, String, Boolean, Long, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ String e;
    public /* synthetic */ boolean g;
    public /* synthetic */ long h;
    public final /* synthetic */ C5077lO i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6969uO(C5077lO c5077lO, JM<? super C6969uO> jm) {
        super(5, jm);
        this.i = c5077lO;
    }

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        long jLongValue = ((Number) obj4).longValue();
        C6969uO c6969uO = new C6969uO(this.i, (JM) serializable);
        c6969uO.e = (String) obj2;
        c6969uO.g = zBooleanValue;
        c6969uO.h = jLongValue;
        return c6969uO.invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            String str = this.e;
            boolean z = this.g;
            long j = this.h;
            this.d = 1;
            if (C5077lO.d(this.i, str, z, j, this) == mn) {
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

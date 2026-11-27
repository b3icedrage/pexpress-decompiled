package defpackage;

import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.tool.AppImpl$wireSentryUserContext$4", f = "AppImpl.kt", l = {282}, m = "invokeSuspend")
public final class C7033uh extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ZT1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7033uh(ZT1 zt1, JM<? super C7033uh> jm) {
        super(2, jm);
        this.g = zt1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7033uh c7033uh = new C7033uh(this.g, jm);
        c7033uh.e = obj;
        return c7033uh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7033uh) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objA;
        MN mn = MN.d;
        int i = this.d;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                ZT1 zt1 = this.g;
                C1717Ot1.a aVar = C1717Ot1.e;
                this.d = 1;
                obj = zt1.a(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            objA = (String) obj;
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (!(objA instanceof C1717Ot1.b)) {
            QF1.m("sub_id", (String) objA);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.f("SentryUserContext", "subId resolution failed", thA);
        }
        return Unit.a;
    }
}

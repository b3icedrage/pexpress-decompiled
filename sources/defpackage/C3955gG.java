package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: gG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.platform.screens.common.CommonNavigateToVerificationWebViewClientApi$redirectToVerificationFragment$1", f = "CommonNavigateToVerificationWebViewClientApi.kt", l = {31}, m = "invokeSuspend")
public final class C3955gG extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC4165hG e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3955gG(AbstractC4165hG abstractC4165hG, JM<? super C3955gG> jm) {
        super(2, jm);
        this.e = abstractC4165hG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3955gG(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3955gG) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.e.f;
            Unit unit = Unit.a;
            this.d = 1;
            if (c6120qK1.a(unit, this) == mn) {
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

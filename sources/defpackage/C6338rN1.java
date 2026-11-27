package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$init$1$1", f = "SocialLoginWithWebView.kt", l = {62}, m = "invokeSuspend")
public final class C6338rN1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC5709oN1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6338rN1(AbstractC5709oN1 abstractC5709oN1, JM<? super C6338rN1> jm) {
        super(2, jm);
        this.e = abstractC5709oN1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6338rN1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6338rN1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            EnumC5076lN1 enumC5076lN1 = EnumC5076lN1.d;
            this.d = 1;
            AbstractC5709oN1 abstractC5709oN1 = this.e;
            abstractC5709oN1.getClass();
            C5189lv.k(C3286d41.a, null, new C6968uN1(abstractC5709oN1, null), 3);
            if (Unit.a == mn) {
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

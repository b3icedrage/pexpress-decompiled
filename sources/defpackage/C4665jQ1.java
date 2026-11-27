package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;

/* JADX INFO: renamed from: jQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.providers.StepDescriptionProviderBase$getDescriptionStep$1", f = "StepDescriptionProviderBase.kt", l = {36}, m = "invokeSuspend")
public final class C4665jQ1 extends AW1 implements InterfaceC1060Gj0<AbstractC5652o6, String, JM<? super DY>, Object> {
    public int d;
    public /* synthetic */ AbstractC5652o6 e;
    public final /* synthetic */ C4875kQ1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4665jQ1(C4875kQ1 c4875kQ1, JM<? super C4665jQ1> jm) {
        super(3, jm);
        this.g = c4875kQ1;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC5652o6 abstractC5652o6 = this.e;
            boolean z = abstractC5652o6 instanceof AbstractC5652o6.b;
            C4875kQ1 c4875kQ1 = this.g;
            if (!z) {
                if (!(abstractC5652o6 instanceof AbstractC5652o6.c)) {
                    return null;
                }
                c4875kQ1.a.getClass();
                Integer numValueOf = Integer.valueOf(R.string.platform_name);
                return new DY("https://assets.pbotservices.com/images/activation-steps/activate_account.png", R.string.create_an_account_platform_tittle, VE.c(numValueOf), R.string.create_a_new_platform_acc_description, VE.c(numValueOf));
            }
            this.d = 1;
            obj = C4875kQ1.b(c4875kQ1, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return (DY) obj;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC5652o6 abstractC5652o6, String str, JM<? super DY> jm) {
        C4665jQ1 c4665jQ1 = new C4665jQ1(this.g, jm);
        c4665jQ1.e = abstractC5652o6;
        return c4665jQ1.invokeSuspend(Unit.a);
    }
}

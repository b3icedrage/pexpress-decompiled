package defpackage;

import com.base.feature.account.screens.balance.AccountBalancePartBase;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import defpackage.C7242vg2.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7946z2 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C7946z2(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((AccountBalancePartBase) this.e).l;
            case 1:
                ((C5852p31) this.e).invoke();
                return Unit.a;
            case 2:
                return ((AbstractC1104Gy) this.e).b.b();
            case 3:
                ActivityC6781tV0 activityC6781tV0 = (ActivityC6781tV0) this.e;
                C3571eS c3571eSB = ((InterfaceC1356Ke) activityC6781tV0.P.getValue()).b();
                c3571eSB.c = new BV0(activityC6781tV0, new C0738Cg(activityC6781tV0, 5));
                Z21 z21 = new Z21(activityC6781tV0);
                BV0 bv0 = c3571eSB.c;
                if (bv0 != null) {
                    return new C3781fS(c3571eSB.a, c3571eSB.b, bv0, new LL(14), z21, new C0957Fb());
                }
                throw new IllegalStateException(BV0.class.getCanonicalName() + " must be set");
            case 4:
                ((C7059un1) this.e).t();
                return Unit.a;
            case 5:
                ((Function0) this.e).invoke();
                return Unit.a;
            case 6:
                return Boolean.valueOf(((C4923kf) this.e).i.getValue() != null);
            case 7:
                return ((C7242vg2) this.e).new d(null);
            default:
                ((WebViewFileChooserUseCaseBase) this.e).f(null);
                return Unit.a;
        }
    }
}

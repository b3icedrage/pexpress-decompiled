package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoPartBase$initFlowCollectors$1$4", f = "AccountMainInfoPartBase.kt", l = {}, m = "invokeSuspend")
public final class E3 extends AW1 implements InterfaceC1060Gj0<AbstractC5652o6, C6911u6, JM<? super Unit>, Object> {
    public /* synthetic */ AbstractC5652o6 d;
    public /* synthetic */ C6911u6 e;
    public final /* synthetic */ AccountMainInfoPartBase g;
    public final /* synthetic */ J3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(AccountMainInfoPartBase accountMainInfoPartBase, J3 j3, JM<? super E3> jm) {
        super(3, jm);
        this.g = accountMainInfoPartBase;
        this.h = j3;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String string;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        AbstractC5652o6 abstractC5652o6 = this.d;
        C6911u6 c6911u6 = this.e;
        boolean z = abstractC5652o6 instanceof AbstractC5652o6.a;
        AccountMainInfoPartBase accountMainInfoPartBase = this.g;
        if (z) {
            MaterialCardView materialCardView = ((J3) accountMainInfoPartBase.k()).e.d;
            Intrinsics.checkNotNullExpressionValue(materialCardView, "getRoot(...)");
            materialCardView.setVisibility(8);
            ImageView accountMainInfoIndicatorIcon = ((J3) accountMainInfoPartBase.k()).j;
            Intrinsics.checkNotNullExpressionValue(accountMainInfoIndicatorIcon, "accountMainInfoIndicatorIcon");
            C3435dm0.e(accountMainInfoIndicatorIcon, R.drawable.ic_ok_small, EnumC7035uh1.g);
        } else {
            if (!(abstractC5652o6 instanceof AbstractC5652o6.b) && !(abstractC5652o6 instanceof AbstractC5652o6.c)) {
                throw new C6489s51();
            }
            AccountMainInfoPartBase.l(accountMainInfoPartBase, c6911u6);
        }
        TextView textView = this.h.k;
        if (z) {
            string = ((AbstractC5652o6.a) abstractC5652o6).a;
        } else if (abstractC5652o6 instanceof AbstractC5652o6.b) {
            string = ((AbstractC5652o6.b) abstractC5652o6).a;
        } else {
            if (!(abstractC5652o6 instanceof AbstractC5652o6.c)) {
                throw new C6489s51();
            }
            string = accountMainInfoPartBase.getString(((AbstractC5652o6.c) abstractC5652o6).a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView.setText(string);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC5652o6 abstractC5652o6, C6911u6 c6911u6, JM<? super Unit> jm) {
        J3 j3 = this.h;
        E3 e3 = new E3(this.g, j3, jm);
        e3.d = abstractC5652o6;
        e3.e = c6911u6;
        return e3.invokeSuspend(Unit.a);
    }
}

package com.base.feature.account.screens.balance;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.account.screens.balance.AccountBalancePartApi;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.A2;
import defpackage.AW1;
import defpackage.B2;
import defpackage.C1795Pt1;
import defpackage.C2;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2591Zp;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4250hg0;
import defpackage.C5109lY1;
import defpackage.C5189lv;
import defpackage.C5491nL;
import defpackage.C6133qP;
import defpackage.C7652xe;
import defpackage.C7946z2;
import defpackage.D2;
import defpackage.EnumC4403iP0;
import defpackage.F2;
import defpackage.FP0;
import defpackage.G2;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6606sf0;
import defpackage.J2;
import defpackage.JM;
import defpackage.KN;
import defpackage.L2;
import defpackage.MN;
import defpackage.QO;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC7526x2;
import defpackage.ViewOnClickListenerC7736y2;
import defpackage.XO0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/account/screens/balance/AccountBalancePartBase;", "Lcom/api/feature/account/screens/balance/AccountBalancePartApi;", "LF2;", "FeatureAccountBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountBalancePartBase extends AccountBalancePartApi<F2> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, F2> {
        public static final a m = new a(3, F2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/databinding/AccountBalancePartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final F2 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.account_balance_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.account_balance_balance_text;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.account_balance_balance_text);
            if (textView != null) {
                i = R.id.account_balance_deposit_button;
                View viewH = C3476e.h(viewInflate, R.id.account_balance_deposit_button);
                if (viewH != null) {
                    MaterialButton materialButton = (MaterialButton) viewH;
                    L2 l2 = new L2(materialButton, materialButton);
                    int i2 = R.id.account_balance_title_text;
                    if (((TextView) C3476e.h(viewInflate, R.id.account_balance_title_text)) != null) {
                        i2 = R.id.account_balance_withdraw_button;
                        View viewH2 = C3476e.h(viewInflate, R.id.account_balance_withdraw_button);
                        if (viewH2 != null) {
                            MaterialButton materialButton2 = (MaterialButton) viewH2;
                            return new F2((ConstraintLayout) viewInflate, textView, l2, new L2(materialButton2, materialButton2));
                        }
                    }
                    i = i2;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalancePartBase$setup$lambda$5$$inlined$launchAndCollectIn$default$1", f = "AccountBalancePartBase.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C4250hg0 g;
        public final /* synthetic */ F2 h;

        @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalancePartBase$setup$lambda$5$$inlined$launchAndCollectIn$default$1$1", f = "AccountBalancePartBase.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C4250hg0 g;
            public final /* synthetic */ F2 h;

            /* JADX INFO: renamed from: com.base.feature.account.screens.balance.AccountBalancePartBase$b$a$a, reason: collision with other inner class name */
            public static final class C0273a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ F2 e;

                public C0273a(KN kn, F2 f2) {
                    this.e = f2;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    String strE;
                    NumberFormat currencyInstance;
                    C2591Zp c2591Zp = (C2591Zp) obj;
                    TextView textView = this.e.e;
                    Double d = new Double(c2591Zp.a);
                    String upperCase = c2591Zp.b.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    try {
                        if (Intrinsics.a(upperCase, "DEMO")) {
                            currencyInstance = NumberFormat.getCurrencyInstance();
                            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                            decimalFormatSymbols.setCurrencySymbol("Đ");
                            Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                        } else {
                            currencyInstance = NumberFormat.getCurrencyInstance();
                            currencyInstance.setCurrency(Currency.getInstance(upperCase));
                        }
                        strE = currencyInstance.format(d);
                        Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                    } catch (IllegalArgumentException unused) {
                        String str = new DecimalFormat("###,###,##0.00").format(d);
                        String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
                        strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
                    }
                    textView.setText("\u202a" + QO.o(strE));
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4250hg0 c4250hg0, JM jm, F2 f2) {
                super(2, jm);
                this.g = c4250hg0;
                this.h = f2;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0273a c0273a = new C0273a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0273a, this) == mn) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FP0 fp0, C4250hg0 c4250hg0, JM jm, F2 f2) {
            super(2, jm);
            this.e = fp0;
            this.g = c4250hg0;
            this.h = f2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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

    public AccountBalancePartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        F2 f2 = (F2) k();
        MaterialButton materialButton = f2.g.e;
        materialButton.setText(requireContext().getText(R.string.deposit_text));
        Intrinsics.checkNotNull(materialButton);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = C7652xe.f(this);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_account_balance_deposit);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_right_arrow);
        C5109lY1.c(materialButton, lifecycleCoroutineScopeImplF, numValueOf, numValueOf2, 20);
        materialButton.setOnClickListener(new ViewOnClickListenerC7526x2(this, 0));
        MaterialButton materialButton2 = f2.h.e;
        materialButton2.setText(requireContext().getText(R.string.withdraw_label));
        Intrinsics.checkNotNull(materialButton2);
        C5109lY1.c(materialButton2, C7652xe.f(this), Integer.valueOf(R.drawable.ic_account_balance_withdraw), numValueOf2, 20);
        materialButton2.setOnClickListener(new ViewOnClickListenerC7736y2(this, 0));
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C4250hg0 c4250hg0 = new C4250hg0(((G2) obj).l(), 0);
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, c4250hg0, null, f2), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C7946z2 c7946z2 = new C7946z2(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new B2(new A2(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(J2.class), new C2(interfaceC3770fO0A, 0), new D2(interfaceC3770fO0A), c7946z2);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, F2> g() {
        return this.m;
    }
}

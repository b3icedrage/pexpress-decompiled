package com.base.feature.account.screens.common;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.v;
import com.api.feature.account.screens.common.AccountCommonFragmentApi;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC2861b3;
import defpackage.C1621Nn1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2637a3;
import defpackage.C2784ak0;
import defpackage.C3070c3;
import defpackage.C3476e;
import defpackage.C4629jE1;
import defpackage.C4839kE1;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.PW0;
import defpackage.Q2;
import defpackage.R2;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.U2;
import defpackage.V2;
import defpackage.V3;
import defpackage.ViewOnScrollChangeListenerC4371iE1;
import defpackage.W2;
import defpackage.W3;
import defpackage.X2;
import defpackage.XO0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/account/screens/common/AccountCommonFragmentBase;", "Lcom/api/feature/account/screens/common/AccountCommonFragmentApi;", "La3;", "FeatureAccountBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountCommonFragmentBase extends AccountCommonFragmentApi<C2637a3> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final W3 k;

    @NotNull
    public final C4839kE1 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2637a3> {
        public static final a m = new a(3, C2637a3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/account/databinding/AccountCommonFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2637a3 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.account_common_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.account_balance_part_placeholder;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.account_balance_part_placeholder);
            if (frameLayout != null) {
                i = R.id.account_balance_settings_separator;
                if (((FrameLayout) C3476e.h(viewInflate, R.id.account_balance_settings_separator)) != null) {
                    i = R.id.account_logout_bottom_separator;
                    if (((FrameLayout) C3476e.h(viewInflate, R.id.account_logout_bottom_separator)) != null) {
                        i = R.id.account_logout_part_placeholder;
                        FrameLayout frameLayout2 = (FrameLayout) C3476e.h(viewInflate, R.id.account_logout_part_placeholder);
                        if (frameLayout2 != null) {
                            i = R.id.account_main_info_part_placeholder;
                            FrameLayout frameLayout3 = (FrameLayout) C3476e.h(viewInflate, R.id.account_main_info_part_placeholder);
                            if (frameLayout3 != null) {
                                i = R.id.account_main_info_rating_separator;
                                if (((FrameLayout) C3476e.h(viewInflate, R.id.account_main_info_rating_separator)) != null) {
                                    i = R.id.account_settings_logout_separator;
                                    if (((FrameLayout) C3476e.h(viewInflate, R.id.account_settings_logout_separator)) != null) {
                                        i = R.id.account_settings_placeholder;
                                        FrameLayout frameLayout4 = (FrameLayout) C3476e.h(viewInflate, R.id.account_settings_placeholder);
                                        if (frameLayout4 != null) {
                                            i = R.id.nestedScrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) C3476e.h(viewInflate, R.id.nestedScrollView);
                                            if (nestedScrollView != null) {
                                                return new C2637a3((ConstraintLayout) viewInflate, frameLayout, frameLayout2, frameLayout3, frameLayout4, nestedScrollView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase$onViewCreated$1", f = "AccountCommonFragmentBase.kt", l = {43}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AccountCommonFragmentBase.this.new b(jm);
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
                this.d = 1;
                if (AccountCommonFragmentBase.l(AccountCommonFragmentBase.this, this) == mn) {
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

    public AccountCommonFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull W3 partProvider) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(partProvider, "partProvider");
        this.j = viewModelFactory;
        this.k = partProvider;
        this.l = new C4839kE1();
        this.m = a.m;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:20:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(com.base.feature.account.screens.common.AccountCommonFragmentBase r5, defpackage.LM r6) {
        /*
            boolean r0 = r6 instanceof defpackage.Y2
            if (r0 == 0) goto L13
            r0 = r6
            Y2 r0 = (defpackage.Y2) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            Y2 r0 = new Y2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            V3 r5 = r0.g
            java.util.Iterator r2 = r0.e
            com.base.feature.account.screens.common.AccountCommonFragmentBase r4 = r0.d
            defpackage.C1795Pt1.b(r6)
            r6 = r5
            r5 = r4
            goto L74
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.C1795Pt1.b(r6)
            wd2 r6 = r5.k()
            a3 r6 = (defpackage.C2637a3) r6
            java.util.Map r6 = n(r6)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L4d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r4 = r6.getKey()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r6 = r6.getValue()
            V3 r6 = (defpackage.V3) r6
            r0.d = r5
            r0.e = r2
            r0.g = r6
            r0.j = r3
            java.lang.Object r4 = r5.m(r4, r0)
            if (r4 != r1) goto L74
            return r1
        L74:
            VM extends xG r4 = r5.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            b3 r4 = (defpackage.AbstractC2861b3) r4
            r4.n(r6)
            goto L4d
        L7f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.account.screens.common.AccountCommonFragmentBase.l(com.base.feature.account.screens.common.AccountCommonFragmentBase, LM):java.lang.Object");
    }

    public static Map n(C2637a3 c2637a3) {
        return PW0.e(new Pair(c2637a3.h, V3.d), new Pair(c2637a3.e, V3.e), new Pair(c2637a3.i, V3.g), new Pair(c2637a3.g, V3.h));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        Q2 q2 = new Q2(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new T2(new S2(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(C3070c3.class), new U2(interfaceC3770fO0A, 0), new V2(interfaceC3770fO0A), q2);
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        int i = Build.VERSION.SDK_INT;
        C4839kE1 c4839kE1 = this.l;
        if (i <= 27) {
            c4839kE1.a = true;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = c4839kE1.b;
        if (lifecycleCoroutineScopeImpl != null) {
            C5189lv.k(lifecycleCoroutineScopeImpl, null, new C4629jE1(c4839kE1, null), 3);
        }
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2637a3> g() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ViewGroup viewGroup, LM lm) {
        R2 r2;
        if (lm instanceof R2) {
            r2 = (R2) lm;
            int i = r2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                r2.h = i - Integer.MIN_VALUE;
            } else {
                r2 = new R2(this, lm);
            }
        } else {
            r2 = new R2(this, lm);
        }
        Object obj = r2.e;
        MN mn = MN.d;
        int i2 = r2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            int id = viewGroup.getId();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            r2.d = viewGroup;
            r2.h = 1;
            if (this.k.b(id, childFragmentManager, r2) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewGroup = r2.d;
            C1795Pt1.b(obj);
        }
        viewGroup.setAlpha(0.0f);
        return Unit.a;
    }

    @Override // com.api.core.SimpleViewModelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.k.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0L = ((AbstractC2861b3) obj).l();
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new X2(viewLifecycleOwner, interfaceC6396rf0L, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn1M = ((AbstractC2861b3) obj2).m();
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new W2(viewLifecycleOwner2, c1621Nn1M, null, this), 3);
        LifecycleCoroutineScopeImpl scope = C7652xe.f(this);
        NestedScrollView view2 = ((C2637a3) k()).j;
        Intrinsics.checkNotNullExpressionValue(view2, "nestedScrollView");
        C4839kE1 c4839kE1 = this.l;
        c4839kE1.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(view2, "view");
        c4839kE1.b = scope;
        view2.setOnScrollChangeListener(new ViewOnScrollChangeListenerC4371iE1(c4839kE1));
        C7652xe.f(this).c(new b(null));
    }
}

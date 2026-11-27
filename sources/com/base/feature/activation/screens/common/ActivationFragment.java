package com.base.feature.activation.screens.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.api.resources.CenteredToolbar;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.appbar.AppBarLayout;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2649a6;
import defpackage.C2784ak0;
import defpackage.C2873b6;
import defpackage.C3082c6;
import defpackage.C3476e;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC3921g6;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.O6;
import defpackage.Sd2;
import defpackage.X5;
import defpackage.XO0;
import defpackage.Y5;
import defpackage.Z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/common/ActivationFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LO6;", "Lc6;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivationFragment extends SimpleViewModelFragment<O6, C3082c6> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final InterfaceC3921g6 k;

    @Nullable
    public final Integer l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3082c6> {
        public static final a m = new a(3, C3082c6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/activation/databinding/ActivationFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3082c6 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.activation_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.actionButtonContainer;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.actionButtonContainer);
            if (frameLayout != null) {
                i = R.id.app_bar_layout;
                if (((AppBarLayout) C3476e.h(viewInflate, R.id.app_bar_layout)) != null) {
                    i = R.id.bigStoriesContainer;
                    FrameLayout frameLayout2 = (FrameLayout) C3476e.h(viewInflate, R.id.bigStoriesContainer);
                    if (frameLayout2 != null) {
                        i = R.id.fragment_change_language_toolbar;
                        CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.fragment_change_language_toolbar);
                        if (centeredToolbar != null) {
                            i = R.id.stepDescriptionContainer;
                            FrameLayout frameLayout3 = (FrameLayout) C3476e.h(viewInflate, R.id.stepDescriptionContainer);
                            if (frameLayout3 != null) {
                                i = R.id.topStepsContainer;
                                FrameLayout frameLayout4 = (FrameLayout) C3476e.h(viewInflate, R.id.topStepsContainer);
                                if (frameLayout4 != null) {
                                    return new C3082c6((ConstraintLayout) viewInflate, frameLayout, frameLayout2, centeredToolbar, frameLayout3, frameLayout4);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.common.ActivationFragment$onViewCreated$1", f = "ActivationFragment.kt", l = {29, 30, 31, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public ActivationFragment d;
        public C3082c6 e;
        public int g;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivationFragment.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0094  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        
            if (com.base.feature.activation.screens.common.ActivationFragment.l(r3, r10, r9) == r0) goto L28;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                MN r0 = defpackage.MN.d
                int r1 = r9.g
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                defpackage.C1795Pt1.b(r10)
                goto Laa
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                c6 r1 = r9.e
                com.base.feature.activation.screens.common.ActivationFragment r3 = r9.d
                defpackage.C1795Pt1.b(r10)
                goto L95
            L28:
                c6 r1 = r9.e
                com.base.feature.activation.screens.common.ActivationFragment r4 = r9.d
                defpackage.C1795Pt1.b(r10)
                goto L80
            L30:
                c6 r1 = r9.e
                com.base.feature.activation.screens.common.ActivationFragment r5 = r9.d
                defpackage.C1795Pt1.b(r10)
                goto L6b
            L38:
                defpackage.C1795Pt1.b(r10)
                com.base.feature.activation.screens.common.ActivationFragment r10 = com.base.feature.activation.screens.common.ActivationFragment.this
                wd2 r1 = r10.k()
                c6 r1 = (defpackage.C3082c6) r1
                com.api.resources.CenteredToolbar r6 = r1.h
                java.lang.String r7 = "fragmentChangeLanguageToolbar"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                androidx.fragment.app.g r7 = r10.requireActivity()
                java.lang.String r8 = "requireActivity(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                defpackage.C5421n02.a(r6, r7)
                android.widget.FrameLayout r6 = r1.j
                java.lang.String r7 = "topStepsContainer"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                r9.d = r10
                r9.e = r1
                r9.g = r5
                java.lang.Object r5 = com.base.feature.activation.screens.common.ActivationFragment.l(r10, r6, r9)
                if (r5 != r0) goto L6a
                goto La9
            L6a:
                r5 = r10
            L6b:
                android.widget.FrameLayout r10 = r1.g
                java.lang.String r6 = "bigStoriesContainer"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)
                r9.d = r5
                r9.e = r1
                r9.g = r4
                java.lang.Object r10 = com.base.feature.activation.screens.common.ActivationFragment.l(r5, r10, r9)
                if (r10 != r0) goto L7f
                goto La9
            L7f:
                r4 = r5
            L80:
                android.widget.FrameLayout r10 = r1.i
                java.lang.String r5 = "stepDescriptionContainer"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
                r9.d = r4
                r9.e = r1
                r9.g = r3
                java.lang.Object r10 = com.base.feature.activation.screens.common.ActivationFragment.l(r4, r10, r9)
                if (r10 != r0) goto L94
                goto La9
            L94:
                r3 = r4
            L95:
                android.widget.FrameLayout r10 = r1.e
                java.lang.String r1 = "actionButtonContainer"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
                r1 = 0
                r9.d = r1
                r9.e = r1
                r9.g = r2
                java.lang.Object r10 = com.base.feature.activation.screens.common.ActivationFragment.l(r3, r10, r9)
                if (r10 != r0) goto Laa
            La9:
                return r0
            Laa:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.base.feature.activation.screens.common.ActivationFragment.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ActivationFragment(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC3921g6 activationPartManager) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(activationPartManager, "activationPartManager");
        this.j = viewModelFactory;
        this.k = activationPartManager;
        this.l = Integer.valueOf(R.color.toolbarBackground);
        this.m = a.m;
    }

    public static final Object l(ActivationFragment activationFragment, FrameLayout frameLayout, b bVar) {
        activationFragment.getClass();
        int id = frameLayout.getId();
        FragmentManager childFragmentManager = activationFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Object objB = activationFragment.k.b(id, childFragmentManager, bVar);
        return objB == MN.d ? objB : Unit.a;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        X5 x5 = new X5(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new Z5(new Y5(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(O6.class), new C2649a6(interfaceC3770fO0A, 0), new C2873b6(interfaceC3770fO0A), x5);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3082c6> g() {
        return this.m;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getP() {
        return this.l;
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
        C7652xe.f(this).c(new b(null));
    }
}

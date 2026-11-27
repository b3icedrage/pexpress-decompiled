package com.base.feature.support.support.screens.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.v;
import com.api.core.SimpleViewModelFragment;
import com.pexpress.tool.R;
import defpackage.AV1;
import defpackage.AW1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3474dz0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5316mW1;
import defpackage.C5500nO;
import defpackage.C7202vV1;
import defpackage.C7413wV1;
import defpackage.C7623xV1;
import defpackage.C7652xe;
import defpackage.C7833yV1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.PW0;
import defpackage.QV1;
import defpackage.RV1;
import defpackage.Sd2;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/common/SupportFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LmW1;", "LAV1;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportFragment extends SimpleViewModelFragment<C5316mW1, AV1> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final RV1 k;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, AV1> {
        public static final a m = new a(3, AV1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/SupportFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final AV1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.support_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.support_faq_placeholder;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.support_faq_placeholder);
            if (frameLayout != null) {
                i = R.id.support_issue_categories_placeholder;
                FrameLayout frameLayout2 = (FrameLayout) C3476e.h(viewInflate, R.id.support_issue_categories_placeholder);
                if (frameLayout2 != null) {
                    i = R.id.support_need_help_placeholder;
                    FrameLayout frameLayout3 = (FrameLayout) C3476e.h(viewInflate, R.id.support_need_help_placeholder);
                    if (frameLayout3 != null) {
                        i = R.id.support_popular_questions_placeholder;
                        FrameLayout frameLayout4 = (FrameLayout) C3476e.h(viewInflate, R.id.support_popular_questions_placeholder);
                        if (frameLayout4 != null) {
                            return new AV1((ConstraintLayout) viewInflate, frameLayout, frameLayout2, frameLayout3, frameLayout4);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportFragment$onViewCreated$1", f = "SupportFragment.kt", l = {36}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return SupportFragment.this.new b(jm);
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
                if (SupportFragment.l(SupportFragment.this, this) == mn) {
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

    public SupportFragment(@NotNull Sd2 viewModelFactory, @NotNull RV1 partProvider) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(partProvider, "partProvider");
        this.j = viewModelFactory;
        this.k = partProvider;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:20:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(com.base.feature.support.support.screens.common.SupportFragment r6, defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C8043zV1
            if (r0 == 0) goto L13
            r0 = r7
            zV1 r0 = (defpackage.C8043zV1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            zV1 r0 = new zV1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            QV1 r6 = r0.g
            java.util.Iterator r2 = r0.e
            com.base.feature.support.support.screens.common.SupportFragment r4 = r0.d
            defpackage.C1795Pt1.b(r7)
            r7 = r6
            r6 = r4
            goto L74
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.C1795Pt1.b(r7)
            wd2 r7 = r6.k()
            AV1 r7 = (defpackage.AV1) r7
            java.util.Map r7 = n(r7)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L4d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r4 = r7.getKey()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r7 = r7.getValue()
            QV1 r7 = (defpackage.QV1) r7
            r0.d = r6
            r0.e = r2
            r0.g = r7
            r0.j = r3
            java.lang.Object r4 = r6.m(r4, r0)
            if (r4 != r1) goto L74
            return r1
        L74:
            VM extends xG r4 = r6.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            mW1 r4 = (defpackage.C5316mW1) r4
            r4.getClass()
            java.lang.String r5 = "part"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            java.util.EnumMap<QV1, g21<java.lang.Boolean>> r4 = r4.j
            java.lang.Object r7 = r4.get(r7)
            g21 r7 = (defpackage.InterfaceC3907g21) r7
            if (r7 == 0) goto L4d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r7.setValue(r4)
            goto L4d
        L93:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.support.support.screens.common.SupportFragment.l(com.base.feature.support.support.screens.common.SupportFragment, LM):java.lang.Object");
    }

    public static Map n(AV1 av1) {
        return PW0.e(new Pair(av1.h, QV1.d), new Pair(av1.e, QV1.e), new Pair(av1.i, QV1.g), new Pair(av1.g, QV1.h));
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 11), 9));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5316mW1.class), new C3474dz0(interfaceC3770fO0A, 6), new C7413wV1(interfaceC3770fO0A), c5500nO);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, AV1> g() {
        return a.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ViewGroup viewGroup, LM lm) {
        C7202vV1 c7202vV1;
        if (lm instanceof C7202vV1) {
            c7202vV1 = (C7202vV1) lm;
            int i = c7202vV1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7202vV1.h = i - Integer.MIN_VALUE;
            } else {
                c7202vV1 = new C7202vV1(this, lm);
            }
        } else {
            c7202vV1 = new C7202vV1(this, lm);
        }
        Object obj = c7202vV1.e;
        MN mn = MN.d;
        int i2 = c7202vV1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            int id = viewGroup.getId();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            c7202vV1.d = viewGroup;
            c7202vV1.h = 1;
            if (this.k.b(id, childFragmentManager, c7202vV1) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewGroup = c7202vV1.d;
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
        C5316mW1.c cVar = ((C5316mW1) obj).k;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7833yV1(viewLifecycleOwner, cVar, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On1 = ((C5316mW1) obj2).i;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C7623xV1(viewLifecycleOwner2, c1699On1, null, this), 3);
        C7652xe.f(this).c(new b(null));
    }
}

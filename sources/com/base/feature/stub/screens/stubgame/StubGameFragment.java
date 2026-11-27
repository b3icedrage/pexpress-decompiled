package com.base.feature.stub.screens.stubgame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.base.feature.stub.usecases.StubGameLineChart;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2405Xf;
import defpackage.C2724aT1;
import defpackage.C2784ak0;
import defpackage.C2948bT1;
import defpackage.C3099cA0;
import defpackage.C3157cT1;
import defpackage.C3238cq0;
import defpackage.C3286d41;
import defpackage.C3367dT1;
import defpackage.C3476e;
import defpackage.C3576eT1;
import defpackage.C4416iT1;
import defpackage.C4797k3;
import defpackage.C5189lv;
import defpackage.C5653o60;
import defpackage.C7034uh0;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC7172vL1;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.O81;
import defpackage.R40;
import defpackage.Sd2;
import defpackage.TS1;
import defpackage.ViewOnClickListenerC3055bz0;
import defpackage.ViewOnClickListenerC6713t9;
import defpackage.XO0;
import defpackage.Y5;
import defpackage.YS1;
import defpackage.ZS1;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/stub/screens/stubgame/StubGameFragment;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LiT1;", "LeT1;", "FeatureStubBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StubGameFragment extends SimpleFragmentInflate<C4416iT1, C3576eT1> {
    public static final long p;
    public static final /* synthetic */ int q = 0;

    @NotNull
    public final Sd2 l;

    @NotNull
    public final C3099cA0 m;

    @NotNull
    public final InterfaceC7172vL1 n;

    @NotNull
    public final a o;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3576eT1> {
        public static final a m = new a(3, C3576eT1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/stub/databinding/StubGameFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3576eT1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.stub_game_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.stub_game_asset_text;
            if (((TextView) C3476e.h(viewInflate, R.id.stub_game_asset_text)) != null) {
                i = R.id.stub_game_balance_text;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.stub_game_balance_text);
                if (textView != null) {
                    i = R.id.stub_game_bet_down_button;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.stub_game_bet_down_button);
                    if (materialButton != null) {
                        i = R.id.stub_game_bet_up_button;
                        MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.stub_game_bet_up_button);
                        if (materialButton2 != null) {
                            i = R.id.stub_game_chart;
                            StubGameLineChart stubGameLineChart = (StubGameLineChart) C3476e.h(viewInflate, R.id.stub_game_chart);
                            if (stubGameLineChart != null) {
                                i = R.id.stub_game_snackbar_anchor;
                                FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.stub_game_snackbar_anchor);
                                if (frameLayout != null) {
                                    return new C3576eT1((ConstraintLayout) viewInflate, textView, materialButton, materialButton2, stubGameLineChart, frameLayout);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment$setup$1", f = "StubGameFragment.kt", l = {39}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return StubGameFragment.this.new b(jm);
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
                if (StubGameFragment.m(StubGameFragment.this, this) == mn) {
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

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        p = c.g(100, R40.MILLISECONDS);
    }

    public StubGameFragment(@NotNull Sd2 viewModelFactory, @NotNull C3099cA0 initStubGameLineChartUseCase, @NotNull InterfaceC7172vL1 showStubSnackbarUseCase) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(initStubGameLineChartUseCase, "initStubGameLineChartUseCase");
        Intrinsics.checkNotNullParameter(showStubSnackbarUseCase, "showStubSnackbarUseCase");
        this.l = viewModelFactory;
        this.m = initStubGameLineChartUseCase;
        this.n = showStubSnackbarUseCase;
        this.o = a.m;
    }

    public static final String l(StubGameFragment stubGameFragment, float f) {
        stubGameFragment.getClass();
        return "Đ" + f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object m(StubGameFragment stubGameFragment, LM lm) {
        C3157cT1 c3157cT1;
        C3576eT1 c3576eT1;
        StubGameFragment stubGameFragment2;
        C3099cA0 c3099cA0;
        stubGameFragment.getClass();
        if (lm instanceof C3157cT1) {
            c3157cT1 = (C3157cT1) lm;
            int i = c3157cT1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3157cT1.j = i - Integer.MIN_VALUE;
            } else {
                c3157cT1 = new C3157cT1(stubGameFragment, lm);
            }
        } else {
            c3157cT1 = new C3157cT1(stubGameFragment, lm);
        }
        Object obj = c3157cT1.h;
        MN mn = MN.d;
        int i2 = c3157cT1.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C3576eT1 c3576eT2 = (C3576eT1) stubGameFragment.k();
            StubGameLineChart stubGameChart = c3576eT2.i;
            Intrinsics.checkNotNullExpressionValue(stubGameChart, "stubGameChart");
            C3099cA0 c3099cA1 = stubGameFragment.m;
            c3099cA1.a(stubGameChart);
            Object obj2 = stubGameFragment.i;
            Intrinsics.checkNotNull(obj2);
            c3157cT1.d = stubGameFragment;
            c3157cT1.e = c3576eT2;
            c3157cT1.g = c3099cA1;
            c3157cT1.j = 1;
            Serializable serializableL = ((C4416iT1) obj2).l(c3157cT1);
            if (serializableL == mn) {
                return mn;
            }
            c3576eT1 = c3576eT2;
            obj = serializableL;
            stubGameFragment2 = stubGameFragment;
            c3099cA0 = c3099cA1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3099cA0 = c3157cT1.g;
            c3576eT1 = c3157cT1.e;
            stubGameFragment2 = c3157cT1.d;
            C1795Pt1.b(obj);
        }
        c3099cA0.c((List) obj, C5653o60.d);
        StubGameLineChart stubGameChart2 = c3576eT1.i;
        Intrinsics.checkNotNullExpressionValue(stubGameChart2, "stubGameChart");
        stubGameFragment2.getClass();
        stubGameChart2.s(new C4797k3(stubGameFragment2, 9), new O81(0, stubGameFragment2.k(), C3576eT1.class, "getRoot", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0, 1));
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C5189lv.k(C7652xe.f(this), null, new b(null), 3);
        C5189lv.k(C3286d41.a, null, new C3367dT1(this, null), 3);
        C3576eT1 c3576eT1 = (C3576eT1) k();
        c3576eT1.h.setOnClickListener(new ViewOnClickListenerC6713t9(this, 7));
        c3576eT1.g.setOnClickListener(new ViewOnClickListenerC3055bz0(this, 3));
        C3576eT1 c3576eT2 = (C3576eT1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<Float> interfaceC6396rf0 = ((C4416iT1) obj).j;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new ZS1(viewLifecycleOwner, interfaceC6396rf0, null, this, c3576eT2), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<TS1> interfaceC6396rf1 = ((C4416iT1) obj2).k;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C2724aT1(viewLifecycleOwner2, interfaceC6396rf1, null, this, c3576eT2), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        FP1<Boolean> fp1 = ((C4416iT1) obj3).l;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C2948bT1(viewLifecycleOwner3, fp1, null, c3576eT2), 3);
        FrameLayout stubGameSnackbarAnchor = ((C3576eT1) k()).j;
        Intrinsics.checkNotNullExpressionValue(stubGameSnackbarAnchor, "stubGameSnackbarAnchor");
        this.n.c(stubGameSnackbarAnchor);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C2405Xf c2405Xf = new C2405Xf(this, 8);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7034uh0(new C3238cq0(this, 8), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C4416iT1.class), new Y5(interfaceC3770fO0A, 4), new YS1(interfaceC3770fO0A), c2405Xf);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3576eT1> g() {
        return this.o;
    }
}

package com.base.feature.activation.screens.big_stories;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C0615Ar;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4082gs;
import defpackage.C4797k3;
import defpackage.C5189lv;
import defpackage.C5220m3;
import defpackage.C5430n3;
import defpackage.C6333rM;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.N5;
import defpackage.O5;
import defpackage.Q5;
import defpackage.R5;
import defpackage.S5;
import defpackage.Sd2;
import defpackage.XO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/big_stories/ActivationBigStoriesFragment;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LS5;", "LQ5;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivationBigStoriesFragment extends SimpleFragmentInflate<S5, Q5> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, Q5> {
        public static final a m = new a(3, Q5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/activation/databinding/ActivationBigStoriesPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final Q5 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.activation_big_stories_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.activation_big_stories_recycler);
            if (recyclerView != null) {
                return new Q5((FrameLayout) viewInflate, recyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.activation_big_stories_recycler)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment$setup$$inlined$launchAndCollectIn$default$1", f = "ActivationBigStoriesFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ C4082gs h;

        @InterfaceC3368dU(c = "com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment$setup$$inlined$launchAndCollectIn$default$1$1", f = "ActivationBigStoriesFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ C4082gs h;

            /* JADX INFO: renamed from: com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0274a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ C4082gs e;

                public C0274a(KN kn, C4082gs c4082gs) {
                    this.e = c4082gs;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.p((List) obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C4082gs c4082gs) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = c4082gs;
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
                    C0274a c0274a = new C0274a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0274a, this) == mn) {
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
        public b(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, C4082gs c4082gs) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = c4082gs;
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

    public /* synthetic */ class c extends C2784ak0 implements Function1<C0615Ar, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C0615Ar c0615Ar) {
            C0615Ar item = c0615Ar;
            Intrinsics.checkNotNullParameter(item, "p0");
            S5 s5 = (S5) this.e;
            s5.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            C5189lv.k(C8056za.j(s5), null, new R5(s5, item, null), 3);
            return Unit.a;
        }
    }

    public ActivationBigStoriesFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C4082gs c4082gs = new C4082gs(new c(1, obj, S5.class, "onItemClick", "onItemClick(Lcom/api/feature/stories/models/BenefitsCardModel;)V", 0));
        ((Q5) k()).e.setAdapter(c4082gs);
        Q5 q5 = (Q5) k();
        q qVar = new q(requireContext(), 0);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Drawable drawable = C6333rM.getDrawable(requireContext(), R.drawable.big_stories_divider);
        Intrinsics.checkNotNull(drawable);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        qVar.a = drawable;
        q5.e.g(qVar);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<List<C0615Ar>> interfaceC6396rf0 = ((S5) obj2).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, interfaceC6396rf0, null, c4082gs), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4797k3 c4797k3 = new C4797k3(this, 1);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C5220m3(new N5(this, 0), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(S5.class), new C5430n3(interfaceC3770fO0A, 1), new O5(interfaceC3770fO0A), c4797k3);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, Q5> g() {
        return this.m;
    }
}

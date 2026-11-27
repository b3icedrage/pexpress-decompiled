package com.base.feature.activation.screens.top_steps;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C5508nQ1;
import defpackage.C5928pQ1;
import defpackage.C6333rM;
import defpackage.C6680t02;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.EnumC4403iP0;
import defpackage.F6;
import defpackage.FP0;
import defpackage.G6;
import defpackage.H6;
import defpackage.I6;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.J6;
import defpackage.JM;
import defpackage.KN;
import defpackage.L6;
import defpackage.M6;
import defpackage.MN;
import defpackage.Sd2;
import defpackage.WE;
import defpackage.XO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/top_steps/ActivationTopStepsFragment;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LM6;", "LL6;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivationTopStepsFragment extends SimpleFragmentInflate<M6, L6> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, L6> {
        public static final a m = new a(3, L6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/activation/databinding/ActivationTopStepsPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final L6 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.activation_top_steps_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.activation_top_steps_first_circle;
            View viewH = C3476e.h(viewInflate, R.id.activation_top_steps_first_circle);
            if (viewH != null) {
                C5928pQ1 c5928pQ1B = C5928pQ1.b(viewH);
                i = R.id.activation_top_steps_first_to_second_progress;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.activation_top_steps_first_to_second_progress);
                if (imageView != null) {
                    i = R.id.activation_top_steps_second_circle;
                    View viewH2 = C3476e.h(viewInflate, R.id.activation_top_steps_second_circle);
                    if (viewH2 != null) {
                        C5928pQ1 c5928pQ1B2 = C5928pQ1.b(viewH2);
                        i = R.id.activation_top_steps_second_to_third_progress;
                        ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.activation_top_steps_second_to_third_progress);
                        if (imageView2 != null) {
                            i = R.id.activation_top_steps_third_circle;
                            View viewH3 = C3476e.h(viewInflate, R.id.activation_top_steps_third_circle);
                            if (viewH3 != null) {
                                return new L6((ConstraintLayout) viewInflate, c5928pQ1B, imageView, c5928pQ1B2, imageView2, C5928pQ1.b(viewH3));
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$setup$$inlined$launchAndCollectIn$default$1", f = "ActivationTopStepsFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ ActivationTopStepsFragment h;

        @InterfaceC3368dU(c = "com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$setup$$inlined$launchAndCollectIn$default$1$1", f = "ActivationTopStepsFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ ActivationTopStepsFragment h;

            /* JADX INFO: renamed from: com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0276a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ ActivationTopStepsFragment e;

                public C0276a(KN kn, ActivationTopStepsFragment activationTopStepsFragment) {
                    this.e = activationTopStepsFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    ColorStateList colorStateList;
                    ActivationTopStepsFragment activationTopStepsFragment = this.e;
                    for (Pair pair : CollectionsKt.j0((List) obj, CollectionsKt.i0(WE.f(((L6) activationTopStepsFragment.k()).e, ((L6) activationTopStepsFragment.k()).h, ((L6) activationTopStepsFragment.k()).j)))) {
                        C6680t02 c6680t02 = (C6680t02) pair.d;
                        IndexedValue indexedValue = (IndexedValue) pair.e;
                        ((C5928pQ1) indexedValue.b).h.setText(activationTopStepsFragment.getString(c6680t02.c));
                        T t = indexedValue.b;
                        C5928pQ1 c5928pQ1 = (C5928pQ1) t;
                        c5928pQ1.i.setText(String.valueOf(indexedValue.a + 1));
                        Intrinsics.checkNotNullExpressionValue(t, "<get-value>(...)");
                        ImageView activationTopStepsInnerCircle = c5928pQ1.e;
                        Intrinsics.checkNotNullExpressionValue(activationTopStepsInnerCircle, "activationTopStepsInnerCircle");
                        C3435dm0.d(activationTopStepsInnerCircle, c6680t02.d);
                        TextView activationTopStepsStepNumber = c5928pQ1.i;
                        Intrinsics.checkNotNullExpressionValue(activationTopStepsStepNumber, "activationTopStepsStepNumber");
                        int i = 8;
                        activationTopStepsStepNumber.setVisibility(c6680t02.b ? 0 : 8);
                        Integer num = c6680t02.e;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Intrinsics.checkNotNullParameter(activationTopStepsFragment, "<this>");
                            colorStateList = C6333rM.getColorStateList(activationTopStepsFragment.requireContext(), iIntValue);
                        } else {
                            colorStateList = null;
                        }
                        c5928pQ1.e.setImageTintList(colorStateList);
                        ImageView activationTopStepsMiddleCircle = c5928pQ1.g;
                        Intrinsics.checkNotNullExpressionValue(activationTopStepsMiddleCircle, "activationTopStepsMiddleCircle");
                        if (c6680t02.f) {
                            i = 0;
                        }
                        activationTopStepsMiddleCircle.setVisibility(i);
                        int i2 = c6680t02.g;
                        activationTopStepsStepNumber.setTextColor(C8056za.i(activationTopStepsFragment, i2));
                        c5928pQ1.h.setTextColor(C8056za.i(activationTopStepsFragment, i2));
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationTopStepsFragment activationTopStepsFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = activationTopStepsFragment;
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
                    C0276a c0276a = new C0276a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0276a, this) == mn) {
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
        public b(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationTopStepsFragment activationTopStepsFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = activationTopStepsFragment;
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

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$setup$$inlined$launchAndCollectIn$default$2", f = "ActivationTopStepsFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ ActivationTopStepsFragment h;

        @InterfaceC3368dU(c = "com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$setup$$inlined$launchAndCollectIn$default$2$1", f = "ActivationTopStepsFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ ActivationTopStepsFragment h;

            /* JADX INFO: renamed from: com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment$c$a$a, reason: collision with other inner class name */
            public static final class C0277a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ ActivationTopStepsFragment e;

                public C0277a(KN kn, ActivationTopStepsFragment activationTopStepsFragment) {
                    this.e = activationTopStepsFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        ActivationTopStepsFragment activationTopStepsFragment = this.e;
                        L6 l6 = (L6) activationTopStepsFragment.k();
                        int i = ((C5508nQ1) list.get(0)).a;
                        Intrinsics.checkNotNullParameter(activationTopStepsFragment, "<this>");
                        l6.g.setImageTintList(C6333rM.getColorStateList(activationTopStepsFragment.requireContext(), i));
                        L6 l7 = (L6) activationTopStepsFragment.k();
                        int i2 = ((C5508nQ1) list.get(1)).a;
                        Intrinsics.checkNotNullParameter(activationTopStepsFragment, "<this>");
                        l7.i.setImageTintList(C6333rM.getColorStateList(activationTopStepsFragment.requireContext(), i2));
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationTopStepsFragment activationTopStepsFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = activationTopStepsFragment;
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
                    C0277a c0277a = new C0277a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0277a, this) == mn) {
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
        public c(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationTopStepsFragment activationTopStepsFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = activationTopStepsFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
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

    public ActivationTopStepsFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    @SuppressLint({"SetTextI18n"})
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<List<C6680t02>> interfaceC6396rf0 = ((M6) obj).d;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<List<C5508nQ1>> interfaceC6396rf1 = ((M6) obj2).e;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new c(viewLifecycleOwner2, interfaceC6396rf1, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        F6 f6 = new F6(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new H6(new G6(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(M6.class), new I6(interfaceC3770fO0A, 0), new J6(interfaceC3770fO0A), f6);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, L6> g() {
        return this.m;
    }
}

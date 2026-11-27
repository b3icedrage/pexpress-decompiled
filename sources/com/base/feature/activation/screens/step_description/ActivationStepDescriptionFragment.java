package com.base.feature.activation.screens.step_description;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.A2;
import defpackage.A6;
import defpackage.AM;
import defpackage.AW1;
import defpackage.B6;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C7121v6;
import defpackage.C7331w6;
import defpackage.C7542x6;
import defpackage.C7652xe;
import defpackage.C7752y6;
import defpackage.DY;
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
import defpackage.Sd2;
import defpackage.XE;
import defpackage.XO0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/step_description/ActivationStepDescriptionFragment;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LB6;", "LA6;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivationStepDescriptionFragment extends SimpleFragmentInflate<B6, A6> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, A6> {
        public static final a m = new a(3, A6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/activation/databinding/ActivationStepDescriptionPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final A6 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.activation_step_description_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.activation_step_description_description;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.activation_step_description_description);
            if (textView != null) {
                i = R.id.activation_step_description_illustration;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.activation_step_description_illustration);
                if (imageView != null) {
                    i = R.id.activation_step_description_title;
                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.activation_step_description_title);
                    if (textView2 != null) {
                        return new A6((LinearLayout) viewInflate, textView, imageView, textView2);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment$setup$$inlined$launchAndCollectIn$default$1", f = "ActivationStepDescriptionFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ ActivationStepDescriptionFragment h;

        @InterfaceC3368dU(c = "com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment$setup$$inlined$launchAndCollectIn$default$1$1", f = "ActivationStepDescriptionFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ ActivationStepDescriptionFragment h;

            /* JADX INFO: renamed from: com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0275a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ ActivationStepDescriptionFragment e;

                public C0275a(KN kn, ActivationStepDescriptionFragment activationStepDescriptionFragment) {
                    this.e = activationStepDescriptionFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    DY dy = (DY) obj;
                    ActivationStepDescriptionFragment activationStepDescriptionFragment = this.e;
                    ImageView activationStepDescriptionIllustration = ((A6) activationStepDescriptionFragment.k()).g;
                    Intrinsics.checkNotNullExpressionValue(activationStepDescriptionIllustration, "activationStepDescriptionIllustration");
                    C3435dm0.f(activationStepDescriptionIllustration, dy.a);
                    A6 a6 = (A6) activationStepDescriptionFragment.k();
                    Context contextRequireContext = activationStepDescriptionFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    List<Object> list = dy.c;
                    if (list == null || !list.isEmpty()) {
                        for (T t : list) {
                            if (!(t instanceof Integer) && !(t instanceof String)) {
                                throw new IllegalStateException("source should contain only elements of type Int or String.");
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList(XE.m(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AM.a(contextRequireContext, it.next()));
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    a6.h.setText(activationStepDescriptionFragment.getString(dy.b, Arrays.copyOf(strArr, strArr.length)));
                    A6 a7 = (A6) activationStepDescriptionFragment.k();
                    Context contextRequireContext2 = activationStepDescriptionFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    List<Object> list2 = dy.e;
                    if (list2 == null || !list2.isEmpty()) {
                        for (T t2 : list2) {
                            if (!(t2 instanceof Integer) && !(t2 instanceof String)) {
                                throw new IllegalStateException("source should contain only elements of type Int or String.");
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(XE.m(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(AM.a(contextRequireContext2, it2.next()));
                    }
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                    a7.e.setText(activationStepDescriptionFragment.getString(dy.d, Arrays.copyOf(strArr2, strArr2.length)));
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationStepDescriptionFragment activationStepDescriptionFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = activationStepDescriptionFragment;
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
                    C0275a c0275a = new C0275a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0275a, this) == mn) {
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
        public b(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivationStepDescriptionFragment activationStepDescriptionFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = activationStepDescriptionFragment;
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

    public ActivationStepDescriptionFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<DY> interfaceC6396rf0 = ((B6) obj).d;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C7121v6 c7121v6 = new C7121v6(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7542x6(new C7331w6(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(B6.class), new A2(interfaceC3770fO0A, 1), new C7752y6(interfaceC3770fO0A), c7121v6);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, A6> g() {
        return this.m;
    }
}

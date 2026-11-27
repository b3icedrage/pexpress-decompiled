package com.base.feature.robot.robot.common_action;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.Ad2;
import defpackage.C0788Cw1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C1811Pz;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2405Xf;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C4466ii;
import defpackage.C4733jk;
import defpackage.C5189lv;
import defpackage.C5220m3;
import defpackage.C5345me2;
import defpackage.C5430n3;
import defpackage.C5640o3;
import defpackage.C6103qF;
import defpackage.C6663sv1;
import defpackage.C6873tv1;
import defpackage.C7293vv1;
import defpackage.C7644xc;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.IW;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.Sd2;
import defpackage.XO0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/common_action/RobotCommonActionPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lvv1;", "LCw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotCommonActionPart extends SimpleFragmentInflate<C7293vv1, C0788Cw1> {

    @NotNull
    public final Sd2 l;

    @Nullable
    public Toast m;

    @NotNull
    public final a n;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0788Cw1> {
        public static final a m = new a(3, C0788Cw1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentCommonActionBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C0788Cw1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_common_action, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.common_action_button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.common_action_button);
            if (materialButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.trading_loading);
                if (spinKitView != null) {
                    return new C0788Cw1(constraintLayout, materialButton, spinKitView);
                }
                i = R.id.trading_loading;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ C6103qF e;

        public b(C6103qF c6103qF) {
            this.e = c6103qF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object obj = RobotCommonActionPart.this.i;
            Intrinsics.checkNotNull(obj);
            ((C7293vv1) obj).m(this.e.c);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectIn$default$1", f = "RobotCommonActionPart.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C0788Cw1 h;
        public final /* synthetic */ RobotCommonActionPart i;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectIn$default$1$1", f = "RobotCommonActionPart.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ FP1 g;
            public final /* synthetic */ C0788Cw1 h;
            public final /* synthetic */ RobotCommonActionPart i;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common_action.RobotCommonActionPart$c$a$a, reason: collision with other inner class name */
            public static final class C0293a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ C0788Cw1 e;
                public final /* synthetic */ RobotCommonActionPart g;

                public C0293a(KN kn, C0788Cw1 c0788Cw1, RobotCommonActionPart robotCommonActionPart) {
                    this.e = c0788Cw1;
                    this.g = robotCommonActionPart;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    int iIntValue;
                    C6103qF c6103qF = (C6103qF) obj;
                    boolean z = c6103qF.a;
                    MaterialButton materialButton = this.e.e;
                    RobotCommonActionPart robotCommonActionPart = this.g;
                    if (z) {
                        materialButton.setOnClickListener(robotCommonActionPart.new b(c6103qF));
                    }
                    boolean z2 = c6103qF.b;
                    String string = z2 ? null : robotCommonActionPart.getString(R.string.loading_third_step);
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    new Ad2(R.id.tag_state_description, CharSequence.class, 64, 30).c(materialButton, string);
                    materialButton.setActivated(c6103qF.c);
                    materialButton.setClickable(c6103qF.a);
                    Integer num = c6103qF.d;
                    String string2 = num != null ? robotCommonActionPart.getString(num.intValue()) : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    materialButton.setText(string2);
                    if (z2) {
                        Integer num2 = c6103qF.e;
                        iIntValue = num2 != null ? num2.intValue() : R.color.primary;
                    } else {
                        iIntValue = R.color.altSurface;
                    }
                    robotCommonActionPart.getClass();
                    materialButton.setBackgroundColor(C8056za.i(robotCommonActionPart, iIntValue));
                    materialButton.setStrokeColorResource(iIntValue);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FP1 fp1, JM jm, C0788Cw1 c0788Cw1, RobotCommonActionPart robotCommonActionPart) {
                super(2, jm);
                this.g = fp1;
                this.h = c0788Cw1;
                this.i = robotCommonActionPart;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h, this.i);
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
                    C0293a c0293a = new C0293a((KN) this.e, this.h, this.i);
                    this.d = 1;
                    if (this.g.c(c0293a, this) == mn) {
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
        public c(FP0 fp0, FP1 fp1, JM jm, C0788Cw1 c0788Cw1, RobotCommonActionPart robotCommonActionPart) {
            super(2, jm);
            this.e = fp0;
            this.g = fp1;
            this.h = c0788Cw1;
            this.i = robotCommonActionPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, jm, this.h, this.i);
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
                a aVar = new a(this.g, null, this.h, this.i);
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectIn$default$2", f = "RobotCommonActionPart.kt", l = {48}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1811Pz g;
        public final /* synthetic */ RobotCommonActionPart h;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectIn$default$2$1", f = "RobotCommonActionPart.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1811Pz g;
            public final /* synthetic */ RobotCommonActionPart h;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common_action.RobotCommonActionPart$d$a$a, reason: collision with other inner class name */
            public static final class C0294a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ RobotCommonActionPart e;

                public C0294a(KN kn, RobotCommonActionPart robotCommonActionPart) {
                    this.e = robotCommonActionPart;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    RobotCommonActionPart robotCommonActionPart = this.e;
                    Toast toast = robotCommonActionPart.m;
                    if (toast != null) {
                        toast.cancel();
                    }
                    Toast toastMakeText = Toast.makeText(robotCommonActionPart.requireContext().getApplicationContext(), R.string.loading_third_step, 0);
                    toastMakeText.show();
                    robotCommonActionPart.m = toastMakeText;
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1811Pz c1811Pz, JM jm, RobotCommonActionPart robotCommonActionPart) {
                super(2, jm);
                this.g = c1811Pz;
                this.h = robotCommonActionPart;
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
                    C0294a c0294a = new C0294a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0294a, this) == mn) {
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
        public d(FP0 fp0, C1811Pz c1811Pz, JM jm, RobotCommonActionPart robotCommonActionPart) {
            super(2, jm);
            this.e = fp0;
            this.g = c1811Pz;
            this.h = robotCommonActionPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new d(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectLatestIn$1", f = "RobotCommonActionPart.kt", l = {81}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C4733jk g;
        public final /* synthetic */ RobotCommonActionPart h;
        public final /* synthetic */ C0788Cw1 i;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectLatestIn$1$1", f = "RobotCommonActionPart.kt", l = {82}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C4733jk g;
            public final /* synthetic */ RobotCommonActionPart h;
            public final /* synthetic */ C0788Cw1 i;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common_action.RobotCommonActionPart$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionPart$setup$lambda$6$$inlined$launchAndCollectLatestIn$1$1$1", f = "RobotCommonActionPart.kt", l = {85}, m = "invokeSuspend")
            public static final class C0295a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
                public int d;
                public /* synthetic */ Object e;
                public final /* synthetic */ KN g;
                public final /* synthetic */ RobotCommonActionPart h;
                public final /* synthetic */ C0788Cw1 i;
                public boolean j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0295a(KN kn, JM jm, RobotCommonActionPart robotCommonActionPart, C0788Cw1 c0788Cw1) {
                    super(2, jm);
                    this.h = robotCommonActionPart;
                    this.i = c0788Cw1;
                    this.g = kn;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    C0295a c0295a = new C0295a(this.g, jm, this.h, this.i);
                    c0295a.e = obj;
                    return c0295a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, JM<? super Unit> jm) {
                    return ((C0295a) create(bool, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    boolean z;
                    MN mn = MN.d;
                    int i = this.d;
                    RobotCommonActionPart robotCommonActionPart = this.h;
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        boolean zBooleanValue = ((Boolean) this.e).booleanValue();
                        this.j = zBooleanValue;
                        this.d = 1;
                        if (RobotCommonActionPart.l(robotCommonActionPart, zBooleanValue, this) == mn) {
                            return mn;
                        }
                        z = zBooleanValue;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = this.j;
                        C1795Pt1.b(obj);
                    }
                    SpinKitView tradingLoading = this.i.g;
                    Intrinsics.checkNotNullExpressionValue(tradingLoading, "tradingLoading");
                    tradingLoading.setVisibility(z ? 0 : 8);
                    View viewFindViewById = robotCommonActionPart.requireActivity().findViewById(R.id.lock_click_view);
                    Intrinsics.checkNotNull(viewFindViewById);
                    viewFindViewById.setVisibility(z ? 0 : 8);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4733jk c4733jk, JM jm, RobotCommonActionPart robotCommonActionPart, C0788Cw1 c0788Cw1) {
                super(2, jm);
                this.g = c4733jk;
                this.h = robotCommonActionPart;
                this.i = c0788Cw1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h, this.i);
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
                    C0295a c0295a = new C0295a((KN) this.e, null, this.h, this.i);
                    this.d = 1;
                    if (C4466ii.j(this.g, c0295a, this) == mn) {
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
        public e(FP0 fp0, C4733jk c4733jk, JM jm, RobotCommonActionPart robotCommonActionPart, C0788Cw1 c0788Cw1) {
            super(2, jm);
            this.e = fp0;
            this.g = c4733jk;
            this.h = robotCommonActionPart;
            this.i = c0788Cw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new e(this.e, this.g, jm, this.h, this.i);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h, this.i);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

    public RobotCommonActionPart(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.n = a.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object l(RobotCommonActionPart robotCommonActionPart, boolean z, LM lm) {
        C6873tv1 c6873tv1;
        robotCommonActionPart.getClass();
        if (lm instanceof C6873tv1) {
            c6873tv1 = (C6873tv1) lm;
            int i = c6873tv1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6873tv1.h = i - Integer.MIN_VALUE;
            } else {
                c6873tv1 = new C6873tv1(robotCommonActionPart, lm);
            }
        } else {
            c6873tv1 = new C6873tv1(robotCommonActionPart, lm);
        }
        Object obj = c6873tv1.e;
        MN mn = MN.d;
        int i2 = c6873tv1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (!z) {
                Resources resources = robotCommonActionPart.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                long jI = C7644xc.i(resources);
                c6873tv1.d = robotCommonActionPart;
                c6873tv1.h = 1;
                if (IW.c(jI, c6873tv1) == mn) {
                    return mn;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        robotCommonActionPart = c6873tv1.d;
        C1795Pt1.b(obj);
        Object obj2 = robotCommonActionPart.i;
        Intrinsics.checkNotNull(obj2);
        C7293vv1 c7293vv1 = (C7293vv1) obj2;
        if (((Boolean) c7293vv1.d.B.d.getValue()).booleanValue()) {
            c7293vv1.g.c();
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        C0788Cw1 c0788Cw1 = (C0788Cw1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C7293vv1) obj).q;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new c(viewLifecycleOwner, c1699On1, null, c0788Cw1, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1811Pz c1811Pz = ((C7293vv1) obj2).u;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new d(viewLifecycleOwner2, c1811Pz, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C4733jk c4733jk = ((C7293vv1) obj3).n;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new e(viewLifecycleOwner3, c4733jk, null, this, c0788Cw1), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C2405Xf c2405Xf = new C2405Xf(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C5430n3(new C5220m3(this, 3), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7293vv1.class), new C5640o3(interfaceC3770fO0A, 1), new C6663sv1(interfaceC3770fO0A), c2405Xf);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0788Cw1> g() {
        return this.n;
    }
}

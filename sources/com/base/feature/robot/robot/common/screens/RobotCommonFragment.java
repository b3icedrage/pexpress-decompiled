package com.base.feature.robot.robot.common.screens;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.core.ViewModelFragment;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C0629Av1;
import defpackage.C0941Ev1;
import defpackage.C0951Ez;
import defpackage.C1486Lv1;
import defpackage.C1621Nn1;
import defpackage.C1645Nv1;
import defpackage.C1795Pt1;
import defpackage.C1879Qv1;
import defpackage.C2017Sp1;
import defpackage.C2038Sw1;
import defpackage.C2151Ui0;
import defpackage.C2566Zg1;
import defpackage.C2700aL1;
import defpackage.C3;
import defpackage.C3048bw1;
import defpackage.C3133cL1;
import defpackage.C3286d41;
import defpackage.C3387da0;
import defpackage.C3435dm0;
import defpackage.C3552eL1;
import defpackage.C4629jE1;
import defpackage.C4839kE1;
import defpackage.C5070lL1;
import defpackage.C5189lv;
import defpackage.C5283mL1;
import defpackage.C5493nL1;
import defpackage.C6025ps1;
import defpackage.C6123qL1;
import defpackage.C6332rL1;
import defpackage.C6489s51;
import defpackage.C6962uL1;
import defpackage.C7652xe;
import defpackage.C7803yL1;
import defpackage.C8056za;
import defpackage.CF0;
import defpackage.EK;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7035uh1;
import defpackage.FP0;
import defpackage.GP1;
import defpackage.InterfaceC2188Uu1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC3902g10;
import defpackage.InterfaceC3907g21;
import defpackage.InterfaceC5529nX1;
import defpackage.InterfaceC5910pK1;
import defpackage.InterfaceC6606sf0;
import defpackage.InterfaceC6672sy1;
import defpackage.InterfaceC6856tq;
import defpackage.JM;
import defpackage.KN;
import defpackage.KW1;
import defpackage.MN;
import defpackage.N4;
import defpackage.R40;
import defpackage.S4;
import defpackage.Sd2;
import defpackage.ViewOnScrollChangeListenerC4371iE1;
import defpackage.W00;
import defpackage.XO0;
import defpackage.YK1;
import defpackage.ZK1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/robot/robot/common/screens/RobotCommonFragment;", "Lcom/api/core/ViewModelFragment;", "LLv1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotCommonFragment extends ViewModelFragment<C1486Lv1> {
    public static final long q;
    public static final /* synthetic */ int r = 0;

    @NotNull
    public final Sd2 j;

    @NotNull
    public final InterfaceC6672sy1 k;

    @NotNull
    public final C0629Av1 l;

    @NotNull
    public final InterfaceC3902g10 m;

    @NotNull
    public final C3048bw1 n;

    @NotNull
    public final C2038Sw1 o;

    @NotNull
    public final C4839kE1 p;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$1", f = "RobotCommonFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1486Lv1.e g;
        public final /* synthetic */ RobotCommonFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.robot.common.screens.RobotCommonFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$1$1", f = "RobotCommonFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0288a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1486Lv1.e g;
            public final /* synthetic */ RobotCommonFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common.screens.RobotCommonFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0289a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ RobotCommonFragment e;

                public C0289a(KN kn, RobotCommonFragment robotCommonFragment) {
                    this.e = robotCommonFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    ((Boolean) obj).getClass();
                    NestedScrollView nestedScrollViewR = this.e.l.r();
                    Intrinsics.checkNotNullParameter(nestedScrollViewR, "<this>");
                    nestedScrollViewR.u(0 - nestedScrollViewR.getScrollX(), 0 - nestedScrollViewR.getScrollY(), 250, false);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0288a(C1486Lv1.e eVar, JM jm, RobotCommonFragment robotCommonFragment) {
                super(2, jm);
                this.g = eVar;
                this.h = robotCommonFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0288a c0288a = new C0288a(this.g, jm, this.h);
                c0288a.e = obj;
                return c0288a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0288a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0289a c0289a = new C0289a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0289a, this) == mn) {
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
        public a(FP0 fp0, C1486Lv1.e eVar, JM jm, RobotCommonFragment robotCommonFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = eVar;
            this.h = robotCommonFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, this.g, jm, this.h);
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
                C0288a c0288a = new C0288a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, c0288a, this) == mn) {
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$2", f = "RobotCommonFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC3907g21 g;
        public final /* synthetic */ RobotCommonFragment h;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$2$1", f = "RobotCommonFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC3907g21 g;
            public final /* synthetic */ RobotCommonFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common.screens.RobotCommonFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0290a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ RobotCommonFragment e;

                public C0290a(KN kn, RobotCommonFragment robotCommonFragment) {
                    this.e = robotCommonFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    C0629Av1 c0629Av1 = this.e.l;
                    if (zBooleanValue) {
                        NestedScrollView nestedScrollViewR = c0629Av1.r();
                        nestedScrollViewR.setPadding(nestedScrollViewR.getPaddingLeft(), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, nestedScrollViewR.getPaddingRight(), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                        c0629Av1.r().scrollBy(0, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                    } else {
                        NestedScrollView nestedScrollViewR2 = c0629Av1.r();
                        nestedScrollViewR2.setPadding(nestedScrollViewR2.getPaddingLeft(), 0, nestedScrollViewR2.getPaddingRight(), 0);
                        NestedScrollView nestedScrollViewR3 = c0629Av1.r();
                        nestedScrollViewR3.u(0 - nestedScrollViewR3.getScrollX(), 0 - nestedScrollViewR3.getScrollY(), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, false);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3907g21 interfaceC3907g21, JM jm, RobotCommonFragment robotCommonFragment) {
                super(2, jm);
                this.g = interfaceC3907g21;
                this.h = robotCommonFragment;
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
                    C0290a c0290a = new C0290a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0290a, this) == mn) {
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
        public b(FP0 fp0, InterfaceC3907g21 interfaceC3907g21, JM jm, RobotCommonFragment robotCommonFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC3907g21;
            this.h = robotCommonFragment;
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$3", f = "RobotCommonFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ RobotCommonFragment h;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$$inlined$launchAndCollectIn$3$1", f = "RobotCommonFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ RobotCommonFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common.screens.RobotCommonFragment$c$a$a, reason: collision with other inner class name */
            public static final class C0291a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ RobotCommonFragment e;

                public C0291a(KN kn, RobotCommonFragment robotCommonFragment) {
                    this.e = robotCommonFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    Object obj2 = this.e.i;
                    Intrinsics.checkNotNull(obj2);
                    C1486Lv1 c1486Lv1 = (C1486Lv1) obj2;
                    c1486Lv1.getClass();
                    C5189lv.k(C8056za.j(c1486Lv1), null, new C1879Qv1(c1486Lv1, null), 3);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotCommonFragment robotCommonFragment) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = robotCommonFragment;
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
                    C0291a c0291a = new C0291a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0291a, this) == mn) {
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
        public c(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotCommonFragment robotCommonFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = robotCommonFragment;
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$1$1", f = "RobotCommonFragment.kt", l = {114}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RobotCommonFragment.this.new d(jm);
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
                this.d = 1;
                if (RobotCommonFragment.l(RobotCommonFragment.this, this) == mn) {
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

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$2", f = "RobotCommonFragment.kt", l = {118}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$onViewCreated$2$1", f = "RobotCommonFragment.kt", l = {119}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ RobotCommonFragment e;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.common.screens.RobotCommonFragment$e$a$a, reason: collision with other inner class name */
            public static final class C0292a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ RobotCommonFragment d;

                public C0292a(RobotCommonFragment robotCommonFragment) {
                    this.d = robotCommonFragment;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    Object objG;
                    W00 w00 = (W00) obj;
                    C3048bw1 c3048bw1 = this.d.n;
                    c3048bw1.getClass();
                    boolean z = w00 instanceof C3552eL1;
                    InterfaceC2188Uu1 interfaceC2188Uu1 = c3048bw1.a;
                    if (z) {
                        C3552eL1 c3552eL1 = (C3552eL1) w00;
                        objG = interfaceC2188Uu1.f(c3552eL1.a, c3552eL1.b, c3552eL1.c, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C5070lL1) {
                        C5070lL1 c5070lL1 = (C5070lL1) w00;
                        objG = interfaceC2188Uu1.j(c5070lL1.a, c5070lL1.b, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C5283mL1) {
                        C5283mL1 c5283mL1 = (C5283mL1) w00;
                        objG = interfaceC2188Uu1.k(c5283mL1.a, c5283mL1.b, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C2700aL1) {
                        ((C2700aL1) w00).getClass();
                        objG = interfaceC2188Uu1.d(jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C6332rL1) {
                        C6332rL1 c6332rL1 = (C6332rL1) w00;
                        c3048bw1.b.a(c6332rL1.a, c6332rL1.b, c6332rL1.c);
                        objG = Unit.a;
                    } else if (w00 instanceof C6962uL1) {
                        C6962uL1 c6962uL1 = (C6962uL1) w00;
                        objG = interfaceC2188Uu1.e(c6962uL1.a, c6962uL1.b, c6962uL1.c, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C3133cL1) {
                        objG = interfaceC2188Uu1.b(((C3133cL1) w00).a, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof YK1) {
                        ((YK1) w00).getClass();
                        objG = interfaceC2188Uu1.c(jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C5493nL1) {
                        objG = interfaceC2188Uu1.i(((C5493nL1) w00).a, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof C7803yL1) {
                        objG = interfaceC2188Uu1.a(((C7803yL1) w00).a, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else if (w00 instanceof ZK1) {
                        ZK1 zk1 = (ZK1) w00;
                        objG = interfaceC2188Uu1.h(zk1.a, zk1.b, zk1.c, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    } else {
                        if (!(w00 instanceof C6123qL1)) {
                            throw new C6489s51();
                        }
                        C6123qL1 c6123qL1 = (C6123qL1) w00;
                        objG = interfaceC2188Uu1.g(c6123qL1.a, c6123qL1.b, jm);
                        if (objG != MN.d) {
                            objG = Unit.a;
                        }
                    }
                    return objG == MN.d ? objG : Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RobotCommonFragment robotCommonFragment, JM<? super a> jm) {
                super(2, jm);
                this.e = robotCommonFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                ((a) create(kn, jm)).invokeSuspend(Unit.a);
                return MN.d;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw EK.c(obj);
                }
                C1795Pt1.b(obj);
                RobotCommonFragment robotCommonFragment = this.e;
                C0292a c0292a = new C0292a(robotCommonFragment);
                this.d = 1;
                robotCommonFragment.m.a(c0292a, this);
                return mn;
            }
        }

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RobotCommonFragment.this.new e(jm);
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
                RobotCommonFragment robotCommonFragment = RobotCommonFragment.this;
                FP0 viewLifecycleOwner = robotCommonFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                g.b bVar = g.b.g;
                a aVar = new a(robotCommonFragment, null);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(viewLifecycleOwner, bVar, aVar, this) == mn) {
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
        q = kotlin.time.c.g(250, R40.MILLISECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotCommonFragment(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC6672sy1 robotPartProvider, @NotNull C0629Av1 binding, @NotNull InterfaceC3902g10 dialogsProvider, @NotNull C3048bw1 robotDialogPresenter, @NotNull C2038Sw1 inAppTutorialViews) {
        super(binding);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(robotPartProvider, "robotPartProvider");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(robotDialogPresenter, "robotDialogPresenter");
        Intrinsics.checkNotNullParameter(inAppTutorialViews, "inAppTutorialViews");
        this.j = viewModelFactory;
        this.k = robotPartProvider;
        this.l = binding;
        this.m = dialogsProvider;
        this.n = robotDialogPresenter;
        this.o = inAppTutorialViews;
        this.p = new C4839kE1();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:24:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:27:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:31:0x0219  */
    /* JADX WARN: Code duplicated, block: B:34:0x024b  */
    /* JADX WARN: Code duplicated, block: B:35:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0281  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x020f, code lost:
    
        if (r11.m(r9, r2) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x024d, code lost:
    
        if (kotlin.Unit.a == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0212, code lost:
    
        if (r5 != r3) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x020f -> B:30:0x0212). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(com.base.feature.robot.robot.common.screens.RobotCommonFragment r27, defpackage.LM r28) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.robot.robot.common.screens.RobotCommonFragment.l(com.base.feature.robot.robot.common.screens.RobotCommonFragment, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        N4 n4 = new N4(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new S4(new C3(this, 2), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(C1486Lv1.class), new C0951Ez(interfaceC3770fO0A, 1), new C0941Ev1(interfaceC3770fO0A), n4);
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        int i = Build.VERSION.SDK_INT;
        C4839kE1 c4839kE1 = this.p;
        if (i <= 27) {
            c4839kE1.a = true;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = c4839kE1.b;
        if (lifecycleCoroutineScopeImpl != null) {
            C5189lv.k(lifecycleCoroutineScopeImpl, null, new C4629jE1(c4839kE1, null), 3);
        }
    }

    @Override // com.api.core.BindingFragment
    /* JADX INFO: renamed from: k */
    public final InterfaceC6856tq getH() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (defpackage.C4466ii.p(r9, r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.view.ViewGroup r8, defpackage.LM r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C0785Cv1
            if (r0 == 0) goto L13
            r0 = r9
            Cv1 r0 = (defpackage.C0785Cv1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            Cv1 r0 = new Cv1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L9a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            GP1 r8 = r0.e
            android.view.ViewGroup r2 = r0.d
            defpackage.C1795Pt1.b(r9)
            r9 = r8
            r8 = r2
            goto L61
        L3c:
            defpackage.C1795Pt1.b(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            GP1 r9 = defpackage.C1589Ne.i(r9)
            int r2 = r8.getId()
            androidx.fragment.app.FragmentManager r5 = r7.getChildFragmentManager()
            java.lang.String r6 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.d = r8
            r0.e = r9
            r0.i = r3
            sy1 r3 = r7.k
            java.lang.Object r2 = r3.b(r2, r5, r0)
            if (r2 != r1) goto L61
            goto L99
        L61:
            r2 = 0
            r8.setAlpha(r2)
            android.view.ViewPropertyAnimator r8 = r8.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r8 = r8.alpha(r2)
            El r2 = new El
            r3 = 2
            r2.<init>(r9, r3)
            android.view.ViewPropertyAnimator r8 = r8.withEndAction(r2)
            java.lang.String r2 = "withEndAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            long r2 = com.base.feature.robot.robot.common.screens.RobotCommonFragment.q
            android.view.ViewPropertyAnimator r8 = defpackage.C7644xc.j(r8, r2)
            r8.start()
            Dv1 r8 = new Dv1
            r2 = 0
            r8.<init>(r4, r2)
            r0.d = r2
            r0.e = r2
            r0.i = r4
            java.lang.Object r8 = defpackage.C4466ii.p(r9, r8, r0)
            if (r8 != r1) goto L9a
        L99:
            return r1
        L9a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.robot.robot.common.screens.RobotCommonFragment.m(android.view.ViewGroup, LM):java.lang.Object");
    }

    public final int n() {
        return (int) requireView().getResources().getDimension(R.dimen.separator_height);
    }

    @Override // com.api.core.BindingFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2038Sw1 c2038Sw1 = this.o;
        c2038Sw1.a.setValue(null);
        c2038Sw1.b.setValue(null);
        c2038Sw1.c.setValue(null);
        c2038Sw1.d.setValue(null);
        c2038Sw1.e.setValue(null);
        this.k.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1486Lv1 c1486Lv1 = (C1486Lv1) obj;
        c1486Lv1.getClass();
        C5189lv.k(C3286d41.a, null, new C1645Nv1(c1486Lv1, null), 3);
        view.post(new CF0(this, 1));
        C5189lv.k(C7652xe.f(this), null, new e(null), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1486Lv1.e eVar = ((C1486Lv1) obj2).q;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, eVar, null, this), 3);
        LifecycleCoroutineScopeImpl scope = C7652xe.f(this);
        C0629Av1 c0629Av1 = this.l;
        NestedScrollView view2 = c0629Av1.r();
        C4839kE1 c4839kE1 = this.p;
        c4839kE1.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(view2, "view");
        c4839kE1.b = scope;
        if (view2 != null) {
            view2.setOnScrollChangeListener(new ViewOnScrollChangeListenerC4371iE1(c4839kE1));
        }
        this.o.e.setValue(c0629Av1.r());
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        GP1 gp1 = ((C1486Lv1) obj3).r;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new b(viewLifecycleOwner2, gp1, null, this), 3);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        KW1 kw1 = C3435dm0.a;
        EnumC7035uh1 priority = EnumC7035uh1.h;
        Intrinsics.checkNotNullParameter(contextRequireContext, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        C6025ps1 c6025ps1V = com.bumptech.glide.a.c(contextRequireContext).m(Integer.valueOf(R.drawable.ic_profit_limit_cup)).v(priority);
        c6025ps1V.getClass();
        InterfaceC5529nX1 c2566Zg1 = new C2566Zg1(c6025ps1V.y);
        Executor executor = C3387da0.a;
        c6025ps1V.M(c2566Zg1, null, c6025ps1V, executor);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Intrinsics.checkNotNullParameter(contextRequireContext2, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        C6025ps1 c6025ps1V2 = com.bumptech.glide.a.c(contextRequireContext2).m(Integer.valueOf(R.drawable.ic_profit_limit_with_activation_moving_cup)).v(priority);
        c6025ps1V2.getClass();
        c6025ps1V2.M(new C2566Zg1(c6025ps1V2.y), null, c6025ps1V2, executor);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1621Nn1 c1621Nn1 = ((C1486Lv1) obj4).s;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new c(viewLifecycleOwner3, c1621Nn1, null, this), 3);
    }
}

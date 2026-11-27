package defpackage;

import android.text.TextUtils;
import com.api.core.backend.domain.models.responseModels.CommonAccounts;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1798Pu1 extends C7576xG {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final InterfaceC0704Bu1 e;

    @NotNull
    public final InterfaceC4315hz1 f;

    @NotNull
    public final O3 g;

    @NotNull
    public final EQ h;

    @NotNull
    public final C4617jA1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C1699On1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final C1699On1 m;

    @NotNull
    public final GP1 n;

    @NotNull
    public final C1699On1 o;

    @NotNull
    public final C1699On1 p;

    @NotNull
    public final e q;

    @NotNull
    public final FP1<Boolean> r;

    @NotNull
    public final GP1 s;

    @NotNull
    public final C1699On1 t;

    /* JADX INFO: renamed from: Pu1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$1", f = "RobotAccountSelectionViewModelBase.kt", l = {70}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Pu1$a$a, reason: collision with other inner class name */
        public static final class C0122a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1798Pu1 d;

            /* JADX INFO: renamed from: Pu1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$1$1", f = "RobotAccountSelectionViewModelBase.kt", l = {89}, m = "emit")
            public static final class C0123a extends LM {
                public C0122a d;
                public EnumC4164hF1 e;
                public /* synthetic */ Object g;
                public final /* synthetic */ C0122a<T> h;
                public int i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0123a(C0122a<? super T> c0122a, JM<? super C0123a> jm) {
                    super(jm);
                    this.h = c0122a;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.g = obj;
                    this.i |= Integer.MIN_VALUE;
                    return this.h.a(null, this);
                }
            }

            public C0122a(C1798Pu1 c1798Pu1) {
                this.d = c1798Pu1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(EnumC4164hF1 enumC4164hF1, JM<? super Unit> jm) {
                C0123a c0123a;
                Object value;
                boolean z;
                GP1 gp1;
                Object value2;
                GP1 gp2;
                Object value3;
                boolean z2;
                C0122a<T> c0122a;
                EnumC4164hF1 enumC4164hF2 = enumC4164hF1;
                if (jm instanceof C0123a) {
                    c0123a = (C0123a) jm;
                    int i = c0123a.i;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0123a.i = i - Integer.MIN_VALUE;
                    } else {
                        c0123a = new C0123a(this, jm);
                    }
                } else {
                    c0123a = new C0123a(this, jm);
                }
                Object obj = c0123a.g;
                MN mn = MN.d;
                int i2 = c0123a.i;
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    boolean z3 = enumC4164hF2 == EnumC4164hF1.g;
                    C1798Pu1 c1798Pu1 = this.d;
                    GP1 gp3 = c1798Pu1.j;
                    do {
                        value = gp3.getValue();
                        z = !z3;
                    } while (!gp3.d(value, R3.a((R3) value, 0, null, z, false, 0, 55)));
                    do {
                        gp1 = c1798Pu1.l;
                        value2 = gp1.getValue();
                    } while (!gp1.d(value2, R3.a((R3) value2, 0, null, z3, false, 0, 55)));
                    do {
                        gp2 = c1798Pu1.n;
                        value3 = gp2.getValue();
                        z2 = z;
                        z = z2;
                    } while (!gp2.d(value3, R3.a((R3) value3, z3 ? R.string.main_robot_demo_account_text : R.string.main_robot_real_account_text, null, false, z2, z3 ? R.drawable.ic_robot_account_demo : R.drawable.ic_robot_account_real, 13)));
                    c0123a.d = this;
                    c0123a.e = enumC4164hF2;
                    c0123a.i = 1;
                    if (C1798Pu1.m(c1798Pu1, c0123a) == mn) {
                        return mn;
                    }
                    c0122a = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC4164hF2 = c0123a.e;
                    c0122a = c0123a.d;
                    C1795Pt1.b(obj);
                }
                if (!((Boolean) c0122a.d.d.e.getValue()).booleanValue()) {
                    C1798Pu1 c1798Pu2 = c0122a.d;
                    if (!((Boolean) c1798Pu2.i.B.d.getValue()).booleanValue()) {
                        C1798Pu1.l(c1798Pu2, enumC4164hF2);
                    }
                }
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1798Pu1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1798Pu1 c1798Pu1 = C1798Pu1.this;
                InterfaceC6396rf0<EnumC4164hF1> interfaceC6396rf0K = c1798Pu1.g.k();
                C0122a c0122a = new C0122a(c1798Pu1);
                this.d = 1;
                if (interfaceC6396rf0K.c(c0122a, this) == mn) {
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

    /* JADX INFO: renamed from: Pu1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$2", f = "RobotAccountSelectionViewModelBase.kt", l = {96}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Pu1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1798Pu1 d;

            public a(C1798Pu1 c1798Pu1) {
                this.d = c1798Pu1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                GP1 gp1;
                Object value;
                R3 r3;
                double d;
                String str;
                GP1 gp2;
                Object value2;
                R3 r4;
                double d2;
                String str2;
                C6945uG c6945uG = (C6945uG) obj;
                C1798Pu1 c1798Pu1 = this.d;
                boolean zBooleanValue = ((Boolean) c1798Pu1.d.e.getValue()).booleanValue();
                if (c6945uG != null && ((!zBooleanValue || c6945uG.l != 0) && c6945uG.m != 0)) {
                    Boolean bool = Boolean.FALSE;
                    GP1 gp3 = c1798Pu1.s;
                    gp3.getClass();
                    gp3.m(null, bool);
                }
                if (!TextUtils.isDigitsOnly(c6945uG.e)) {
                    do {
                        gp2 = c1798Pu1.j;
                        value2 = gp2.getValue();
                        r4 = (R3) value2;
                        C7396wQ c7396wQ = r4.b;
                        d2 = c6945uG.j;
                        str2 = c6945uG.g;
                        c7396wQ.getClass();
                    } while (!gp2.d(value2, R3.a(r4, 0, C7396wQ.a(d2, str2), false, false, 0, 59)));
                }
                do {
                    gp1 = c1798Pu1.l;
                    value = gp1.getValue();
                    r3 = (R3) value;
                    C7396wQ c7396wQ2 = r3.b;
                    d = c6945uG.k;
                    str = c6945uG.h;
                    c7396wQ2.getClass();
                } while (!gp1.d(value, R3.a(r3, 0, C7396wQ.a(d, str), false, false, 0, 59)));
                Object objM = C1798Pu1.m(c1798Pu1, jm);
                return objM == MN.d ? objM : Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1798Pu1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return Unit.a;
            }
            C1795Pt1.b(obj);
            C1798Pu1 c1798Pu1 = C1798Pu1.this;
            GP1 gp1 = c1798Pu1.d.k;
            a aVar = new a(c1798Pu1);
            this.d = 1;
            gp1.c(new C4040gg0(aVar), this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Pu1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$3", f = "RobotAccountSelectionViewModelBase.kt", l = {120}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Pu1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1798Pu1 d;

            public a(C1798Pu1 c1798Pu1) {
                this.d = c1798Pu1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objM = C1798Pu1.m(this.d, jm);
                return objM == MN.d ? objM : Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1798Pu1.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return Unit.a;
            }
            C1795Pt1.b(obj);
            C1798Pu1 c1798Pu1 = C1798Pu1.this;
            GP1 gp1 = c1798Pu1.d.m;
            a aVar = new a(c1798Pu1);
            this.d = 1;
            gp1.c(new C4040gg0(aVar), this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Pu1$d */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$4", f = "RobotAccountSelectionViewModelBase.kt", l = {132, 136}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Pu1$d$a */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$4$loaded$1", f = "RobotAccountSelectionViewModelBase.kt", l = {133}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
            public int d;
            public final /* synthetic */ C1798Pu1 e;

            /* JADX INFO: renamed from: Pu1$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onInit$4$loaded$1$1", f = "RobotAccountSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
            public static final class C0124a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
                public /* synthetic */ boolean d;

                public C0124a() {
                    throw null;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    C0124a c0124a = new C0124a(2, jm);
                    c0124a.d = ((Boolean) obj).booleanValue();
                    return c0124a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C0124a) create(bool2, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    C1795Pt1.b(obj);
                    return Boolean.valueOf(!this.d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1798Pu1 c1798Pu1, JM<? super a> jm) {
                super(2, jm);
                this.e = c1798Pu1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Boolean> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                    return obj;
                }
                C1795Pt1.b(obj);
                C1699On1 c1699On1 = this.e.t;
                C0124a c0124a = new C0124a(2, null);
                this.d = 1;
                Object objP = C4466ii.p(c1699On1, c0124a, this);
                return objP == mn ? mn : objP;
            }
        }

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1798Pu1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r7.a(r1, r6) == r0) goto L17;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.d
                Pu1 r2 = defpackage.C1798Pu1.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                defpackage.C1795Pt1.b(r7)
                goto L46
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                defpackage.C1795Pt1.b(r7)
                goto L33
            L1e:
                defpackage.C1795Pt1.b(r7)
                Pu1$d$a r7 = new Pu1$d$a
                r1 = 0
                r7.<init>(r2, r1)
                r6.d = r4
                r4 = 90000(0x15f90, double:4.4466E-319)
                java.lang.Object r7 = defpackage.OZ1.c(r4, r7, r6)
                if (r7 != r0) goto L33
                goto L45
            L33:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                if (r7 != 0) goto L46
                kf r7 = r2.d
                qK1 r7 = r7.t
                kotlin.Unit r1 = kotlin.Unit.a
                r6.d = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L46
            L45:
                return r0
            L46:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1798Pu1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Pu1$e */
    public static final class e implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C4250hg0 d;

        /* JADX INFO: renamed from: Pu1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Pu1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$special$$inlined$map$1$2", f = "RobotAccountSelectionViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0125a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0125a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0125a c0125a;
                if (jm instanceof C0125a) {
                    c0125a = (C0125a) jm;
                    int i = c0125a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0125a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0125a = new C0125a(jm);
                    }
                } else {
                    c0125a = new C0125a(jm);
                }
                Object obj2 = c0125a.d;
                MN mn = MN.d;
                int i2 = c0125a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((CommonAccounts) obj).a().size() > 2);
                    c0125a.e = 1;
                    if (this.d.a(boolValueOf, c0125a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C1798Pu1(@NotNull C4923kf appData, @NotNull InterfaceC0704Bu1 callback, @NotNull InterfaceC4315hz1 robotScreenStateProvider, @NotNull InterfaceC3493e4 accountSelectionEnabledProvider, @NotNull S3 accountModelProviderApi, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider, @NotNull C4617jA1 robotTrading) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(robotScreenStateProvider, "robotScreenStateProvider");
        Intrinsics.checkNotNullParameter(accountSelectionEnabledProvider, "accountSelectionEnabledProvider");
        Intrinsics.checkNotNullParameter(accountModelProviderApi, "accountModelProviderApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        this.d = appData;
        this.e = callback;
        this.f = robotScreenStateProvider;
        this.g = accountModeSelectionUseCase;
        this.h = currencySignProvider;
        this.i = robotTrading;
        GP1 gp1I = C1589Ne.i(accountModelProviderApi.b());
        this.j = gp1I;
        this.k = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(accountModelProviderApi.c());
        this.l = gp1I2;
        this.m = C4466ii.f(gp1I2);
        GP1 gp1I3 = C1589Ne.i(accountModelProviderApi.a());
        this.n = gp1I3;
        this.o = C4466ii.f(gp1I3);
        this.p = C4466ii.f(appData.e);
        this.q = new e(new C4250hg0(appData.m, 0));
        this.r = accountSelectionEnabledProvider.b();
        GP1 gp1I4 = C1589Ne.i(Boolean.TRUE);
        this.s = gp1I4;
        this.t = C4466ii.f(gp1I4);
    }

    public static final void l(C1798Pu1 c1798Pu1, EnumC4164hF1 enumC4164hF1) {
        c1798Pu1.getClass();
        Intrinsics.checkNotNullParameter(enumC4164hF1, "<this>");
        c1798Pu1.f.a(enumC4164hF1 == EnumC4164hF1.g ? EnumC4105gz1.d : EnumC4105gz1.e);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object m(C1798Pu1 c1798Pu1, JM jm) {
        C2032Su1 c2032Su1;
        C1798Pu1 c1798Pu2;
        C6945uG c6945uG;
        double d2;
        Object objA;
        C1798Pu1 c1798Pu3;
        double d3;
        String str;
        GP1 gp1;
        Object value;
        R3 r3;
        c1798Pu1.getClass();
        if (jm instanceof C2032Su1) {
            c2032Su1 = (C2032Su1) jm;
            int i = c2032Su1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2032Su1.j = i - Integer.MIN_VALUE;
            } else {
                c2032Su1 = new C2032Su1(c1798Pu1, jm);
            }
        } else {
            c2032Su1 = new C2032Su1(c1798Pu1, jm);
        }
        Object objA2 = c2032Su1.h;
        MN mn = MN.d;
        int i2 = c2032Su1.j;
        if (i2 == 0) {
            C1795Pt1.b(objA2);
            GP1 gp2 = c1798Pu1.d.k;
            c2032Su1.d = c1798Pu1;
            c2032Su1.j = 1;
            objA2 = C7236vf0.a(gp2, c2032Su1);
            if (objA2 != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            c1798Pu1 = c2032Su1.d;
            C1795Pt1.b(objA2);
        } else {
            if (i2 == 2) {
                c6945uG = c2032Su1.e;
                c1798Pu2 = c2032Su1.d;
                C1795Pt1.b(objA2);
                if (objA2 == EnumC4164hF1.g) {
                    d2 = c6945uG.k;
                } else {
                    d2 = c6945uG.j;
                }
                EQ eq = c1798Pu2.h;
                c2032Su1.d = c1798Pu2;
                c2032Su1.e = null;
                c2032Su1.g = d2;
                c2032Su1.j = 3;
                objA = eq.a(false, c2032Su1);
                if (objA != mn) {
                    double d4 = d2;
                    c1798Pu3 = c1798Pu2;
                    d3 = d4;
                    objA2 = objA;
                }
                return mn;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d3 = c2032Su1.g;
            c1798Pu3 = c2032Su1.d;
            C1795Pt1.b(objA2);
        }
        str = (String) objA2;
        gp1 = c1798Pu3.n;
        do {
            value = gp1.getValue();
            r3 = (R3) value;
            r3.b.getClass();
        } while (!gp1.d(value, R3.a(r3, 0, C7396wQ.a(d3, str), false, false, 0, 59)));
        return Unit.a;
        C6945uG c6945uG2 = (C6945uG) objA2;
        InterfaceC6396rf0<EnumC4164hF1> interfaceC6396rf0K = c1798Pu1.g.k();
        c2032Su1.d = c1798Pu1;
        c2032Su1.e = c6945uG2;
        c2032Su1.j = 2;
        Object objO = C4466ii.o(interfaceC6396rf0K, c2032Su1);
        if (objO != mn) {
            c1798Pu2 = c1798Pu1;
            c6945uG = c6945uG2;
            objA2 = objO;
            if (objA2 == EnumC4164hF1.g) {
                d2 = c6945uG.k;
            } else {
                d2 = c6945uG.j;
            }
            EQ eq2 = c1798Pu2.h;
            c2032Su1.d = c1798Pu2;
            c2032Su1.e = null;
            c2032Su1.g = d2;
            c2032Su1.j = 3;
            objA = eq2.a(false, c2032Su1);
            if (objA != mn) {
                double d5 = d2;
                c1798Pu3 = c1798Pu2;
                d3 = d5;
                objA2 = objA;
                str = (String) objA2;
                gp1 = c1798Pu3.n;
                do {
                    value = gp1.getValue();
                    r3 = (R3) value;
                    r3.b.getClass();
                } while (!gp1.d(value, R3.a(r3, 0, C7396wQ.a(d3, str), false, false, 0, 59)));
                return Unit.a;
            }
        }
        return mn;
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new a(null));
        C6561sS.g(this, new b(null));
        C6561sS.g(this, new c(null));
        C6561sS.g(this, new d(null));
    }
}

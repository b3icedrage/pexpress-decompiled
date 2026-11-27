package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2360Wy1 extends C7576xG implements InterfaceC2200Uy1 {

    @NotNull
    public final C1699On1 A;

    @NotNull
    public final GP1 B;

    @NotNull
    public final C1699On1 C;

    @NotNull
    public final C6120qK1 D;

    @NotNull
    public final C1621Nn1 E;

    @NotNull
    public final C1621Nn1 F;

    @NotNull
    public final C6120qK1 G;

    @NotNull
    public final C6120qK1 H;
    public final boolean I;

    @NotNull
    public final InterfaceC2197Ux1 d;

    @NotNull
    public final C4612j90 e;

    @NotNull
    public final C4923kf f;

    @NotNull
    public final ReporterApi g;

    @NotNull
    public final InterfaceC3902g10 h;

    @NotNull
    public final InterfaceC5614nv1 i;

    @NotNull
    public final AbstractC3405de2 j;

    @NotNull
    public final InterfaceC7711xu1 k;

    @NotNull
    public final U22 l;

    @NotNull
    public final C2726aU0 m;

    @NotNull
    public final O3 n;

    @NotNull
    public final InterfaceC2152Ui1 o;

    @NotNull
    public final RT0 p;

    @NotNull
    public final o q;

    @NotNull
    public final GP1 r;

    @NotNull
    public final C1699On1 s;

    @NotNull
    public final GP1 t;

    @NotNull
    public final C1699On1 u;

    @NotNull
    public final GP1 v;

    @NotNull
    public final C1699On1 w;

    @NotNull
    public final GP1 x;

    @NotNull
    public final C1699On1 y;

    @NotNull
    public final GP1 z;

    /* JADX INFO: renamed from: Wy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$1", f = "RobotRiskManagementViewModelBase.kt", l = {109}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$a$a, reason: collision with other inner class name */
        public static final class C0178a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            public C0178a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                ((Boolean) obj).getClass();
                Object objA = this.d.D.a(E32.h, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new a(jm);
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
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C1699On1 c1699On1 = c2360Wy1.e.m;
                C0178a c0178a = new C0178a(c2360Wy1);
                this.d = 1;
                Object objC = c1699On1.d.c(new C2464Xy1(c0178a), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    /* JADX INFO: renamed from: Wy1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$10", f = "RobotRiskManagementViewModelBase.kt", l = {213}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C2360Wy1 c2360Wy1 = this.d;
                c2360Wy1.j.a(C3668eu.a((C3668eu) obj, new Integer(R.string.unlock_btn), new C1449Lj(c2360Wy1, 2)));
                c2360Wy1.d.c();
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2360Wy1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((b) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            C2360Wy1 c2360Wy1 = C2360Wy1.this;
            C6120qK1 c6120qK1 = c2360Wy1.G;
            a aVar = new a(c2360Wy1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, aVar, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Wy1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$2", f = "RobotRiskManagementViewModelBase.kt", l = {125}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$c$a */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$2$1", f = "RobotRiskManagementViewModelBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Unit>, Object> {
            public /* synthetic */ boolean d;
            public /* synthetic */ boolean e;
            public final /* synthetic */ C2360Wy1 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2360Wy1 c2360Wy1, JM<? super a> jm) {
                super(3, jm);
                this.g = c2360Wy1;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                Object value;
                GP1 gp1;
                Object value2;
                MN mn = MN.d;
                C1795Pt1.b(obj);
                boolean z = this.d;
                boolean z2 = this.e;
                C2360Wy1 c2360Wy1 = this.g;
                GP1 gp2 = c2360Wy1.r;
                do {
                    value = gp2.getValue();
                    ((C7963z60) value).getClass();
                } while (!gp2.d(value, new C7963z60(z2, z)));
                do {
                    gp1 = c2360Wy1.t;
                    value2 = gp1.getValue();
                } while (!gp1.d(value2, C7753y60.a((C7753y60) value2, z && z2, null, 0.0d, 6)));
                return Unit.a;
            }

            @Override // defpackage.InterfaceC1060Gj0
            public final Object k(Boolean bool, Boolean bool2, JM<? super Unit> jm) {
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = bool2.booleanValue();
                a aVar = new a(this.g, jm);
                aVar.d = zBooleanValue;
                aVar.e = zBooleanValue2;
                return aVar.invokeSuspend(Unit.a);
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C6610sg0 c6610sg0IsEnabled = c2360Wy1.o.isEnabled();
                GP1 gp1 = c2360Wy1.f.e;
                a aVar = new a(c2360Wy1, null);
                this.d = 1;
                Object objA = C4372iF.a(this, D51.d, new C6820tg0(aVar, null), C7240vg0.d, new InterfaceC6396rf0[]{c6610sg0IsEnabled, gp1});
                if (objA != obj2) {
                    objA = Unit.a;
                }
                if (objA != obj2) {
                    objA = Unit.a;
                }
                if (objA == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: Wy1$d */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$3", f = "RobotRiskManagementViewModelBase.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                GP1 gp1;
                Object value2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C2360Wy1 c2360Wy1 = this.d;
                GP1 gp2 = c2360Wy1.x;
                do {
                    value = gp2.getValue();
                } while (!gp2.d(value, new C7963z60(((C7963z60) value).a, zBooleanValue)));
                do {
                    gp1 = c2360Wy1.z;
                    value2 = gp1.getValue();
                } while (!gp1.d(value2, C7753y60.a((C7753y60) value2, zBooleanValue, null, 0.0d, 6)));
                return Unit.a;
            }
        }

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled = c2360Wy1.p.isEnabled();
                a aVar = new a(c2360Wy1);
                this.d = 1;
                if (interfaceC6396rf0IsEnabled.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$e */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$4", f = "RobotRiskManagementViewModelBase.kt", l = {139}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            /* JADX INFO: renamed from: Wy1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$4$1", f = "RobotRiskManagementViewModelBase.kt", l = {142}, m = "emit")
            public static final class C0179a extends LM {
                public AbstractC6892u10 d;
                public InterfaceC3907g21 e;
                public C2360Wy1 g;
                public Object h;
                public C7753y60 i;
                public /* synthetic */ Object j;
                public final /* synthetic */ a<T> k;
                public int l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0179a(a<? super T> aVar, JM<? super C0179a> jm) {
                    super(jm);
                    this.k = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.j = obj;
                    this.l |= Integer.MIN_VALUE;
                    return this.k.a(null, this);
                }
            }

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0051  */
            /* JADX WARN: Code duplicated, block: B:19:0x005c  */
            /* JADX WARN: Code duplicated, block: B:21:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:22:0x007f  */
            /* JADX WARN: Code duplicated, block: B:26:0x009a  */
            /* JADX WARN: Code duplicated, block: B:28:0x009d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [g21] */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [g21] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:18:0x005a). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:23:0x0083). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x009d
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(defpackage.AbstractC6892u10<java.lang.Long> r13, defpackage.JM<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof defpackage.C2360Wy1.e.a.C0179a
                    if (r0 == 0) goto L13
                    r0 = r14
                    Wy1$e$a$a r0 = (defpackage.C2360Wy1.e.a.C0179a) r0
                    int r1 = r0.l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.l = r1
                    goto L18
                L13:
                    Wy1$e$a$a r0 = new Wy1$e$a$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.j
                    MN r1 = defpackage.MN.d
                    int r2 = r0.l
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    y60 r13 = r0.i
                    java.lang.Object r2 = r0.h
                    Wy1 r4 = r0.g
                    g21 r5 = r0.e
                    u10 r6 = r0.d
                    defpackage.C1795Pt1.b(r14)
                    goto L83
                L31:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L39:
                    defpackage.C1795Pt1.b(r14)
                    Wy1 r14 = r12.d
                    GP1 r2 = r14.t
                    r5 = r2
                L41:
                    r4 = r14
                    java.lang.Object r2 = r5.getValue()
                    r14 = r2
                    y60 r14 = (defpackage.C7753y60) r14
                    java.lang.Object r6 = r13.a()
                    java.lang.Long r6 = (java.lang.Long) r6
                    if (r6 == 0) goto L5c
                    long r6 = r6.longValue()
                    double r6 = (double) r6
                    r8 = r4
                    r4 = r14
                    r14 = r8
                    r7 = r6
                L5a:
                    r10 = r5
                    goto L8d
                L5c:
                    U22 r6 = r4.l
                    O3 r7 = r4.n
                    On1 r7 = r7.l()
                    g21 r7 = r7.d
                    java.lang.Object r7 = r7.getValue()
                    hF1 r7 = (defpackage.EnumC4164hF1) r7
                    r0.d = r13
                    r0.e = r5
                    r0.g = r4
                    r0.h = r2
                    r0.i = r14
                    r0.l = r3
                    java.lang.Object r6 = r6.c(r7, r0)
                    if (r6 != r1) goto L7f
                    return r1
                L7f:
                    r11 = r6
                    r6 = r13
                    r13 = r14
                    r14 = r11
                L83:
                    java.lang.Number r14 = (java.lang.Number) r14
                    double r7 = r14.doubleValue()
                    r14 = r4
                    r4 = r13
                    r13 = r6
                    goto L5a
                L8d:
                    r5 = 0
                    r6 = 0
                    r9 = 3
                    y60 r4 = defpackage.C7753y60.a(r4, r5, r6, r7, r9)
                    boolean r2 = r10.d(r2, r4)
                    if (r2 == 0) goto L9d
                    kotlin.Unit r13 = kotlin.Unit.a
                    return r13
                L9d:
                    r5 = r10
                    goto L41
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C2360Wy1.e.a.a(u10, JM):java.lang.Object");
            }
        }

        public e(JM<? super e> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((e) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C5981pg0 c5981pg0C = MA1.c(c2360Wy1.o.a(), c2360Wy1.o.b(), c2360Wy1.n, c2360Wy1.f);
                a aVar = new a(c2360Wy1);
                this.d = 1;
                if (c5981pg0C.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$f */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$5", f = "RobotRiskManagementViewModelBase.kt", l = {155}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$f$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            /* JADX INFO: renamed from: Wy1$f$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$5$1", f = "RobotRiskManagementViewModelBase.kt", l = {158}, m = "emit")
            public static final class C0180a extends LM {
                public AbstractC6892u10 d;
                public InterfaceC3907g21 e;
                public C2360Wy1 g;
                public Object h;
                public C7753y60 i;
                public /* synthetic */ Object j;
                public final /* synthetic */ a<T> k;
                public int l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0180a(a<? super T> aVar, JM<? super C0180a> jm) {
                    super(jm);
                    this.k = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.j = obj;
                    this.l |= Integer.MIN_VALUE;
                    return this.k.a(null, this);
                }
            }

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0051  */
            /* JADX WARN: Code duplicated, block: B:19:0x005c  */
            /* JADX WARN: Code duplicated, block: B:21:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:22:0x007f  */
            /* JADX WARN: Code duplicated, block: B:26:0x009a  */
            /* JADX WARN: Code duplicated, block: B:28:0x009d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [g21] */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [g21] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:18:0x005a). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:23:0x0083). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x009d
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(defpackage.AbstractC6892u10<java.lang.Long> r13, defpackage.JM<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof defpackage.C2360Wy1.f.a.C0180a
                    if (r0 == 0) goto L13
                    r0 = r14
                    Wy1$f$a$a r0 = (defpackage.C2360Wy1.f.a.C0180a) r0
                    int r1 = r0.l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.l = r1
                    goto L18
                L13:
                    Wy1$f$a$a r0 = new Wy1$f$a$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.j
                    MN r1 = defpackage.MN.d
                    int r2 = r0.l
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    y60 r13 = r0.i
                    java.lang.Object r2 = r0.h
                    Wy1 r4 = r0.g
                    g21 r5 = r0.e
                    u10 r6 = r0.d
                    defpackage.C1795Pt1.b(r14)
                    goto L83
                L31:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L39:
                    defpackage.C1795Pt1.b(r14)
                    Wy1 r14 = r12.d
                    GP1 r2 = r14.z
                    r5 = r2
                L41:
                    r4 = r14
                    java.lang.Object r2 = r5.getValue()
                    r14 = r2
                    y60 r14 = (defpackage.C7753y60) r14
                    java.lang.Object r6 = r13.a()
                    java.lang.Long r6 = (java.lang.Long) r6
                    if (r6 == 0) goto L5c
                    long r6 = r6.longValue()
                    double r6 = (double) r6
                    r8 = r4
                    r4 = r14
                    r14 = r8
                    r7 = r6
                L5a:
                    r10 = r5
                    goto L8d
                L5c:
                    U22 r6 = r4.l
                    O3 r7 = r4.n
                    On1 r7 = r7.l()
                    g21 r7 = r7.d
                    java.lang.Object r7 = r7.getValue()
                    hF1 r7 = (defpackage.EnumC4164hF1) r7
                    r0.d = r13
                    r0.e = r5
                    r0.g = r4
                    r0.h = r2
                    r0.i = r14
                    r0.l = r3
                    java.lang.Object r6 = r6.b(r7, r0)
                    if (r6 != r1) goto L7f
                    return r1
                L7f:
                    r11 = r6
                    r6 = r13
                    r13 = r14
                    r14 = r11
                L83:
                    java.lang.Number r14 = (java.lang.Number) r14
                    double r7 = r14.doubleValue()
                    r14 = r4
                    r4 = r13
                    r13 = r6
                    goto L5a
                L8d:
                    r5 = 0
                    r6 = 0
                    r9 = 3
                    y60 r4 = defpackage.C7753y60.a(r4, r5, r6, r7, r9)
                    boolean r2 = r10.d(r2, r4)
                    if (r2 == 0) goto L9d
                    kotlin.Unit r13 = kotlin.Unit.a
                    return r13
                L9d:
                    r5 = r10
                    goto L41
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C2360Wy1.f.a.a(u10, JM):java.lang.Object");
            }
        }

        public f(JM<? super f> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new f(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((f) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C5981pg0 c5981pg0C = MA1.c(c2360Wy1.p.a(), c2360Wy1.p.b(), c2360Wy1.n, c2360Wy1.f);
                a aVar = new a(c2360Wy1);
                this.d = 1;
                if (c5981pg0C.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$g */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$6", f = "RobotRiskManagementViewModelBase.kt", l = {172}, m = "invokeSuspend")
    public static final class g extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$g$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                GP1 gp1;
                Object value2;
                AbstractC6892u10 abstractC6892u10 = (AbstractC6892u10) obj;
                C2360Wy1 c2360Wy1 = this.d;
                GP1 gp2 = c2360Wy1.t;
                do {
                    value = gp2.getValue();
                } while (!gp2.d(value, C7753y60.a((C7753y60) value, false, (String) abstractC6892u10.a(), 0.0d, 5)));
                do {
                    gp1 = c2360Wy1.z;
                    value2 = gp1.getValue();
                } while (!gp1.d(value2, C7753y60.a((C7753y60) value2, false, (String) abstractC6892u10.a(), 0.0d, 5)));
                return Unit.a;
            }
        }

        public g(JM<? super g> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new g(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((g) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C4923kf c4923kf = c2360Wy1.f;
                C5981pg0 c5981pg0C = MA1.c(c4923kf.G, c4923kf.F, c2360Wy1.n, c4923kf);
                a aVar = new a(c2360Wy1);
                this.d = 1;
                if (c5981pg0C.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$h */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$7", f = "RobotRiskManagementViewModelBase.kt", l = {195}, m = "invokeSuspend")
    public static final class h extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$h$a */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$7$1", f = "RobotRiskManagementViewModelBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements InterfaceC1138Hj0<Double, C7753y60, C7753y60, JM<? super Unit>, Object> {
            public /* synthetic */ double d;
            public /* synthetic */ C7753y60 e;
            public /* synthetic */ C7753y60 g;
            public final /* synthetic */ C2360Wy1 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2360Wy1 c2360Wy1, JM<? super a> jm) {
                super(4, jm);
                this.h = c2360Wy1;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                Object value;
                String str;
                double d;
                GP1 gp1;
                Object value2;
                double d2;
                Object value3;
                MN mn = MN.d;
                C1795Pt1.b(obj);
                double d3 = this.d;
                C7753y60 c7753y60 = this.e;
                C7753y60 c7753y61 = this.g;
                double d4 = c7753y61.c;
                C2360Wy1 c2360Wy1 = this.h;
                if (d4 > d3) {
                    GP1 gp2 = c2360Wy1.z;
                    do {
                        value3 = gp2.getValue();
                    } while (!gp2.d(value3, C7753y60.a((C7753y60) value3, false, null, d3, 3)));
                    return Unit.a;
                }
                GP1 gp3 = c2360Wy1.v;
                do {
                    value = gp3.getValue();
                    str = c7753y60.b;
                    d = c7753y60.c + d3;
                    ((C7396wQ) value).getClass();
                } while (!gp3.d(value, C7396wQ.a(d, str)));
                do {
                    gp1 = c2360Wy1.B;
                    value2 = gp1.getValue();
                    d2 = d3 - c7753y61.c;
                    ((C7396wQ) value2).getClass();
                } while (!gp1.d(value2, C7396wQ.a(d2, c7753y61.b)));
                return Unit.a;
            }

            @Override // defpackage.InterfaceC1138Hj0
            public final Object l(Double d, C7753y60 c7753y60, C7753y60 c7753y61, JM<? super Unit> jm) {
                double dDoubleValue = d.doubleValue();
                a aVar = new a(this.h, jm);
                aVar.d = dDoubleValue;
                aVar.e = c7753y60;
                aVar.g = c7753y61;
                return aVar.invokeSuspend(Unit.a);
            }
        }

        public h(JM<? super h> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new h(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((h) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C5561ng0 c5561ng0K = C4466ii.k(c2360Wy1.q, c2360Wy1.u, c2360Wy1.A, new a(c2360Wy1, null));
                this.d = 1;
                if (C4466ii.i(c5561ng0K, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$i */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$8", f = "RobotRiskManagementViewModelBase.kt", l = {199}, m = "invokeSuspend")
    public static final class i extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        public i(JM<? super i> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new i(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((i) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                if (c2360Wy1.I) {
                    C4657jO c4657jO = new C4657jO(0);
                    this.d = 1;
                    if (c2360Wy1.p.d(c4657jO, this) == mn) {
                        return mn;
                    }
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

    /* JADX INFO: renamed from: Wy1$j */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onInit$9", f = "RobotRiskManagementViewModelBase.kt", l = {203}, m = "invokeSuspend")
    public static final class j extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Wy1$j$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2360Wy1 d;

            public a(C2360Wy1 c2360Wy1) {
                this.d = c2360Wy1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C2360Wy1 c2360Wy1 = this.d;
                c2360Wy1.j.a(C3668eu.a((C3668eu) obj, new Integer(R.string.unlock_btn), new C4797k3(c2360Wy1, 6)));
                c2360Wy1.d.c();
                return Unit.a;
            }
        }

        public j(JM<? super j> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2360Wy1.this.new j(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((j) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            C2360Wy1 c2360Wy1 = C2360Wy1.this;
            C6120qK1 c6120qK1 = c2360Wy1.H;
            a aVar = new a(c2360Wy1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, aVar, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Wy1$k */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onLossLimitTextEdit$1", f = "RobotRiskManagementViewModelBase.kt", l = {328}, m = "invokeSuspend")
    public static final class k extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String g;
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, JM<? super k> jm) {
            super(1, jm);
            this.g = str;
            this.h = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new k(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((k) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7711xu1 interfaceC7711xu1 = C2360Wy1.this.k;
                this.d = 1;
                if (interfaceC7711xu1.a(this, this.g, this.h) == mn) {
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

    /* JADX INFO: renamed from: Wy1$l */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$showProfitLimitBlockedDialog$1$1$1", f = "RobotRiskManagementViewModelBase.kt", l = {288}, m = "invokeSuspend")
    public static final class l extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        public l(JM<? super l> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C2360Wy1.this.new l(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((l) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2360Wy1 c2360Wy1 = C2360Wy1.this;
                C6120qK1 c6120qK1 = c2360Wy1.G;
                C3668eu c3668euA = c2360Wy1.i.a(EnumC5404mv1.h);
                this.d = 1;
                if (c6120qK1.a(c3668euA, this) == mn) {
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

    /* JADX INFO: renamed from: Wy1$m */
    public static final class m implements InterfaceC6396rf0<Double> {
        public final /* synthetic */ C4250hg0 d;

        /* JADX INFO: renamed from: Wy1$m$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Wy1$m$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$special$$inlined$map$1$2", f = "RobotRiskManagementViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0181a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0181a(JM jm) {
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
                C0181a c0181a;
                if (jm instanceof C0181a) {
                    c0181a = (C0181a) jm;
                    int i = c0181a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0181a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0181a = new C0181a(jm);
                    }
                } else {
                    c0181a = new C0181a(jm);
                }
                Object obj2 = c0181a.d;
                MN mn = MN.d;
                int i2 = c0181a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Double d = new Double(((C6945uG) obj).k);
                    c0181a.e = 1;
                    if (this.d.a(d, c0181a) == mn) {
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

        public m(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Double> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: Wy1$n */
    public static final class n implements InterfaceC6396rf0<Double> {
        public final /* synthetic */ C4250hg0 d;

        /* JADX INFO: renamed from: Wy1$n$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Wy1$n$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$special$$inlined$map$2$2", f = "RobotRiskManagementViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0182a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0182a(JM jm) {
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
                C0182a c0182a;
                if (jm instanceof C0182a) {
                    c0182a = (C0182a) jm;
                    int i = c0182a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0182a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0182a = new C0182a(jm);
                    }
                } else {
                    c0182a = new C0182a(jm);
                }
                Object obj2 = c0182a.d;
                MN mn = MN.d;
                int i2 = c0182a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Double d = new Double(((C6945uG) obj).j);
                    c0182a.e = 1;
                    if (this.d.a(d, c0182a) == mn) {
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

        public n(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Double> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: Wy1$o */
    public static final class o implements InterfaceC6396rf0<Double> {
        public final /* synthetic */ C5981pg0 d;

        /* JADX INFO: renamed from: Wy1$o$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Wy1$o$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$special$$inlined$map$3$2", f = "RobotRiskManagementViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0183a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0183a(JM jm) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0183a c0183a;
                if (jm instanceof C0183a) {
                    c0183a = (C0183a) jm;
                    int i = c0183a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0183a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0183a = new C0183a(jm);
                    }
                } else {
                    c0183a = new C0183a(jm);
                }
                Object obj2 = c0183a.d;
                MN mn = MN.d;
                int i2 = c0183a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Object objA = ((AbstractC6892u10) obj).a();
                    c0183a.e = 1;
                    if (this.d.a(objA, c0183a) == mn) {
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

        public o(C5981pg0 c5981pg0) {
            this.d = c5981pg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Double> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C2360Wy1(@NotNull InterfaceC2197Ux1 callbacks, @NotNull C4612j90 events, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC3902g10 dialogsProvider, @NotNull InterfaceC5614nv1 robotBottomSheetDialogsDataFactory, @NotNull AbstractC3405de2 viewPagerBottomSheetDataProvider, @NotNull InterfaceC7711xu1 riskManagementChangeUseCaseApi, @NotNull U22 tradingDefaultsProvider, @NotNull MT0 lossLimitRemovedLocalExperiment, @NotNull C2726aU0 lossProfitLimitPopupLocalExperiment, @NotNull O3 accountModeSelectionUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull RT0 lossLimitUseCase) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(robotBottomSheetDialogsDataFactory, "robotBottomSheetDialogsDataFactory");
        Intrinsics.checkNotNullParameter(viewPagerBottomSheetDataProvider, "viewPagerBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(riskManagementChangeUseCaseApi, "riskManagementChangeUseCaseApi");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(lossLimitRemovedLocalExperiment, "lossLimitRemovedLocalExperiment");
        Intrinsics.checkNotNullParameter(lossProfitLimitPopupLocalExperiment, "lossProfitLimitPopupLocalExperiment");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        this.d = callbacks;
        this.e = events;
        this.f = appData;
        this.g = reporter;
        this.h = dialogsProvider;
        this.i = robotBottomSheetDialogsDataFactory;
        this.j = viewPagerBottomSheetDataProvider;
        this.k = riskManagementChangeUseCaseApi;
        this.l = tradingDefaultsProvider;
        this.m = lossProfitLimitPopupLocalExperiment;
        this.n = accountModeSelectionUseCase;
        this.o = profitLimitUseCase;
        this.p = lossLimitUseCase;
        GP1 gp1 = appData.k;
        this.q = new o(MA1.c(new m(new C4250hg0(gp1, 0)), new n(new C4250hg0(gp1, 0)), accountModeSelectionUseCase, appData));
        int i2 = 0;
        GP1 gp1I = C1589Ne.i(new C7963z60(0));
        this.r = gp1I;
        this.s = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(new C7753y60(i2));
        this.t = gp1I2;
        this.u = C4466ii.f(gp1I2);
        GP1 gp1I3 = C1589Ne.i(new C7396wQ(0));
        this.v = gp1I3;
        this.w = C4466ii.f(gp1I3);
        GP1 gp1I4 = C1589Ne.i(new C7963z60(0));
        this.x = gp1I4;
        this.y = C4466ii.f(gp1I4);
        GP1 gp1I5 = C1589Ne.i(new C7753y60(i2));
        this.z = gp1I5;
        this.A = C4466ii.f(gp1I5);
        GP1 gp1I6 = C1589Ne.i(new C7396wQ(0));
        this.B = gp1I6;
        this.C = C4466ii.f(gp1I6);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.D = c6120qK1G;
        this.E = C4466ii.e(c6120qK1G);
        this.F = C4466ii.e(C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d));
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.G = c6120qK1G2;
        C4466ii.e(c6120qK1G2);
        C6120qK1 c6120qK1G3 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.H = c6120qK1G3;
        C4466ii.e(c6120qK1G3);
        this.I = lossLimitRemovedLocalExperiment.o();
    }

    @Override // defpackage.InterfaceC2200Uy1
    public final void d(@NotNull String newValue, boolean z) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (newValue.length() == 0) {
            return;
        }
        C6561sS.g(this, new k(newValue, z, null));
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new a(null));
        C6561sS.g(this, new c(null));
        C6561sS.g(this, new d(null));
        C6561sS.g(this, new e(null));
        C6561sS.g(this, new f(null));
        C6561sS.g(this, new g(null));
        C6561sS.g(this, new h(null));
        C6561sS.g(this, new i(null));
        C5189lv.k(C8056za.j(this), null, new j(null), 3);
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
    }

    public final void l(@NotNull L80 eventPlaceCall) {
        Intrinsics.checkNotNullParameter(eventPlaceCall, "eventPlaceCall");
        ReporterApi.a.b(this.g, EnumC5028l80.y0, new C1510Md1(eventPlaceCall.d), null, 12);
        this.d.a();
    }

    public final void m() {
        C2726aU0 c2726aU0 = this.m;
        if (c2726aU0.o()) {
            C6561sS.g(this, new l(null));
        }
        if (c2726aU0.n()) {
            this.h.b(new C6123qL1(new C6693t4(this, 3), new C6819tg(this, 2)));
        }
    }
}

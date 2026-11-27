package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1486Lv1 extends C7576xG {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final AbstractC7949z22 e;

    @NotNull
    public final C6355rT0 f;

    @NotNull
    public final InterfaceC3721f81 g;

    @NotNull
    public final C4617jA1 h;

    @NotNull
    public final InterfaceC4315hz1 i;

    @NotNull
    public final InterfaceC3493e4 j;

    @NotNull
    public final LU k;

    @NotNull
    public final InterfaceC2191Uv1 l;

    @NotNull
    public final C3670eu1 m;

    @NotNull
    public final C4612j90 n;

    @NotNull
    public final NQ o;

    @NotNull
    public final C1699On1 p;

    @NotNull
    public final e q;

    @NotNull
    public final GP1 r;

    @NotNull
    public final C1621Nn1 s;

    /* JADX INFO: renamed from: Lv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$1", f = "RobotCommonViewModelBase.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1486Lv1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
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
                return Unit.a;
            }
            C1795Pt1.b(obj);
            InterfaceC2191Uv1 interfaceC2191Uv1 = C1486Lv1.this.l;
            this.d = 1;
            interfaceC2191Uv1.a(this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: Lv1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$2", f = "RobotCommonViewModelBase.kt", l = {83}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Lv1$b$a */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$2$3", f = "RobotCommonViewModelBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
            public /* synthetic */ boolean d;
            public final /* synthetic */ C1486Lv1 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1486Lv1 c1486Lv1, JM<? super a> jm) {
                super(2, jm);
                this.e = c1486Lv1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.e, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Unit> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                boolean z = this.d;
                C1486Lv1 c1486Lv1 = this.e;
                if (z) {
                    C4617jA1 c4617jA1 = c1486Lv1.h;
                    c4617jA1.getClass();
                    c4617jA1.u(true);
                    c4617jA1.l(FI1.c.b);
                } else {
                    c1486Lv1.h.u(true);
                }
                c1486Lv1.e.d();
                c1486Lv1.i.a(EnumC4105gz1.d);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: Lv1$b$b, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$2$4", f = "RobotCommonViewModelBase.kt", l = {93}, m = "invokeSuspend")
        public static final class C0089b extends AW1 implements Function1<JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ C1486Lv1 e;

            /* JADX INFO: renamed from: Lv1$b$b$a */
            public static final class a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ C1486Lv1 d;

                public a(C1486Lv1 c1486Lv1) {
                    this.d = c1486Lv1;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    C1486Lv1 c1486Lv1 = this.d;
                    if (zBooleanValue) {
                        c1486Lv1.i.a(EnumC4105gz1.g);
                    } else {
                        c1486Lv1.i.a(EnumC4105gz1.d);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0089b(C1486Lv1 c1486Lv1, JM<? super C0089b> jm) {
                super(1, jm);
                this.e = c1486Lv1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0089b(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Unit> jm) {
                ((C0089b) create(jm)).invokeSuspend(Unit.a);
                return MN.d;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C1486Lv1 c1486Lv1 = this.e;
                    C1699On1 c1699On1 = c1486Lv1.h.B;
                    a aVar = new a(c1486Lv1);
                    this.d = 1;
                    if (c1699On1.d.c(aVar, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                throw new C3342dL0();
            }
        }

        /* JADX INFO: renamed from: Lv1$b$c */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$2$5", f = "RobotCommonViewModelBase.kt", l = {102}, m = "invokeSuspend")
        public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ C1486Lv1 e;

            /* JADX INFO: renamed from: Lv1$b$c$a */
            public static final class a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ C1486Lv1 d;

                public a(C1486Lv1 c1486Lv1) {
                    this.d = c1486Lv1;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    ((Boolean) obj).getClass();
                    C1486Lv1 c1486Lv1 = this.d;
                    c1486Lv1.i.a(EnumC4105gz1.d);
                    c1486Lv1.j.a(true);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C1486Lv1 c1486Lv1, JM<? super c> jm) {
                super(1, jm);
                this.e = c1486Lv1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new c(this.e, jm);
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
                C1486Lv1 c1486Lv1 = this.e;
                GP1 gp1 = c1486Lv1.d.e;
                a aVar = new a(c1486Lv1);
                this.d = 1;
                gp1.c(new C1564Mv1(aVar), this);
                return mn;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1486Lv1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C1486Lv1 c1486Lv1 = C1486Lv1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                c1486Lv1.e.j();
                GP1 gp1 = c1486Lv1.d.k;
                this.d = 1;
                if (C7236vf0.a(gp1, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C4617jA1 c4617jA1 = c1486Lv1.h;
            C1523Mi viewModelScopeProvider = new C1523Mi(c1486Lv1, 5);
            c4617jA1.getClass();
            Intrinsics.checkNotNullParameter(viewModelScopeProvider, "viewModelScopeProvider");
            c4617jA1.A = viewModelScopeProvider;
            C5189lv.k(C8056za.j(c1486Lv1), null, new C5670oA1(c4617jA1, null), 3);
            KN knInvoke = c4617jA1.A.invoke();
            if (knInvoke != null) {
                C5189lv.k(knInvoke, null, new C4827kA1(c4617jA1, null), 3);
            }
            KN knInvoke2 = c4617jA1.A.invoke();
            if (knInvoke2 != null) {
                C5189lv.k(knInvoke2, null, new C5250mA1(c4617jA1, null), 3);
            }
            C4617jA1 c4617jA2 = c1486Lv1.h;
            if (((Boolean) c4617jA2.B.d.getValue()).booleanValue()) {
                KN knInvoke3 = c4617jA2.A.invoke();
                if (knInvoke3 == null) {
                    c4617jA2.k("tryRestart");
                } else {
                    c4617jA2.Q.set(true);
                    c4617jA2.P = C5189lv.k(knInvoke3, C6266r20.a, new C6509sA1(c4617jA2, null), 2);
                }
            }
            c1486Lv1.g.a(new C7121v6(c1486Lv1, 5));
            a onLogout = new a(c1486Lv1, null);
            C6355rT0 c6355rT0 = c1486Lv1.f;
            c6355rT0.getClass();
            Intrinsics.checkNotNullParameter(onLogout, "onLogout");
            c6355rT0.i.add(onLogout);
            C6561sS.g(c1486Lv1, new C0089b(c1486Lv1, null));
            C6561sS.g(c1486Lv1, new c(c1486Lv1, null));
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Lv1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$3", f = "RobotCommonViewModelBase.kt", l = {109}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Lv1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1486Lv1 d;

            public a(C1486Lv1 c1486Lv1) {
                this.d = c1486Lv1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objL = C1486Lv1.l(this.d, true, jm);
                return objL == MN.d ? objL : Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1486Lv1.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            ((c) create(jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1486Lv1 c1486Lv1 = C1486Lv1.this;
                C1621Nn1 c1621Nn1 = c1486Lv1.h.C;
                a aVar = new a(c1486Lv1);
                this.d = 1;
                if (c1621Nn1.d.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    /* JADX INFO: renamed from: Lv1$d */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$4", f = "RobotCommonViewModelBase.kt", l = {114}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Lv1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1486Lv1 d;

            /* JADX INFO: renamed from: Lv1$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onInit$4$1", f = "RobotCommonViewModelBase.kt", l = {116}, m = "emit")
            public static final class C0090a extends LM {
                public C2337Wr d;
                public InterfaceC3907g21 e;
                public C1486Lv1 g;
                public Object h;
                public /* synthetic */ Object i;
                public final /* synthetic */ a<T> j;
                public int k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0090a(a<? super T> aVar, JM<? super C0090a> jm) {
                    super(jm);
                    this.j = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.i = obj;
                    this.k |= Integer.MIN_VALUE;
                    return this.j.a(null, this);
                }
            }

            public a(C1486Lv1 c1486Lv1) {
                this.d = c1486Lv1;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004b  */
            /* JADX WARN: Code duplicated, block: B:19:0x005b A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:20:0x005c  */
            /* JADX WARN: Code duplicated, block: B:24:0x0083  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [g21] */
            /* JADX WARN: Type inference failed for: r4v2, types: [g21] */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v5 */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:22:0x0066). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x0060). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x004b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(defpackage.C2337Wr r11, defpackage.JM<? super kotlin.Unit> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof defpackage.C1486Lv1.d.a.C0090a
                    if (r0 == 0) goto L13
                    r0 = r12
                    Lv1$d$a$a r0 = (defpackage.C1486Lv1.d.a.C0090a) r0
                    int r1 = r0.k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.k = r1
                    goto L18
                L13:
                    Lv1$d$a$a r0 = new Lv1$d$a$a
                    r0.<init>(r10, r12)
                L18:
                    java.lang.Object r12 = r0.i
                    MN r1 = defpackage.MN.d
                    int r2 = r0.k
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r11 = r0.h
                    Lv1 r2 = r0.g
                    g21 r4 = r0.e
                    Wr r5 = r0.d
                    defpackage.C1795Pt1.b(r12)
                    goto L60
                L2f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L37:
                    defpackage.C1795Pt1.b(r12)
                    Lv1 r12 = r10.d
                    j90 r2 = r12.n
                    GP1 r2 = r2.c
                    r4 = r2
                    r2 = r12
                L42:
                    java.lang.Object r12 = r4.getValue()
                    r5 = r12
                    j90$a r5 = (defpackage.C4612j90.a) r5
                    if (r5 != 0) goto L66
                    r0.d = r11
                    r0.e = r4
                    r0.g = r2
                    r0.h = r12
                    r0.k = r3
                    java.lang.Object r5 = r2.o(r3, r0)
                    if (r5 != r1) goto L5c
                    return r1
                L5c:
                    r9 = r5
                    r5 = r11
                    r11 = r12
                    r12 = r9
                L60:
                    j90$a r12 = (defpackage.C4612j90.a) r12
                    r9 = r12
                    r12 = r11
                    r11 = r5
                    r5 = r9
                L66:
                    j90$a r6 = new j90$a
                    T r5 = r5.a
                    sL1 r5 = (defpackage.C6542sL1) r5
                    java.lang.String r7 = r5.a
                    java.lang.String r8 = "assetSymbol"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
                    sL1 r8 = new sL1
                    tL1 r5 = r5.b
                    r8.<init>(r7, r5, r11)
                    r6.<init>(r8)
                    boolean r12 = r4.d(r12, r6)
                    if (r12 == 0) goto L42
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C1486Lv1.d.a.a(Wr, JM):java.lang.Object");
            }
        }

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1486Lv1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            ((d) create(jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1486Lv1 c1486Lv1 = C1486Lv1.this;
                C1621Nn1 c1621Nn1 = c1486Lv1.h.D;
                a aVar = new a(c1486Lv1);
                this.d = 1;
                if (c1621Nn1.d.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    /* JADX INFO: renamed from: Lv1$e */
    public static final class e implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C1699On1 d;

        /* JADX INFO: renamed from: Lv1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Lv1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$special$$inlined$filter$1$2", f = "RobotCommonViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0091a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0091a(JM jm) {
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
                C0091a c0091a;
                if (jm instanceof C0091a) {
                    c0091a = (C0091a) jm;
                    int i = c0091a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0091a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0091a = new C0091a(jm);
                    }
                } else {
                    c0091a = new C0091a(jm);
                }
                Object obj2 = c0091a.d;
                MN mn = MN.d;
                int i2 = c0091a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c0091a.e = 1;
                        if (this.d.a(obj, c0091a) == mn) {
                            return mn;
                        }
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

        public e(C1699On1 c1699On1) {
            this.d = c1699On1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: Lv1$f */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$special$$inlined$transform$1", f = "RobotCommonViewModelBase.kt", l = {36}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<InterfaceC6606sf0<? super Unit>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ C1486Lv1 h;

        /* JADX INFO: renamed from: Lv1$f$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0<Unit> d;
            public final /* synthetic */ C1486Lv1 e;

            /* JADX INFO: renamed from: Lv1$f$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$special$$inlined$transform$1$1", f = "RobotCommonViewModelBase.kt", l = {219, 220}, m = "emit")
            public static final class C0092a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public a h;
                public InterfaceC6606sf0 i;

                public C0092a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, C1486Lv1 c1486Lv1) {
                this.e = c1486Lv1;
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(T t, @NotNull JM<? super Unit> jm) {
                C0092a c0092a;
                InterfaceC6606sf0<Unit> interfaceC6606sf0;
                a<T> aVar;
                a<T> aVar2;
                if (jm instanceof C0092a) {
                    c0092a = (C0092a) jm;
                    int i = c0092a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0092a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0092a = new C0092a(jm);
                    }
                } else {
                    c0092a = new C0092a(jm);
                }
                Object objM = c0092a.d;
                MN mn = MN.d;
                int i2 = c0092a.e;
                if (i2 == 0) {
                    C1795Pt1.b(objM);
                    ((Number) t).intValue();
                    c0092a.h = this;
                    interfaceC6606sf0 = this.d;
                    c0092a.i = interfaceC6606sf0;
                    c0092a.e = 1;
                    objM = C1486Lv1.m(this.e, c0092a);
                    if (objM != mn) {
                        aVar = this;
                    }
                    return mn;
                }
                if (i2 == 1) {
                    interfaceC6606sf0 = c0092a.i;
                    aVar = c0092a.h;
                    C1795Pt1.b(objM);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = c0092a.h;
                    C1795Pt1.b(objM);
                }
                C1486Lv1 c1486Lv1 = aVar2.e;
                c1486Lv1.m.g.b(c1486Lv1.n());
                return Unit.a;
                if (((Boolean) objM).booleanValue()) {
                    Unit unit = Unit.a;
                    c0092a.h = aVar;
                    c0092a.i = null;
                    c0092a.e = 2;
                    if (interfaceC6606sf0.a(unit, c0092a) != mn) {
                        aVar2 = aVar;
                        C1486Lv1 c1486Lv2 = aVar2.e;
                        c1486Lv2.m.g.b(c1486Lv2.n());
                    }
                    return mn;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C1486Lv1 c1486Lv1) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = c1486Lv1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            f fVar = new f(this.g, jm, this.h);
            fVar.e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super Unit> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((f) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a((InterfaceC6606sf0) this.e, this.h);
                this.d = 1;
                if (this.g.c(aVar, this) == mn) {
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

    public C1486Lv1(@NotNull C4923kf appData, @NotNull AbstractC7949z22 assetsProvider, @NotNull C6355rT0 logoutManager, @NotNull InterfaceC3721f81 robotTradingOptions, @NotNull C4617jA1 robotTrading, @NotNull C1804Pw1 tutorialManager, @NotNull InterfaceC4315hz1 robotScreenStateProviderBase, @NotNull InterfaceC3493e4 accountSelectionEnabledProvider, @NotNull LU deeplinkManager, @NotNull InterfaceC2191Uv1 robotCommonViewsVisibilityControllerApi, @NotNull C3670eu1 reviewDialogDeps, @NotNull C4612j90 robotEvents, @NotNull NQ currentIndicatorParamsProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(logoutManager, "logoutManager");
        Intrinsics.checkNotNullParameter(robotTradingOptions, "robotTradingOptions");
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(tutorialManager, "tutorialManager");
        Intrinsics.checkNotNullParameter(robotScreenStateProviderBase, "robotScreenStateProviderBase");
        Intrinsics.checkNotNullParameter(accountSelectionEnabledProvider, "accountSelectionEnabledProvider");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(robotCommonViewsVisibilityControllerApi, "robotCommonViewsVisibilityControllerApi");
        Intrinsics.checkNotNullParameter(reviewDialogDeps, "reviewDialogDeps");
        Intrinsics.checkNotNullParameter(robotEvents, "robotEvents");
        Intrinsics.checkNotNullParameter(currentIndicatorParamsProvider, "currentIndicatorParamsProvider");
        this.d = appData;
        this.e = assetsProvider;
        this.f = logoutManager;
        this.g = robotTradingOptions;
        this.h = robotTrading;
        this.i = robotScreenStateProviderBase;
        this.j = accountSelectionEnabledProvider;
        this.k = deeplinkManager;
        this.l = robotCommonViewsVisibilityControllerApi;
        this.m = reviewDialogDeps;
        this.n = robotEvents;
        this.o = currentIndicatorParamsProvider;
        InterfaceC6396rf0 interfaceC6396rf0A = tutorialManager.a(C1589Ne.i(null), tutorialManager.a.a);
        LL ll = IK1.a.a;
        this.p = k(interfaceC6396rf0A, null, ll);
        this.q = new e(robotTrading.B);
        this.r = tutorialManager.d;
        this.s = C4466ii.D(new C3735fC1(new f(reviewDialogDeps.a.i(), null, this)), C8056za.j(this), ll);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object l(C1486Lv1 c1486Lv1, boolean z, JM jm) {
        C1957Rv1 c1957Rv1;
        GP1 gp1;
        c1486Lv1.getClass();
        if (jm instanceof C1957Rv1) {
            c1957Rv1 = (C1957Rv1) jm;
            int i = c1957Rv1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1957Rv1.h = i - Integer.MIN_VALUE;
            } else {
                c1957Rv1 = new C1957Rv1(c1486Lv1, jm);
            }
        } else {
            c1957Rv1 = new C1957Rv1(c1486Lv1, jm);
        }
        Object obj = c1957Rv1.e;
        Object obj2 = MN.d;
        int i2 = c1957Rv1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            GP1 gp2 = c1486Lv1.n.c;
            c1957Rv1.d = gp2;
            c1957Rv1.h = 1;
            Object objO = c1486Lv1.o(z, c1957Rv1);
            if (objO == obj2) {
                return obj2;
            }
            obj = objO;
            gp1 = gp2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gp1 = c1957Rv1.d;
            C1795Pt1.b(obj);
        }
        gp1.setValue(obj);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object m(C1486Lv1 c1486Lv1, LM lm) {
        C2035Sv1 c2035Sv1;
        C1486Lv1 c1486Lv2;
        boolean z;
        C1486Lv1 c1486Lv3;
        c1486Lv1.getClass();
        if (lm instanceof C2035Sv1) {
            c2035Sv1 = (C2035Sv1) lm;
            int i = c2035Sv1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2035Sv1.j = i - Integer.MIN_VALUE;
            } else {
                c2035Sv1 = new C2035Sv1(c1486Lv1, lm);
            }
        } else {
            c2035Sv1 = new C2035Sv1(c1486Lv1, lm);
        }
        Object objG = c2035Sv1.h;
        MN mn = MN.d;
        int i2 = c2035Sv1.j;
        int i3 = 1;
        if (i2 == 0) {
            C1795Pt1.b(objG);
            boolean zBooleanValue = ((Boolean) c1486Lv1.d.e.getValue()).booleanValue();
            Ki2 ki2 = c1486Lv1.m.a;
            c2035Sv1.d = c1486Lv1;
            c2035Sv1.e = zBooleanValue;
            c2035Sv1.j = 1;
            Object objC = ki2.c(zBooleanValue, c2035Sv1);
            if (objC != mn) {
                c1486Lv2 = c1486Lv1;
                z = zBooleanValue;
                objG = objC;
            }
        }
        if (i2 == 1) {
            z = c2035Sv1.e;
            c1486Lv2 = c2035Sv1.d;
            C1795Pt1.b(objG);
        } else {
            if (i2 == 2) {
                int i4 = c2035Sv1.g;
                c1486Lv2 = c2035Sv1.d;
                C1795Pt1.b(objG);
                i3 = i4;
                c1486Lv3 = c1486Lv2;
                boolean zBooleanValue2 = ((Boolean) objG).booleanValue();
                if (c1486Lv3.m.c.o() || (i3 == 0 && !zBooleanValue2)) {
                    return Boolean.FALSE;
                }
                InterfaceC4548iu1 interfaceC4548iu1 = c1486Lv3.m.b;
                c2035Sv1.d = c1486Lv3;
                c2035Sv1.j = 3;
                if (interfaceC4548iu1.b(null, c2035Sv1) != mn) {
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objG);
                return objG;
            }
            c1486Lv3 = c2035Sv1.d;
            C1795Pt1.b(objG);
        }
        InterfaceC4548iu1 interfaceC4548iu2 = c1486Lv3.m.b;
        c2035Sv1.d = null;
        c2035Sv1.j = 4;
        Object objA = interfaceC4548iu2.a(c2035Sv1);
        return objA == mn ? mn : objA;
        int iIntValue = ((Number) objG).intValue();
        if ((!z || iIntValue < 1) && (z || iIntValue < 2)) {
            i3 = 0;
        }
        InterfaceC4548iu1 interfaceC4548iu3 = c1486Lv2.m.b;
        c2035Sv1.d = c1486Lv2;
        c2035Sv1.g = i3;
        c2035Sv1.j = 2;
        objG = interfaceC4548iu3.g(c2035Sv1);
        if (objG != mn) {
            c1486Lv3 = c1486Lv2;
            boolean zBooleanValue3 = ((Boolean) objG).booleanValue();
            if (c1486Lv3.m.c.o()) {
            }
            return Boolean.FALSE;
        }
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new a(null));
        C6561sS.g(this, new b(null));
        C6561sS.g(this, new c(null));
        C6561sS.g(this, new d(null));
    }

    public final String n() {
        if (((Boolean) this.d.e.getValue()).booleanValue()) {
            L80 l80 = L80.MAX_PROFIT;
            return "robot_real";
        }
        L80 l81 = L80.MAX_PROFIT;
        return "robot_demo";
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(boolean z, LM lm) {
        C1253Iv1 c1253Iv1;
        C1486Lv1 c1486Lv1;
        String str;
        C6752tL1 c6752tL1;
        String str2;
        C1486Lv1 c1486Lv2;
        InterfaceC7722xy0 interfaceC7722xy0;
        C7725xz0 c7725xz0A;
        if (lm instanceof C1253Iv1) {
            c1253Iv1 = (C1253Iv1) lm;
            int i = c1253Iv1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1253Iv1.j = i - Integer.MIN_VALUE;
            } else {
                c1253Iv1 = new C1253Iv1(this, lm);
            }
        } else {
            c1253Iv1 = new C1253Iv1(this, lm);
        }
        Object objA = c1253Iv1.h;
        MN mn = MN.d;
        int i2 = c1253Iv1.j;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            C1621Nn1 c1621Nn1 = this.h.U;
            c1253Iv1.d = this;
            c1253Iv1.g = z;
            c1253Iv1.j = 1;
            objA = C7236vf0.a(c1621Nn1, c1253Iv1);
            if (objA != mn) {
                c1486Lv1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            z = c1253Iv1.g;
            c1486Lv1 = (C1486Lv1) c1253Iv1.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1486Lv2 = c1253Iv1.e;
            str2 = (String) c1253Iv1.d;
            C1795Pt1.b(objA);
        }
        interfaceC7722xy0 = (InterfaceC7722xy0) objA;
        c1486Lv2.getClass();
        if (interfaceC7722xy0 != null || (c7725xz0A = C7935yz0.a(interfaceC7722xy0)) == null) {
            c6752tL1 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = c7725xz0A.c.iterator();
            while (it.hasNext()) {
                List<C3471dy0> list = ((C1027Fy0) it.next()).c;
                ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C3471dy0) it2.next()).b);
                }
                C2904bF.o(arrayList, arrayList2);
            }
            c6752tL1 = new C6752tL1(c7725xz0A.b.d, arrayList);
        }
        if (c6752tL1 == null) {
            c6752tL1 = new C6752tL1("clear", C5653o60.d);
        }
        str = str2;
        return new C4612j90.a(new C6542sL1(str, c6752tL1, null));
        str = ((C3279d22) objA).c;
        if (z) {
            InterfaceC6396rf0<InterfaceC7722xy0<?>> interfaceC6396rf0 = c1486Lv1.o.c;
            c1253Iv1.d = str;
            c1253Iv1.e = c1486Lv1;
            c1253Iv1.j = 2;
            Object objQ = C4466ii.q(interfaceC6396rf0, c1253Iv1);
            if (objQ != mn) {
                str2 = str;
                objA = objQ;
                c1486Lv2 = c1486Lv1;
                interfaceC7722xy0 = (InterfaceC7722xy0) objA;
                c1486Lv2.getClass();
                if (interfaceC7722xy0 != null) {
                    c6752tL1 = null;
                } else {
                    c6752tL1 = null;
                }
                if (c6752tL1 == null) {
                    c6752tL1 = new C6752tL1("clear", C5653o60.d);
                }
                str = str2;
            }
            return mn;
        }
        c6752tL1 = null;
        return new C4612j90.a(new C6542sL1(str, c6752tL1, null));
    }
}

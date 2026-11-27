package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.feature.analytics.reporters.ReporterApi;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1146Hm extends AbstractC1394Kq1 implements InterfaceC1472Lq1 {

    @NotNull
    public final ReporterApi I;

    @NotNull
    public final TK1 J;

    @NotNull
    public final RU1 K;

    @NotNull
    public final InterfaceC1691Ol L;

    @NotNull
    public final EC1 M;

    @NotNull
    public final XV N;

    @NotNull
    public final InterfaceC1767Pk0 O;

    @NotNull
    public final OU1 P;

    @NotNull
    public final WS0 Q;

    @NotNull
    public final InterfaceC4374iF1 R;

    @NotNull
    public final InterfaceC5599nq1 S;

    @NotNull
    public final InterfaceC4358iA0 T;

    @NotNull
    public final InterfaceC5703oL1 U;

    @NotNull
    public final C4612j90 V;

    @NotNull
    public String W;

    @NotNull
    public String X;

    @NotNull
    public final GP1 Y;

    @NotNull
    public final C1699On1 Z;

    @NotNull
    public final GP1 a0;

    @NotNull
    public final GP1 b0;

    @NotNull
    public final C1699On1 c0;

    @NotNull
    public final InterfaceC6396rf0<DuoAuthType> d0;

    @NotNull
    public final GP1 e0;

    /* JADX INFO: renamed from: Hm$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$1", f = "AuthorizationViewModelBase.kt", l = {129}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Hm$a$a, reason: collision with other inner class name */
        public static final class C0044a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1146Hm d;

            public C0044a(C1146Hm c1146Hm) {
                this.d = c1146Hm;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                ((Boolean) obj).getClass();
                C6120qK1 c6120qK1 = this.d.i;
                Unit unit = Unit.a;
                Object objA = c6120qK1.a(unit, jm);
                return objA == MN.d ? objA : unit;
            }
        }

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1146Hm.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            int i2 = 1;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1146Hm c1146Hm = C1146Hm.this;
                C0892Ef0 c0892Ef0 = new C0892Ef0(new C4561iz(i2, 3), c1146Hm.V.m, null);
                C0044a c0044a = new C0044a(c1146Hm);
                this.d = 1;
                Object objG = LE.g(new C7026uf0(c0892Ef0, new C1224Im(c0044a), null), this);
                if (objG != obj2) {
                    objG = Unit.a;
                }
                if (objG != obj2) {
                    objG = Unit.a;
                }
                if (objG == obj2) {
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

    /* JADX INFO: renamed from: Hm$b */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$2", f = "AuthorizationViewModelBase.kt", l = {136}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Hm$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1146Hm d;

            public a(C1146Hm c1146Hm) {
                this.d = c1146Hm;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final /* bridge */ /* synthetic */ Object a(Object obj, JM jm) {
                return b(jm);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object b(JM jm) throws Throwable {
                C1302Jm c1302Jm;
                a<T> aVar;
                if (jm instanceof C1302Jm) {
                    c1302Jm = (C1302Jm) jm;
                    int i = c1302Jm.h;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1302Jm.h = i - Integer.MIN_VALUE;
                    } else {
                        c1302Jm = new C1302Jm(this, jm);
                    }
                } else {
                    c1302Jm = new C1302Jm(this, jm);
                }
                Object obj = c1302Jm.e;
                Object obj2 = MN.d;
                int i2 = c1302Jm.h;
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    c1302Jm.d = this;
                    c1302Jm.h = 1;
                    C1146Hm c1146Hm = this.d;
                    c1146Hm.getClass();
                    RV rv = C6266r20.a;
                    Object objP = C5189lv.p(QV0.a, new C0912Em(c1146Hm, null), c1302Jm);
                    if (objP != obj2) {
                        objP = Unit.a;
                    }
                    if (objP == obj2) {
                        return obj2;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c1302Jm.d;
                    C1795Pt1.b(obj);
                }
                GP1 gp1 = aVar.d.k;
                Boolean bool = Boolean.FALSE;
                gp1.getClass();
                gp1.m(null, bool);
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1146Hm.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1146Hm c1146Hm = C1146Hm.this;
                C1621Nn1 c1621Nn1B = c1146Hm.K.b();
                a aVar = new a(c1146Hm);
                this.d = 1;
                Object objC = c1621Nn1B.d.c(new C1380Km(aVar, c1146Hm), this);
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

    /* JADX INFO: renamed from: Hm$c */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$3", f = "AuthorizationViewModelBase.kt", l = {144}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Hm$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1146Hm d;

            /* JADX INFO: renamed from: Hm$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$3$2", f = "AuthorizationViewModelBase.kt", l = {146, 148}, m = "emit")
            public static final class C0045a extends LM {
                public a d;
                public /* synthetic */ Object e;
                public final /* synthetic */ a<T> g;
                public int h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0045a(a<? super T> aVar, JM<? super C0045a> jm) {
                    super(jm);
                    this.g = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.e = obj;
                    this.h |= Integer.MIN_VALUE;
                    return this.g.a(null, this);
                }
            }

            public a(C1146Hm c1146Hm) {
                this.d = c1146Hm;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
            
                if (kotlin.Unit.a == r1) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
            
                if (kotlin.Unit.a == r1) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
            
                return r1;
             */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(OU1.a r7, defpackage.JM<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.C1146Hm.c.a.C0045a
                    if (r0 == 0) goto L13
                    r0 = r8
                    Hm$c$a$a r0 = (defpackage.C1146Hm.c.a.C0045a) r0
                    int r1 = r0.h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.h = r1
                    goto L18
                L13:
                    Hm$c$a$a r0 = new Hm$c$a$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.e
                    MN r1 = defpackage.MN.d
                    int r2 = r0.h
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r5) goto L35
                    if (r2 != r3) goto L2d
                    Hm$c$a r7 = r0.d
                    defpackage.C1795Pt1.b(r8)
                    goto L82
                L2d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L35:
                    Hm$c$a r7 = r0.d
                    defpackage.C1795Pt1.b(r8)
                    goto L64
                L3b:
                    defpackage.C1795Pt1.b(r8)
                    OU1$a r8 = OU1.a.e
                    if (r7 != r8) goto L63
                    r0.d = r6
                    r0.h = r5
                    Hm r7 = r6.d
                    r7.getClass()
                    la r8 = defpackage.EnumC5113la.ENTER_WRONG_ACCOUNT
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r5)
                    com.api.feature.analytics.reporters.ReporterApi r7 = r7.I
                    com.api.feature.analytics.reporters.ReporterApi.a.a(r7, r8, r2)
                    la r8 = defpackage.EnumC5113la.REGISTRATED
                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                    com.api.feature.analytics.reporters.ReporterApi.a.a(r7, r8, r2)
                    kotlin.Unit r7 = kotlin.Unit.a
                    if (r7 != r1) goto L63
                    goto L81
                L63:
                    r7 = r6
                L64:
                    Hm r8 = r7.d
                    r0.d = r7
                    r0.h = r3
                    r8.getClass()
                    KN r0 = defpackage.C8056za.j(r8)
                    RV r2 = defpackage.C6266r20.a
                    zn0 r2 = defpackage.QV0.a
                    Dm r5 = new Dm
                    r5.<init>(r8, r4)
                    defpackage.C5189lv.k(r0, r2, r5, r3)
                    kotlin.Unit r8 = kotlin.Unit.a
                    if (r8 != r1) goto L82
                L81:
                    return r1
                L82:
                    Hm r7 = r7.d
                    GP1 r7 = r7.k
                    java.lang.Boolean r8 = java.lang.Boolean.FALSE
                    r7.getClass()
                    r7.m(r4, r8)
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C1146Hm.c.a.a(OU1$a, JM):java.lang.Object");
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1146Hm.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1146Hm c1146Hm = C1146Hm.this;
                C1621Nn1 c1621Nn1B = c1146Hm.P.b();
                a aVar = new a(c1146Hm);
                this.d = 1;
                Object objC = c1621Nn1B.d.c(new C1458Lm(aVar, c1146Hm), this);
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

    /* JADX INFO: renamed from: Hm$d */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$4", f = "AuthorizationViewModelBase.kt", l = {153}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Hm$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1146Hm d;

            public a(C1146Hm c1146Hm) {
                this.d = c1146Hm;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C7474wm c7474wm = (C7474wm) obj;
                ReporterApi.a.b(this.d.I, c7474wm.a, c7474wm.b, null, 12);
                return Unit.a;
            }
        }

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C1146Hm.this.new d(jm);
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
                C1146Hm c1146Hm = C1146Hm.this;
                C1699On1 c1699On1 = c1146Hm.c0;
                Intrinsics.checkNotNullParameter(c1699On1, "<this>");
                a aVar = new a(c1146Hm);
                this.d = 1;
                Object objC = c1699On1.d.c(new C5351mg0(new C7684xm(aVar), new C2590Zo1()), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
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

    /* JADX INFO: renamed from: Hm$e */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$5", f = "AuthorizationViewModelBase.kt", l = {158}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Hm$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C1146Hm d;

            public a(C1146Hm c1146Hm) {
                this.d = c1146Hm;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                DuoAuthType type = (DuoAuthType) obj;
                C1146Hm c1146Hm = this.d;
                c1146Hm.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                c1146Hm.L.h();
                return Unit.a;
            }
        }

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C1146Hm.this.new e(jm);
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
                C1146Hm c1146Hm = C1146Hm.this;
                C1845Qk0.a aVarA = c1146Hm.O.a();
                a aVar = new a(c1146Hm);
                this.d = 1;
                if (aVarA.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: Hm$f */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onLoginClick$1", f = "AuthorizationViewModelBase.kt", l = {HttpPlatformResponse.MAX_MESSAGE_LENGTH, 206, 211}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public f(JM<? super f> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C1146Hm.this.new f(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:29:0x009c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
        
            if (r11.a(r10) == r0) goto L36;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1146Hm.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Hm$g */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$startTransition$1", f = "AuthorizationViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, boolean z2, JM<? super g> jm) {
            super(2, jm);
            this.e = z;
            this.g = z2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C1146Hm.this.new g(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object value;
            N42 n42;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C1146Hm c1146Hm = C1146Hm.this;
            GP1 gp1 = c1146Hm.b0;
            do {
                value = gp1.getValue();
                n42 = (N42) value;
                int iOrdinal = n42.ordinal();
                boolean z = this.e;
                boolean z2 = this.g;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 && !z) {
                        C1146Hm.w(c1146Hm, z2);
                        n42 = N42.h;
                    }
                } else if (z) {
                    C1146Hm.w(c1146Hm, z2);
                    n42 = N42.g;
                }
            } while (!gp1.d(value, n42));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146Hm(@NotNull C1273Jc0 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase, @NotNull NB checkboxValidationUseCase, @NotNull InterfaceC7699xq1 registerUseCase, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC1547Mq baseRegistrationCallback, @NotNull TK1 shouldCleanProvider, @NotNull RU1 successRegisterUseCase, @NotNull InterfaceC1691Ol authorizationCallbacks, @NotNull EC1 savedEmailProvider, @NotNull XV showErrorUseCase, @NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull OU1 successLoginUseCase, @NotNull WS0 loginUseCase, @NotNull InterfaceC4374iF1 selectedAccountProvider, @NotNull InterfaceC5599nq1 registerDialogsManager, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull InterfaceC5703oL1 showLoginErrorDialogUserCase, @NotNull C4612j90 events) {
        super(emailValidationUseCase, passwordValidationUseCase, checkboxValidationUseCase, registerUseCase, appData, reporter, baseRegistrationCallback);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        Intrinsics.checkNotNullParameter(checkboxValidationUseCase, "checkboxValidationUseCase");
        Intrinsics.checkNotNullParameter(registerUseCase, "registerUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(baseRegistrationCallback, "baseRegistrationCallback");
        Intrinsics.checkNotNullParameter(shouldCleanProvider, "shouldCleanProvider");
        Intrinsics.checkNotNullParameter(successRegisterUseCase, "successRegisterUseCase");
        Intrinsics.checkNotNullParameter(authorizationCallbacks, "authorizationCallbacks");
        Intrinsics.checkNotNullParameter(savedEmailProvider, "savedEmailProvider");
        Intrinsics.checkNotNullParameter(showErrorUseCase, "showErrorUseCase");
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(successLoginUseCase, "successLoginUseCase");
        Intrinsics.checkNotNullParameter(loginUseCase, "loginUseCase");
        Intrinsics.checkNotNullParameter(selectedAccountProvider, "selectedAccountProvider");
        Intrinsics.checkNotNullParameter(registerDialogsManager, "registerDialogsManager");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(showLoginErrorDialogUserCase, "showLoginErrorDialogUserCase");
        Intrinsics.checkNotNullParameter(events, "events");
        this.I = reporter;
        this.J = shouldCleanProvider;
        this.K = successRegisterUseCase;
        this.L = authorizationCallbacks;
        this.M = savedEmailProvider;
        this.N = showErrorUseCase;
        this.O = getCodeIfNeededFromDuoAuthUseCase;
        this.P = successLoginUseCase;
        this.Q = loginUseCase;
        this.R = selectedAccountProvider;
        this.S = registerDialogsManager;
        this.T = initializeExecutorUseCase;
        this.U = showLoginErrorDialogUserCase;
        this.V = events;
        this.W = "";
        this.X = "";
        GP1 gp1I = C1589Ne.i(C5653o60.d);
        this.Y = gp1I;
        this.Z = C4466ii.f(gp1I);
        Boolean bool = Boolean.FALSE;
        this.a0 = C1589Ne.i(bool);
        GP1 gp1I2 = C1589Ne.i(N42.d);
        this.b0 = gp1I2;
        C1699On1 c1699On1F = C4466ii.f(gp1I2);
        this.c0 = c1699On1F;
        this.d0 = getCodeIfNeededFromDuoAuthUseCase.a();
        C4466ii.E(new C2006Sm(c1699On1F, 0), C8056za.j(this), IK1.a.a, bool);
        this.e0 = C1589Ne.i("");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r8.a(r10, r6) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r8.a(r12, r6) == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(defpackage.C1146Hm r8, com.api.core.backend.domain.models.requestModels.CaptchaDestination r9, com.api.core.backend.domain.models.resultModels.CommonError r10, java.lang.String r11, defpackage.LM r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C1068Gm
            if (r0 == 0) goto L14
            r0 = r12
            Gm r0 = (defpackage.C1068Gm) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Gm r0 = new Gm
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.e
            MN r0 = defpackage.MN.d
            int r1 = r6.h
            r7 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L3d
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            defpackage.C1795Pt1.b(r12)
            goto L82
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            qK1 r8 = r6.d
            defpackage.C1795Pt1.b(r12)
            goto L76
        L3d:
            defpackage.C1795Pt1.b(r12)
            goto L53
        L41:
            defpackage.C1795Pt1.b(r12)
            boolean r12 = r9 instanceof com.api.core.backend.domain.models.requestModels.CaptchaDestination.Login
            if (r12 == 0) goto L56
            oL1 r8 = r8.U
            r6.h = r3
            java.lang.Object r8 = r8.a(r10, r6)
            if (r8 != r0) goto L53
            goto L81
        L53:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L56:
            boolean r12 = r9 instanceof com.api.core.backend.domain.models.requestModels.CaptchaDestination.Registration
            if (r12 == 0) goto L85
            qK1 r9 = r8.B
            r12 = r2
            KN r2 = defpackage.C8056za.j(r8)
            if (r11 != 0) goto L65
            java.lang.String r11 = ""
        L65:
            r4 = r11
            r6.d = r9
            r6.h = r12
            r5 = 0
            XV r1 = r8.N
            r3 = r10
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L75
            goto L81
        L75:
            r8 = r9
        L76:
            r9 = 0
            r6.d = r9
            r6.h = r7
            java.lang.Object r8 = r8.a(r12, r6)
            if (r8 != r0) goto L82
        L81:
            return r0
        L82:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L85:
            boolean r8 = r9 instanceof com.api.core.backend.domain.models.requestModels.CaptchaDestination.RemindPass
            if (r8 != 0) goto L94
            boolean r8 = r9 instanceof com.api.core.backend.domain.models.requestModels.CaptchaDestination.SmsSend
            if (r8 == 0) goto L8e
            goto L94
        L8e:
            s51 r8 = new s51
            r8.<init>()
            throw r8
        L94:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1146Hm.A(Hm, com.api.core.backend.domain.models.requestModels.CaptchaDestination, com.api.core.backend.domain.models.resultModels.CommonError, java.lang.String, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object D(C1146Hm c1146Hm, String str, String str2, S80 s80, LM lm) {
        C1616Nm c1616Nm;
        String str3;
        if (lm instanceof C1616Nm) {
            c1616Nm = (C1616Nm) lm;
            int i = c1616Nm.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1616Nm.i = i - Integer.MIN_VALUE;
            } else {
                c1616Nm = new C1616Nm(c1146Hm, lm);
            }
        } else {
            c1616Nm = new C1616Nm(c1146Hm, lm);
        }
        C1616Nm c1616Nm2 = c1616Nm;
        Object objD = c1616Nm2.g;
        MN mn = MN.d;
        int i2 = c1616Nm2.i;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            InterfaceC7699xq1 interfaceC7699xq1 = c1146Hm.x;
            String str4 = (String) c1146Hm.e0.getValue();
            c1616Nm2.d = c1146Hm;
            c1616Nm2.e = str;
            c1616Nm2.i = 1;
            objD = interfaceC7699xq1.d(str, str2, str4, s80, c1616Nm2);
            if (objD == mn) {
                return mn;
            }
            str3 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c1616Nm2.e;
            c1146Hm = c1616Nm2.d;
            C1795Pt1.b(objD);
        }
        CommonResult commonResult = (CommonResult) objD;
        c1146Hm.getClass();
        if (commonResult instanceof ResultError) {
            C5189lv.k(C8056za.j(c1146Hm), null, new C8104zm(c1146Hm, ((ResultError) commonResult).getError(), str3, null), 3);
        }
        return Unit.a;
    }

    public static final void w(C1146Hm c1146Hm, boolean z) {
        c1146Hm.getClass();
        C5189lv.k(C8056za.j(c1146Hm), null, new C1772Pm(c1146Hm, null), 3);
        GP1 gp1 = c1146Hm.o;
        GP1 gp2 = c1146Hm.q;
        if (z) {
            gp1.setValue(Jc2.a);
            gp2.getClass();
            gp2.m(null, "");
            return;
        }
        GP1 gp3 = c1146Hm.g;
        String str = (String) gp3.getValue();
        String str2 = (String) gp2.getValue();
        gp3.setValue(c1146Hm.W);
        gp2.setValue(c1146Hm.X);
        c1146Hm.W = str;
        c1146Hm.X = str2;
        Jc2 jc2 = Jc2.a;
        c1146Hm.e.setValue(jc2);
        gp1.setValue(jc2);
    }

    public final void B() {
        C5189lv.k(C8056za.j(this), C6266r20.c, new f(null), 2);
    }

    @Nullable
    public Object C(@NotNull CaptchaDestination captchaDestination, @NotNull CommonError commonError, @NotNull String str, @NotNull C8104zm c8104zm) {
        Object objZ = z(captchaDestination, commonError, str, c8104zm);
        return objZ == MN.d ? objZ : Unit.a;
    }

    public final void E(boolean z, boolean z2) {
        C5189lv.k(C8056za.j(this), null, new g(z2, z, null), 3);
    }

    @Override // defpackage.InterfaceC1472Lq1
    public void c(@NotNull C2098Tq1 registrationCurrency) {
        Intrinsics.checkNotNullParameter(registrationCurrency, "registrationCurrency");
    }

    @Override // defpackage.C7576xG
    public void j() {
        C6561sS.g(this, new a(null));
        C6561sS.g(this, new b(null));
        C6561sS.g(this, new c(null));
        C6561sS.g(this, new d(null));
        C5189lv.k(C8056za.j(this), null, new e(null), 3);
        if (((Boolean) this.R.a().d.getValue()).booleanValue()) {
            N42 n42 = N42.g;
            GP1 gp1 = this.b0;
            gp1.getClass();
            gp1.m(null, n42);
        }
    }

    @Override // defpackage.M50
    public final void n() {
        TK1 tk1 = this.J;
        if (tk1.a) {
            tk1.a = false;
            o();
        }
        if (tk1.b) {
            tk1.b = false;
            o();
        }
        EC1 ec1 = this.M;
        String str = ec1.a;
        if (str != null) {
            GP1 gp1 = this.g;
            gp1.getClass();
            gp1.m(null, str);
            ec1.a = null;
        }
    }

    @Override // defpackage.AbstractC7959z50
    public final void o() {
        super.o();
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.E;
        gp1.getClass();
        gp1.m(null, bool);
        this.C.setValue(Jc2.a);
    }

    @Override // defpackage.AbstractC1394Kq1
    @NotNull
    public final ReporterApi q() {
        return this.I;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    @Override // defpackage.AbstractC1394Kq1
    @Nullable
    public final Object r(@NotNull C4078gq1 c4078gq1, @NotNull JM<? super Unit> jm) {
        Function0<Unit> c0600Am;
        C1146Hm c1146Hm;
        Function0<Unit> c0756Cm;
        Object objA;
        int iOrdinal = c4078gq1.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                c0600Am = new C0678Bm(0, this, C1146Hm.class, "onLoginAfterAlreadyRegisteredErrorClick", "onLoginAfterAlreadyRegisteredErrorClick()V", 0);
                c1146Hm = this;
            } else if (iOrdinal != 6) {
                c1146Hm = this;
                c0756Cm = new C7894ym();
            } else {
                c1146Hm = this;
                c0756Cm = new C0756Cm(0, this, C1146Hm.class, "repeatRegister", "repeatRegister()V", 0);
            }
            objA = c1146Hm.S.a(c4078gq1, new C0658Bf0(Boolean.FALSE), null, c0756Cm, jm);
            if (objA == MN.d) {
                return objA;
            }
            return Unit.a;
        }
        c1146Hm = this;
        c0600Am = new C0600Am(0, c1146Hm, C1146Hm.class, "onVpnInstructionClick", "onVpnInstructionClick()V", 0, 0);
        c0756Cm = c0600Am;
        objA = c1146Hm.S.a(c4078gq1, new C0658Bf0(Boolean.FALSE), null, c0756Cm, jm);
        if (objA == MN.d) {
            return objA;
        }
        return Unit.a;
    }

    @Override // defpackage.AbstractC1394Kq1
    @Nullable
    public final Object u(@NotNull String str, @NotNull String str2, @NotNull S80 s80, @NotNull JM<? super Unit> jm) {
        return D(this, str, str2, s80, (LM) jm);
    }

    public final boolean x() {
        C1273Jc0 c1273Jc0 = this.v;
        AbstractC0961Fc0 abstractC0961Fc0A = c1273Jc0.a();
        Jc2 jc2 = Jc2.a;
        boolean zA = Intrinsics.a(abstractC0961Fc0A, jc2);
        C1273Jc0 c1273Jc1 = this.u;
        if (zA && Intrinsics.a(c1273Jc1.a(), jc2)) {
            return true;
        }
        this.e.setValue(c1273Jc1.a());
        this.o.setValue(c1273Jc0.a());
        return false;
    }

    @NotNull
    public final CQ0 y() {
        CQ0 cq0B = VE.b();
        AbstractC0961Fc0 abstractC0961Fc0A = this.u.a();
        Jc2 jc2 = Jc2.a;
        if (!Intrinsics.a(abstractC0961Fc0A, jc2)) {
            cq0B.add("email");
        }
        if (!Intrinsics.a(this.v.a(), jc2)) {
            cq0B.add("password");
        }
        return VE.a(cq0B);
    }

    @Nullable
    public Object z(@NotNull CaptchaDestination captchaDestination, @NotNull CommonError commonError, @Nullable String str, @NotNull AW1 aw1) {
        return A(this, captchaDestination, commonError, str, aw1);
    }
}

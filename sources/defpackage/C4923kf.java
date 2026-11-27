package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4923kf {

    @NotNull
    public final GP1 A;

    @NotNull
    public final GP1 B;

    @NotNull
    public final GP1 C;

    @NotNull
    public final C6120qK1 D;

    @NotNull
    public final GP1 E;

    @NotNull
    public final C1699On1 F;

    @NotNull
    public final C1699On1 G;

    @NotNull
    public final GP1 H;

    @NotNull
    public final GP1 I;

    @NotNull
    public final GP1 J;

    @NotNull
    public final GP1 K;

    @NotNull
    public final AbstractC3900g02 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final GP1 m;

    @NotNull
    public final C6120qK1 n;

    @NotNull
    public final C6120qK1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final GP1 r;

    @NotNull
    public final GP1 s;

    @NotNull
    public final C6120qK1 t;

    @NotNull
    public final C2643a41 u;

    @NotNull
    public final C6120qK1 v;

    @NotNull
    public final C6120qK1 w;

    @NotNull
    public final C6120qK1 x;

    @NotNull
    public final GP1 y;

    @NotNull
    public final GP1 z;

    /* JADX INFO: renamed from: kf$a */
    @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$1", f = "AppDataRepository.kt", l = {102}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4923kf.this.new a(jm);
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
                C6120qK1 c6120qK1 = C4923kf.this.D;
                Boolean bool = Boolean.FALSE;
                this.d = 1;
                if (c6120qK1.a(bool, this) == mn) {
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

    /* JADX INFO: renamed from: kf$b */
    @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$2", f = "AppDataRepository.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4923kf.this.new b(jm);
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
                if (C4923kf.this.a(this) == mn) {
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

    /* JADX INFO: renamed from: kf$c */
    @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$3", f = "AppDataRepository.kt", l = {108}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: kf$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4923kf d;

            public a(C4923kf c4923kf) {
                this.d = c4923kf;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.d.g.setValue((C6315rG) obj);
                return Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4923kf.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
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
            C4923kf c4923kf = C4923kf.this;
            GP1 gp1 = c4923kf.f;
            a aVar = new a(c4923kf);
            this.d = 1;
            gp1.c(new C4040gg0(aVar), this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: kf$d */
    public static final class d implements InterfaceC6396rf0<String> {
        public final /* synthetic */ e d;

        /* JADX INFO: renamed from: kf$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: kf$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$special$$inlined$filterNot$1$2", f = "AppDataRepository.kt", l = {219}, m = "emit")
            public static final class C0426a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0426a(JM jm) {
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
                C0426a c0426a;
                if (jm instanceof C0426a) {
                    c0426a = (C0426a) jm;
                    int i = c0426a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0426a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0426a = new C0426a(jm);
                    }
                } else {
                    c0426a = new C0426a(jm);
                }
                Object obj2 = c0426a.d;
                MN mn = MN.d;
                int i2 = c0426a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (!Intrinsics.a((String) obj, "0")) {
                        c0426a.e = 1;
                        if (this.d.a(obj, c0426a) == mn) {
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

        public d(e eVar) {
            this.d = eVar;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: kf$e */
    public static final class e implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: kf$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: kf$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$special$$inlined$mapNotNull$1$2", f = "AppDataRepository.kt", l = {221}, m = "emit")
            public static final class C0427a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0427a(JM jm) {
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
                C0427a c0427a;
                if (jm instanceof C0427a) {
                    c0427a = (C0427a) jm;
                    int i = c0427a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0427a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0427a = new C0427a(jm);
                    }
                } else {
                    c0427a = new C0427a(jm);
                }
                Object obj2 = c0427a.d;
                MN mn = MN.d;
                int i2 = c0427a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    String str = c6945uG != null ? c6945uG.g : null;
                    if (str != null) {
                        c0427a.e = 1;
                        if (this.d.a(str, c0427a) == mn) {
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

        public e(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: kf$f */
    public static final class f implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: kf$f$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: kf$f$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository$special$$inlined$mapNotNull$2$2", f = "AppDataRepository.kt", l = {221}, m = "emit")
            public static final class C0428a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0428a(JM jm) {
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
                C0428a c0428a;
                if (jm instanceof C0428a) {
                    c0428a = (C0428a) jm;
                    int i = c0428a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0428a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0428a = new C0428a(jm);
                    }
                } else {
                    c0428a = new C0428a(jm);
                }
                Object obj2 = c0428a.d;
                MN mn = MN.d;
                int i2 = c0428a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    String str = c6945uG != null ? c6945uG.h : null;
                    if (str != null) {
                        c0428a.e = 1;
                        if (this.d.a(str, c0428a) == mn) {
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

        public f(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public C4923kf(@NotNull AbstractC3900g02 tokenUseCase) {
        Intrinsics.checkNotNullParameter(tokenUseCase, "tokenUseCase");
        this.a = tokenUseCase;
        this.b = C1589Ne.i(null);
        this.c = C1589Ne.i(null);
        this.d = C1589Ne.i(null);
        Boolean bool = Boolean.FALSE;
        this.e = C1589Ne.i(bool);
        this.f = C1589Ne.i(null);
        this.g = C1589Ne.i(null);
        this.h = C1589Ne.i(null);
        this.i = C1589Ne.i(null);
        this.j = C1589Ne.i(null);
        GP1 gp1I = C1589Ne.i(null);
        this.k = gp1I;
        this.l = C1589Ne.i(null);
        this.m = C1589Ne.i(null);
        C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.n = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.o = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        C1589Ne.i(null);
        this.p = C1589Ne.i(null);
        C5653o60 c5653o60 = C5653o60.d;
        this.q = C1589Ne.i(c5653o60);
        GP1 gp1I2 = C1589Ne.i(null);
        this.r = gp1I2;
        this.s = C1589Ne.i(MN1.d);
        this.t = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.u = new C2643a41();
        this.v = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.w = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.x = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.y = C1589Ne.i(null);
        this.z = C1589Ne.i(bool);
        this.A = C1589Ne.i(bool);
        this.B = C1589Ne.i(Double.valueOf(10000.0d));
        this.C = C1589Ne.i(null);
        C1589Ne.i(c5653o60);
        this.D = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.E = C1589Ne.i(bool);
        d dVar = new d(new e(gp1I));
        EM em = C3784fT.a;
        LL ll = IK1.a.a;
        String upperCase = "usd".toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        C1699On1 c1699On1E = C4466ii.E(dVar, em, ll, upperCase);
        this.F = c1699On1E;
        this.G = C4466ii.E(new f(gp1I), em, ll, c1699On1E.d.getValue());
        this.H = C1589Ne.i(null);
        this.I = C1589Ne.i(null);
        this.J = C1589Ne.i(PW0.c());
        this.K = C1589Ne.i(null);
        gp1I2.m(null, EnumC3495e41.j);
        C5189lv.k(C7235vf.a, null, new a(null), 3);
        C5189lv.k(em, C6266r20.c, new b(null), 2);
        C5189lv.k(em, null, new c(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C5766of c5766of;
        GP1 gp1;
        if (lm instanceof C5766of) {
            c5766of = (C5766of) lm;
            int i = c5766of.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5766of.h = i - Integer.MIN_VALUE;
            } else {
                c5766of = new C5766of(this, lm);
            }
        } else {
            c5766of = new C5766of(this, lm);
        }
        Object obj = c5766of.e;
        MN mn = MN.d;
        int i2 = c5766of.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            EM em = C7235vf.a;
            RV rv = C6266r20.a;
            C5189lv.k(em, rv, new C5976pf(this, null), 2);
            C5189lv.k(em, rv, new C6395rf(this, null), 2);
            C5189lv.k(em, rv, new C6605sf(this, null), 2);
            C0807Dd c0807Dd = new C0807Dd(this.a.k(), 1);
            GP1 gp2 = this.f;
            c5766of.d = gp2;
            c5766of.h = 1;
            Object objO = C4466ii.o(c0807Dd, c5766of);
            if (objO == mn) {
                return mn;
            }
            gp1 = gp2;
            obj = objO;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gp1 = c5766of.d;
            C1795Pt1.b(obj);
        }
        gp1.setValue(obj);
        return Unit.a;
    }
}

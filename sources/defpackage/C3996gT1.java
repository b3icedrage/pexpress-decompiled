package defpackage;

import com.appsflyer.share.attribution.RequestError;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3996gT1 implements InterfaceC3786fT1 {

    @NotNull
    public final SS1 b;

    @NotNull
    public final InterfaceC5937pT1 c;

    @NotNull
    public final C6120qK1 d;

    @NotNull
    public final c e;

    @NotNull
    public final C6120qK1 f;

    @NotNull
    public final InterfaceC5910pK1 g;

    @NotNull
    public final FP1<Boolean> h;

    /* JADX INFO: renamed from: gT1$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.usecases.StubGameInteractorBase$1", f = "StubGameInteractorBase.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: gT1$a$a, reason: collision with other inner class name */
        public static final class C0361a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C3996gT1 d;

            public C0361a(C3996gT1 c3996gT1) {
                this.d = c3996gT1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                float fFloatValue = ((Number) obj).floatValue();
                C3996gT1 c3996gT1 = this.d;
                if (fFloatValue < 30.0f) {
                    Object objA = c3996gT1.f.a(TT1.e, jm);
                    return objA == MN.d ? objA : Unit.a;
                }
                if (fFloatValue <= 70.0f) {
                    return Unit.a;
                }
                Object objA2 = c3996gT1.f.a(TT1.d, jm);
                return objA2 == MN.d ? objA2 : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C3996gT1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
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
            C3996gT1 c3996gT1 = C3996gT1.this;
            GP1 gp1A = c3996gT1.b.a();
            C0361a c0361a = new C0361a(c3996gT1);
            this.d = 1;
            gp1A.c(c0361a, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: gT1$b */
    @InterfaceC3368dU(c = "com.base.feature.stub.usecases.StubGameInteractorBase$2", f = "StubGameInteractorBase.kt", l = {62}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: gT1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C3996gT1 d;

            public a(C3996gT1 c3996gT1) {
                this.d = c3996gT1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                SS1 ss1 = this.d.b;
                Float fValueOf = Float.valueOf(((Number) ss1.a().getValue()).floatValue() + ((TS1) obj).a);
                GP1 gp1 = ss1.a;
                gp1.getClass();
                gp1.m(null, fValueOf);
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C3996gT1.this.new b(jm);
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
            C3996gT1 c3996gT1 = C3996gT1.this;
            C6120qK1 c6120qK1D = c3996gT1.c.d();
            a aVar = new a(c3996gT1);
            this.d = 1;
            c6120qK1D.c(aVar, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: gT1$c */
    public static final class c implements InterfaceC6396rf0<Float> {
        public final /* synthetic */ C3098cA d;

        /* JADX INFO: renamed from: gT1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: gT1$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.stub.usecases.StubGameInteractorBase$special$$inlined$map$1$2", f = "StubGameInteractorBase.kt", l = {219}, m = "emit")
            public static final class C0362a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0362a(JM jm) {
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
                C0362a c0362a;
                if (jm instanceof C0362a) {
                    c0362a = (C0362a) jm;
                    int i = c0362a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0362a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0362a = new C0362a(jm);
                    }
                } else {
                    c0362a = new C0362a(jm);
                }
                Object obj2 = c0362a.d;
                MN mn = MN.d;
                int i2 = c0362a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    float fFloatValue = ((Number) obj).floatValue();
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    decimalFormat.setRoundingMode(RoundingMode.CEILING);
                    String str = decimalFormat.format(new Float(fFloatValue));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Float f = new Float(Float.parseFloat(str));
                    c0362a.e = 1;
                    if (this.d.a(f, c0362a) == mn) {
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

        public c(C3098cA c3098cA) {
            this.d = c3098cA;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Float> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C3996gT1(@NotNull SS1 stubBalanceUseCase, @NotNull InterfaceC5937pT1 stubMakeBetUseCase) {
        Intrinsics.checkNotNullParameter(stubBalanceUseCase, "stubBalanceUseCase");
        Intrinsics.checkNotNullParameter(stubMakeBetUseCase, "stubMakeBetUseCase");
        this.b = stubBalanceUseCase;
        this.c = stubMakeBetUseCase;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.d = c6120qK1G;
        this.e = new c(C4466ii.x(c6120qK1G, stubBalanceUseCase.a()));
        this.f = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.g = stubMakeBetUseCase.d();
        this.h = stubMakeBetUseCase.c();
        EM em = C3784fT.a;
        RV rv = C6266r20.a;
        C5189lv.k(em, rv, new a(null), 2);
        C5189lv.k(em, rv, new b(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r10.a(r7, r8, r0) == r1) goto L22;
     */
    @Override // defpackage.InterfaceC3786fT1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull H32.a r7, double r8, @org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C4206hT1
            if (r0 == 0) goto L13
            r0 = r10
            hT1 r0 = (defpackage.C4206hT1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            hT1 r0 = new hT1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r10)
            goto L7a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            double r8 = r0.g
            H32$a r7 = r0.e
            gT1 r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L6a
        L3c:
            defpackage.C1795Pt1.b(r10)
            qK1 r10 = r6.d
            SS1 r2 = r6.b
            GP1 r2 = r2.a()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 15
            float r5 = (float) r5
            float r2 = r2 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r2)
            r0.d = r6
            r0.e = r7
            r0.g = r8
            r0.j = r4
            java.lang.Object r10 = r10.a(r5, r0)
            if (r10 != r1) goto L69
            goto L79
        L69:
            r2 = r6
        L6a:
            pT1 r10 = r2.c
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.j = r3
            java.lang.Object r7 = r10.a(r7, r8, r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3996gT1.a(H32$a, double, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3786fT1
    @Nullable
    public final JQ b() {
        return this.c.b();
    }

    @Override // defpackage.InterfaceC3786fT1
    @NotNull
    public final FP1<Boolean> c() {
        return this.h;
    }

    @Override // defpackage.InterfaceC3786fT1
    @NotNull
    public final InterfaceC5910pK1 d() {
        return this.g;
    }

    @Override // defpackage.InterfaceC3786fT1
    @NotNull
    public final c e() {
        return this.e;
    }

    @Override // defpackage.InterfaceC3786fT1
    public final C6120qK1 f() {
        return this.f;
    }
}

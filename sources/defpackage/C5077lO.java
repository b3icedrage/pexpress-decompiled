package defpackage;

import com.api.core.backend.domain.models.other.RawCouponData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5077lO implements InterfaceC4399iO {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC7600xO b;

    @NotNull
    public final InterfaceC7012ub2 c;

    @NotNull
    public final GP1 d;

    @Nullable
    public C2936bP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    /* JADX INFO: renamed from: lO$a */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$1", f = "CouponProviderBase.kt", l = {58}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5077lO.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                C5077lO c5077lO = C5077lO.this;
                InterfaceC7600xO interfaceC7600xO = c5077lO.b;
                Object objI = C4466ii.i(C4466ii.l(interfaceC7600xO.a(), interfaceC7600xO.g(), C4466ii.m(new C6339rO(interfaceC7600xO.i(), c5077lO, 0)), C4466ii.m(new C6759tO(new C4250hg0(c5077lO.a.k, 0), 0)), new C6969uO(c5077lO, null)), this);
                if (objI != obj2) {
                    objI = Unit.a;
                }
                if (objI == obj2) {
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

    /* JADX INFO: renamed from: lO$b */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$2", f = "CouponProviderBase.kt", l = {61}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5077lO.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                C5077lO c5077lO = C5077lO.this;
                Object objC = c5077lO.b.i().c(new C2183Ut(c5077lO, 1), this);
                if (objC != obj2) {
                    objC = Unit.a;
                }
                if (objC == obj2) {
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

    /* JADX INFO: renamed from: lO$c */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$couponFlow$1", f = "CouponProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements InterfaceC1138Hj0<String, Long, String, JM<? super C4189hO>, Object> {
        public /* synthetic */ String d;
        public /* synthetic */ long e;
        public /* synthetic */ String g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return new C4189hO(this.e, this.d, this.g);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(String str, Long l, String str2, JM<? super C4189hO> jm) {
            long jLongValue = l.longValue();
            c cVar = new c(4, jm);
            cVar.d = str;
            cVar.e = jLongValue;
            cVar.g = str2;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: lO$d */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$destroyCoupon$1", f = "CouponProviderBase.kt", l = {137}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5077lO.this.new d(jm);
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
                InterfaceC7600xO interfaceC7600xO = C5077lO.this.b;
                C5290mO c5290mO = new C5290mO(0);
                this.d = 1;
                if (interfaceC7600xO.d(c5290mO, this) == mn) {
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

    /* JADX INFO: renamed from: lO$e */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$needShowCoupon$2", f = "CouponProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class e extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d && this.e);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            e eVar = new e(3, jm);
            eVar.d = zBooleanValue;
            eVar.e = zBooleanValue2;
            return eVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: lO$f */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$saveCouponDataToPrefs$1", f = "CouponProviderBase.kt", l = {113, 118, 119, 120, 121}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public long d;
        public String e;
        public int g;
        public final /* synthetic */ RawCouponData h;
        public final /* synthetic */ C5077lO i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RawCouponData rawCouponData, C5077lO c5077lO, JM<? super f> jm) {
            super(2, jm);
            this.h = rawCouponData;
            this.i = c5077lO;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new f(this.h, this.i, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009d  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        
            if (r14.c(r1, r13) == r0) goto L36;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                MN r0 = defpackage.MN.d
                int r1 = r13.g
                com.api.core.backend.domain.models.other.RawCouponData r2 = r13.h
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                lO r8 = r13.i
                if (r1 == 0) goto L3e
                if (r1 == r7) goto L36
                if (r1 == r6) goto L30
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                defpackage.C1795Pt1.b(r14)
                goto Lbf
            L1e:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L26:
                defpackage.C1795Pt1.b(r14)
                goto Lae
            L2b:
                defpackage.C1795Pt1.b(r14)
                goto L9d
            L30:
                long r6 = r13.d
                defpackage.C1795Pt1.b(r14)
                goto L8d
            L36:
                long r9 = r13.d
                java.lang.String r1 = r13.e
                defpackage.C1795Pt1.b(r14)
                goto L6d
            L3e:
                defpackage.C1795Pt1.b(r14)
                java.lang.Long r14 = r2.getTimeSeconds()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
                long r9 = r14.longValue()
                r14 = 1000(0x3e8, float:1.401E-42)
                long r11 = (long) r14
                long r9 = r9 * r11
                long r11 = java.lang.System.currentTimeMillis()
                long r11 = r11 + r9
                java.lang.String r1 = r2.getId()
                xO r14 = r8.b
                rf0 r14 = r14.a()
                r13.e = r1
                r13.d = r11
                r13.g = r7
                java.lang.Object r14 = defpackage.C4466ii.o(r14, r13)
                if (r14 != r0) goto L6c
                goto Lbe
            L6c:
                r9 = r11
            L6d:
                boolean r14 = kotlin.jvm.internal.Intrinsics.a(r14, r1)
                if (r14 == 0) goto L76
                kotlin.Unit r14 = kotlin.Unit.a
                return r14
            L76:
                xO r14 = r8.b
                nO r7 = new nO
                r11 = 0
                r7.<init>(r1, r11)
                r1 = 0
                r13.e = r1
                r13.d = r9
                r13.g = r6
                java.lang.Object r14 = r14.b(r7, r13)
                if (r14 != r0) goto L8c
                goto Lbe
            L8c:
                r6 = r9
            L8d:
                xO r14 = r8.b
                oO r1 = new oO
                r1.<init>(r6)
                r13.g = r5
                java.lang.Object r14 = r14.d(r1, r13)
                if (r14 != r0) goto L9d
                goto Lbe
            L9d:
                xO r14 = r8.b
                A0 r1 = new A0
                r5 = 2
                r1.<init>(r2, r5)
                r13.g = r4
                java.lang.Object r14 = r14.j(r1, r13)
                if (r14 != r0) goto Lae
                goto Lbe
            Lae:
                xO r14 = r8.b
                X5 r1 = new X5
                r4 = 3
                r1.<init>(r2, r4)
                r13.g = r3
                java.lang.Object r14 = r14.c(r1, r13)
                if (r14 != r0) goto Lbf
            Lbe:
                return r0
            Lbf:
                kotlin.Unit r14 = kotlin.Unit.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5077lO.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lO$g */
    public static final class g implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: lO$g$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: lO$g$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$special$$inlined$map$1$2", f = "CouponProviderBase.kt", l = {219}, m = "emit")
            public static final class C0435a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0435a(JM jm) {
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
                C0435a c0435a;
                if (jm instanceof C0435a) {
                    c0435a = (C0435a) jm;
                    int i = c0435a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0435a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0435a = new C0435a(jm);
                    }
                } else {
                    c0435a = new C0435a(jm);
                }
                Object obj2 = c0435a.d;
                MN mn = MN.d;
                int i2 = c0435a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).longValue() > 0);
                    c0435a.e = 1;
                    if (this.d.a(boolValueOf, c0435a) == mn) {
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

        public g(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public C5077lO(@NotNull C4923kf appData, @NotNull InterfaceC7600xO couponUseCase, @NotNull InterfaceC7012ub2 userRepositoryApi) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(couponUseCase, "couponUseCase");
        Intrinsics.checkNotNullParameter(userRepositoryApi, "userRepositoryApi");
        this.a = appData;
        this.b = couponUseCase;
        this.c = userRepositoryApi;
        GP1 gp1I = C1589Ne.i(null);
        this.d = gp1I;
        this.f = gp1I;
        GP1 gp1I2 = C1589Ne.i(-1L);
        this.g = gp1I2;
        C4466ii.k(couponUseCase.g(), gp1I2, couponUseCase.e(), new c(4, null));
        new C6610sg0(C4466ii.m(new g(gp1I2)), couponUseCase.h(), new e(3, null));
        EM em = C3784fT.a;
        RV rv = C6266r20.a;
        C5189lv.k(em, rv, new a(null), 2);
        C5189lv.k(em, rv, new b(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r9 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r9 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r9 == r2) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.C5077lO r9, java.lang.String r10, boolean r11, long r12, defpackage.LM r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5077lO.d(lO, java.lang.String, boolean, long, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4399iO
    @NotNull
    public final GP1 a() {
        return this.f;
    }

    @Override // defpackage.InterfaceC4399iO
    public final void b() {
        C5189lv.k(C3784fT.a, C6266r20.c, new d(null), 2);
    }

    @Override // defpackage.InterfaceC4399iO
    public final void c(@NotNull RawCouponData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getId() == null || data.getCode() == null || data.getPercent() == null || data.getTimeSeconds() == null) {
            return;
        }
        C5189lv.k(C3784fT.a, C6266r20.c, new f(data, this, null), 2);
    }
}

package defpackage;

import android.os.SystemClock;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.impl.core.backend.abstractModels.RawWebSocketRequest;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl$authenticate$1", f = "WebSocketRequestExecutorImpl.kt", l = {236, 239, 245, 303, 304, 307}, m = "invokeSuspend")
public final class Wg2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public CommonResult d;
    public int e;
    public final /* synthetic */ Vg2 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;

    @InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl$authenticate$1$1", f = "WebSocketRequestExecutorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ Vg2 e;

        /* JADX INFO: renamed from: Wg2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl$authenticate$1$1$1", f = "WebSocketRequestExecutorImpl.kt", l = {259, 262, 278}, m = "invokeSuspend")
        public static final class C0171a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ Vg2 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0171a(Vg2 vg2, JM<? super C0171a> jm) {
                super(2, jm);
                this.e = vg2;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0171a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0171a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x002f  */
            /* JADX WARN: Code duplicated, block: B:18:0x0043  */
            /* JADX WARN: Code duplicated, block: B:20:0x0047  */
            /* JADX WARN: Code duplicated, block: B:24:0x0068  */
            /* JADX WARN: Code duplicated, block: B:26:0x0077  */
            /* JADX WARN: Code duplicated, block: B:30:0x0087  */
            /* JADX WARN: Path cross not found for [B:13:0x0029, B:26:0x0077], limit reached: 34 */
            /* JADX WARN: Path cross not found for [B:26:0x0077, B:13:0x0029], limit reached: 34 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:24:0x0068). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.AbstractC7487wq
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    MN r0 = defpackage.MN.d
                    int r1 = r10.d
                    java.lang.String r2 = "is_real"
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r5) goto L22
                    if (r1 == r4) goto L1e
                    if (r1 != r3) goto L16
                    defpackage.C1795Pt1.b(r11)
                    goto Lc1
                L16:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1e:
                    defpackage.C1795Pt1.b(r11)
                    goto L68
                L22:
                    defpackage.C1795Pt1.b(r11)
                    goto L43
                L26:
                    defpackage.C1795Pt1.b(r11)
                L29:
                    Vg2 r11 = r10.e
                    boolean r11 = r11.h
                    if (r11 == 0) goto Lc1
                    Vg2 r11 = r10.e
                    KW1 r11 = r11.C
                    java.lang.Object r11 = r11.getValue()
                    ng2 r11 = (defpackage.C5563ng2) r11
                    r10.d = r5
                    java.lang.Object r11 = r11.d(r10)
                    if (r11 != r0) goto L43
                    goto Lc0
                L43:
                    Qg r11 = defpackage.U0.N
                    if (r11 == 0) goto L5d
                    Vg2 r1 = r10.e
                    boolean r1 = r1 instanceof defpackage.C3836fh2
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    kotlin.Pair r6 = new kotlin.Pair
                    r6.<init>(r2, r1)
                    java.util.Map r1 = defpackage.OW0.b(r6)
                    java.lang.String r6 = "ping_sent"
                    r11.invoke(r6, r1)
                L5d:
                    long r6 = defpackage.Vg2.L
                    r10.d = r4
                    java.lang.Object r11 = defpackage.IW.c(r6, r10)
                    if (r11 != r0) goto L68
                    goto Lc0
                L68:
                    long r6 = android.os.SystemClock.uptimeMillis()
                    Vg2 r11 = r10.e
                    long r8 = r11.K
                    long r6 = r6 - r8
                    Vg2 r11 = r10.e
                    boolean r11 = r11.h
                    if (r11 == 0) goto L29
                    long r8 = defpackage.Vg2.M
                    long r8 = kotlin.time.b.l(r8)
                    int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r11 <= 0) goto L29
                    Qg r11 = defpackage.U0.N
                    java.lang.String r1 = "pong_timeout"
                    if (r11 == 0) goto Lab
                    Vg2 r4 = r10.e
                    boolean r4 = r4 instanceof defpackage.C3836fh2
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    kotlin.Pair r5 = new kotlin.Pair
                    r5.<init>(r2, r4)
                    java.lang.Long r2 = new java.lang.Long
                    r2.<init>(r6)
                    kotlin.Pair r4 = new kotlin.Pair
                    java.lang.String r6 = "since_server_ping_ms"
                    r4.<init>(r6, r2)
                    kotlin.Pair[] r2 = new kotlin.Pair[]{r5, r4}
                    java.util.Map r2 = defpackage.PW0.e(r2)
                    r11.invoke(r1, r2)
                Lab:
                    Vg2 r11 = r10.e
                    r11.v(r1)
                    Vg2 r11 = r10.e
                    r10.d = r3
                    pg r1 = new pg
                    r2 = 2
                    r1.<init>(r2)
                    java.lang.Object r11 = r11.t(r1, r10)
                    if (r11 != r0) goto Lc1
                Lc0:
                    return r0
                Lc1:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: Wg2.a.C0171a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl$authenticate$1$1$2", f = "WebSocketRequestExecutorImpl.kt", l = {284}, m = "invokeSuspend")
        public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ Vg2 e;

            /* JADX INFO: renamed from: Wg2$a$b$a, reason: collision with other inner class name */
            public static final class C0172a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ Vg2 d;

                public C0172a(Vg2 vg2) {
                    this.d = vg2;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    ((Number) obj).intValue();
                    this.d.K = SystemClock.uptimeMillis();
                    C1832Qg c1832Qg = U0.N;
                    if (c1832Qg != null) {
                        c1832Qg.invoke("server_ping", OW0.b(new Pair("is_real", Boolean.valueOf(this.d instanceof C3836fh2))));
                    }
                    Vg2 vg2 = ((C5563ng2) this.d.C.getValue()).a.f;
                    if (vg2 == null) {
                        Intrinsics.l("executor");
                        throw null;
                    }
                    Object objJ = vg2.J(new RawWebSocketRequest("3"), jm);
                    MN mn = MN.d;
                    if (objJ != mn) {
                        objJ = Unit.a;
                    }
                    if (objJ != mn) {
                        objJ = Unit.a;
                    }
                    return objJ == mn ? objJ : Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Vg2 vg2, JM<? super b> jm) {
                super(2, jm);
                this.e = vg2;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new b(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((b) create(kn, jm)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference failed for: r2v5, types: [fO0, java.lang.Object] */
            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                InterfaceC6396rf0 interfaceC6396rf0X;
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    Vg2 vg2 = this.e;
                    C4720jg2 c4720jg2 = ((C5563ng2) vg2.C.getValue()).a;
                    Vg2 vg3 = c4720jg2.f;
                    if (vg3 == null) {
                        Intrinsics.l("executor");
                        throw null;
                    }
                    InterfaceC6396rf0<Integer> response = ((InterfaceC5125ld) c4720jg2.e.getValue()).e();
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (C1526Mj.m(new EnumC3495e41[]{EnumC3495e41.h, EnumC3495e41.g, EnumC3495e41.i}, vg3.a.r.getValue())) {
                        interfaceC6396rf0X = new C0658Bf0(new ResultError(new CommonError.NotWebSocketConnection()));
                    } else {
                        Tg2 tg2 = new Tg2(response);
                        Qg2 qg2 = vg3.r;
                        Intrinsics.checkNotNull(qg2);
                        interfaceC6396rf0X = C4466ii.x(tg2, C5020l60.d, qg2);
                    }
                    CommonResultKt$okFilter$$inlined$filterIsInstance$1 commonResultKt$okFilter$$inlined$filterIsInstance$1C = CommonResultKt.c(interfaceC6396rf0X, "ws.server_ping");
                    C0172a c0172a = new C0172a(vg2);
                    this.d = 1;
                    Object objC = commonResultKt$okFilter$$inlined$filterIsInstance$1C.c(new C4252hg2(new C4042gg2(c0172a)), this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vg2 vg2, JM<? super a> jm) {
            super(2, jm);
            this.e = vg2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.e, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            KN kn = (KN) this.d;
            Vg2 vg2 = this.e;
            C5189lv.k(kn, null, new C0171a(vg2, null), 3);
            C5189lv.k(kn, null, new b(vg2, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wg2(Vg2 vg2, String str, long j, int i, JM<? super Wg2> jm) {
        super(2, jm);
        this.g = vg2;
        this.h = str;
        this.i = j;
        this.j = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Wg2(this.g, this.h, this.i, this.j, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Wg2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0275 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0279 */
    /* JADX WARN: Code duplicated, block: B:100:0x0253 A[PHI: r11 r14
      0x0253: PHI (r11v12 Wg2) = (r11v10 Wg2), (r11v13 Wg2) binds: [B:98:0x0250, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r14v55 java.lang.Object) = (r14v54 java.lang.Object), (r14v0 java.lang.Object) binds: [B:98:0x0250, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x025b  */
    /* JADX WARN: Code duplicated, block: B:107:0x026a  */
    /* JADX WARN: Code duplicated, block: B:120:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126 A[PHI: r11 r14
      0x0126: PHI (r11v6 Wg2) = (r11v5 Wg2), (r11v7 Wg2) binds: [B:52:0x0122, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r14v21 java.lang.Object) = (r14v20 java.lang.Object), (r14v0 java.lang.Object) binds: [B:52:0x0122, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170 A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #1 {, blocks: (B:69:0x016c, B:71:0x0170), top: B:122:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0186 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x01be  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239 A[PHI: r1 r11
      0x0239: PHI (r1v17 com.api.core.backend.domain.models.resultModels.CommonResult) = 
      (r1v14 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r1v20 com.api.core.backend.domain.models.resultModels.CommonResult)
     binds: [B:95:0x0236, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r11v10 Wg2) = (r11v6 Wg2), (r11v11 Wg2) binds: [B:95:0x0236, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0264, code lost:
    
        if (r14.f(r13) == r0) goto L104;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01f7, please report this as an issue */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Wg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

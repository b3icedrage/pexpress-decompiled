package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$startTrading$2", f = "Trader.kt", l = {353, 356, 358, 360, 363, 371}, m = "invokeSuspend")
public final class K12 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public S02 d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ S02<H32> h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ InterfaceC5721oR1 k;
    public final /* synthetic */ E10 l;
    public final /* synthetic */ InterfaceC7187vQ1 m;
    public final /* synthetic */ EnumC4164hF1 n;

    @InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$startTrading$2$1", f = "Trader.kt", l = {349}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC7187vQ1, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ S02<H32> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S02<H32> s02, JM<? super a> jm) {
            super(2, jm);
            this.g = s02;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7187vQ1 interfaceC7187vQ1, JM<? super Unit> jm) {
            return ((a) create(interfaceC7187vQ1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7187vQ1 interfaceC7187vQ1 = (InterfaceC7187vQ1) this.e;
                this.d = 1;
                if (S02.a(this.g, interfaceC7187vQ1, this) == mn) {
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
    public K12(S02<H32> s02, int i, boolean z, InterfaceC5721oR1 interfaceC5721oR1, E10 e10, InterfaceC7187vQ1 interfaceC7187vQ1, EnumC4164hF1 enumC4164hF1, JM<? super K12> jm) {
        super(2, jm);
        this.h = s02;
        this.i = i;
        this.j = z;
        this.k = interfaceC5721oR1;
        this.l = e10;
        this.m = interfaceC7187vQ1;
        this.n = enumC4164hF1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        K12 k12 = new K12(this.h, this.i, this.j, this.k, this.l, this.m, this.n, jm);
        k12.g = obj;
        return k12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((K12) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[Catch: all -> 0x002b, CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1 A[Catch: all -> 0x002b, CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4 A[Catch: all -> 0x002b, CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb A[Catch: all -> 0x002b, CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x002b, CancellationException -> 0x002f, PHI: r2
      0x0101: PHI (r2v14 KN) = (r2v11 KN), (r2v16 KN) binds: [B:41:0x00fd, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117 A[Catch: all -> 0x002b, CancellationException -> 0x002f, PHI: r2
      0x0117: PHI (r2v17 KN) = (r2v14 KN), (r2v20 KN) binds: [B:44:0x0113, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f A[Catch: all -> 0x002b, CancellationException -> 0x002f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:8:0x0026, B:52:0x0141, B:54:0x014f, B:15:0x0038, B:50:0x012f, B:18:0x0046, B:46:0x0117, B:21:0x0050, B:43:0x0101, B:24:0x005a, B:31:0x00d2, B:33:0x00ea, B:36:0x00f1, B:37:0x00f4, B:40:0x00fb, B:27:0x0065), top: B:88:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:0: B:52:0x0141->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e7, code lost:
    
        if (r0 == r3) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [H32, T extends H32] */
    /* JADX WARN: Type inference failed for: r2v2, types: [KN] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

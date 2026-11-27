package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2422Xk1<T> extends AbstractC2123Tz<T> {

    @NotNull
    public final TR1 h;

    /* JADX INFO: renamed from: Xk1$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {94, 96}, m = "collectImpl")
    public static final class a extends LM {
        public C2422Xk1 d;
        public InterfaceC6606sf0 e;
        public C8110zn1 g;
        public long h;
        public /* synthetic */ Object i;
        public final /* synthetic */ C2422Xk1<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2422Xk1<T> c2422Xk1, JM<? super a> jm) {
            super(jm);
            this.j = c2422Xk1;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.n(null, null, this);
        }
    }

    public C2422Xk1(@NotNull TR1 tr1, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(coroutineContext, i, enumC1796Pu);
        this.h = tr1;
    }

    @Override // defpackage.AbstractC2123Tz, defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        CoroutineContext context = jm.getContext();
        d.a aVar = d.f;
        CoroutineContext coroutineContext = this.d;
        d dVar = (d) coroutineContext.p(aVar);
        if (dVar == null || dVar.equals(context.p(aVar))) {
            Object objN = n(context.t(coroutineContext), interfaceC6606sf0, jm);
            return objN == MN.d ? objN : Unit.a;
        }
        Object objD = LN.d(new C2500Yk1(interfaceC6606sf0, this, null), jm);
        MN mn = MN.d;
        if (objD != mn) {
            objD = Unit.a;
        }
        return objD == mn ? objD : Unit.a;
    }

    @Override // defpackage.AbstractC2123Tz
    @Nullable
    public final Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        Object objN = n(interfaceC1133Hh1.getE(), new KF1(interfaceC1133Hh1.D()), jm);
        return objN == MN.d ? objN : Unit.a;
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C2422Xk1(this.h, coroutineContext, i, enumC1796Pu);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:40:0x00bd, B:42:0x00c9, B:44:0x00cd, B:46:0x00d5, B:47:0x00d8, B:26:0x007d, B:37:0x00a5, B:20:0x0050), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [sf0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4, types: [sf0] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [zn1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [zn1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [zn1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [zn1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ba -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.CoroutineContext r20, defpackage.InterfaceC6606sf0<? super T> r21, defpackage.JM<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2422Xk1.n(kotlin.coroutines.CoroutineContext, sf0, JM):java.lang.Object");
    }

    public final long o() {
        if (this.g != EnumC1796Pu.d) {
            return Long.MAX_VALUE;
        }
        int i = this.e;
        if (i == -2) {
            InterfaceC1733Oz.b.getClass();
            return InterfaceC1733Oz.a.b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.");
    }
}

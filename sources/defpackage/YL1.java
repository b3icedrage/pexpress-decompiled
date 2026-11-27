package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
public final class YL1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C2946bT d;
    public int e;
    public final /* synthetic */ ZL1<Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YL1(ZL1<Object> zl1, JM<? super YL1> jm) {
        super(2, jm);
        this.g = zl1;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new YL1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((YL1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[PHI: r1 r7
      0x0043: PHI (r1v1 bT) = (r1v2 bT), (r1v3 bT) binds: [B:13:0x0040, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r7v5 java.lang.Object) = (r7v10 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0040, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            MN r0 = defpackage.MN.d
            int r1 = r6.e
            r2 = 2
            r3 = 1
            ZL1<java.lang.Object> r4 = r6.g
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r7)
            goto L4f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            bT r1 = r6.d
            defpackage.C1795Pt1.b(r7)
            goto L43
        L20:
            defpackage.C1795Pt1.b(r7)
            Sk r7 = r4.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.get()
            if (r7 <= 0) goto L5c
        L2d:
            EM r7 = r4.a
            kotlin.coroutines.CoroutineContext r7 = r7.d
            defpackage.ED.h(r7)
            bT r1 = r4.b
            Su r7 = r4.c
            r6.d = r1
            r6.e = r3
            java.lang.Object r7 = r7.h(r6)
            if (r7 != r0) goto L43
            goto L4e
        L43:
            r5 = 0
            r6.d = r5
            r6.e = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            Sk r7 = r4.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L5c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YL1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

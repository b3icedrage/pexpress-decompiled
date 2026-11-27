package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1744Pc1 implements UN1 {

    @NotNull
    public final InterfaceC2833av d;

    @NotNull
    public final C1481Lu e;

    @Nullable
    public C7782yE1 g;
    public int h;
    public boolean i;
    public long j;

    public C1744Pc1(@NotNull InterfaceC2833av upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.d = upstream;
        C1481Lu c1481LuN = upstream.n();
        this.e = c1481LuN;
        C7782yE1 c7782yE1 = c1481LuN.d;
        this.g = c7782yE1;
        this.h = c7782yE1 != null ? c7782yE1.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.d.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.UN1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s0(@org.jetbrains.annotations.NotNull defpackage.C1481Lu r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6e
            boolean r3 = r8.i
            if (r3 != 0) goto L66
            yE1 r3 = r8.g
            Lu r4 = r8.e
            if (r3 == 0) goto L2b
            yE1 r5 = r4.d
            if (r3 != r5) goto L23
            int r3 = r8.h
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.j
            r2 = 1
            long r0 = r0 + r2
            av r2 = r8.d
            boolean r0 = r2.s(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            yE1 r0 = r8.g
            if (r0 != 0) goto L4f
            yE1 r0 = r4.d
            if (r0 == 0) goto L4f
            r8.g = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.b
            r8.h = r0
        L4f:
            long r0 = r4.e
            long r2 = r8.j
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            Lu r2 = r8.e
            long r4 = r8.j
            r3 = r9
            r2.p(r3, r4, r6)
            long r9 = r8.j
            long r9 = r9 + r6
            r8.j = r9
            return r6
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6e:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = defpackage.C6419rl.a(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1744Pc1.s0(Lu, long):long");
    }
}

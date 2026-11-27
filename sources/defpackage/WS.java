package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
public final class WS extends AW1 implements Function2<KN, JM<? super EP1<Object>>, Object> {
    public int d;
    public final /* synthetic */ IS<Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WS(IS is, JM jm) {
        super(2, jm);
        this.e = is;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new WS(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super EP1<Object>> jm) {
        return ((WS) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            r2 = 2
            r3 = 1
            IS<java.lang.Object> r4 = r5.e
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.Throwable -> L1e
            goto L3d
        L1e:
            r6 = move-exception
            goto L4a
        L20:
            defpackage.C1795Pt1.b(r6)
            eT<T> r6 = r4.h
            EP1 r6 = r6.a()
            boolean r6 = r6 instanceof defpackage.C7649xd0
            if (r6 == 0) goto L34
            eT<T> r6 = r4.h
            EP1 r6 = r6.a()
            return r6
        L34:
            r5.d = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r4.h(r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L3d
            goto L46
        L3d:
            r5.d = r2
            r6 = 0
            java.lang.Object r6 = defpackage.IS.e(r4, r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            EP1 r6 = (defpackage.EP1) r6
            return r6
        L4a:
            An1 r0 = new An1
            r1 = -1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

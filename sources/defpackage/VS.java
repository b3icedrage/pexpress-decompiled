package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
public final class VS extends AW1 implements Function1<JM<? super Unit>, Object> {
    public Serializable d;
    public int e;
    public final /* synthetic */ C3027bp1<Object> g;
    public final /* synthetic */ IS<Object> h;
    public final /* synthetic */ C2590Zo1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VS(C3027bp1<Object> c3027bp1, IS<Object> is, C2590Zo1 c2590Zo1, JM<? super VS> jm) {
        super(1, jm);
        this.g = c3027bp1;
        this.h = is;
        this.i = c2590Zo1;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@NotNull JM<?> jm) {
        return new VS(this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((VS) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.e
            Zo1 r2 = r8.i
            bp1<java.lang.Object> r3 = r8.g
            r4 = 3
            r5 = 2
            IS<java.lang.Object> r6 = r8.h
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.d
            r2 = r0
            Zo1 r2 = (defpackage.C2590Zo1) r2
            defpackage.C1795Pt1.b(r9)
            goto L6d
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.io.Serializable r1 = r8.d
            Zo1 r1 = (defpackage.C2590Zo1) r1
            defpackage.C1795Pt1.b(r9)     // Catch: defpackage.VN -> L60
            goto L57
        L2e:
            java.io.Serializable r1 = r8.d
            bp1 r1 = (defpackage.C3027bp1) r1
            defpackage.C1795Pt1.b(r9)     // Catch: defpackage.VN -> L60
            goto L45
        L36:
            defpackage.C1795Pt1.b(r9)
            r8.d = r3     // Catch: defpackage.VN -> L60
            r8.e = r7     // Catch: defpackage.VN -> L60
            java.lang.Object r9 = r6.i(r8)     // Catch: defpackage.VN -> L60
            if (r9 != r0) goto L44
            goto L6c
        L44:
            r1 = r3
        L45:
            r1.d = r9     // Catch: defpackage.VN -> L60
            SB0 r9 = r6.g()     // Catch: defpackage.VN -> L60
            r8.d = r2     // Catch: defpackage.VN -> L60
            r8.e = r5     // Catch: defpackage.VN -> L60
            java.lang.Integer r9 = r9.e()     // Catch: defpackage.VN -> L60
            if (r9 != r0) goto L56
            goto L6c
        L56:
            r1 = r2
        L57:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: defpackage.VN -> L60
            int r9 = r9.intValue()     // Catch: defpackage.VN -> L60
            r1.d = r9     // Catch: defpackage.VN -> L60
            goto L75
        L60:
            T r9 = r3.d
            r8.d = r2
            r8.e = r4
            java.lang.Object r9 = r6.j(r9, r7, r8)
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.d = r9
        L75:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

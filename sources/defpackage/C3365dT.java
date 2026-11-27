package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
public final class C3365dT extends AW1 implements Function2<InterfaceC4950kl2<Object>, JM<? super Unit>, Object> {
    public C2590Zo1 d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2590Zo1 h;
    public final /* synthetic */ IS<Object> i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3365dT(C2590Zo1 c2590Zo1, IS<Object> is, Object obj, boolean z, JM<? super C3365dT> jm) {
        super(2, jm);
        this.h = c2590Zo1;
        this.i = is;
        this.j = obj;
        this.k = z;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C3365dT c3365dT = new C3365dT(this.h, this.i, this.j, this.k, jm);
        c3365dT.g = obj;
        return c3365dT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC4950kl2<Object> interfaceC4950kl2, JM<? super Unit> jm) {
        return ((C3365dT) create(interfaceC4950kl2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.a(r3, r7) == r0) goto L16;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            MN r0 = defpackage.MN.d
            int r1 = r7.e
            Zo1 r2 = r7.h
            java.lang.Object r3 = r7.j
            IS<java.lang.Object> r4 = r7.i
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            defpackage.C1795Pt1.b(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            Zo1 r1 = r7.d
            java.lang.Object r6 = r7.g
            kl2 r6 = (defpackage.InterfaceC4950kl2) r6
            defpackage.C1795Pt1.b(r8)
            goto L43
        L28:
            defpackage.C1795Pt1.b(r8)
            java.lang.Object r8 = r7.g
            kl2 r8 = (defpackage.InterfaceC4950kl2) r8
            SB0 r1 = r4.g()
            r7.g = r8
            r7.d = r2
            r7.e = r6
            java.lang.Integer r1 = r1.b()
            if (r1 != r0) goto L40
            goto L58
        L40:
            r6 = r8
            r8 = r1
            r1 = r2
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.d = r8
            r8 = 0
            r7.g = r8
            r7.d = r8
            r7.e = r5
            java.lang.Object r8 = r6.a(r3, r7)
            if (r8 != r0) goto L59
        L58:
            return r0
        L59:
            boolean r8 = r7.k
            if (r8 == 0) goto L71
            eT<T> r8 = r4.h
            jS r0 = new jS
            if (r3 == 0) goto L68
            int r1 = r3.hashCode()
            goto L69
        L68:
            r1 = 0
        L69:
            int r2 = r2.d
            r0.<init>(r3, r1, r2)
            r8.b(r0)
        L71:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3365dT.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

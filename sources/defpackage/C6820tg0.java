package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class C6820tg0 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object[], JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ Object[] g;
    public final /* synthetic */ AW1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6820tg0(InterfaceC1060Gj0<Object, Object, ? super JM<Object>, ? extends Object> interfaceC1060Gj0, JM<? super C6820tg0> jm) {
        super(3, jm);
        this.h = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [AW1, Gj0] */
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r6)
            goto L43
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            sf0 r1 = r5.e
            defpackage.C1795Pt1.b(r6)
            goto L37
        L1e:
            defpackage.C1795Pt1.b(r6)
            sf0 r1 = r5.e
            java.lang.Object[] r6 = r5.g
            r4 = 0
            r4 = r6[r4]
            r6 = r6[r3]
            r5.e = r1
            r5.d = r3
            AW1 r3 = r5.h
            java.lang.Object r6 = r3.k(r4, r6, r5)
            if (r6 != r0) goto L37
            goto L42
        L37:
            r3 = 0
            r5.e = r3
            r5.d = r2
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6820tg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object[] objArr, JM<? super Unit> jm) {
        C6820tg0 c6820tg0 = new C6820tg0(this.h, jm);
        c6820tg0.e = interfaceC6606sf0;
        c6820tg0.g = objArr;
        return c6820tg0.invokeSuspend(Unit.a);
    }
}

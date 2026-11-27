package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: og0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
public final class C5771og0 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object[], JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ Object[] g;
    public final /* synthetic */ AW1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5771og0(JM jm, InterfaceC1216Ij0 interfaceC1216Ij0) {
        super(3, jm);
        this.h = (AW1) interfaceC1216Ij0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r1.a(r12, r11) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [AW1, Ij0] */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            MN r0 = defpackage.MN.d
            int r1 = r11.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.C1795Pt1.b(r12)
            r10 = r11
            goto L4b
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            sf0 r1 = r11.e
            defpackage.C1795Pt1.b(r12)
            r10 = r11
            goto L3f
        L20:
            defpackage.C1795Pt1.b(r12)
            sf0 r1 = r11.e
            java.lang.Object[] r12 = r11.g
            r4 = 0
            r6 = r12[r4]
            r7 = r12[r3]
            r8 = r12[r2]
            r4 = 3
            r9 = r12[r4]
            r11.e = r1
            r11.d = r3
            AW1 r5 = r11.h
            r10 = r11
            java.lang.Object r12 = r5.c(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L3f
            goto L4a
        L3f:
            r3 = 0
            r10.e = r3
            r10.d = r2
            java.lang.Object r12 = r1.a(r12, r11)
            if (r12 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5771og0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, Ij0] */
    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object[] objArr, JM<? super Unit> jm) {
        C5771og0 c5771og0 = new C5771og0(jm, this.h);
        c5771og0.e = interfaceC6606sf0;
        c5771og0.g = objArr;
        return c5771og0.invokeSuspend(Unit.a);
    }
}

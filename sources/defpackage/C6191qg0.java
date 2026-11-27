package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: qg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
public final class C6191qg0 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object[], JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ Object[] g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6191qg0(JM jm, InterfaceC1294Jj0 interfaceC1294Jj0) {
        super(3, jm);
        this.h = interfaceC1294Jj0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1.a(r13, r12) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [Jj0, java.lang.Object] */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            MN r0 = defpackage.MN.d
            int r1 = r12.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.C1795Pt1.b(r13)
            r11 = r12
            goto L4e
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            sf0 r1 = r12.e
            defpackage.C1795Pt1.b(r13)
            r11 = r12
            goto L42
        L20:
            defpackage.C1795Pt1.b(r13)
            sf0 r1 = r12.e
            java.lang.Object[] r13 = r12.g
            r4 = 0
            r6 = r13[r4]
            r7 = r13[r3]
            r8 = r13[r2]
            r4 = 3
            r9 = r13[r4]
            r4 = 4
            r10 = r13[r4]
            r12.e = r1
            r12.d = r3
            java.lang.Object r5 = r12.h
            r11 = r12
            java.lang.Object r13 = r5.q(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L42
            goto L4d
        L42:
            r3 = 0
            r11.e = r3
            r11.d = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6191qg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jj0, java.lang.Object] */
    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object[] objArr, JM<? super Unit> jm) {
        C6191qg0 c6191qg0 = new C6191qg0(jm, this.h);
        c6191qg0.e = interfaceC6606sf0;
        c6191qg0.g = objArr;
        return c6191qg0.invokeSuspend(Unit.a);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1986Sf0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ R22 e;

    /* JADX INFO: renamed from: Sf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {219, 219}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public InterfaceC6606sf0 g;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1986Sf0.this.a(null, this);
        }
    }

    public C1986Sf0(InterfaceC6606sf0 interfaceC6606sf0, R22 r22) {
        this.d = interfaceC6606sf0;
        this.e = r22;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7.a(r8, r0) == r1) goto L22;
     */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, @org.jetbrains.annotations.NotNull defpackage.JM r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C1986Sf0.a
            if (r0 == 0) goto L13
            r0 = r8
            Sf0$a r0 = (defpackage.C1986Sf0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Sf0$a r0 = new Sf0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            sf0 r7 = r0.g
            defpackage.C1795Pt1.b(r8)
            goto L4d
        L38:
            defpackage.C1795Pt1.b(r8)
            sf0 r8 = r6.d
            r0.g = r8
            r0.e = r4
            R22 r2 = r6.e
            java.lang.Object r7 = r2.invoke(r7, r0)
            if (r7 != r1) goto L4a
            goto L58
        L4a:
            r5 = r8
            r8 = r7
            r7 = r5
        L4d:
            r2 = 0
            r0.g = r2
            r0.e = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1986Sf0.a(java.lang.Object, JM):java.lang.Object");
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4928kg0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ Object d;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ AW1 g;

    /* JADX INFO: renamed from: kg0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {113, 114}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public C4928kg0 h;
        public InterfaceC6606sf0 i;
        public C3027bp1 j;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C4928kg0.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4928kg0(Object obj, InterfaceC6396rf0 interfaceC6396rf0, InterfaceC1060Gj0 interfaceC1060Gj0) {
        this.d = obj;
        this.e = interfaceC6396rf0;
        this.g = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r8.c(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC6396rf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull defpackage.InterfaceC6606sf0<? super java.lang.Object> r7, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C4928kg0.a
            if (r0 == 0) goto L13
            r0 = r8
            kg0$a r0 = (defpackage.C4928kg0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kg0$a r0 = new kg0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            bp1 r7 = r0.j
            sf0 r2 = r0.i
            kg0 r4 = r0.h
            defpackage.C1795Pt1.b(r8)
            goto L56
        L3c:
            bp1 r8 = defpackage.C4564j.b(r8)
            java.lang.Object r2 = r6.d
            r8.d = r2
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.e = r4
            java.lang.Object r2 = r7.a(r2, r0)
            if (r2 != r1) goto L53
            goto L6e
        L53:
            r4 = r6
            r2 = r7
            r7 = r8
        L56:
            rf0 r8 = r4.e
            lg0 r5 = new lg0
            AW1 r4 = r4.g
            r5.<init>(r7, r4, r2)
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.j = r7
            r0.e = r3
            java.lang.Object r7 = r8.c(r5, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4928kg0.c(sf0, JM):java.lang.Object");
    }
}

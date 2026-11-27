package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1282Jf0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ InterfaceC6396rf0 d;
    public final /* synthetic */ AW1 e;

    /* JADX INFO: renamed from: Jf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {112, 113}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public C1282Jf0 h;
        public InterfaceC6606sf0 i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1282Jf0.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1282Jf0(InterfaceC6396rf0 interfaceC6396rf0, InterfaceC1060Gj0 interfaceC1060Gj0) {
        this.d = interfaceC6396rf0;
        this.e = (AW1) interfaceC1060Gj0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.k(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC6396rf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull defpackage.InterfaceC6606sf0<? super java.lang.Object> r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C1282Jf0.a
            if (r0 == 0) goto L13
            r0 = r7
            Jf0$a r0 = (defpackage.C1282Jf0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Jf0$a r0 = new Jf0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            sf0 r6 = r0.i
            Jf0 r2 = r0.h
            defpackage.C1795Pt1.b(r7)
            goto L4d
        L3a:
            defpackage.C1795Pt1.b(r7)
            r0.h = r5
            r0.i = r6
            r0.e = r4
            rf0 r7 = r5.d
            java.io.Serializable r7 = defpackage.C4466ii.h(r0, r7, r6)
            if (r7 != r1) goto L4c
            goto L60
        L4c:
            r2 = r5
        L4d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L61
            AW1 r2 = r2.e
            r4 = 0
            r0.h = r4
            r0.i = r4
            r0.e = r3
            java.lang.Object r6 = r2.k(r6, r7, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1282Jf0.c(sf0, JM):java.lang.Object");
    }
}

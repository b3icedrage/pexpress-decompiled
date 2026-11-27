package defpackage;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: If0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1204If0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ AW1 d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    /* JADX INFO: renamed from: If0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {115, 119}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public C1204If0 h;
        public InterfaceC6606sf0 i;
        public C2897bC1 j;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1204If0.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1204If0(InterfaceC6396rf0 interfaceC6396rf0, Function2 function2) {
        this.d = (AW1) function2;
        this.e = interfaceC6396rf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.c(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6396rf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull defpackage.InterfaceC6606sf0<? super java.lang.Object> r7, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C1204If0.a
            if (r0 == 0) goto L13
            r0 = r8
            If0$a r0 = (defpackage.C1204If0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            If0$a r0 = new If0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            bC1 r7 = r0.j
            sf0 r2 = r0.i
            If0 r4 = r0.h
            defpackage.C1795Pt1.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5e
        L3c:
            r8 = move-exception
            goto L7a
        L3e:
            defpackage.C1795Pt1.b(r8)
            bC1 r8 = new bC1
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            AW1 r2 = r6.d     // Catch: java.lang.Throwable -> L76
            r0.h = r6     // Catch: java.lang.Throwable -> L76
            r0.i = r7     // Catch: java.lang.Throwable -> L76
            r0.j = r8     // Catch: java.lang.Throwable -> L76
            r0.e = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L76
            if (r2 != r1) goto L5b
            goto L72
        L5b:
            r4 = r6
            r2 = r7
            r7 = r8
        L5e:
            r7.releaseIntercepted()
            rf0 r7 = r4.e
            r8 = 0
            r0.h = r8
            r0.i = r8
            r0.j = r8
            r0.e = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L76:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1204If0.c(sf0, JM):java.lang.Object");
    }
}

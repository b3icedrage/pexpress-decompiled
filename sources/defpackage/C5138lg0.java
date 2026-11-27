package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5138lg0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C3027bp1<Object> d;
    public final /* synthetic */ AW1 e;
    public final /* synthetic */ InterfaceC6606sf0<Object> g;

    /* JADX INFO: renamed from: lg0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, 106}, m = "emit")
    public static final class a extends LM {
        public C5138lg0 d;
        public C3027bp1 e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C5138lg0<T> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C5138lg0<? super T> c5138lg0, JM<? super a> jm) {
            super(jm);
            this.h = c5138lg0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5138lg0(C3027bp1<Object> c3027bp1, InterfaceC1060Gj0<Object, ? super T, ? super JM<Object>, ? extends Object> interfaceC1060Gj0, InterfaceC6606sf0<Object> interfaceC6606sf0) {
        this.d = c3027bp1;
        this.e = (AW1) interfaceC1060Gj0;
        this.g = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r6.a(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [AW1, Gj0] */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C5138lg0.a
            if (r0 == 0) goto L13
            r0 = r7
            lg0$a r0 = (defpackage.C5138lg0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            lg0$a r0 = new lg0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            bp1 r6 = r0.e
            lg0 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L54
        L3a:
            defpackage.C1795Pt1.b(r7)
            bp1<java.lang.Object> r7 = r5.d
            T r2 = r7.d
            r0.d = r5
            r0.e = r7
            r0.i = r4
            AW1 r4 = r5.e
            java.lang.Object r6 = r4.k(r2, r6, r0)
            if (r6 != r1) goto L50
            goto L69
        L50:
            r2 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L54:
            r6.d = r7
            sf0<java.lang.Object> r6 = r2.g
            bp1<java.lang.Object> r7 = r2.d
            T r7 = r7.d
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.i = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5138lg0.a(java.lang.Object, JM):java.lang.Object");
    }
}

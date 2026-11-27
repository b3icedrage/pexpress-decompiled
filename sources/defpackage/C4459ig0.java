package defpackage;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4459ig0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ AW1 e;

    /* JADX INFO: renamed from: ig0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {219, 220}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public Object h;
        public InterfaceC6606sf0 i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C4459ig0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4459ig0(InterfaceC6606sf0 interfaceC6606sf0, Function2 function2) {
        this.d = interfaceC6606sf0;
        this.e = (AW1) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r6.a(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4459ig0.a
            if (r0 == 0) goto L13
            r0 = r7
            ig0$a r0 = (defpackage.C4459ig0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ig0$a r0 = new ig0$a
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
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            sf0 r6 = r0.i
            java.lang.Object r2 = r0.h
            defpackage.C1795Pt1.b(r7)
            goto L50
        L3a:
            defpackage.C1795Pt1.b(r7)
            r0.h = r6
            sf0 r7 = r5.d
            r0.i = r7
            r0.e = r4
            AW1 r2 = r5.e
            java.lang.Object r2 = r2.invoke(r6, r0)
            if (r2 != r1) goto L4e
            goto L5d
        L4e:
            r2 = r6
            r6 = r7
        L50:
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.e = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4459ig0.a(java.lang.Object, JM):java.lang.Object");
    }
}

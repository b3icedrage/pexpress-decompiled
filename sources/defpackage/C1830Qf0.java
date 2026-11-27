package defpackage;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1830Qf0 implements InterfaceC6606sf0<Object> {
    public final /* synthetic */ AW1 d;
    public final /* synthetic */ InterfaceC6606sf0 e;

    /* JADX INFO: renamed from: Qf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {139, 140}, m = "emit")
    public static final class a extends LM {
        public C1830Qf0 d;
        public /* synthetic */ Object e;
        public int g;
        public Object i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return C1830Qf0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1830Qf0(InterfaceC6606sf0 interfaceC6606sf0, Function2 function2) {
        this.d = (AW1) function2;
        this.e = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.a(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Type inference failed for: r9v2, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C1830Qf0.a
            if (r0 == 0) goto L13
            r0 = r9
            Qf0$a r0 = (defpackage.C1830Qf0.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            Qf0$a r0 = new Qf0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Qf0 r8 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.i
            Qf0 r2 = r0.d
            defpackage.C1795Pt1.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L55
        L40:
            defpackage.C1795Pt1.b(r9)
            r0.d = r7
            r0.i = r8
            r0.g = r4
            AW1 r9 = r7.d
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L52
            goto L6c
        L52:
            r2 = r9
            r9 = r8
            r8 = r7
        L55:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            sf0 r2 = r8.e
            r0.d = r8
            r5 = 0
            r0.i = r5
            r0.g = r3
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L6e
        L6c:
            return r1
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L73
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L73:
            w r9 = new w
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1830Qf0.a(java.lang.Object, JM):java.lang.Object");
    }
}

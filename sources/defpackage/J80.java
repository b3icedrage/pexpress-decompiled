package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.EventPipeline$write$1", f = "EventPipeline.kt", l = {93, 98}, m = "invokeSuspend")
public final class J80 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public InterfaceC2621Zz d;
    public int e;
    public int g;
    public final /* synthetic */ K80 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J80(K80 k80, JM<? super J80> jm) {
        super(2, jm);
        this.h = k80;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new J80(this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((J80) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r1 r13
      0x0028: PHI (r1v3 Zz) = (r1v7 Zz), (r1v12 Zz) binds: [B:17:0x003f, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r13v3 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:17:0x003f, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005d -> B:32:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:32:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0070 -> B:32:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            MN r0 = defpackage.MN.d
            int r1 = r12.g
            K80 r2 = r12.h
            r3 = 2
            r4 = 0
            r5 = 1
            ea r6 = r2.a
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            int r1 = r12.e
            Zz r7 = r12.d
            defpackage.C1795Pt1.b(r13)     // Catch: java.lang.Exception -> L19
            goto L77
        L19:
            r13 = move-exception
            goto L70
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            Zz r1 = r12.d
            defpackage.C1795Pt1.b(r13)
        L28:
            r7 = r1
            goto L42
        L2a:
            defpackage.C1795Pt1.b(r13)
            Su r13 = r2.b
            r13.getClass()
            Su$a r1 = new Su$a
            r1.<init>()
        L37:
            r12.d = r1
            r12.g = r5
            java.lang.Object r13 = r1.a(r12)
            if (r13 != r0) goto L28
            goto L6f
        L42:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lc2
            java.lang.Object r13 = r7.next()
            hl2 r13 = (defpackage.C4272hl2) r13
            il2 r1 = r13.a
            il2 r8 = defpackage.EnumC4481il2.e
            if (r1 != r8) goto L58
            r1 = r5
            goto L59
        L58:
            r1 = r4
        L59:
            if (r1 != 0) goto L77
            Aq r13 = r13.b
            if (r13 == 0) goto L77
            LQ1 r8 = r6.g()     // Catch: java.lang.Exception -> L19
            r12.d = r7     // Catch: java.lang.Exception -> L19
            r12.e = r1     // Catch: java.lang.Exception -> L19
            r12.g = r3     // Catch: java.lang.Exception -> L19
            java.lang.Object r13 = r8.e(r13, r12)     // Catch: java.lang.Exception -> L19
            if (r13 != r0) goto L77
        L6f:
            return r0
        L70:
            java.lang.String r8 = "Error when writing event to pipeline"
            DS0 r9 = r6.l
            defpackage.C8056za.p(r13, r9, r8)
        L77:
            MI r13 = r6.a
            java.lang.Boolean r13 = r13.q
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.Intrinsics.a(r13, r8)
            if (r13 == 0) goto L84
            goto Lbf
        L84:
            java.util.concurrent.atomic.AtomicInteger r13 = r2.d
            int r8 = r13.incrementAndGet()
            int r9 = r2.g
            java.util.concurrent.atomic.AtomicInteger r10 = r2.j
            int r10 = r10.get()
            int r9 = r9 / r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 0
            if (r9 != 0) goto L9b
            r10 = r11
        L9b:
            if (r10 == 0) goto La2
            int r9 = r10.intValue()
            goto La3
        La2:
            r9 = r5
        La3:
            if (r8 >= r9) goto Lb5
            if (r1 == 0) goto La8
            goto Lb5
        La8:
            H80 r13 = new H80
            r13.<init>(r2, r11)
            Y90 r1 = r6.f
            EM r8 = r6.c
            defpackage.C5189lv.k(r8, r1, r13, r3)
            goto Lbf
        Lb5:
            r13.set(r4)
            Su r13 = r2.c
            java.lang.String r1 = "#!upload"
            r13.n(r1)
        Lbf:
            r1 = r7
            goto L37
        Lc2:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

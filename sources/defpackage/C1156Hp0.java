package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Hp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", l = {130, 133}, m = "invokeSuspend")
public final class C1156Hp0 extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1390Kp0 h;

    /* JADX INFO: renamed from: Hp0$a */
    public static final class a extends ML0 implements Function0<Boolean> {
        public final /* synthetic */ C1390Kp0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1390Kp0 c1390Kp0) {
            super(0);
            this.d = c1390Kp0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.d.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156Hp0(C1390Kp0 c1390Kp0, JM<? super C1156Hp0> jm) {
        super(3, jm);
        this.h = c1390Kp0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Hd1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.d
            Kp0 r2 = r8.h
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L16
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L16:
            java.lang.Object r0 = r8.e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.C1795Pt1.b(r9)
            goto L6b
        L1e:
            java.lang.Object r1 = r8.e
            Hd1 r1 = (defpackage.AbstractC1121Hd1) r1
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L26
            goto L4d
        L26:
            r9 = move-exception
            goto L50
        L28:
            defpackage.C1795Pt1.b(r9)
            java.lang.Object r9 = r8.e
            r1 = r9
            Hd1 r1 = (defpackage.AbstractC1121Hd1) r1
            java.lang.Object r9 = r8.g
            TContext r5 = r1.d     // Catch: java.lang.Throwable -> L26
            br0 r5 = (defpackage.C3032br0) r5     // Catch: java.lang.Throwable -> L26
            YH r5 = r5.f     // Catch: java.lang.Throwable -> L26
            Yk<java.lang.Boolean> r6 = defpackage.C1704Op0.b     // Catch: java.lang.Throwable -> L26
            Hp0$a r7 = new Hp0$a     // Catch: java.lang.Throwable -> L26
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L26
            r5.a(r6, r7)     // Catch: java.lang.Throwable -> L26
            r8.e = r1     // Catch: java.lang.Throwable -> L26
            r8.d = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r9 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L26
            if (r9 != r0) goto L4d
            goto L69
        L4d:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L50:
            java.lang.Throwable r9 = defpackage.QO.r(r9)
            TContext r1 = r1.d
            br0 r1 = (defpackage.C3032br0) r1
            FS0 r4 = defpackage.C1704Op0.a
            Np0 r4 = new Np0
            r4.<init>(r1)
            r8.e = r9
            r8.d = r3
            kotlin.Unit r1 = defpackage.C1390Kp0.a(r2, r9, r4, r8)
            if (r1 != r0) goto L6a
        L69:
            return r0
        L6a:
            r0 = r9
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1156Hp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
        C1156Hp0 c1156Hp0 = new C1156Hp0(this.h, jm);
        c1156Hp0.e = abstractC1121Hd1;
        c1156Hp0.g = obj;
        return c1156Hp0.invokeSuspend(Unit.a);
    }
}

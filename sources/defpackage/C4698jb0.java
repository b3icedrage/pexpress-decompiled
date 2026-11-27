package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.FTDUpdater$start$2", f = "FTDUpdater.kt", l = {51, 52, 58}, m = "invokeSuspend")
public final class C4698jb0 extends AW1 implements InterfaceC1138Hj0<InterfaceC6606sf0<? super C6945uG>, C6945uG, C6106qG, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ C6945uG g;
    public /* synthetic */ C6106qG h;
    public final /* synthetic */ C5118lb0 i;

    /* JADX INFO: renamed from: jb0$a */
    @InterfaceC3368dU(c = "com.base.core.backend.updaters.FTDUpdater$start$2$1", f = "FTDUpdater.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Integer>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Integer> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return new Integer(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4698jb0(C5118lb0 c5118lb0, JM<? super C4698jb0> jm) {
        super(4, jm);
        this.i = c5118lb0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r11.a(r1, r10) == r0) goto L34;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            MN r0 = defpackage.MN.d
            int r1 = r10.d
            lb0 r2 = r10.i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L29
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.C1795Pt1.b(r11)
            goto L9c
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            qG r1 = r10.h
            uG r2 = r10.g
            sf0 r4 = r10.e
            defpackage.C1795Pt1.b(r11)
            goto L7d
        L29:
            qG r1 = r10.h
            uG r7 = r10.g
            sf0 r8 = r10.e
            defpackage.C1795Pt1.b(r11)
            goto L5d
        L33:
            defpackage.C1795Pt1.b(r11)
            sf0 r11 = r10.e
            uG r1 = r10.g
            qG r7 = r10.h
            if (r7 == 0) goto L85
            boolean r8 = r7.d
            if (r8 != r6) goto L85
            GX r8 = r2.d
            rf0 r8 = r8.l()
            r10.e = r11
            r10.g = r1
            r10.h = r7
            r10.d = r6
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r10)
            if (r8 != r0) goto L57
            goto L9b
        L57:
            r9 = r8
            r8 = r11
            r11 = r9
            r9 = r7
            r7 = r1
            r1 = r9
        L5d:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != 0) goto L81
            GX r11 = r2.d
            jb0$a r2 = new jb0$a
            r2.<init>(r6, r5)
            r10.e = r8
            r10.g = r7
            r10.h = r1
            r10.d = r4
            java.lang.Object r11 = r11.m(r2, r10)
            if (r11 != r0) goto L7b
            goto L9b
        L7b:
            r2 = r7
            r4 = r8
        L7d:
            r7 = r1
            r1 = r2
            r11 = r4
            goto L85
        L81:
            r11 = r7
            r7 = r1
            r1 = r11
            r11 = r8
        L85:
            if (r1 == 0) goto L9c
            if (r7 == 0) goto L9c
            boolean r2 = r7.d
            if (r2 != 0) goto L9c
            r10.e = r5
            r10.g = r5
            r10.h = r5
            r10.d = r3
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L9c
        L9b:
            return r0
        L9c:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4698jb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(InterfaceC6606sf0<? super C6945uG> interfaceC6606sf0, C6945uG c6945uG, C6106qG c6106qG, JM<? super Unit> jm) {
        C4698jb0 c4698jb0 = new C4698jb0(this.i, jm);
        c4698jb0.e = interfaceC6606sf0;
        c4698jb0.g = c6945uG;
        c4698jb0.h = c6106qG;
        return c4698jb0.invokeSuspend(Unit.a);
    }
}

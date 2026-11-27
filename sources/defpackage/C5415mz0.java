package defpackage;

/* JADX INFO: renamed from: mz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5415mz0<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C4782jz0 d;

    /* JADX INFO: renamed from: mz0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsViewModel$subscribeToSelectionEvents$2", f = "IndicatorsDetailsViewModel.kt", l = {51, 51}, m = "emit")
    public static final class a extends LM {
        public AbstractC1731Oy0.c d;
        public C4782jz0 e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C5415mz0<T> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C5415mz0<? super T> c5415mz0, JM<? super a> jm) {
            super(jm);
            this.h = c5415mz0;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.a(null, this);
        }
    }

    public C5415mz0(C4782jz0 c4782jz0) {
        this.d = c4782jz0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // defpackage.InterfaceC6606sf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.AbstractC1731Oy0 r7, defpackage.JM<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C5415mz0.a
            if (r0 == 0) goto L13
            r0 = r8
            mz0$a r0 = (defpackage.C5415mz0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            mz0$a r0 = new mz0$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            jz0 r7 = r0.e
            Oy0$c r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L59
        L3a:
            defpackage.C1795Pt1.b(r8)
            boolean r8 = r7 instanceof defpackage.AbstractC1731Oy0.c
            jz0 r2 = r6.d
            if (r8 == 0) goto L7c
            r8 = r7
            Oy0$c r8 = (defpackage.AbstractC1731Oy0.c) r8
            r0.d = r8
            r0.e = r2
            r0.i = r4
            r2.getClass()
            java.lang.Object r8 = defpackage.C2907bG.n(r2, r0)
            if (r8 != r1) goto L56
            goto L78
        L56:
            r5 = r2
            r2 = r7
            r7 = r5
        L59:
            java.lang.String r8 = (java.lang.String) r8
            Lx0 r2 = r2.a
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.i = r3
            qK1 r7 = r7.g
            Ib1 r3 = new Ib1
            java.lang.String r2 = r2.e
            r3.<init>(r8, r2)
            java.lang.Object r7 = r7.a(r3, r0)
            if (r7 != r1) goto L74
            goto L76
        L74:
            kotlin.Unit r7 = kotlin.Unit.a
        L76:
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7c:
            boolean r8 = r7 instanceof defpackage.AbstractC1731Oy0.b
            if (r8 == 0) goto L84
            r2.l()
            goto L96
        L84:
            boolean r8 = r7 instanceof defpackage.AbstractC1731Oy0.a
            if (r8 != 0) goto L96
            boolean r7 = r7 instanceof defpackage.AbstractC1731Oy0.d
            if (r7 == 0) goto L90
            r2.l()
            goto L96
        L90:
            s51 r7 = new s51
            r7.<init>()
            throw r7
        L96:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5415mz0.a(Oy0, JM):java.lang.Object");
    }
}

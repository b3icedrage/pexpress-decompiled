package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$init$2", f = "WebSocketRequestExecutorBase.kt", l = {352, 353, 359, 361, 392}, m = "invokeSuspend")
public final class Gg2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Vg2 e;

    @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$init$2$1", f = "WebSocketRequestExecutorBase.kt", l = {371}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ Vg2 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vg2 vg2, JM jm) {
            super(2, jm);
            this.g = vg2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Unit> jm) {
            return ((a) create(bool, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                Boolean bool = (Boolean) this.e;
                boolean zA = Intrinsics.a(bool, Boolean.TRUE);
                Vg2 vg2 = this.g;
                if (zA) {
                    vg2.getClass();
                    Fg2.a(vg2, "canOpenWS");
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    this.d = 1;
                    if (vg2.f(this) == mn) {
                        return mn;
                    }
                } else if (bool != null) {
                    throw new C6489s51();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$init$2$2", f = "WebSocketRequestExecutorBase.kt", l = {387, 387}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ Vg2 e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ Vg2 d;

            public a(Vg2 vg2) {
                this.d = vg2;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objInvoke = ((Function2) this.d.q.getValue()).invoke((Pf2.a) obj, jm);
                return objInvoke == MN.d ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Vg2 vg2, JM jm) {
            super(2, jm);
            this.e = vg2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (((defpackage.InterfaceC6396rf0) r6).c(r1, r5) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.d
                Vg2 r2 = r5.e
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                defpackage.C1795Pt1.b(r6)
                goto L3e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L2e
            L1e:
                defpackage.C1795Pt1.b(r6)
                r5.d = r4
                ld r6 = r2.F()
                rf0 r6 = r6.c()
                if (r6 != r0) goto L2e
                goto L3d
            L2e:
                rf0 r6 = (defpackage.InterfaceC6396rf0) r6
                Gg2$b$a r1 = new Gg2$b$a
                r1.<init>(r2)
                r5.d = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3e
            L3d:
                return r0
            L3e:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Gg2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gg2(Vg2 vg2, JM jm) {
        super(2, jm);
        this.e = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Gg2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Gg2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[PHI: r12
      0x0093: PHI (r12v25 java.lang.Object) = (r12v14 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x008f, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (r12.a(r1, r11) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0141, code lost:
    
        if (kotlin.Unit.a == r0) goto L56;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Gg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

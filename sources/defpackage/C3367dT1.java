package defpackage;

import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment$startAnimatedAddValueLoop$1", f = "StubGameFragment.kt", l = {91}, m = "invokeSuspend")
public final class C3367dT1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ StubGameFragment g;

    /* JADX INFO: renamed from: dT1$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment$startAnimatedAddValueLoop$1$1", f = "StubGameFragment.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Long>, Object> {
        public int d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(2, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Long> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            this.d = 1;
            Object objC = C0682Bn0.c(this);
            return objC == mn ? mn : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3367dT1(StubGameFragment stubGameFragment, JM<? super C3367dT1> jm) {
        super(2, jm);
        this.g = stubGameFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C3367dT1 c3367dT1 = new C3367dT1(this.g, jm);
        c3367dT1.e = obj;
        return c3367dT1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3367dT1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0039 -> B:14:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            MN r1 = defpackage.MN.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            java.lang.Object r2 = r0.e
            KN r2 = (defpackage.KN) r2
            defpackage.C1795Pt1.b(r25)
            goto L3c
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1b:
            defpackage.C1795Pt1.b(r25)
            java.lang.Object r2 = r0.e
            KN r2 = (defpackage.KN) r2
        L22:
            boolean r4 = defpackage.LN.e(r2)
            if (r4 == 0) goto L99
            long r4 = com.base.feature.stub.screens.stubgame.StubGameFragment.p
            dT1$a r6 = new dT1$a
            r7 = 2
            r8 = 0
            r6.<init>(r7, r8)
            r0.e = r2
            r0.d = r3
            java.lang.Object r4 = defpackage.OZ1.d(r4, r6, r0)
            if (r4 != r1) goto L3c
            return r1
        L3c:
            com.base.feature.stub.screens.stubgame.StubGameFragment r6 = r0.g
            VM extends xG r4 = r6.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            iT1 r4 = (defpackage.C4416iT1) r4
            US1 r4 = r4.e
            KQ r4 = r4.a
            SZ1 r12 = r4.e()
            int r4 = com.base.feature.stub.screens.stubgame.StubGameFragment.q
            VM extends xG r4 = r6.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            iT1 r4 = (defpackage.C4416iT1) r4
            long r4 = r4.i
            long r13 = kotlin.time.b.l(r4)
            VM extends xG r4 = r6.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            iT1 r4 = (defpackage.C4416iT1) r4
            long r4 = r4.i
            long r15 = kotlin.time.b.l(r4)
            XS1 r17 = new XS1
            VM extends xG r4 = r6.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Class<iT1> r20 = defpackage.C4416iT1.class
            java.lang.String r21 = "getCurrentBet"
            r18 = 0
            java.lang.String r22 = "getCurrentBet()Lcom/api/feature/trading/models/CurrentBet;"
            r23 = 0
            r19 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            Am r4 = new Am
            java.lang.Class<com.base.feature.stub.screens.stubgame.StubGameFragment> r7 = com.base.feature.stub.screens.stubgame.StubGameFragment.class
            java.lang.String r8 = "isResumed"
            r5 = 0
            java.lang.String r9 = "isResumed()Z"
            r10 = 0
            r11 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            cA0 r7 = r6.m
            r8 = r12
            r9 = r13
            r11 = r15
            r13 = r17
            r14 = r4
            r7.b(r8, r9, r11, r13, r14)
            goto L22
        L99:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3367dT1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

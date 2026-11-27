package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NU implements MU {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    @NotNull
    public final YX d;

    @NotNull
    public final InterfaceC5862p6 e;

    @InterfaceC3368dU(c = "com.base.app.navigation.callbacks.deeplinks.DeeplinkManagerCallbacksBase$navigateToDeposit$1", f = "DeeplinkManagerCallbacksBase.kt", l = {47, 49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return NU.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r4.d.e(r5) == r0) goto L17;
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
                r2 = 2
                r3 = 1
                NU r4 = defpackage.NU.this
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.C1795Pt1.b(r6)
                goto L42
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L30
            L1e:
                defpackage.C1795Pt1.b(r6)
                p6 r6 = r4.e
                On1 r6 = r6.a()
                r5.d = r3
                java.lang.Object r6 = defpackage.C4466ii.o(r6, r5)
                if (r6 != r0) goto L30
                goto L41
            L30:
                boolean r6 = r6 instanceof defpackage.AbstractC5652o6.c
                if (r6 != 0) goto L42
                r4.i()
                r5.d = r2
                YX r6 = r4.d
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: NU.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public NU(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull YX depositScreenStarter, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogScreensProvider;
        this.d = depositScreenStarter;
        this.e = activationStateProviderApi;
    }

    @Override // defpackage.MU
    public final void a() {
        i();
        InterfaceC3951gE1 interfaceC3951gE1 = this.b;
        AbstractC2307Wh[] abstractC2307WhArr = {interfaceC3951gE1.k(), interfaceC3951gE1.a()};
        AbstractC5463nB1 abstractC5463nB1 = this.a;
        abstractC5463nB1.d(abstractC2307WhArr);
        abstractC5463nB1.c(this.c.o(), false);
    }

    @Override // defpackage.MU
    public final void b() {
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }

    @Override // defpackage.MU
    public final void c() {
        i();
        InterfaceC3951gE1 interfaceC3951gE1 = this.b;
        AbstractC2307Wh[] abstractC2307WhArr = {interfaceC3951gE1.k(), interfaceC3951gE1.a()};
        AbstractC5463nB1 abstractC5463nB1 = this.a;
        abstractC5463nB1.d(abstractC2307WhArr);
        abstractC5463nB1.c(this.c.c(), false);
    }

    @Override // defpackage.MU
    public final void d() {
        if (this.e.a().d.getValue() instanceof AbstractC5652o6.c) {
            i();
            InterfaceC3951gE1 interfaceC3951gE1 = this.b;
            this.a.d(new AbstractC2307Wh[]{interfaceC3951gE1.k(), interfaceC3951gE1.n(), interfaceC3951gE1.j()});
        }
    }

    @Override // defpackage.MU
    public final void e() {
        if (this.e.a().d.getValue() instanceof AbstractC5652o6.a) {
            return;
        }
        i();
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.MU
    public final void f() {
        i();
        this.a.c(this.b.l(), false);
    }

    @Override // defpackage.MU
    public final void g() {
        i();
        this.a.d(new AbstractC2307Wh[]{this.b.k()});
    }

    @Override // defpackage.MU
    public final void h() {
        i();
        InterfaceC3951gE1 interfaceC3951gE1 = this.b;
        this.a.d(new AbstractC2307Wh[]{interfaceC3951gE1.k(), interfaceC3951gE1.a()});
    }

    public final void i() {
        this.a.f();
    }
}

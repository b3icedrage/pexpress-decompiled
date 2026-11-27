package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class H61 extends L61 {

    @NotNull
    public final X61 d;

    @NotNull
    public final ReporterApi e;

    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionAlreadyGranted$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {53}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return H61.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (H61.g(H61.this, true, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionRequestBlocked$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {37, 46}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionRequestBlocked$1$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function1<JM<? super W61>, Object> {
            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super W61> jm) {
                ((a) create(jm)).invokeSuspend(Unit.a);
                return W61.g;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return W61.g;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return H61.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r2.j(r2.b, new defpackage.Z61(r7, null), r6) == r0) goto L18;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.d
                r2 = 2
                r3 = 1
                H61 r4 = defpackage.H61.this
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.C1795Pt1.b(r7)
                goto L66
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                defpackage.C1795Pt1.b(r7)
                goto L30
            L1e:
                defpackage.C1795Pt1.b(r7)
                X61 r7 = r4.d
                Y61 r7 = (defpackage.Y61) r7
                Y61$a r7 = r7.c
                r6.d = r3
                java.lang.Object r7 = defpackage.C4466ii.o(r7, r6)
                if (r7 != r0) goto L30
                goto L65
            L30:
                W61 r7 = (defpackage.W61) r7
                java.util.Objects.toString(r7)
                W61 r1 = defpackage.W61.g
                if (r7 == r1) goto L42
                com.api.feature.analytics.reporters.ReporterApi r7 = r4.e
                L80 r1 = defpackage.L80.SYSTEM_SETTINGS
                tl1 r5 = defpackage.EnumC6841tl1.TOTALLY
                defpackage.P51.a(r7, r1, r5)
            L42:
                com.api.feature.analytics.reporters.ReporterApi r7 = r4.e
                rl1 r1 = defpackage.EnumC6421rl1.NO
                defpackage.P51.b(r7, r1)
                H61$b$a r7 = new H61$b$a
                r1 = 0
                r7.<init>(r3, r1)
                r6.d = r2
                X61 r2 = r4.d
                Y61 r2 = (defpackage.Y61) r2
                r2.getClass()
                Z61 r3 = new Z61
                r3.<init>(r7, r1)
                Lg1 r7 = r2.b
                java.lang.Object r7 = r2.j(r7, r3, r6)
                if (r7 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: H61.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionRequestComplete$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {60}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ H61 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, H61 h61, JM<? super c> jm) {
            super(2, jm);
            this.e = z;
            this.g = h61;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (H61.g(this.g, this.e, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionRequestShown$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {30}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$onPermissionRequestShown$1$1", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function1<JM<? super W61>, Object> {
            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super W61> jm) {
                ((a) create(jm)).invokeSuspend(Unit.a);
                return W61.d;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return W61.d;
            }
        }

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return H61.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                X61 x61 = H61.this.d;
                a aVar = new a(1, null);
                this.d = 1;
                Y61 y61 = (Y61) x61;
                y61.getClass();
                if (y61.j(y61.b, new Z61(aVar, null), this) == mn) {
                    return mn;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H61(@NotNull B61 notificationManager, @NotNull X61 previousPushesAvailability, @NotNull ReporterApi reporter) {
        super(notificationManager, previousPushesAvailability, reporter);
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(previousPushesAvailability, "previousPushesAvailability");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.d = previousPushesAvailability;
        this.e = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r6.j(r6.b, new defpackage.Z61(r7, null), r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.H61 r6, boolean r7, defpackage.LM r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.I61
            if (r0 == 0) goto L16
            r0 = r8
            I61 r0 = (defpackage.I61) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i = r1
            goto L1b
        L16:
            I61 r0 = new I61
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r8)
            goto L95
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            boolean r7 = r0.e
            H61 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L53
        L3d:
            defpackage.C1795Pt1.b(r8)
            X61 r8 = r6.d
            Y61 r8 = (defpackage.Y61) r8
            Y61$a r8 = r8.c
            r0.d = r6
            r0.e = r7
            r0.i = r4
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L53
            goto L94
        L53:
            W61 r8 = (defpackage.W61) r8
            java.util.Objects.toString(r8)
            if (r7 != 0) goto L67
            W61 r2 = defpackage.W61.g
            if (r8 == r2) goto L67
            com.api.feature.analytics.reporters.ReporterApi r8 = r6.e
            L80 r2 = defpackage.L80.NOTIFICATION_REQUEST_DIALOG
            tl1 r5 = defpackage.EnumC6841tl1.TOTALLY
            defpackage.P51.a(r8, r2, r5)
        L67:
            if (r7 == 0) goto L6f
            super.c()
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6f:
            com.api.feature.analytics.reporters.ReporterApi r7 = r6.e
            rl1 r8 = defpackage.EnumC6421rl1.NO
            defpackage.P51.b(r7, r8)
            J61 r7 = new J61
            r8 = 0
            r7.<init>(r4, r8)
            r0.d = r8
            r0.i = r3
            X61 r6 = r6.d
            Y61 r6 = (defpackage.Y61) r6
            r6.getClass()
            Z61 r2 = new Z61
            r2.<init>(r7, r8)
            Lg1 r7 = r6.b
            java.lang.Object r6 = r6.j(r7, r2, r0)
            if (r6 != r1) goto L95
        L94:
            return r1
        L95:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H61.g(H61, boolean, LM):java.lang.Object");
    }

    @Override // defpackage.L61, defpackage.K61
    public final void a() {
        C5189lv.k(C3784fT.a, null, new d(null), 3);
    }

    @Override // defpackage.L61, defpackage.K61
    public final void b(boolean z) {
        C5189lv.k(C3784fT.a, null, new c(z, this, null), 3);
    }

    @Override // defpackage.L61, defpackage.K61
    public final void d() {
        C5189lv.k(C3784fT.a, null, new b(null), 3);
    }

    @Override // defpackage.L61, defpackage.K61
    public final void e() {
        C5189lv.k(C3784fT.a, null, new a(null), 3);
    }

    @Override // defpackage.L61, defpackage.K61
    public final void c() {
    }
}

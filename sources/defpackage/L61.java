package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class L61 implements K61 {

    @NotNull
    public final B61 a;

    @NotNull
    public final X61 b;

    @NotNull
    public final ReporterApi c;

    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsUseCaseBase$onApplicationCreate$1", f = "NotificationPermissionAnalyticsUseCaseBase.kt", l = {30, 33}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public W61 d;
        public int e;

        /* JADX INFO: renamed from: L61$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsUseCaseBase$onApplicationCreate$1$1", f = "NotificationPermissionAnalyticsUseCaseBase.kt", l = {}, m = "invokeSuspend")
        public static final class C0081a extends AW1 implements Function1<JM<? super W61>, Object> {
            public final /* synthetic */ W61 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0081a(W61 w61, JM<? super C0081a> jm) {
                super(1, jm);
                this.d = w61;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0081a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super W61> jm) {
                return ((C0081a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return this.d;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return L61.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006c  */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
        
            if (r1.j(r1.b, new defpackage.Z61(r11, null), r10) == r0) goto L74;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L61.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public L61(@NotNull B61 notificationManager, @NotNull X61 previousNotificationsAvailability, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(previousNotificationsAvailability, "previousNotificationsAvailability");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = notificationManager;
        this.b = previousNotificationsAvailability;
        this.c = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(L61 l61, W61 w61, LM lm) {
        M61 m61;
        l61.getClass();
        if (lm instanceof M61) {
            m61 = (M61) lm;
            int i = m61.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                m61.i = i - Integer.MIN_VALUE;
            } else {
                m61 = new M61(l61, lm);
            }
        } else {
            m61 = new M61(l61, lm);
        }
        Object objA = m61.g;
        MN mn = MN.d;
        int i2 = m61.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            Y61.a aVar = ((Y61) l61.b).c;
            m61.d = l61;
            m61.e = w61;
            m61.i = 1;
            objA = C7236vf0.a(aVar, m61);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w61 = m61.e;
            l61 = m61.d;
            C1795Pt1.b(objA);
        }
        int iOrdinal = ((W61) objA).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C6489s51();
                }
            } else if (w61 == W61.g) {
                P51.a(l61.c, L80.SYSTEM_SETTINGS, P51.c(w61));
            }
        } else if (w61 != W61.d) {
            P51.a(l61.c, L80.SYSTEM_SETTINGS, P51.c(w61));
        }
        return Unit.a;
    }

    @Override // defpackage.K61
    public void c() {
        C5189lv.k(C3784fT.a, null, new a(null), 3);
    }

    @Override // defpackage.K61
    public void a() {
    }

    @Override // defpackage.K61
    public void d() {
    }

    @Override // defpackage.K61
    public void e() {
    }

    @Override // defpackage.K61
    public void b(boolean z) {
    }
}

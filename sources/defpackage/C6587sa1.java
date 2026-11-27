package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$initialize$2", f = "NisyReporterBase.kt", l = {}, m = "invokeSuspend")
public final class C6587sa1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C6797ta1 d;
    public final /* synthetic */ ApplicationC0963Fd e;

    /* JADX INFO: renamed from: sa1$a */
    public /* synthetic */ class a extends C2784ak0 implements Function1<JM<? super String>, Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((ZT1) this.e).a(jm);
        }
    }

    /* JADX INFO: renamed from: sa1$b */
    public /* synthetic */ class b extends C2784ak0 implements Function1<JM<? super String>, Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((ZT1) this.e).d(jm);
        }
    }

    /* JADX INFO: renamed from: sa1$c */
    public /* synthetic */ class c extends C7 implements Function1<JM<? super String>, Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((ZT1) this.d).c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6587sa1(C6797ta1 c6797ta1, ApplicationC0963Fd applicationC0963Fd, JM jm) {
        super(2, jm);
        this.d = c6797ta1;
        this.e = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6587sa1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6587sa1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C6797ta1 c6797ta1 = this.d;
        ZT1 zt1 = c6797ta1.a;
        a getAdvertisingId = new a(1, zt1, ZT1.class, "getSubId", "getSubId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        b getAppSetId = new b(1, zt1, ZT1.class, "getAppSetId", "getAppSetId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        c getFirebaseId = new c(1, zt1, ZT1.class, "getAdId", "getAdId()Ljava/lang/String;", 4);
        ApplicationC0963Fd applicationC0963Fd = this.e;
        C4797k3 appContext = new C4797k3(applicationC0963Fd, 3);
        C2405Xf userId = new C2405Xf(c6797ta1, 3);
        C7239vg productEmail = new C7239vg(c6797ta1, 3);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(productEmail, "productEmail");
        Intrinsics.checkNotNullParameter(getAdvertisingId, "getAdvertisingId");
        Intrinsics.checkNotNullParameter(getFirebaseId, "getFirebaseId");
        Intrinsics.checkNotNullParameter(getAppSetId, "getAppSetId");
        Intrinsics.checkNotNullParameter("Pocket Matix", "appName");
        Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", "apiKey");
        Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com", "host");
        c6797ta1.b = new C2128Ua1(new C7416wW1(C5027l8.j(null, null, new WP(applicationC0963Fd, 0), 7)), new C4979kv(appContext, userId, productEmail, getAdvertisingId, getFirebaseId, getAppSetId));
        Boolean bool = Boolean.TRUE;
        GP1 gp1 = c6797ta1.d;
        gp1.getClass();
        gp1.m(null, bool);
        return Unit.a;
    }
}

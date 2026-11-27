package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App$initAppsFlyer$4", f = "App.kt", l = {}, m = "invokeSuspend")
public final class C8068zd extends AW1 implements Function2<Long, JM<? super Unit>, Object> {
    public /* synthetic */ long d;
    public final /* synthetic */ AppsFlyerLib e;
    public final /* synthetic */ ApplicationC0963Fd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8068zd(ApplicationC0963Fd applicationC0963Fd, JM jm, AppsFlyerLib appsFlyerLib) {
        super(2, jm);
        this.e = appsFlyerLib;
        this.g = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C8068zd c8068zd = new C8068zd(this.g, jm, this.e);
        c8068zd.d = ((Number) obj).longValue();
        return c8068zd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, JM<? super Unit> jm) {
        return ((C8068zd) create(Long.valueOf(l.longValue()), jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.e.setCustomerUserId(String.valueOf(this.d));
        ReporterApi reporterApi = this.g.h;
        if (reporterApi != null) {
            reporterApi.d(true);
            return Unit.a;
        }
        Intrinsics.l("reporter");
        throw null;
    }
}

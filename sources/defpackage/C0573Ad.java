package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App$initAppsFlyer$5", f = "App.kt", l = {}, m = "invokeSuspend")
public final class C0573Ad extends AW1 implements Function2<Unit, JM<? super Unit>, Object> {
    public final /* synthetic */ ApplicationC0963Fd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573Ad(ApplicationC0963Fd applicationC0963Fd, JM<? super C0573Ad> jm) {
        super(2, jm);
        this.d = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0573Ad(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, JM<? super Unit> jm) {
        return ((C0573Ad) create(unit, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        ReporterApi reporterApi = this.d.h;
        if (reporterApi != null) {
            reporterApi.d(false);
            return Unit.a;
        }
        Intrinsics.l("reporter");
        throw null;
    }
}

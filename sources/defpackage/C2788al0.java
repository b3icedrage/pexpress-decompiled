package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2788al0 implements InterfaceC5331mb0<C2577Zk0> {
    public final InterfaceC1531Mk1<InterfaceC7816yQ> a;
    public final InterfaceC1531Mk1<C4923kf> b;
    public final InterfaceC1531Mk1<ReporterApi> c;

    public C2788al0(InterfaceC1531Mk1<InterfaceC7816yQ> interfaceC1531Mk1, InterfaceC1531Mk1<C4923kf> interfaceC1531Mk2, InterfaceC1531Mk1<ReporterApi> interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        InterfaceC7816yQ currencyRepository = this.a.get();
        C4923kf appDataRepository = this.b.get();
        ReporterApi reporterApi = this.c.get();
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(reporterApi, "reporterApi");
        return new C2577Zk0(currencyRepository, appDataRepository, reporterApi);
    }
}

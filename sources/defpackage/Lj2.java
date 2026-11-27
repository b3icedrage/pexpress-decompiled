package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Lj2 implements InterfaceC5331mb0<Kj2> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final C7933yy1 b;
    public final InterfaceC1531Mk1<Q21> c;
    public final InterfaceC1531Mk1<ReporterApi> d;

    public Lj2(InterfaceC1531Mk1 interfaceC1531Mk1, C7933yy1 c7933yy1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = c7933yy1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        InterfaceC8087zh2 webViewCallbacks = (InterfaceC8087zh2) this.b.get();
        Q21 navigateToVerificationCallback = this.c.get();
        ReporterApi reporter = this.d.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(navigateToVerificationCallback, "navigateToVerificationCallback");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        return new Kj2(appData, webViewCallbacks, navigateToVerificationCallback, reporter);
    }
}

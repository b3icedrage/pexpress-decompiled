package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.impl.feature.platform.screens.platform_webview.PlatformWebViewFragmentImpl;

/* JADX INFO: renamed from: mf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5348mf1 implements InterfaceC5331mb0<PlatformWebViewFragmentImpl> {
    public final OW a;
    public final InterfaceC1531Mk1<C3827ff1> b;
    public final InterfaceC1531Mk1<InterfaceC2297Wd1> c;
    public final InterfaceC1531Mk1<C1280Je1> d;
    public final InterfaceC1531Mk1<AbstractC3198cf1> e;
    public final InterfaceC1531Mk1<AbstractC4456if1> f;
    public final InterfaceC1531Mk1<ReporterApi> g;
    public final InterfaceC1531Mk1<Ch2> h;

    public C5348mf1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.a = ow;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.g = interfaceC1531Mk6;
        this.h = interfaceC1531Mk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new PlatformWebViewFragmentImpl((Sd2) this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}

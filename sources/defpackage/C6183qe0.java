package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: renamed from: qe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6183qe0 implements InterfaceC5331mb0<C4710je0> {
    public final C5929pR a;
    public final C7904yp b;
    public final C5553ne0 c;
    public final C7851yb0 d;
    public final C5763oe0 e;
    public final C5343me0 f;
    public final C5973pe0 g;

    public C6183qe0(C5929pR c5929pR, C7904yp c7904yp, C5553ne0 c5553ne0, C7851yb0 c7851yb0, C5763oe0 c5763oe0, C5343me0 c5343me0, C5973pe0 c5973pe0) {
        this.a = c5929pR;
        this.b = c7904yp;
        this.c = c5553ne0;
        this.d = c7851yb0;
        this.e = c5763oe0;
        this.f = c5343me0;
        this.g = c5973pe0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4710je0((C1198Id0) this.a.get(), (InterfaceC1612Nk1) this.b.get(), (InterfaceC2400Xd0) this.c.get(), (InterfaceC1612Nk1) this.d.get(), (RemoteConfigManager) this.e.get(), (C8002zI) this.f.get(), (SessionManager) this.g.get());
    }
}

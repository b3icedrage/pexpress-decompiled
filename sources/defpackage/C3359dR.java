package defpackage;

import com.api.core.ActivityStateProvider;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3359dR implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC5331mb0 d;
    public final InterfaceC1531Mk1 e;

    public C3359dR(WQ wq, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.d = wq;
        this.b = interfaceC1531Mk1;
        this.e = interfaceC1454Lk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3149cR((VQ) ((WQ) this.d).get(), (AbstractC7004uZ1) this.b.get(), (MR1) ((InterfaceC1454Lk1) this.e).get(), (InterfaceC0565Aa0) this.c.get());
            default:
                return new IM0((ReporterApi) this.b.get(), (BB) ((DB) this.d).get(), (ActivityStateProvider) this.c.get(), (K61) this.e.get());
        }
    }

    public C3359dR(InterfaceC1531Mk1 interfaceC1531Mk1, DB db, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.d = db;
        this.c = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
    }
}

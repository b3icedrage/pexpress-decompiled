package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Kh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1367Kh1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C1367Kh1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1289Jh1((X4) this.b.get(), (ReporterApi) this.c.get());
            default:
                return new C6453rv1((ActivityC1745Pd) this.b.get(), (ReporterApi) this.c.get());
        }
    }
}

package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: eF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3534eF1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C3534eF1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3325dF1((AbstractC7949z22) this.b.get(), (C4923kf) this.c.get(), (AbstractC2199Uy0) this.d.get());
            case 1:
                return new KR1((InterfaceC5213m10) this.b.get(), (AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.d).get());
            default:
                return new Pj2((Pa2) this.b.get(), (ReporterApi) this.c.get(), (H21) ((C5609nu) this.d).get());
        }
    }

    public C3534eF1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.d = ow;
        this.c = interfaceC1531Mk2;
    }
}

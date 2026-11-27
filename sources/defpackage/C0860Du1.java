package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Du1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860Du1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;

    public C0860Du1(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.f = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0782Cu1((AbstractC5463nB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.f).get(), (InterfaceC5213m10) this.c.get(), (YX) this.d.get(), (ReporterApi) this.e.get());
            default:
                return new IX1((Context) ((C6) this.e).get(), (ZT1) this.b.get(), new HX1(), (InterfaceC0565Aa0) this.c.get(), (InterfaceC0799Da0) ((C7987zD) this.f).get(), (ReporterApi) this.d.get());
        }
    }

    public C0860Du1(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C7987zD c7987zD, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.e = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.f = c7987zD;
        this.d = interfaceC1531Mk3;
    }
}

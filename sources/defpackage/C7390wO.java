package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: wO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7390wO implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C7390wO(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5077lO((C4923kf) this.b.get(), (InterfaceC7600xO) ((EO) this.d).get(), (InterfaceC7012ub2) this.c.get());
            case 1:
                return new C0754Cl0((InterfaceC7012ub2) this.b.get(), (I50) this.c.get(), (C4923kf) this.d.get());
            case 2:
                return new C5265mF1((ReporterApi) this.b.get(), (X61) ((C4587j3) this.c).get(), (Context) ((C6) this.d).get());
            default:
                return new KQ1((AI1) ((InterfaceC1454Lk1) this.b).get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.c).get(), (C6102qE1) ((InterfaceC1454Lk1) this.d).get());
        }
    }

    public C7390wO(InterfaceC1531Mk1 interfaceC1531Mk1, EO eo, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 0;
        this.b = interfaceC1531Mk1;
        this.d = eo;
        this.c = interfaceC1531Mk2;
    }
}

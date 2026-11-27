package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: zm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8105zm0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC5331mb0 e;

    public /* synthetic */ C8105zm0(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7054um0((ReporterApi) this.b.get(), (InterfaceC0652Bd0) this.c.get(), (AbstractC0757Cm0) this.d.get(), (AbstractC1276Jd0) ((C3523eC) this.e).get());
            default:
                return new C3309dA0((AI1) ((InterfaceC1454Lk1) this.b).get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC4855kK) ((InterfaceC1454Lk1) this.d).get(), (C5892pE1) ((C6512sB1) this.e).get());
        }
    }
}

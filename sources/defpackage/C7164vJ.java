package defpackage;

import com.impl.feature.webpageinapp.screens.privacypolicy.PlatformPrivacyPolicyWebViewFragmentImpl;
import com.jivosite.sdk.socket.JivoWebSocketService;

/* JADX INFO: renamed from: vJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7164vJ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1531Mk1 g;

    public /* synthetic */ C7164vJ(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1531Mk1;
        this.d = interfaceC1454Lk2;
        this.e = interfaceC1531Mk2;
        this.f = interfaceC1531Mk3;
        this.g = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6954uJ((AI1) this.b.get(), (JivoWebSocketService) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC1466Lo1) this.d.get(), (InterfaceC4855kK) ((InterfaceC1454Lk1) this.e).get(), (M8) ((InterfaceC1454Lk1) this.f).get(), (InterfaceC7170vL) ((InterfaceC1454Lk1) this.g).get());
            default:
                return new PlatformPrivacyPolicyWebViewFragmentImpl((Sd2) ((OW) this.b).get(), new C7175vM1(), (Pa2) this.c.get(), (C1124He1) ((C3284d4) this.d).get(), (PX1) this.e.get(), (C6201qi2) this.f.get(), (Ch2) this.g.get());
        }
    }
}

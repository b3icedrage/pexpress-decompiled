package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4337i5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C4337i5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4127h5((Activity) this.b.get(), (Context) this.c.get(), (VK1) ((XK1) this.d).get(), (InterfaceC2228Vi) ((Y3) this.e).get());
            default:
                return new XV((C4923kf) this.b.get(), (InterfaceC6211ql0) this.c.get(), (DC1) this.d.get(), (AbstractC5045lD0) this.e.get());
        }
    }
}

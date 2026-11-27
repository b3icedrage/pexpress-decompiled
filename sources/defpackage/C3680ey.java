package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3680ey implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3680ey(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3470dy((Context) this.b.get());
            default:
                return new C2860b22((S02) this.b.get());
        }
    }
}

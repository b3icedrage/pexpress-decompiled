package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: hY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4219hY implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C4219hY(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4009gY((C4923kf) this.b.get(), (EQ) this.c.get());
            default:
                return new C0607Ao0((InterfaceC6843tm) this.b.get(), (Context) this.c.get());
        }
    }
}

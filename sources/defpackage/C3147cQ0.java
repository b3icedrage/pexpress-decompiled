package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: cQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3147cQ0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final C6 b;

    public /* synthetic */ C3147cQ0(C6 c6, int i) {
        this.a = i;
        this.b = c6;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2938bQ0((Context) this.b.get());
            case 1:
                return new C4909kb1((Context) this.b.get());
            default:
                return new C1046Ge1((Context) this.b.get());
        }
    }
}

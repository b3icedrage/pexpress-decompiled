package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6617si implements InterfaceC5331mb0<C5358mi> {
    public final C6 a;
    public final InterfaceC1531Mk1<Activity> b;
    public final InterfaceC1531Mk1<AbstractC4394iM0> c;
    public final InterfaceC1531Mk1<InterfaceC1446Li> d;
    public final InterfaceC1531Mk1<C4923kf> e;

    public C6617si(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C5358mi((Context) this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

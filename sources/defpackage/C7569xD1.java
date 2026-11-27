package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: xD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7569xD1 implements InterfaceC5541nb0<Ak2> {
    public final UA0 a;
    public final InterfaceC1531Mk1<T80> b;
    public final C7358wD1 c;

    public C7569xD1(UA0 ua0, InterfaceC1531Mk1 interfaceC1531Mk1, C7358wD1 c7358wD1) {
        this.a = ua0;
        this.b = interfaceC1531Mk1;
        this.c = c7358wD1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2908bG0((Context) this.a.a, this.b.get(), (AbstractC5259mD1) this.c.get());
    }
}

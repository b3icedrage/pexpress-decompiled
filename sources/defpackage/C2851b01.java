package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: b01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2851b01 implements InterfaceC5541nb0<C2627a01> {
    public final UA0 a;
    public final UP b;

    public C2851b01(UA0 ua0, UP up) {
        this.a = ua0;
        this.b = up;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2627a01((Context) this.a.a, (TP) this.b.get());
    }
}

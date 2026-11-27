package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class GD1 implements InterfaceC5541nb0<FD1> {
    public final UA0 a;

    public GD1(UA0 ua0) {
        this.a = ua0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new FD1((Context) this.a.a, Integer.valueOf(FD1.h).intValue(), "com.google.android.datatransport.events");
    }
}

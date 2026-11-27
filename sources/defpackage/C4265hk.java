package defpackage;

import com.impl.core.backend.data_sources.AssetsDataSourceImpl;

/* JADX INFO: renamed from: hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4265hk implements InterfaceC5331mb0<AssetsDataSourceImpl> {
    public final InterfaceC1531Mk1<Vg2> a;
    public final InterfaceC1531Mk1<C3836fh2> b;
    public final InterfaceC1531Mk1<O3> c;

    public C4265hk(InterfaceC1531Mk1<Vg2> interfaceC1531Mk1, InterfaceC1531Mk1<C3836fh2> interfaceC1531Mk2, InterfaceC1531Mk1<O3> interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new AssetsDataSourceImpl(this.a.get(), this.b.get(), this.c.get());
    }
}

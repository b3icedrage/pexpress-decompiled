package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class O31 implements InterfaceC5331mb0<C2263Vt1> {
    public final InterfaceC1454Lk1 a;
    public final N31 b;
    public final M31 c;

    public O31(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1, N31 n31, M31 m31) {
        this.a = interfaceC1454Lk1;
        this.b = n31;
        this.c = m31;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C6711t81 client = (C6711t81) this.a.get();
        WM.a converter = (WM.a) this.b.get();
        InterfaceC1179Hx.a callAdapter = (InterfaceC1179Hx.a) this.c.get();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(callAdapter, "callAdapter");
        C2263Vt1.b bVar = new C2263Vt1.b();
        bVar.b("https://jivosite.com/");
        Objects.requireNonNull(client, "client == null");
        bVar.b = client;
        bVar.e.add(callAdapter);
        bVar.a(converter);
        C2263Vt1 c2263Vt1C = bVar.c();
        Intrinsics.checkNotNullExpressionValue(c2263Vt1C, "Builder()\n            .b…ter)\n            .build()");
        return c2263Vt1C;
    }
}

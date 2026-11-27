package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: pj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5993pj0 implements InterfaceC5331mb0<C5783oj0> {
    public final InterfaceC1454Lk1 a;
    public final InterfaceC1531Mk1<ReporterApi> b;
    public final InterfaceC1531Mk1<Context> c;

    public C5993pj0(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C5783oj0((VQ1) this.a.get(), this.b.get(), this.c.get());
    }
}

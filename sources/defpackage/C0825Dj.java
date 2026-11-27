package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0825Dj extends AbstractC6155qW0<Object, Object> {
    public final /* synthetic */ C0903Ej d;

    public C0825Dj(C0903Ej c0903Ej) {
        this.d = c0903Ej;
    }

    @Override // defpackage.AbstractC6155qW0
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.AbstractC6155qW0
    public final Object b(int i, int i2) {
        return this.d.e[i];
    }

    @Override // defpackage.AbstractC6155qW0
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // defpackage.AbstractC6155qW0
    public final int d() {
        return this.d.g;
    }

    @Override // defpackage.AbstractC6155qW0
    public final int e(Object obj) {
        C0903Ej c0903Ej = this.d;
        return obj == null ? c0903Ej.d() : c0903Ej.c(obj.hashCode(), obj);
    }

    @Override // defpackage.AbstractC6155qW0
    public final int f(Object obj) {
        C0903Ej c0903Ej = this.d;
        return obj == null ? c0903Ej.d() : c0903Ej.c(obj.hashCode(), obj);
    }

    @Override // defpackage.AbstractC6155qW0
    public final void g(Object obj, Object obj2) {
        this.d.add(obj);
    }

    @Override // defpackage.AbstractC6155qW0
    public final void h(int i) {
        this.d.e(i);
    }

    @Override // defpackage.AbstractC6155qW0
    public final Object i(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}

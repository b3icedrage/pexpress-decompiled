package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7672xj extends AbstractC6155qW0<Object, Object> {
    public final /* synthetic */ C8092zj d;

    public C7672xj(C8092zj c8092zj) {
        this.d = c8092zj;
    }

    @Override // defpackage.AbstractC6155qW0
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.AbstractC6155qW0
    public final Object b(int i, int i2) {
        return this.d.e[(i << 1) + i2];
    }

    @Override // defpackage.AbstractC6155qW0
    public final Map<Object, Object> c() {
        return this.d;
    }

    @Override // defpackage.AbstractC6155qW0
    public final int d() {
        return this.d.g;
    }

    @Override // defpackage.AbstractC6155qW0
    public final int e(Object obj) {
        return this.d.f(obj);
    }

    @Override // defpackage.AbstractC6155qW0
    public final int f(Object obj) {
        return this.d.h(obj);
    }

    @Override // defpackage.AbstractC6155qW0
    public final void g(Object obj, Object obj2) {
        this.d.put(obj, obj2);
    }

    @Override // defpackage.AbstractC6155qW0
    public final void h(int i) {
        this.d.k(i);
    }

    @Override // defpackage.AbstractC6155qW0
    public final Object i(int i, Object obj) {
        return this.d.l(i, obj);
    }
}

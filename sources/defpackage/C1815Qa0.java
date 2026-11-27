package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: Qa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1815Qa0 extends AbstractC1659Oa0<AbstractC0595Ak0.d> {
    @Override // defpackage.AbstractC1659Oa0
    public final void a(Map.Entry entry) {
        ((AbstractC0595Ak0.d) entry.getKey()).getClass();
    }

    @Override // defpackage.AbstractC1659Oa0
    public final C0649Bc0<AbstractC0595Ak0.d> b(Object obj) {
        return ((AbstractC0595Ak0.c) obj).extensions;
    }

    @Override // defpackage.AbstractC1659Oa0
    public final C0649Bc0<AbstractC0595Ak0.d> c(Object obj) {
        AbstractC0595Ak0.c cVar = (AbstractC0595Ak0.c) obj;
        C0649Bc0<AbstractC0595Ak0.d> c0649Bc0 = cVar.extensions;
        if (c0649Bc0.b) {
            cVar.extensions = c0649Bc0.clone();
        }
        return cVar.extensions;
    }

    @Override // defpackage.AbstractC1659Oa0
    public final boolean d(GZ0 gz0) {
        return gz0 instanceof AbstractC0595Ak0.c;
    }

    @Override // defpackage.AbstractC1659Oa0
    public final void e(Object obj) {
        C0649Bc0<AbstractC0595Ak0.d> c0649Bc0 = ((AbstractC0595Ak0.c) obj).extensions;
        if (c0649Bc0.b) {
            return;
        }
        c0649Bc0.a.g();
        c0649Bc0.b = true;
    }

    @Override // defpackage.AbstractC1659Oa0
    public final void f(Map.Entry entry) {
        ((AbstractC0595Ak0.d) entry.getKey()).getClass();
        throw null;
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BW0 implements InterfaceC7835yW0 {
    @Override // defpackage.InterfaceC7835yW0
    public final C7415wW0 a(Object obj, Object obj2) {
        C7415wW0 c7415wW0E = (C7415wW0) obj;
        C7415wW0 c7415wW0 = (C7415wW0) obj2;
        if (!c7415wW0.isEmpty()) {
            if (!c7415wW0E.d) {
                c7415wW0E = c7415wW0E.e();
            }
            c7415wW0E.d();
            if (!c7415wW0.isEmpty()) {
                c7415wW0E.putAll(c7415wW0);
            }
        }
        return c7415wW0E;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final Object b(Object obj) {
        ((C7415wW0) obj).d = false;
        return obj;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final C6364rW0.a<?, ?> c(Object obj) {
        return ((C6364rW0) obj).a;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final int d(int i, Object obj, Object obj2) {
        C7415wW0 c7415wW0 = (C7415wW0) obj;
        C6364rW0 c6364rW0 = (C6364rW0) obj2;
        int iD = 0;
        if (c7415wW0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c7415wW0.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            c6364rW0.getClass();
            int iC = GE.C(i);
            int iA = C6364rW0.a(c6364rW0.a, key, value);
            iD += GE.D(iA) + iA + iC;
        }
        return iD;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final C7415wW0 e(Object obj) {
        return (C7415wW0) obj;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final C7415wW0 f() {
        return C7415wW0.e.e();
    }

    @Override // defpackage.InterfaceC7835yW0
    public final C7415wW0 g(Object obj) {
        return (C7415wW0) obj;
    }

    @Override // defpackage.InterfaceC7835yW0
    public final boolean h(Object obj) {
        return !((C7415wW0) obj).d;
    }
}

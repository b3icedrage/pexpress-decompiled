package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AW0 implements InterfaceC7625xW0 {
    @Override // defpackage.InterfaceC7625xW0
    public final C7204vW0 a(Object obj, Object obj2) {
        C7204vW0 c7204vW0E = (C7204vW0) obj;
        C7204vW0 c7204vW0 = (C7204vW0) obj2;
        if (!c7204vW0.isEmpty()) {
            if (!c7204vW0E.d) {
                c7204vW0E = c7204vW0E.e();
            }
            c7204vW0E.d();
            if (!c7204vW0.isEmpty()) {
                c7204vW0E.putAll(c7204vW0);
            }
        }
        return c7204vW0E;
    }

    @Override // defpackage.InterfaceC7625xW0
    public final Object b(Object obj) {
        ((C7204vW0) obj).d = false;
        return obj;
    }

    @Override // defpackage.InterfaceC7625xW0
    public final C6574sW0.a<?, ?> c(Object obj) {
        return ((C6574sW0) obj).a;
    }

    @Override // defpackage.InterfaceC7625xW0
    public final int d(int i, Object obj, Object obj2) {
        C7204vW0 c7204vW0 = (C7204vW0) obj;
        C6574sW0 c6574sW0 = (C6574sW0) obj2;
        int iA = 0;
        if (c7204vW0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c7204vW0.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            c6574sW0.getClass();
            int iE = HE.E(i);
            int iA2 = C6574sW0.a(c6574sW0.a, key, value);
            iA = C8045zW0.a(iA2, iA2, iE, iA);
        }
        return iA;
    }

    @Override // defpackage.InterfaceC7625xW0
    public final C7204vW0 e(Object obj) {
        return (C7204vW0) obj;
    }
}

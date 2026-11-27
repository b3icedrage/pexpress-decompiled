package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: gH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3958gH {
    default <T> T a(Class<T> cls) {
        return (T) g(C7892yl1.a(cls));
    }

    default <T> Set<T> b(C7892yl1<T> c7892yl1) {
        return d(c7892yl1).get();
    }

    default <T> InterfaceC1612Nk1<T> c(Class<T> cls) {
        return f(C7892yl1.a(cls));
    }

    <T> InterfaceC1612Nk1<Set<T>> d(C7892yl1<T> c7892yl1);

    <T> InterfaceC7203vW<T> e(C7892yl1<T> c7892yl1);

    <T> InterfaceC1612Nk1<T> f(C7892yl1<T> c7892yl1);

    default <T> T g(C7892yl1<T> c7892yl1) {
        InterfaceC1612Nk1<T> interfaceC1612Nk1F = f(c7892yl1);
        if (interfaceC1612Nk1F == null) {
            return null;
        }
        return interfaceC1612Nk1F.get();
    }
}

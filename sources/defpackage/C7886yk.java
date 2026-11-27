package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7886yk implements InterfaceC8098zk1 {
    public final int a;

    public C7886yk(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC8098zk1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8098zk1)) {
            return false;
        }
        C7886yk c7886yk = (C7886yk) ((InterfaceC8098zk1) obj);
        if (this.a != c7886yk.a) {
            return false;
        }
        Object obj2 = InterfaceC8098zk1.a.d;
        c7886yk.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (InterfaceC8098zk1.a.d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + InterfaceC8098zk1.a.d + ')';
    }
}

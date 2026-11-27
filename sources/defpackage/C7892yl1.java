package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: yl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7892yl1<T> {
    public final Class<? extends Annotation> a;
    public final Class<T> b;

    /* JADX INFO: renamed from: yl1$a */
    public @interface a {
    }

    public C7892yl1(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> C7892yl1<T> a(Class<T> cls) {
        return new C7892yl1<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7892yl1.class != obj.getClass()) {
            return false;
        }
        C7892yl1 c7892yl1 = (C7892yl1) obj;
        if (this.b.equals(c7892yl1.b)) {
            return this.a.equals(c7892yl1.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.b;
        Class<? extends Annotation> cls2 = this.a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

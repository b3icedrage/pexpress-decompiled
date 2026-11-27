package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class RM1 implements QM1 {
    public static final RM1 a = new RM1();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return QM1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof QM1;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + QM1.class.getName() + "()";
    }
}

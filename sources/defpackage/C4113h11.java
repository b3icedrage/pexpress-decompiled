package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: h11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113h11 extends WM.a {
    public final C3903g11 a;

    public C4113h11(C3903g11 c3903g11) {
        this.a = c3903g11;
    }

    public static Set<? extends Annotation> d(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC7369wH0.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // WM.a
    public final WM<?, AbstractC5395ms1> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C2263Vt1 c2263Vt1) {
        return new C4323i11(this.a.c(type, d(annotationArr), null));
    }

    @Override // WM.a
    public final WM<AbstractC1091Gt1, ?> b(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        return new C4581j11(this.a.c(type, d(annotationArr), null));
    }
}

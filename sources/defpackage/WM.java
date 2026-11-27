package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface WM<F, T> {

    public static abstract class a {
        @Nullable
        public WM<?, AbstractC5395ms1> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C2263Vt1 c2263Vt1) {
            return null;
        }

        @Nullable
        public WM<AbstractC1091Gt1, ?> b(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
            return null;
        }

        @Nullable
        public WM<?, String> c(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
            return null;
        }
    }

    @Nullable
    T a(F f);
}

package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6793tZ0<T> {

    /* JADX INFO: renamed from: tZ0$a */
    public interface a {
        @NotNull
        InterfaceC6793tZ0<?> a(@NotNull Type type, @NotNull Annotation[] annotationArr);
    }

    @NotNull
    AbstractC6583sZ0 a(T t);

    T b(@NotNull AbstractC6583sZ0 abstractC6583sZ0);
}

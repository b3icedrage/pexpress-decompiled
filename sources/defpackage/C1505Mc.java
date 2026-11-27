package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1505Mc {
    @NotNull
    public static final <T> T a(@NotNull Class<T> annotationClass, @NotNull Map<String, ? extends Object> values, @NotNull List<Method> methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        KW1 kw1B = XO0.b(new C1194Ic(values, 0));
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C1350Kc(annotationClass, values, XO0.b(new C1272Jc(annotationClass, values)), kw1B, methods));
        Intrinsics.c(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }
}

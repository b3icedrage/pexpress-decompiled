package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7373wI0 {

    /* JADX INFO: renamed from: wI0$a */
    public static final class a extends AbstractC7373wI0 {

        @NotNull
        public final List<Method> a;

        /* JADX INFO: renamed from: wI0$a$a, reason: collision with other inner class name */
        public static final class C0525a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return BG.a(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public a(@NotNull Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            this.a = C1526Mj.B(declaredMethods, new C0525a());
        }

        @Override // defpackage.AbstractC7373wI0
        @NotNull
        public final String a() {
            return CollectionsKt.J(this.a, "", "<init>(", ")V", RY.g, 24);
        }
    }

    /* JADX INFO: renamed from: wI0$b */
    public static final class b extends AbstractC7373wI0 {

        @NotNull
        public final Constructor<?> a;

        public b(@NotNull Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.a = constructor;
        }

        @Override // defpackage.AbstractC7373wI0
        @NotNull
        public final String a() {
            Class<?>[] parameterTypes = this.a.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return C1526Mj.x(parameterTypes, "", "<init>(", ")V", SY.g, 24);
        }
    }

    /* JADX INFO: renamed from: wI0$c */
    public static final class c extends AbstractC7373wI0 {

        @NotNull
        public final Method a;

        public c(@NotNull Method method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.a = method;
        }

        @Override // defpackage.AbstractC7373wI0
        @NotNull
        public final String a() {
            return C1952Ru.e(this.a);
        }
    }

    /* JADX INFO: renamed from: wI0$d */
    public static final class d extends AbstractC7373wI0 {

        @NotNull
        public final AbstractC7583xI0.b a;

        @NotNull
        public final String b;

        public d(@NotNull AbstractC7583xI0.b signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.a = signature;
            this.b = signature.a();
        }

        @Override // defpackage.AbstractC7373wI0
        @NotNull
        public final String a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: wI0$e */
    public static final class e extends AbstractC7373wI0 {

        @NotNull
        public final AbstractC7583xI0.b a;

        @NotNull
        public final String b;

        public e(@NotNull AbstractC7583xI0.b signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.a = signature;
            this.b = signature.a();
        }

        @Override // defpackage.AbstractC7373wI0
        @NotNull
        public final String a() {
            return this.b;
        }
    }

    @NotNull
    public abstract String a();
}

package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OX1 extends WM.a {

    @NotNull
    public final C4746jn0 a;

    public static final class a {
        public static final String a(Type type) {
            if (type instanceof Class) {
                return ((Class) type).getSimpleName();
            }
            if (!(type instanceof ParameterizedType)) {
                String string = type.toString();
                return StringsKt.W(JwtParser.SEPARATOR_CHAR, string, string);
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Class cls = rawType instanceof Class ? (Class) rawType : null;
            String simpleName = cls != null ? cls.getSimpleName() : "Unknown";
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
            return ID.c(simpleName, "<", C1526Mj.x(actualTypeArguments, ",", null, null, new NX1(), 30), ">");
        }
    }

    public static final class b implements WM<AbstractC1091Gt1, Object> {

        @NotNull
        public final WM<AbstractC1091Gt1, ?> a;

        @NotNull
        public final Type b;

        public b(@NotNull WM<AbstractC1091Gt1, ?> delegate, @NotNull Type type) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = delegate;
            this.b = type;
        }

        @Override // defpackage.WM
        public final Object a(AbstractC1091Gt1 abstractC1091Gt1) {
            AbstractC1091Gt1 value = abstractC1091Gt1;
            Type type = this.b;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return this.a.a(value);
            } catch (HH0 e) {
                C2144Ug c2144Ug = U0.n;
                if (c2144Ug != null) {
                    c2144Ug.k(a.a(type), -1, e);
                }
                throw e;
            } catch (C6529sH0 e2) {
                C2144Ug c2144Ug2 = U0.n;
                if (c2144Ug2 != null) {
                    c2144Ug2.k(a.a(type), -1, e2);
                }
                throw e2;
            }
        }
    }

    public OX1(@NotNull C4746jn0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // WM.a
    @Nullable
    public final WM<?, AbstractC5395ms1> a(@NotNull Type type, @NotNull Annotation[] parameterAnnotations, @NotNull Annotation[] methodAnnotations, @NotNull C2263Vt1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.a.a(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    @Override // WM.a
    @Nullable
    public final WM<AbstractC1091Gt1, ?> b(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull C2263Vt1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new b(this.a.b(type, annotations, retrofit), type);
    }

    @Override // WM.a
    @Nullable
    public final WM<?, String> c(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull C2263Vt1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.a.getClass();
        return null;
    }
}

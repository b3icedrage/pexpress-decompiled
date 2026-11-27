package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MX1 implements InterfaceC6793tZ0.a {

    @NotNull
    public final InterfaceC6793tZ0.a a;

    public static final class a {
        public static final int a(AbstractC6583sZ0 abstractC6583sZ0) {
            if (abstractC6583sZ0 instanceof AbstractC6583sZ0.b) {
                byte[] bytes = ((AbstractC6583sZ0.b) abstractC6583sZ0).a.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes.length;
            }
            if (abstractC6583sZ0 instanceof AbstractC6583sZ0.a) {
                return ((AbstractC6583sZ0.a) abstractC6583sZ0).a.length;
            }
            throw new C6489s51();
        }

        public static final String b(Type type) {
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
            return ID.c(simpleName, "<", C1526Mj.x(actualTypeArguments, ",", null, null, new LX1(), 30), ">");
        }
    }

    public static final class b<T> implements InterfaceC6793tZ0<T> {

        @NotNull
        public final InterfaceC6793tZ0<T> a;

        @NotNull
        public final Type b;

        public b(@NotNull InterfaceC6793tZ0<T> delegate, @NotNull Type type) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = delegate;
            this.b = type;
        }

        @Override // defpackage.InterfaceC6793tZ0
        @NotNull
        public final AbstractC6583sZ0 a(T t) {
            return this.a.a(t);
        }

        @Override // defpackage.InterfaceC6793tZ0
        public final T b(@NotNull AbstractC6583sZ0 message) {
            Type type = this.b;
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                return this.a.b(message);
            } catch (HH0 e) {
                C2144Ug c2144Ug = U0.n;
                if (c2144Ug != null) {
                    c2144Ug.k(a.b(type), Integer.valueOf(a.a(message)), e);
                }
                throw e;
            } catch (C6529sH0 e2) {
                C2144Ug c2144Ug2 = U0.n;
                if (c2144Ug2 != null) {
                    c2144Ug2.k(a.b(type), Integer.valueOf(a.a(message)), e2);
                }
                throw e2;
            }
        }
    }

    public MX1(@NotNull InterfaceC6793tZ0.a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // defpackage.InterfaceC6793tZ0.a
    @NotNull
    public final InterfaceC6793tZ0<?> a(@NotNull Type type, @NotNull Annotation[] annotations) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return new b(this.a.a(type, annotations), type);
    }
}

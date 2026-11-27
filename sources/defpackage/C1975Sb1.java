package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1975Sb1 implements ParameterizedType, Type {

    @NotNull
    public final Class<?> d;

    @Nullable
    public final Type e;

    @NotNull
    public final Type[] g;

    /* JADX INFO: renamed from: Sb1$a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends C2784ak0 implements Function1<Type, String> {
        public static final a m = new a();

        public a() {
            super(1, C7128v72.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Type type) {
            Type p0 = type;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C7128v72.a(p0);
        }
    }

    public C1975Sb1(@NotNull Class rawType, @Nullable Type type, @NotNull ArrayList typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.d = rawType;
        this.e = type;
        this.g = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (Intrinsics.a(this.d, parameterizedType.getRawType()) && Intrinsics.a(this.e, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.g, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type[] getActualTypeArguments() {
        return this.g;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public final Type getOwnerType() {
        return this.e;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type getRawType() {
        return this.d;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.d;
        Type type = this.e;
        if (type != null) {
            sb.append(C7128v72.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(C7128v72.a(cls));
        }
        Type[] typeArr = this.g;
        if (typeArr.length != 0) {
            C1526Mj.v(typeArr, sb, ", ", "<", ">", a.m);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode();
        Type type = this.e;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.g);
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}

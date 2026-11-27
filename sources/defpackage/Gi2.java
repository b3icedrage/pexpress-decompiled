package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Gi2 implements WildcardType, Type {

    @NotNull
    public static final a g = new a(null);

    @NotNull
    public static final Gi2 h = new Gi2(null, null);

    @Nullable
    public final Type d;

    @Nullable
    public final Type e;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Gi2(@Nullable Type type, @Nullable Type type2) {
        this.d = type;
        this.e = type2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public final Type[] getLowerBounds() {
        Type type = this.e;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        Type type = this.e;
        if (type != null) {
            return "? super " + C7128v72.a(type);
        }
        Type type2 = this.d;
        if (type2 == null || Intrinsics.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + C7128v72.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public final Type[] getUpperBounds() {
        Type type = this.d;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}

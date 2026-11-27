package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0985Fk0 implements GenericArrayType, Type {

    @NotNull
    public final Type d;

    public C0985Fk0(@NotNull Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.d = elementType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.a(this.d, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public final Type getGenericComponentType() {
        return this.d;
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        return C7128v72.a(this.d) + "[]";
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}

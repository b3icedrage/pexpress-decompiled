package defpackage;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class A62 {

    @NotNull
    public final RI0<?> a;

    @NotNull
    public final Type b;

    @Nullable
    public final SJ0 c;

    public A62(@NotNull RI0 type, @Nullable SJ0 sj0, @NotNull Type reifiedType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        this.a = type;
        this.b = reifiedType;
        this.c = sj0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A62)) {
            return false;
        }
        A62 a62 = (A62) obj;
        return Intrinsics.a(this.a, a62.a) && Intrinsics.a(this.b, a62.b) && Intrinsics.a(this.c, a62.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SJ0 sj0 = this.c;
        return iHashCode + (sj0 == null ? 0 : sj0.hashCode());
    }

    @NotNull
    public final String toString() {
        return "TypeInfo(type=" + this.a + ", reifiedType=" + this.b + ", kotlinType=" + this.c + ')';
    }
}

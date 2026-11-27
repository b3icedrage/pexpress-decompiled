package defpackage;

import defpackage.InterfaceC6126qM1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6928uA0<Type extends InterfaceC6126qM1> extends Rc2<Type> {

    @NotNull
    public final C5638o21 a;

    @NotNull
    public final Type b;

    public C6928uA0(@NotNull C5638o21 underlyingPropertyName, @NotNull Type underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.a = underlyingPropertyName;
        this.b = underlyingType;
    }

    @Override // defpackage.Rc2
    public final boolean a(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.a(this.a, name);
    }

    @NotNull
    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}

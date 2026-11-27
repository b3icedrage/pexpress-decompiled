package defpackage;

import defpackage.InterfaceC6126qM1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class H11<Type extends InterfaceC6126qM1> extends Rc2<Type> {

    @NotNull
    public final ArrayList a;

    @NotNull
    public final Map<C5638o21, Type> b;

    public H11(@NotNull ArrayList underlyingPropertyNamesToTypes) {
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.a = underlyingPropertyNamesToTypes;
        Map<C5638o21, Type> mapJ = PW0.j(underlyingPropertyNamesToTypes);
        if (mapJ.size() != underlyingPropertyNamesToTypes.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.b = mapJ;
    }

    @Override // defpackage.Rc2
    public final boolean a(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.b.containsKey(name);
    }

    @NotNull
    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}

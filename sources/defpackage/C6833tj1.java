package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6833tj1<Object, Field> implements InterfaceC6475s2<Object, Field> {

    @NotNull
    public final AJ0<Object, Field> a;

    public C6833tj1(@NotNull AJ0<Object, Field> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.a = property;
    }

    @Override // defpackage.InterfaceC6475s2
    @Nullable
    public final Field a(Object object) {
        return this.a.get(object);
    }

    @Override // defpackage.InterfaceC6475s2
    public final Field b(Object object) {
        AJ0<Object, Field> aj0 = this.a;
        Field field = aj0.get(object);
        if (field != null) {
            return field;
        }
        throw new IllegalStateException("Field " + aj0.getName() + " is not set");
    }

    @Override // defpackage.InterfaceC6625sk
    @Nullable
    public final Field c(Object object, Field field) {
        AJ0<Object, Field> aj0 = this.a;
        Field field2 = aj0.get(object);
        if (field2 == null) {
            aj0.p(object, field);
            return null;
        }
        if (field2.equals(field)) {
            return null;
        }
        return field2;
    }
}

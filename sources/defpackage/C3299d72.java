package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3299d72 implements TypeVariable<GenericDeclaration>, Type {

    @NotNull
    public final XJ0 d;

    public C3299d72(@NotNull XJ0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.d = typeParameter;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.a(this.d.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final Type[] getBounds() {
        List<SJ0> upperBounds = this.d.getUpperBounds();
        ArrayList arrayList = new ArrayList(XE.m(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(C7128v72.b((SJ0) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final GenericDeclaration getGenericDeclaration() {
        throw new H51(C5491nL.c("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.d));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public final String getName() {
        return this.d.getName();
    }

    @Override // java.lang.reflect.Type
    @NotNull
    public final String getTypeName() {
        return this.d.getName();
    }

    public final int hashCode() {
        this.d.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    @NotNull
    public final String toString() {
        return this.d.getName();
    }
}

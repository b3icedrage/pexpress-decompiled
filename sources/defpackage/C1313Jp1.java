package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1313Jp1 extends AbstractC8116zp1 implements WD0, ZE0 {

    @NotNull
    public final TypeVariable<?> a;

    public C1313Jp1(@NotNull TypeVariable<?> typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C1313Jp1) {
            return Intrinsics.a(this.a, ((C1313Jp1) obj).a);
        }
        return false;
    }

    @Override // defpackage.CE0
    @NotNull
    public final C5638o21 getName() {
        C5638o21 c5638o21K = C5638o21.k(this.a.getName());
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return c5638o21K;
    }

    @Override // defpackage.ZE0
    public final Collection getUpperBounds() {
        Type[] bounds = this.a.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C7696xp1(type));
        }
        C7696xp1 c7696xp1 = (C7696xp1) CollectionsKt.W(arrayList);
        return Intrinsics.a(c7696xp1 != null ? c7696xp1.a : null, Object.class) ? C5653o60.d : arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.WD0
    public final Collection k() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C5653o60.d : N7.f(declaredAnnotations);
    }

    @Override // defpackage.WD0
    public final QD0 p(C1758Ph0 fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        TypeVariable<?> typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return N7.e(declaredAnnotations, fqName);
    }

    @NotNull
    public final String toString() {
        return C1313Jp1.class.getName() + ": " + this.a;
    }
}

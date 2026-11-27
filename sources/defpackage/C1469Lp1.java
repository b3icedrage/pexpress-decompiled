package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1469Lp1 extends AbstractC1235Ip1 implements InterfaceC5051lF0 {

    @NotNull
    public final WildcardType a;

    @NotNull
    public final C5653o60 b;

    public C1469Lp1(@NotNull WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.a = reflectType;
        this.b = C5653o60.d;
    }

    @Override // defpackage.InterfaceC5051lF0
    public final boolean J() {
        Type[] upperBounds = this.a.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return !Intrinsics.a(C1526Mj.r(upperBounds), Object.class);
    }

    @Override // defpackage.AbstractC1235Ip1
    public final Type O() {
        return this.a;
    }

    @Override // defpackage.WD0
    @NotNull
    public final Collection<QD0> k() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5051lF0
    public final AbstractC1235Ip1 x() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Intrinsics.checkNotNull(lowerBounds);
            Object objA = C1526Mj.A(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objA, "single(...)");
            Type type = (Type) objA;
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C1079Gp1(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new C5806op1(type);
            }
            return type instanceof WildcardType ? new C1469Lp1((WildcardType) type) : new C7696xp1(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Intrinsics.checkNotNull(upperBounds);
        Type type2 = (Type) C1526Mj.A(upperBounds);
        if (Intrinsics.a(type2, Object.class)) {
            return null;
        }
        Intrinsics.checkNotNull(type2);
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C1079Gp1(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
            return new C5806op1(type2);
        }
        return type2 instanceof WildcardType ? new C1469Lp1((WildcardType) type2) : new C7696xp1(type2);
    }
}

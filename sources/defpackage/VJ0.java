package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class VJ0 implements Function0 {
    public final WJ0 d;
    public final int e;
    public final Object g;

    public VJ0(WJ0 wj0, int i, InterfaceC3770fO0 interfaceC3770fO0) {
        this.d = wj0;
        this.e = i;
        this.g = interfaceC3770fO0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WJ0 wj0 = this.d;
        Type typeB = wj0.b();
        if (typeB instanceof Class) {
            Class cls = (Class) typeB;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.checkNotNull(componentType);
            return componentType;
        }
        boolean z = typeB instanceof GenericArrayType;
        int i = this.e;
        if (z) {
            if (i == 0) {
                Type genericComponentType = ((GenericArrayType) typeB).getGenericComponentType();
                Intrinsics.checkNotNull(genericComponentType);
                return genericComponentType;
            }
            throw new C3761fL0("Array type has been queried for a non-0th argument: " + wj0);
        }
        if (!(typeB instanceof ParameterizedType)) {
            throw new C3761fL0("Non-generic type has been queried for arguments: " + wj0);
        }
        Type type = (Type) ((List) this.g.getValue()).get(i);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) C1526Mj.r(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) C1526Mj.q(upperBounds);
        }
        Intrinsics.checkNotNull(type2);
        return type2;
    }
}

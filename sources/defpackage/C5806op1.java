package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: op1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5806op1 extends AbstractC1235Ip1 implements ZD0 {

    @NotNull
    public final Type a;

    @NotNull
    public final AbstractC1235Ip1 b;

    @NotNull
    public final C5653o60 c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5806op1(@NotNull Type reflectType) {
        AbstractC1235Ip1 c5806op1;
        AbstractC1235Ip1 c1079Gp1;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> type = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(type, "getComponentType(...)");
                    Intrinsics.checkNotNullParameter(type, "type");
                    c5806op1 = (type == 0 || !type.isPrimitive()) ? ((type instanceof GenericArrayType) || (type != 0 && type.isArray())) ? new C5806op1(type) : type instanceof WildcardType ? new C1469Lp1((WildcardType) type) : new C7696xp1(type) : new C1079Gp1(type);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type type2 = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(type2, "getGenericComponentType(...)");
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z = type2 instanceof Class;
        if (z) {
            Class cls2 = (Class) type2;
            c1079Gp1 = cls2.isPrimitive() ? new C1079Gp1(cls2) : c1079Gp1;
            this.b = c1079Gp1;
            this.c = C5653o60.d;
        }
        c5806op1 = ((type2 instanceof GenericArrayType) || (z && ((Class) type2).isArray())) ? new C5806op1(type2) : type2 instanceof WildcardType ? new C1469Lp1((WildcardType) type2) : new C7696xp1(type2);
        c1079Gp1 = c5806op1;
        this.b = c1079Gp1;
        this.c = C5653o60.d;
    }

    @Override // defpackage.ZD0
    public final AbstractC1235Ip1 K() {
        return this.b;
    }

    @Override // defpackage.AbstractC1235Ip1
    @NotNull
    public final Type O() {
        return this.a;
    }

    @Override // defpackage.WD0
    @NotNull
    public final Collection<QD0> k() {
        return this.c;
    }
}

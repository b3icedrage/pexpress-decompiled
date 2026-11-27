package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7696xp1 extends AbstractC1235Ip1 implements InterfaceC4370iE0 {

    @NotNull
    public final Type a;

    @NotNull
    public final AbstractC8116zp1 b;

    public C7696xp1(@NotNull Type reflectType) {
        AbstractC8116zp1 c7065up1;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.a = reflectType;
        if (reflectType instanceof Class) {
            c7065up1 = new C7065up1((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            c7065up1 = new C1313Jp1((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c7065up1 = new C7065up1((Class) rawType);
        }
        this.b = c7065up1;
    }

    @Override // defpackage.InterfaceC4370iE0
    @NotNull
    public final String A() {
        throw new UnsupportedOperationException("Type not found: " + this.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    @Override // defpackage.InterfaceC4370iE0
    @NotNull
    public final ArrayList F() {
        WD0 c5806op1;
        WD0 c1079Gp1;
        List<Type> listC = C4753jp1.c(this.a);
        ArrayList arrayList = new ArrayList(XE.m(listC, 10));
        for (Type type : listC) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c1079Gp1 = new C1079Gp1(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        c5806op1 = new C5806op1(type);
                    } else {
                        c5806op1 = type instanceof WildcardType ? new C1469Lp1((WildcardType) type) : new C7696xp1(type);
                    }
                    c1079Gp1 = c5806op1;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    c5806op1 = new C5806op1(type);
                } else {
                    c5806op1 = new C5806op1(type);
                }
                c1079Gp1 = c5806op1;
            }
            arrayList.add(c1079Gp1);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC1235Ip1
    @NotNull
    public final Type O() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hE0, zp1] */
    @Override // defpackage.InterfaceC4370iE0
    @NotNull
    public final InterfaceC4160hE0 g() {
        return this.b;
    }

    @Override // defpackage.WD0
    @NotNull
    public final Collection<QD0> k() {
        return C5653o60.d;
    }

    @Override // defpackage.AbstractC1235Ip1, defpackage.WD0
    @Nullable
    public final QD0 p(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // defpackage.InterfaceC4370iE0
    @NotNull
    public final String q() {
        return this.a.toString();
    }

    @Override // defpackage.InterfaceC4370iE0
    public final boolean z() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }
}

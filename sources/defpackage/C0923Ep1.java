package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ep1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0923Ep1 extends AbstractC0845Dp1 implements InterfaceC7991zE0 {

    @NotNull
    public final Method a;

    public C0923Ep1(@NotNull Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.a = member;
    }

    @Override // defpackage.InterfaceC7991zE0
    public final boolean L() {
        Object c7486wp1;
        Object value = this.a.getDefaultValue();
        Object obj = null;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (C4753jp1.e(value.getClass())) {
                c7486wp1 = new C0611Ap1(null, (Enum) value);
            } else if (value instanceof Annotation) {
                c7486wp1 = new C5386mp1(null, (Annotation) value);
            } else if (value instanceof Object[]) {
                c7486wp1 = new C5596np1(null, (Object[]) value);
            } else {
                c7486wp1 = value instanceof Class ? new C7486wp1(null, (Class) value) : new C0767Cp1(null, value);
            }
            obj = c7486wp1;
        }
        return obj != null;
    }

    @Override // defpackage.AbstractC0845Dp1
    public final Member O() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7991zE0
    @NotNull
    public final List<InterfaceC3953gF0> j() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return P(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // defpackage.InterfaceC7991zE0
    public final AbstractC1235Ip1 m() {
        Type type = this.a.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(type, "getGenericReturnType(...)");
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

    @Override // defpackage.InterfaceC2681aF0
    @NotNull
    public final ArrayList w() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C1313Jp1(typeVariable));
        }
        return arrayList;
    }
}

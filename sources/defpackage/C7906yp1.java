package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7906yp1 extends AbstractC0845Dp1 implements InterfaceC4628jE0 {

    @NotNull
    public final Constructor<?> a;

    public C7906yp1(@NotNull Constructor<?> member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.a = member;
    }

    @Override // defpackage.AbstractC0845Dp1
    public final Member O() {
        return this.a;
    }

    @Override // defpackage.InterfaceC4628jE0
    @NotNull
    public final List<InterfaceC3953gF0> j() {
        Constructor<?> constructor = this.a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        Intrinsics.checkNotNull(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return C5653o60.d;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C1371Kj.e(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + constructor);
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            Intrinsics.checkNotNull(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) C1371Kj.e(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        Intrinsics.checkNotNull(genericParameterTypes);
        Intrinsics.checkNotNull(parameterAnnotations);
        return P(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
    }

    @Override // defpackage.InterfaceC2681aF0
    @NotNull
    public final ArrayList w() {
        TypeVariable<Constructor<?>>[] typeParameters = this.a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C1313Jp1(typeVariable));
        }
        return arrayList;
    }
}

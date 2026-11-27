package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0845Dp1 extends AbstractC8116zp1 implements WD0, BE0, InterfaceC7571xE0 {
    @Override // defpackage.BE0
    public final boolean I() {
        return Modifier.isAbstract(O().getModifiers());
    }

    @NotNull
    public abstract Member O();

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    @NotNull
    public final ArrayList P(@NotNull Type[] parameterTypes, @NotNull Annotation[][] parameterAnnotations, boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        AbstractC1235Ip1 c5806op1;
        AbstractC1235Ip1 c1079Gp1;
        String str;
        boolean z2;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList2 = new ArrayList(parameterTypes.length);
        PD0 pd0 = PD0.a;
        Member member = O();
        Intrinsics.checkNotNullParameter(member, "member");
        PD0.a aVarA = PD0.b;
        if (aVarA == null) {
            synchronized (pd0) {
                aVarA = PD0.b;
                if (aVarA == null) {
                    aVarA = PD0.a(member);
                    PD0.b = aVarA;
                }
            }
        }
        Method method2 = aVarA.a;
        if (method2 == null || (method = aVarA.b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, new Object[0]);
                Intrinsics.c(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            Type type = parameterTypes[i];
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c1079Gp1 = new C1079Gp1(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
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
            if (arrayList != null) {
                str = (String) CollectionsKt.H(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + c1079Gp1 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                z2 = true;
                if (i != parameterTypes.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList2.add(new C1391Kp1(c1079Gp1, parameterAnnotations[i], str, z2));
        }
        return arrayList2;
    }

    @Override // defpackage.BE0
    public final boolean b() {
        return Modifier.isFinal(O().getModifiers());
    }

    @Override // defpackage.BE0
    @NotNull
    public final AbstractC2766af2 d() {
        int modifiers = O().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Xe2.h.c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Xe2.e.c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? C4841kF0.c : C4631jF0.c;
        }
        return C4373iF0.c;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof AbstractC0845Dp1) && Intrinsics.a(O(), ((AbstractC0845Dp1) obj).O());
    }

    @Override // defpackage.CE0
    @NotNull
    public final C5638o21 getName() {
        String name = O().getName();
        return name != null ? C5638o21.k(name) : C6761tO1.a;
    }

    public final int hashCode() {
        return O().hashCode();
    }

    @Override // defpackage.BE0
    public final boolean i() {
        return Modifier.isStatic(O().getModifiers());
    }

    @Override // defpackage.WD0
    public final Collection k() {
        Member memberO = O();
        Intrinsics.c(memberO, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberO).getDeclaredAnnotations();
        return declaredAnnotations != null ? N7.f(declaredAnnotations) : C5653o60.d;
    }

    @Override // defpackage.InterfaceC7571xE0
    public final C7065up1 o() {
        Class<?> declaringClass = O().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new C7065up1(declaringClass);
    }

    @Override // defpackage.WD0
    public final QD0 p(C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Member memberO = O();
        Intrinsics.c(memberO, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberO).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return N7.e(declaredAnnotations, fqName);
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return getClass().getName() + ": " + O();
    }
}

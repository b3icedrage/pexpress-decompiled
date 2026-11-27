package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: up1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7065up1 extends AbstractC8116zp1 implements WD0, BE0, InterfaceC2902bE0 {

    @NotNull
    public final Class<?> a;

    public C7065up1(@NotNull Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.a = klass;
    }

    @Override // defpackage.InterfaceC2902bE0
    public final boolean C() {
        return this.a.isEnum();
    }

    @Override // defpackage.InterfaceC2902bE0
    public final boolean E() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class<?> clazz = this.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = OD0.a().a;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC2902bE0
    public final boolean H() {
        return this.a.isInterface();
    }

    @Override // defpackage.BE0
    public final boolean I() {
        return Modifier.isAbstract(this.a.getModifiers());
    }

    @Override // defpackage.InterfaceC2902bE0
    @NotNull
    public final Sequence<InterfaceC4370iE0> M() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Class<?> clazz = this.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = OD0.a().b;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr == null) {
            return C6492s60.a;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new C7696xp1(cls));
        }
        return CollectionsKt.y(arrayList);
    }

    @Override // defpackage.InterfaceC2902bE0
    public final List N() {
        Class<?>[] declaredClasses = this.a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return JH1.p(JH1.n(JH1.i(C1526Mj.i(declaredClasses), C3962gI0.g), QB.h));
    }

    @Override // defpackage.InterfaceC2902bE0
    @NotNull
    public final Collection<InterfaceC4370iE0> a() {
        Class<?> cls = this.a;
        if (Intrinsics.a(cls, Object.class)) {
            return C5653o60.d;
        }
        C4952km0 c4952km0 = new C4952km0(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        c4952km0.a(genericSuperclass != null ? genericSuperclass : Object.class);
        c4952km0.b(cls.getGenericInterfaces());
        ArrayList arrayList = (ArrayList) c4952km0.a;
        List listF = WE.f(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(XE.m(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C7696xp1((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.BE0
    public final boolean b() {
        return Modifier.isFinal(this.a.getModifiers());
    }

    @Override // defpackage.InterfaceC2902bE0
    @NotNull
    public final C1758Ph0 c() {
        return C4753jp1.a(this.a).a();
    }

    @Override // defpackage.BE0
    @NotNull
    public final AbstractC2766af2 d() {
        int modifiers = this.a.getModifiers();
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
        if (obj instanceof C7065up1) {
            return Intrinsics.a(this.a, ((C7065up1) obj).a);
        }
        return false;
    }

    @Override // defpackage.CE0
    @NotNull
    public final C5638o21 getName() {
        Class<?> cls = this.a;
        if (!cls.isAnonymousClass()) {
            C5638o21 c5638o21K = C5638o21.k(cls.getSimpleName());
            Intrinsics.checkNotNull(c5638o21K);
            return c5638o21K;
        }
        String missingDelimiterValue = cls.getName();
        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getName(...)");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(".", "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iK = StringsKt.K(0, 6, missingDelimiterValue, ".");
        if (iK != -1) {
            missingDelimiterValue = missingDelimiterValue.substring(1 + iK, missingDelimiterValue.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
        }
        C5638o21 c5638o21K2 = C5638o21.k(missingDelimiterValue);
        Intrinsics.checkNotNull(c5638o21K2);
        return c5638o21K2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.BE0
    public final boolean i() {
        return Modifier.isStatic(this.a.getModifiers());
    }

    @Override // defpackage.WD0
    public final Collection k() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C5653o60.d : N7.f(declaredAnnotations);
    }

    @Override // defpackage.InterfaceC2902bE0
    public final List l() {
        Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return JH1.p(JH1.m(JH1.i(C1526Mj.i(declaredConstructors), C6016pp1.m), C6226qp1.m));
    }

    @Override // defpackage.InterfaceC2902bE0
    @NotNull
    public final ArrayList n() {
        Class<?> clazz = this.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = OD0.a().d;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(clazz, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C1157Hp1(obj));
        }
        return arrayList;
    }

    @Override // defpackage.WD0
    public final QD0 p(C1758Ph0 fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Class<?> cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return N7.e(declaredAnnotations, fqName);
    }

    @Override // defpackage.InterfaceC2902bE0
    public final boolean s() {
        return this.a.isAnnotation();
    }

    @Override // defpackage.InterfaceC2902bE0
    public final C7065up1 t() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new C7065up1(declaringClass);
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return C7065up1.class.getName() + ": " + this.a;
    }

    @Override // defpackage.InterfaceC2902bE0
    public final List u() {
        Field[] declaredFields = this.a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return JH1.p(JH1.m(JH1.i(C1526Mj.i(declaredFields), C6435rp1.m), C6645sp1.m));
    }

    @Override // defpackage.InterfaceC2902bE0
    public final boolean v() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class<?> clazz = this.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = OD0.a().c;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC2681aF0
    @NotNull
    public final ArrayList w() {
        TypeVariable<Class<?>>[] typeParameters = this.a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C1313Jp1(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2902bE0
    public final List y() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return JH1.p(JH1.m(JH1.h(C1526Mj.i(declaredMethods), new QK0(this, 2)), C6855tp1.m));
    }
}

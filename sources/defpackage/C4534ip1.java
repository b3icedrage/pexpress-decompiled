package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ip1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4534ip1 {
    /* JADX WARN: Type inference failed for: r6v12, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [fO0, java.lang.Object] */
    public static TC a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            QC qcA = C4753jp1.a(cls);
            String str = RE0.a;
            C1758Ph0 fqName = qcA.a();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            QC qc = RE0.h.get(fqName.i());
            if (qc != null) {
                qcA = qc;
            }
            return new TC(qcA, i);
        }
        if (cls.equals(Void.TYPE)) {
            C1758Ph0 topLevelFqName = C4194hP1.a.d.g();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            return new TC(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), i);
        }
        EnumC6405rh1 enumC6405rh1I = DI0.e(cls.getName()).i();
        Intrinsics.checkNotNullExpressionValue(enumC6405rh1I, "getPrimitiveType(...)");
        if (i > 0) {
            C1758Ph0 topLevelFqName2 = (C1758Ph0) enumC6405rh1I.h.getValue();
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            C1758Ph0 c1758Ph0E2 = topLevelFqName2.e();
            return new TC(new QC(c1758Ph0E2, SI0.a(c1758Ph0E2, "parent(...)", topLevelFqName2, "shortName(...)")), i - 1);
        }
        C1758Ph0 topLevelFqName3 = (C1758Ph0) enumC6405rh1I.g.getValue();
        Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
        C1758Ph0 c1758Ph0E3 = topLevelFqName3.e();
        return new TC(new QC(c1758Ph0E3, SI0.a(c1758Ph0E3, "parent(...)", topLevelFqName3, "shortName(...)")), i);
    }

    public static void b(InterfaceC2699aL0.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsG = C7279vr.g(C7279vr.e(annotation));
        InterfaceC2699aL0.a aVarB = cVar.b(C4753jp1.a(clsG), new C4285hp1(annotation));
        if (aVarB != null) {
            c(aVarB, annotation, clsG);
        }
    }

    public static void c(InterfaceC2699aL0.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        C6411rj c6411rjL = C6621sj.l(cls.getDeclaredMethods());
        while (c6411rjL.hasNext()) {
            Method method = (Method) c6411rjL.next();
            int i = 0;
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                Intrinsics.checkNotNull(objInvoke);
                C5638o21 c5638o21K = C5638o21.k(method.getName());
                Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    aVar.c(c5638o21K, a((Class) objInvoke));
                } else if (C1783Pp1.a.contains(enclosingClass)) {
                    aVar.b(c5638o21K, objInvoke);
                } else if (C4753jp1.e(enclosingClass)) {
                    if (!enclosingClass.isEnum()) {
                        enclosingClass = enclosingClass.getEnclosingClass();
                    }
                    Intrinsics.checkNotNull(enclosingClass);
                    QC qcA = C4753jp1.a(enclosingClass);
                    C5638o21 c5638o21K2 = C5638o21.k(((Enum) objInvoke).name());
                    Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
                    aVar.e(c5638o21K, qcA, c5638o21K2);
                } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                    Class<?>[] interfaces = enclosingClass.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                    Class cls2 = (Class) C1526Mj.A(interfaces);
                    Intrinsics.checkNotNull(cls2);
                    InterfaceC2699aL0.a aVarF = aVar.f(C4753jp1.a(cls2), c5638o21K);
                    if (aVarF != null) {
                        c(aVarF, (Annotation) objInvoke, cls2);
                    }
                } else {
                    if (!enclosingClass.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                    }
                    InterfaceC2699aL0.b bVarD = aVar.d(c5638o21K);
                    if (bVarD != null) {
                        Class<?> componentType = enclosingClass.getComponentType();
                        if (componentType.isEnum()) {
                            Intrinsics.checkNotNull(componentType);
                            QC qcA2 = C4753jp1.a(componentType);
                            Object[] objArr = (Object[]) objInvoke;
                            int length = objArr.length;
                            while (i < length) {
                                Object obj = objArr[i];
                                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                C5638o21 c5638o21K3 = C5638o21.k(((Enum) obj).name());
                                Intrinsics.checkNotNullExpressionValue(c5638o21K3, "identifier(...)");
                                bVarD.d(qcA2, c5638o21K3);
                                i++;
                            }
                        } else if (componentType.equals(Class.class)) {
                            Object[] objArr2 = (Object[]) objInvoke;
                            int length2 = objArr2.length;
                            while (i < length2) {
                                Object obj2 = objArr2[i];
                                Intrinsics.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                bVarD.e(a((Class) obj2));
                                i++;
                            }
                        } else if (Annotation.class.isAssignableFrom(componentType)) {
                            Object[] objArr3 = (Object[]) objInvoke;
                            int length3 = objArr3.length;
                            while (i < length3) {
                                Object obj3 = objArr3[i];
                                Intrinsics.checkNotNull(componentType);
                                InterfaceC2699aL0.a aVarB = bVarD.b(C4753jp1.a(componentType));
                                if (aVarB != null) {
                                    Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                    c(aVarB, (Annotation) obj3, componentType);
                                }
                                i++;
                            }
                        } else {
                            Object[] objArr4 = (Object[]) objInvoke;
                            int length4 = objArr4.length;
                            while (i < length4) {
                                bVarD.c(objArr4[i]);
                                i++;
                            }
                        }
                        bVarD.a();
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}

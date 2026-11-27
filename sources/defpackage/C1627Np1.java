package defpackage;

import defpackage.C0683Bn1.b;
import defpackage.C0683Bn1.c;
import defpackage.C0683Bn1.d;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Np1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627Np1 implements InterfaceC2699aL0 {

    @NotNull
    public final Class<?> a;

    @NotNull
    public final UK0 b;

    /* JADX INFO: renamed from: Np1$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
        @Nullable
        public static C1627Np1 a(@NotNull Class klass) throws InvocationTargetException {
            UK0 uk0;
            InterfaceC2699aL0.a dVar;
            UK0.a aVar;
            Intrinsics.checkNotNullParameter(klass, "klass");
            C0683Bn1 visitor = new C0683Bn1();
            visitor.a = null;
            visitor.b = null;
            visitor.c = 0;
            visitor.d = null;
            visitor.e = null;
            visitor.f = null;
            visitor.g = null;
            visitor.h = null;
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            C6411rj c6411rjL = C6621sj.l(klass.getDeclaredAnnotations());
            while (c6411rjL.hasNext()) {
                Annotation annotation = (Annotation) c6411rjL.next();
                Intrinsics.checkNotNull(annotation);
                Class clsG = C7279vr.g(C7279vr.e(annotation));
                QC qcA = C4753jp1.a(clsG);
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                C1758Ph0 c1758Ph0A = qcA.a();
                if (c1758Ph0A.equals(C3333dI0.a)) {
                    dVar = visitor.new b();
                } else if (c1758Ph0A.equals(C3333dI0.o)) {
                    dVar = visitor.new c();
                } else if (C0683Bn1.i || visitor.g != null || (aVar = (UK0.a) C0683Bn1.j.get(qcA)) == null) {
                    dVar = null;
                } else {
                    visitor.g = aVar;
                    dVar = visitor.new d();
                }
                if (dVar != null) {
                    C4534ip1.c(dVar, annotation, clsG);
                }
            }
            C7793yI0 c7793yI0 = C7793yI0.g;
            if (visitor.g == null || visitor.a == null) {
                uk0 = null;
            } else {
                C7793yI0 c7793yI1 = new C7793yI0(visitor.a, (visitor.c & 8) != 0);
                if (c7793yI1.b(c7793yI0)) {
                    UK0.a aVar2 = visitor.g;
                    if ((aVar2 == UK0.a.CLASS || aVar2 == UK0.a.FILE_FACADE || aVar2 == UK0.a.MULTIFILE_CLASS_PART) && visitor.d == null) {
                        uk0 = null;
                    }
                } else {
                    visitor.f = visitor.d;
                    visitor.d = null;
                }
                String[] strArr = visitor.h;
                if (strArr != null) {
                    C6233qs.a(strArr);
                }
                uk0 = new UK0(visitor.g, c7793yI1, visitor.d, visitor.f, visitor.e, visitor.b, visitor.c);
            }
            if (uk0 == null) {
                return null;
            }
            return new C1627Np1(klass, uk0);
        }
    }

    public C1627Np1() {
        throw null;
    }

    public C1627Np1(Class cls, UK0 uk0) {
        this.a = cls;
        this.b = uk0;
    }

    @Override // defpackage.InterfaceC2699aL0
    @NotNull
    public final UK0 a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2699aL0
    public final void b(@NotNull H memberVisitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(memberVisitor, "visitor");
        Class<?> klass = this.a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        C6411rj c6411rjL = C6621sj.l(klass.getDeclaredMethods());
        while (c6411rjL.hasNext()) {
            Method method = (Method) c6411rjL.next();
            C5638o21 c5638o21K = C5638o21.k(method.getName());
            Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
            Intrinsics.checkNotNull(method);
            Intrinsics.checkNotNullParameter(method, "method");
            StringBuilder sb = new StringBuilder("(");
            C6411rj c6411rjL2 = C6621sj.l(method.getParameterTypes());
            while (c6411rjL2.hasNext()) {
                Class cls = (Class) c6411rjL2.next();
                Intrinsics.checkNotNull(cls);
                sb.append(C4753jp1.b(cls));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            sb.append(C4753jp1.b(returnType));
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            H.a aVarA = memberVisitor.a(c5638o21K, string);
            C6411rj c6411rjL3 = C6621sj.l(method.getDeclaredAnnotations());
            while (c6411rjL3.hasNext()) {
                Annotation annotation = (Annotation) c6411rjL3.next();
                Intrinsics.checkNotNull(annotation);
                C4534ip1.b(aVarA, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i = 0; i < length; i++) {
                C6411rj c6411rjL4 = C6621sj.l(annotationArr[i]);
                while (c6411rjL4.hasNext()) {
                    Annotation annotation2 = (Annotation) c6411rjL4.next();
                    Class clsG = C7279vr.g(C7279vr.e(annotation2));
                    QC qcA = C4753jp1.a(clsG);
                    Intrinsics.checkNotNull(annotation2);
                    C4970ks c4970ksC = aVarA.c(i, qcA, new C4285hp1(annotation2));
                    if (c4970ksC != null) {
                        C4534ip1.c(c4970ksC, annotation2, clsG);
                    }
                }
            }
            aVarA.a();
        }
        C6411rj c6411rjL5 = C6621sj.l(klass.getDeclaredConstructors());
        while (c6411rjL5.hasNext()) {
            Constructor constructor = (Constructor) c6411rjL5.next();
            C5638o21 c5638o21 = C6761tO1.e;
            Intrinsics.checkNotNull(constructor);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder("(");
            C6411rj c6411rjL6 = C6621sj.l(constructor.getParameterTypes());
            while (c6411rjL6.hasNext()) {
                Class cls2 = (Class) c6411rjL6.next();
                Intrinsics.checkNotNull(cls2);
                sb2.append(C4753jp1.b(cls2));
            }
            sb2.append(")V");
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            H.a aVarA2 = memberVisitor.a(c5638o21, string2);
            C6411rj c6411rjL7 = C6621sj.l(constructor.getDeclaredAnnotations());
            while (c6411rjL7.hasNext()) {
                Annotation annotation3 = (Annotation) c6411rjL7.next();
                Intrinsics.checkNotNull(annotation3);
                C4534ip1.b(aVarA2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.checkNotNull(parameterAnnotations2);
            if (parameterAnnotations2.length != 0) {
                int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length3 = parameterAnnotations2.length;
                for (int i2 = 0; i2 < length3; i2++) {
                    C6411rj c6411rjL8 = C6621sj.l(parameterAnnotations2[i2]);
                    while (c6411rjL8.hasNext()) {
                        Annotation annotation4 = (Annotation) c6411rjL8.next();
                        Class clsG2 = C7279vr.g(C7279vr.e(annotation4));
                        QC qcA2 = C4753jp1.a(clsG2);
                        Class<?> cls3 = klass;
                        Intrinsics.checkNotNull(annotation4);
                        C4970ks c4970ksC2 = aVarA2.c(i2 + length2, qcA2, new C4285hp1(annotation4));
                        if (c4970ksC2 != null) {
                            C4534ip1.c(c4970ksC2, annotation4, clsG2);
                        }
                        klass = cls3;
                    }
                }
            }
            Class<?> cls4 = klass;
            aVarA2.a();
            klass = cls4;
        }
        C6411rj c6411rjL9 = C6621sj.l(klass.getDeclaredFields());
        while (c6411rjL9.hasNext()) {
            Field field = (Field) c6411rjL9.next();
            C5638o21 name = C5638o21.k(field.getName());
            Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
            Intrinsics.checkNotNull(field);
            Intrinsics.checkNotNullParameter(field, "field");
            Class<?> type = field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            String desc = C4753jp1.b(type);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            String name2 = name.e();
            Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            TY0 signature = new TY0(name2 + '#' + desc);
            Intrinsics.checkNotNullParameter(signature, "signature");
            ArrayList arrayList = new ArrayList();
            C6411rj c6411rjL10 = C6621sj.l(field.getDeclaredAnnotations());
            while (c6411rjL10.hasNext()) {
                Annotation annotation5 = (Annotation) c6411rjL10.next();
                Intrinsics.checkNotNull(annotation5);
                Class clsG3 = C7279vr.g(C7279vr.e(annotation5));
                QC classId = C4753jp1.a(clsG3);
                C4285hp1 source = new C4285hp1(annotation5);
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                C4970ks c4970ksQ = memberVisitor.a.q(classId, source, arrayList);
                if (c4970ksQ != null) {
                    C4534ip1.c(c4970ksQ, annotation5, clsG3);
                }
            }
            if (!arrayList.isEmpty()) {
                memberVisitor.b.put(signature, arrayList);
            }
        }
    }

    @Override // defpackage.InterfaceC2699aL0
    public final void c(@NotNull InterfaceC2699aL0.c visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Class<?> klass = this.a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        C6411rj c6411rjL = C6621sj.l(klass.getDeclaredAnnotations());
        while (c6411rjL.hasNext()) {
            Annotation annotation = (Annotation) c6411rjL.next();
            Intrinsics.checkNotNull(annotation);
            C4534ip1.b(visitor, annotation);
        }
        visitor.a();
    }

    @Override // defpackage.InterfaceC2699aL0
    @NotNull
    public final String d() {
        StringBuilder sb = new StringBuilder();
        String name = this.a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(kotlin.text.d.l(name, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append(".class");
        return sb.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C1627Np1) {
            return Intrinsics.a(this.a, ((C1627Np1) obj).a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2699aL0
    @NotNull
    public final QC h() {
        return C4753jp1.a(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1627Np1.class.getName() + ": " + this.a;
    }
}

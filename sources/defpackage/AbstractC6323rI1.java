package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: rI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6323rI1<T> {
    /* JADX WARN: Code duplicated, block: B:384:0x08f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:385:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:566:0x090b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v135, types: [int] */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v0, types: [Bs1$a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static AbstractC7701xr0 b(C2263Vt1 c2263Vt1, Method method) {
        Type genericReturnType;
        boolean z;
        Type typeE;
        AbstractC1819Qb1<?> abstractC1819Qb1;
        int i;
        int i2;
        int i3;
        AbstractC1819Qb1<?>[] abstractC1819Qb1Arr;
        String str;
        AbstractC1819Qb1<?> oVar;
        AbstractC1819Qb1<?> hVar;
        AbstractC1819Qb1<?> c1741Pb1;
        AbstractC1819Qb1<?> kVar;
        int i4;
        ?? r2;
        int i5 = -1;
        int i6 = 0;
        ?? r4 = 1;
        ?? aVar = new C0698Bs1.a(c2263Vt1, method);
        Annotation[] annotationArr = aVar.c;
        int length = annotationArr.length;
        int i7 = 0;
        while (true) {
            Method method2 = aVar.b;
            String str2 = "HEAD";
            AbstractC1819Qb1<?> abstractC1819Qb2 = null;
            if (i7 >= length) {
                if (aVar.n == null) {
                    throw Dc2.j(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.o) {
                    if (aVar.q) {
                        throw Dc2.j(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.p) {
                        throw Dc2.j(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = aVar.d;
                int length2 = annotationArr2.length;
                aVar.v = new AbstractC1819Qb1[length2];
                int i8 = length2 - 1;
                int i9 = 0;
                while (i9 < length2) {
                    AbstractC1819Qb1<?>[] abstractC1819Qb1Arr2 = aVar.v;
                    Type type = aVar.e[i9];
                    Annotation[] annotationArr3 = annotationArr2[i9];
                    int i10 = i9 == i8 ? 1 : i6;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        AbstractC1819Qb1<?> abstractC1819Qb3 = abstractC1819Qb2;
                        while (i6 < length3) {
                            Annotation annotation = annotationArr3[i6];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = i6;
                            if (annotation instanceof Ka2) {
                                aVar.c(i9, type);
                                if (aVar.m) {
                                    throw Dc2.k(method2, i9, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.i) {
                                    throw Dc2.k(method2, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.j) {
                                    throw Dc2.k(method2, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.k) {
                                    throw Dc2.k(method2, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.l) {
                                    throw Dc2.k(method2, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.r != null) {
                                    throw Dc2.k(method2, i9, "@Url cannot be used with @%s URL", aVar.n);
                                }
                                aVar.m = true;
                                if (type != C1318Jr0.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw Dc2.k(method2, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                oVar = new AbstractC1819Qb1.n(i9, method2);
                                i = length2;
                                i3 = i8;
                                abstractC1819Qb1Arr = abstractC1819Qb1Arr2;
                                i2 = length3;
                            } else {
                                i = length2;
                                boolean z2 = annotation instanceof InterfaceC0884Ec1;
                                C2263Vt1 c2263Vt2 = aVar.a;
                                if (z2) {
                                    aVar.c(i9, type);
                                    if (aVar.j) {
                                        throw Dc2.k(method2, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.k) {
                                        throw Dc2.k(method2, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.l) {
                                        throw Dc2.k(method2, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.m) {
                                        throw Dc2.k(method2, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.r == null) {
                                        throw Dc2.k(method2, i9, "@Path can only be used with relative url on @%s", aVar.n);
                                    }
                                    aVar.i = true;
                                    InterfaceC0884Ec1 interfaceC0884Ec1 = (InterfaceC0884Ec1) annotation;
                                    String strValue = interfaceC0884Ec1.value();
                                    if (!C0698Bs1.a.y.matcher(strValue).matches()) {
                                        throw Dc2.k(method2, i9, "@Path parameter name must match %s. Found: %s", C0698Bs1.a.x.pattern(), strValue);
                                    }
                                    if (!aVar.u.contains(strValue)) {
                                        throw Dc2.k(method2, i9, "URL \"%s\" does not contain \"{%s}\".", aVar.r, strValue);
                                    }
                                    Annotation[] annotationArr5 = annotationArr3;
                                    i2 = length3;
                                    oVar = new AbstractC1819Qb1.i<>(method2, i9, strValue, c2263Vt2.e(type, annotationArr5), interfaceC0884Ec1.encoded());
                                    type = type;
                                    annotationArr3 = annotationArr5;
                                    i3 = i8;
                                    abstractC1819Qb1Arr = abstractC1819Qb1Arr2;
                                } else {
                                    i2 = length3;
                                    i3 = i8;
                                    abstractC1819Qb1Arr = abstractC1819Qb1Arr2;
                                    if (annotation instanceof InterfaceC8102zl1) {
                                        aVar.c(i9, type);
                                        InterfaceC8102zl1 interfaceC8102zl1 = (InterfaceC8102zl1) annotation;
                                        String strValue2 = interfaceC8102zl1.value();
                                        boolean zEncoded = interfaceC8102zl1.encoded();
                                        Class<?> clsF = Dc2.f(type);
                                        aVar.j = true;
                                        if (Iterable.class.isAssignableFrom(clsF)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Dc2.k(method2, i9, clsF.getSimpleName() + " must include generic type (e.g., " + clsF.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            oVar = new C1663Ob1(new AbstractC1819Qb1.j(strValue2, c2263Vt2.e(Dc2.e(0, (ParameterizedType) type), annotationArr3), zEncoded));
                                        } else if (clsF.isArray()) {
                                            oVar = new C1741Pb1(new AbstractC1819Qb1.j(strValue2, c2263Vt2.e(C0698Bs1.a.a(clsF.getComponentType()), annotationArr3), zEncoded));
                                        } else {
                                            kVar = new AbstractC1819Qb1.j<>(strValue2, c2263Vt2.e(type, annotationArr3), zEncoded);
                                            oVar = kVar;
                                        }
                                    } else if (annotation instanceof InterfaceC0755Cl1) {
                                        aVar.c(i9, type);
                                        boolean zEncoded2 = ((InterfaceC0755Cl1) annotation).encoded();
                                        Class<?> clsF2 = Dc2.f(type);
                                        aVar.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsF2)) {
                                            oVar = clsF2.isArray() ? new C1741Pb1(new AbstractC1819Qb1.l(c2263Vt2.e(C0698Bs1.a.a(clsF2.getComponentType()), annotationArr3), zEncoded2)) : new AbstractC1819Qb1.l<>(c2263Vt2.e(type, annotationArr3), zEncoded2);
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Dc2.k(method2, i9, clsF2.getSimpleName() + " must include generic type (e.g., " + clsF2.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            oVar = new C1663Ob1(new AbstractC1819Qb1.l(c2263Vt2.e(Dc2.e(0, (ParameterizedType) type), annotationArr3), zEncoded2));
                                        }
                                    } else if (annotation instanceof InterfaceC0677Bl1) {
                                        aVar.c(i9, type);
                                        Class<?> clsF3 = Dc2.f(type);
                                        aVar.l = true;
                                        if (!Map.class.isAssignableFrom(clsF3)) {
                                            throw Dc2.k(method2, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type typeG = Dc2.g(type, clsF3);
                                        if (!(typeG instanceof ParameterizedType)) {
                                            throw Dc2.k(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType = (ParameterizedType) typeG;
                                        Type typeE2 = Dc2.e(0, parameterizedType);
                                        if (String.class != typeE2) {
                                            throw Dc2.k(method2, i9, "@QueryMap keys must be of type String: " + typeE2, new Object[0]);
                                        }
                                        kVar = new AbstractC1819Qb1.k<>(method2, i9, c2263Vt2.e(Dc2.e(1, parameterizedType), annotationArr3), ((InterfaceC0677Bl1) annotation).encoded());
                                        oVar = kVar;
                                    } else {
                                        str = str2;
                                        if (annotation instanceof InterfaceC1854Qn0) {
                                            aVar.c(i9, type);
                                            String strValue3 = ((InterfaceC1854Qn0) annotation).value();
                                            Class<?> clsF4 = Dc2.f(type);
                                            if (!Iterable.class.isAssignableFrom(clsF4)) {
                                                oVar = clsF4.isArray() ? new C1741Pb1(new AbstractC1819Qb1.d(strValue3, c2263Vt2.e(C0698Bs1.a.a(clsF4.getComponentType()), annotationArr3))) : new AbstractC1819Qb1.d<>(strValue3, c2263Vt2.e(type, annotationArr3));
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw Dc2.k(method2, i9, clsF4.getSimpleName() + " must include generic type (e.g., " + clsF4.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                oVar = new C1663Ob1(new AbstractC1819Qb1.d(strValue3, c2263Vt2.e(Dc2.e(0, (ParameterizedType) type), annotationArr3)));
                                            }
                                        } else if (annotation instanceof InterfaceC2088Tn0) {
                                            if (type == C2813ao0.class) {
                                                oVar = new AbstractC1819Qb1.f(i9, method2);
                                            } else {
                                                aVar.c(i9, type);
                                                Class<?> clsF5 = Dc2.f(type);
                                                if (!Map.class.isAssignableFrom(clsF5)) {
                                                    throw Dc2.k(method2, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeG2 = Dc2.g(type, clsF5);
                                                if (!(typeG2 instanceof ParameterizedType)) {
                                                    throw Dc2.k(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType2 = (ParameterizedType) typeG2;
                                                Type typeE3 = Dc2.e(0, parameterizedType2);
                                                if (String.class != typeE3) {
                                                    throw Dc2.k(method2, i9, "@HeaderMap keys must be of type String: " + typeE3, new Object[0]);
                                                }
                                                oVar = new AbstractC1819Qb1.e<>(method2, i9, c2263Vt2.e(Dc2.e(1, parameterizedType2), annotationArr3));
                                            }
                                        } else if (annotation instanceof InterfaceC5965pc0) {
                                            aVar.c(i9, type);
                                            if (!aVar.p) {
                                                throw Dc2.k(method2, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            InterfaceC5965pc0 interfaceC5965pc0 = (InterfaceC5965pc0) annotation;
                                            String strValue4 = interfaceC5965pc0.value();
                                            boolean zEncoded3 = interfaceC5965pc0.encoded();
                                            aVar.f = true;
                                            Class<?> clsF6 = Dc2.f(type);
                                            if (!Iterable.class.isAssignableFrom(clsF6)) {
                                                oVar = clsF6.isArray() ? new C1741Pb1(new AbstractC1819Qb1.b(strValue4, c2263Vt2.e(C0698Bs1.a.a(clsF6.getComponentType()), annotationArr3), zEncoded3)) : new AbstractC1819Qb1.b<>(strValue4, c2263Vt2.e(type, annotationArr3), zEncoded3);
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw Dc2.k(method2, i9, clsF6.getSimpleName() + " must include generic type (e.g., " + clsF6.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                oVar = new C1663Ob1(new AbstractC1819Qb1.b(strValue4, c2263Vt2.e(Dc2.e(0, (ParameterizedType) type), annotationArr3), zEncoded3));
                                            }
                                        } else {
                                            if (annotation instanceof InterfaceC7435wc0) {
                                                aVar.c(i9, type);
                                                if (!aVar.p) {
                                                    throw Dc2.k(method2, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsF7 = Dc2.f(type);
                                                if (!Map.class.isAssignableFrom(clsF7)) {
                                                    throw Dc2.k(method2, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeG3 = Dc2.g(type, clsF7);
                                                if (!(typeG3 instanceof ParameterizedType)) {
                                                    throw Dc2.k(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeG3;
                                                Type typeE4 = Dc2.e(0, parameterizedType3);
                                                if (String.class != typeE4) {
                                                    throw Dc2.k(method2, i9, "@FieldMap keys must be of type String: " + typeE4, new Object[0]);
                                                }
                                                WM<T, String> wmE = c2263Vt2.e(Dc2.e(1, parameterizedType3), annotationArr3);
                                                aVar.f = true;
                                                c1741Pb1 = new AbstractC1819Qb1.c<>(method2, i9, wmE, ((InterfaceC7435wc0) annotation).encoded());
                                            } else if (annotation instanceof InterfaceC7646xc1) {
                                                aVar.c(i9, type);
                                                if (!aVar.q) {
                                                    throw Dc2.k(method2, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                InterfaceC7646xc1 interfaceC7646xc1 = (InterfaceC7646xc1) annotation;
                                                aVar.g = true;
                                                String strValue5 = interfaceC7646xc1.value();
                                                Class<?> clsF8 = Dc2.f(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsF8);
                                                    oVar = AbstractC1819Qb1.m.a;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw Dc2.k(method2, i9, clsF8.getSimpleName() + " must include generic type (e.g., " + clsF8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!M11.b.class.isAssignableFrom(Dc2.f(Dc2.e(0, (ParameterizedType) type)))) {
                                                            throw Dc2.k(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        hVar = new C1663Ob1(oVar);
                                                        oVar = hVar;
                                                    } else if (clsF8.isArray()) {
                                                        if (!M11.b.class.isAssignableFrom(clsF8.getComponentType())) {
                                                            throw Dc2.k(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c1741Pb1 = new C1741Pb1(oVar);
                                                    } else if (!M11.b.class.isAssignableFrom(clsF8)) {
                                                        throw Dc2.k(method2, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else {
                                                    C2813ao0 c2813ao0C = C2813ao0.b.c("Content-Disposition", C1039Gc0.d("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC7646xc1.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsF8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw Dc2.k(method2, i9, clsF8.getSimpleName() + " must include generic type (e.g., " + clsF8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeE5 = Dc2.e(0, (ParameterizedType) type);
                                                        if (M11.b.class.isAssignableFrom(Dc2.f(typeE5))) {
                                                            throw Dc2.k(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new C1663Ob1(new AbstractC1819Qb1.g(method2, i9, c2813ao0C, c2263Vt2.c(typeE5, annotationArr3, annotationArr)));
                                                    } else if (clsF8.isArray()) {
                                                        Class<?> clsA = C0698Bs1.a.a(clsF8.getComponentType());
                                                        if (M11.b.class.isAssignableFrom(clsA)) {
                                                            throw Dc2.k(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new C1741Pb1(new AbstractC1819Qb1.g(method2, i9, c2813ao0C, c2263Vt2.c(clsA, annotationArr3, annotationArr)));
                                                    } else {
                                                        if (M11.b.class.isAssignableFrom(clsF8)) {
                                                            throw Dc2.k(method2, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new AbstractC1819Qb1.g<>(method2, i9, c2813ao0C, c2263Vt2.c(type, annotationArr3, annotationArr));
                                                    }
                                                }
                                            } else if (annotation instanceof InterfaceC7856yc1) {
                                                aVar.c(i9, type);
                                                if (!aVar.q) {
                                                    throw Dc2.k(method2, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                aVar.g = true;
                                                Class<?> clsF9 = Dc2.f(type);
                                                if (!Map.class.isAssignableFrom(clsF9)) {
                                                    throw Dc2.k(method2, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeG4 = Dc2.g(type, clsF9);
                                                if (!(typeG4 instanceof ParameterizedType)) {
                                                    throw Dc2.k(method2, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeG4;
                                                Type typeE6 = Dc2.e(0, parameterizedType4);
                                                if (String.class != typeE6) {
                                                    throw Dc2.k(method2, i9, "@PartMap keys must be of type String: " + typeE6, new Object[0]);
                                                }
                                                Type typeE7 = Dc2.e(1, parameterizedType4);
                                                if (M11.b.class.isAssignableFrom(Dc2.f(typeE7))) {
                                                    throw Dc2.k(method2, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                hVar = new AbstractC1819Qb1.h<>(method2, i9, c2263Vt2.c(typeE7, annotationArr3, annotationArr), ((InterfaceC7856yc1) annotation).encoding());
                                                oVar = hVar;
                                            } else if (annotation instanceof InterfaceC5396mt) {
                                                aVar.c(i9, type);
                                                if (aVar.p || aVar.q) {
                                                    throw Dc2.k(method2, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (aVar.h) {
                                                    throw Dc2.k(method2, i9, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    WM<T, AbstractC5395ms1> wmC = c2263Vt2.c(type, annotationArr3, annotationArr);
                                                    aVar.h = true;
                                                    oVar = new AbstractC1819Qb1.a<>(method2, i9, wmC);
                                                } catch (RuntimeException e) {
                                                    throw Dc2.l(method2, e, i9, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof InterfaceC4686jX1) {
                                                aVar.c(i9, type);
                                                Class<?> clsF10 = Dc2.f(type);
                                                for (int i12 = i9 - 1; i12 >= 0; i12--) {
                                                    AbstractC1819Qb1<?> abstractC1819Qb4 = aVar.v[i12];
                                                    if ((abstractC1819Qb4 instanceof AbstractC1819Qb1.o) && ((AbstractC1819Qb1.o) abstractC1819Qb4).a.equals(clsF10)) {
                                                        throw Dc2.k(method2, i9, "@Tag type " + clsF10.getName() + " is duplicate of parameter #" + (i12 + 1) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                oVar = new AbstractC1819Qb1.o<>(clsF10);
                                            } else {
                                                oVar = null;
                                            }
                                            oVar = c1741Pb1;
                                        }
                                    }
                                    if (oVar != null) {
                                        if (abstractC1819Qb3 == null) {
                                            throw Dc2.k(method2, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        abstractC1819Qb3 = oVar;
                                    }
                                    i6 = i11 + 1;
                                    length3 = i2;
                                    annotationArr2 = annotationArr4;
                                    length2 = i;
                                    i8 = i3;
                                    abstractC1819Qb1Arr2 = abstractC1819Qb1Arr;
                                    str2 = str;
                                }
                            }
                            str = str2;
                            if (oVar != null) {
                                if (abstractC1819Qb3 == null) {
                                    throw Dc2.k(method2, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                abstractC1819Qb3 = oVar;
                            }
                            i6 = i11 + 1;
                            length3 = i2;
                            annotationArr2 = annotationArr4;
                            length2 = i;
                            i8 = i3;
                            abstractC1819Qb1Arr2 = abstractC1819Qb1Arr;
                            str2 = str;
                        }
                        abstractC1819Qb1 = abstractC1819Qb3;
                    } else {
                        abstractC1819Qb1 = null;
                    }
                    Annotation[][] annotationArr6 = annotationArr2;
                    int i13 = length2;
                    int i14 = i8;
                    AbstractC1819Qb1<?>[] abstractC1819Qb1Arr3 = abstractC1819Qb1Arr2;
                    String str3 = str2;
                    if (abstractC1819Qb1 == null) {
                        if (i10 != 0) {
                            try {
                                if (Dc2.f(type) == JM.class) {
                                    aVar.w = true;
                                    abstractC1819Qb1 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw Dc2.k(method2, i9, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC1819Qb1Arr3[i9] = abstractC1819Qb1;
                    i9++;
                    annotationArr2 = annotationArr6;
                    length2 = i13;
                    i8 = i14;
                    str2 = str3;
                    i6 = 0;
                    abstractC1819Qb2 = null;
                }
                String str4 = str2;
                if (aVar.r == null && !aVar.m) {
                    throw Dc2.j(method2, null, "Missing either @%s URL or @Url parameter.", aVar.n);
                }
                boolean z3 = aVar.p;
                if (!z3 && !aVar.q && !aVar.o && aVar.h) {
                    throw Dc2.j(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !aVar.f) {
                    throw Dc2.j(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.q && !aVar.g) {
                    throw Dc2.j(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C0698Bs1 c0698Bs1 = new C0698Bs1(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (Dc2.h(genericReturnType2)) {
                    throw Dc2.j(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw Dc2.j(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z4 = c0698Bs1.k;
                if (z4) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type2 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (Dc2.f(type2) == C0935Et1.class && (type2 instanceof ParameterizedType)) {
                        typeE = Dc2.e(0, (ParameterizedType) type2);
                        z = true;
                    } else {
                        typeE = type2;
                        z = false;
                    }
                    genericReturnType = new Dc2.b(null, InterfaceC1101Gx.class, typeE);
                    if (!Dc2.i(annotations, QM1.class)) {
                        Annotation[] annotationArr7 = new Annotation[annotations.length + 1];
                        annotationArr7[0] = RM1.a;
                        System.arraycopy(annotations, 0, annotationArr7, 1, annotations.length);
                        annotations = annotationArr7;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    InterfaceC1179Hx<?, ?> interfaceC1179HxA = c2263Vt1.a(genericReturnType, annotations);
                    Type typeA = interfaceC1179HxA.a();
                    if (typeA == C0857Dt1.class) {
                        throw Dc2.j(method, null, "'" + Dc2.f(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeA == C0935Et1.class) {
                        throw Dc2.j(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c0698Bs1.c.equals(str4) && !Void.class.equals(typeA)) {
                        throw Dc2.j(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        WM<AbstractC1091Gt1, T> wmD = c2263Vt1.d(typeA, method.getAnnotations());
                        InterfaceC1023Fx.a aVar2 = c2263Vt1.b;
                        if (z4) {
                            return z ? new AbstractC7701xr0.c(c0698Bs1, aVar2, wmD, interfaceC1179HxA) : new AbstractC7701xr0.b(c0698Bs1, aVar2, wmD, interfaceC1179HxA);
                        }
                        return new AbstractC7701xr0.a(c0698Bs1, aVar2, wmD, interfaceC1179HxA);
                    } catch (RuntimeException e2) {
                        throw Dc2.j(method, e2, "Unable to create converter for %s", typeA);
                    }
                } catch (RuntimeException e3) {
                    throw Dc2.j(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i7];
            if (annotation2 instanceof ZR) {
                aVar.b("DELETE", ((ZR) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC4734jk0) {
                aVar.b("GET", ((InterfaceC4734jk0) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC6219qn0) {
                aVar.b("HEAD", ((InterfaceC6219qn0) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC1816Qa1) {
                aVar.b("PATCH", ((InterfaceC1816Qa1) annotation2).value(), r4);
            } else if (annotation2 instanceof InterfaceC2206Va1) {
                aVar.b("POST", ((InterfaceC2206Va1) annotation2).value(), r4);
            } else if (annotation2 instanceof InterfaceC2288Wa1) {
                aVar.b("PUT", ((InterfaceC2288Wa1) annotation2).value(), r4);
            } else if (annotation2 instanceof B71) {
                aVar.b("OPTIONS", ((B71) annotation2).value(), false);
            } else {
                if (annotation2 instanceof InterfaceC6428rn0) {
                    InterfaceC6428rn0 interfaceC6428rn0 = (InterfaceC6428rn0) annotation2;
                    aVar.b(interfaceC6428rn0.method(), interfaceC6428rn0.path(), interfaceC6428rn0.hasBody());
                } else if (annotation2 instanceof InterfaceC3023bo0) {
                    String[] strArrValue = ((InterfaceC3023bo0) annotation2).value();
                    if (strArrValue.length == 0) {
                        throw Dc2.j(method2, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    C2813ao0.a aVar3 = new C2813ao0.a();
                    int length4 = strArrValue.length;
                    int i15 = 0;
                    ?? r5 = r4;
                    while (i15 < length4) {
                        String str5 = strArrValue[i15];
                        ?? r16 = r5;
                        int iIndexOf = str5.indexOf(58);
                        if (iIndexOf != i5 && iIndexOf != 0) {
                            int i16 = i5;
                            if (iIndexOf != str5.length() - 1) {
                                String strSubstring = str5.substring(0, iIndexOf);
                                String strTrim = str5.substring(iIndexOf + 1).trim();
                                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                                    try {
                                        Pattern pattern = CY0.d;
                                        aVar.t = CY0.a.a(strTrim);
                                    } catch (IllegalArgumentException e4) {
                                        throw Dc2.j(method2, e4, "Malformed content type: %s", strTrim);
                                    }
                                } else {
                                    aVar3.a(strSubstring, strTrim);
                                }
                                i15++;
                                r5 = r16 == true ? 1 : 0;
                                i5 = i16;
                            }
                        }
                        throw Dc2.j(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    i4 = i5;
                    aVar.s = aVar3.d();
                    r2 = r5 == true ? 1 : 0;
                } else {
                    i4 = i5;
                    boolean z5 = r4 == true ? 1 : 0;
                    if (!(annotation2 instanceof L11)) {
                        r2 = z5 ? 1 : 0;
                        if (!(annotation2 instanceof InterfaceC0976Fh0)) {
                            continue;
                        } else {
                            if (aVar.q) {
                                throw Dc2.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            aVar.p = r2;
                        }
                    } else {
                        if (aVar.p) {
                            throw Dc2.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        r2 = z5 ? 1 : 0;
                        aVar.q = r2;
                    }
                }
                i7 += r2;
                r4 = r2;
                i5 = i4;
            }
            i4 = i5;
            r2 = r4 == true ? 1 : 0;
            i7 += r2;
            r4 = r2;
            i5 = i4;
        }
    }

    @Nullable
    public abstract T a(Object[] objArr);
}

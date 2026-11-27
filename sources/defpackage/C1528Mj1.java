package defpackage;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: Mj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1528Mj1 extends C5494nM {
    public final Object h;
    public final Class<?> i;
    public final C6649sr j;

    public C1528Mj1(C6859tr c6859tr, Object obj) {
        Class<?> returnType;
        Method[] methodArr;
        this.h = obj;
        Class<?> cls = obj.getClass();
        this.i = cls;
        HashMap map = c6859tr.h;
        if (!map.containsKey(cls)) {
            if (c6859tr.i == null) {
                HS0 hs0 = c6859tr.e;
                C7069ur c7069ur = new C7069ur();
                c7069ur.j(hs0);
                c6859tr.i = c7069ur;
            }
            C7069ur c7069ur2 = c6859tr.i;
            c7069ur2.getClass();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            Method[] methods = cls.getMethods();
            int length = methods.length;
            int i = 0;
            while (i < length) {
                Method method = methods[i];
                if (method.isBridge()) {
                    methodArr = methods;
                } else {
                    int length2 = method.getParameterTypes().length;
                    Class<?> cls2 = Void.TYPE;
                    if (length2 <= 0 && (returnType = method.getReturnType()) != cls2) {
                        String name = method.getName();
                        methodArr = methods;
                        if ((name.startsWith("get") || name.startsWith("is")) && (!name.startsWith("is") || returnType.equals(Boolean.TYPE) || returnType.equals(Boolean.class))) {
                            String strI = QO.i(method);
                            Method method2 = (Method) map2.put(strI, method);
                            if (method2 != null) {
                                if (method2.getName().startsWith("is")) {
                                    map2.put(strI, method2);
                                }
                                c7069ur2.p(C4694ja0.a("Class '", cls.getCanonicalName(), "' contains multiple getters for the same property '", strI, "'."));
                            }
                        }
                    } else {
                        methodArr = methods;
                    }
                    if (method.getParameterTypes().length == 1 && method.getReturnType() == cls2 && method.getName().startsWith("set")) {
                        String strI2 = QO.i(method);
                        if (((Method) map3.put(strI2, method)) != null) {
                            c7069ur2.p(C4694ja0.a("Class '", cls.getCanonicalName(), "' contains multiple setters for the same property '", strI2, "'."));
                        }
                    } else {
                        if ((method.getParameterTypes().length == 1 && method.getReturnType() == cls2) ? method.getName().startsWith(ProductAction.ACTION_ADD) : false) {
                            String strI3 = QO.i(method);
                            if (((Method) map4.put(strI3, method)) != null) {
                                c7069ur2.p(C4694ja0.a("Class '", cls.getCanonicalName(), "' contains multiple adders for the same property '", strI3, "'."));
                            }
                        }
                    }
                }
                i++;
                methods = methodArr;
            }
            map.put(cls, new C6649sr(map2, map3, map4));
        }
        this.j = (C6649sr) map.get(cls);
    }

    public static EnumC5874p9 r(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> cls = parameterTypes.length != 1 ? null : parameterTypes[0];
        if (cls == null) {
            return EnumC5874p9.d;
        }
        Package r0 = cls.getPackage();
        return (cls.isPrimitive() || (r0 != null && "java.lang".equals(r0.getName())) || C8056za.f(cls) || cls.isEnum() || Charset.class.isAssignableFrom(cls)) ? EnumC5874p9.e : EnumC5874p9.g;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    public final EnumC5874p9 q(String str) {
        Method methodT;
        Method methodS = s(str.substring(0, 1).toUpperCase() + str.substring(1));
        EnumC5874p9 enumC5874p9 = EnumC5874p9.d;
        if (methodS == null) {
            methodT = t(str);
            if (methodT != null) {
                return r(methodT);
            }
        } else {
            EnumC5874p9 enumC5874p9R = r(methodS);
            int iOrdinal = enumC5874p9R.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return EnumC5874p9.h;
                }
                if (iOrdinal == 2) {
                    return EnumC5874p9.i;
                }
                if (iOrdinal == 3 || iOrdinal == 4) {
                    l("Unexpected AggregationType " + enumC5874p9R);
                }
                methodT = t(str);
                if (methodT != null) {
                    return r(methodT);
                }
            }
        }
        return enumC5874p9;
    }

    public final Method s(String str) {
        return this.j.c.get(QO.q(str));
    }

    public final Method t(String str) {
        return this.j.b.get(QO.q(str));
    }

    public final Class<?> u(String str, EnumC5874p9 enumC5874p9, C7377wJ1 c7377wJ1) {
        Class<?> cls;
        Method methodT;
        Class<?> superclass = this.h.getClass();
        c7377wJ1.getClass();
        String lowerCase = str.toLowerCase();
        while (true) {
            if (superclass == null) {
                cls = null;
                break;
            }
            cls = (Class) ((HashMap) c7377wJ1.d).get(new C3864fp0(superclass, lowerCase));
            if (cls != null) {
                break;
            }
            superclass = superclass.getSuperclass();
        }
        if (cls != null) {
            return cls;
        }
        if (enumC5874p9 == EnumC5874p9.i) {
            methodT = s(str);
        } else {
            if (enumC5874p9 != EnumC5874p9.g) {
                throw new IllegalStateException(enumC5874p9 + " not allowed here");
            }
            methodT = t(str);
        }
        if (methodT != null) {
            XU xu = (XU) methodT.getAnnotation(XU.class);
            Class<?> clsValue = xu != null ? xu.value() : null;
            if (clsValue != null) {
                return clsValue;
            }
            Class<?>[] parameterTypes = methodT.getParameterTypes();
            Class<?> cls2 = parameterTypes.length != 1 ? null : parameterTypes[0];
            if (cls2 != null && !cls2.isInterface()) {
                try {
                    if (cls2.newInstance() != null) {
                        return cls2;
                    }
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
        return null;
    }

    public final void v(Method method, Object obj) {
        Object obj2 = this.h;
        Class<?> cls = obj.getClass();
        try {
            method.invoke(obj2, obj);
        } catch (Exception e) {
            m("Could not invoke method " + method.getName() + " in class " + obj2.getClass().getName() + " with parameter of type " + cls.getName(), e);
        }
    }

    public final boolean w(String str, Class[] clsArr, Object obj) {
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            StringBuilder sbB = C6495s7.b("Wrong number of parameters in setter method for property [", str, "] in ");
            sbB.append(this.h.getClass().getName());
            l(sbB.toString());
            return false;
        }
        if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        }
        l("A \"" + cls.getName() + "\" object is not assignable to a \"" + clsArr[0].getName() + "\" variable.");
        StringBuilder sb = new StringBuilder("The class \"");
        sb.append(clsArr[0].getName());
        sb.append("\" was loaded by ");
        l(sb.toString());
        l("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
        l("\"" + cls.getName() + "\" was loaded by [" + cls.getClassLoader() + "].");
        return false;
    }

    public final void x(Object obj, String str) {
        Method methodT = t(str);
        Object obj2 = this.h;
        if (methodT == null) {
            StringBuilder sbB = C6495s7.b("Not setter method for property [", str, "] in ");
            sbB.append(obj2.getClass().getName());
            p(sbB.toString());
        } else if (w(str, methodT.getParameterTypes(), obj)) {
            try {
                v(methodT, obj);
            } catch (Exception e) {
                m("Could not set component " + obj2 + " for parent component " + obj2, e);
            }
        }
    }

    public final void y(String str, String str2) {
        if (str2 == null) {
            return;
        }
        Method methodT = t(str);
        if (methodT == null) {
            StringBuilder sbB = C6495s7.b("No setter for property [", str, "] in ");
            sbB.append(this.i.getName());
            sbB.append(".");
            p(sbB.toString());
            return;
        }
        try {
            z(methodT, str2);
        } catch (C1765Pj1 e) {
            o(new Ff2(C4694ja0.a("Failed to set property [", str, "] to value \"", str2, "\". "), e, 1, this.g));
        }
    }

    public final void z(Method method, String str) throws C1765Pj1 {
        Class<?>[] parameterTypes = method.getParameterTypes();
        try {
            Object objC = C8056za.c(this, str, parameterTypes[0]);
            if (objC != null) {
                try {
                    method.invoke(this.h, objC);
                } catch (Exception e) {
                    throw new C1765Pj1(e);
                }
            } else {
                throw new C1765Pj1("Conversion to type [" + parameterTypes[0] + "] failed.");
            }
        } catch (Throwable th) {
            throw new C1765Pj1("Conversion to type [" + parameterTypes[0] + "] failed. ", th);
        }
    }
}

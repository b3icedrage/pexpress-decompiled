package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class MS0 {
    public static volatile int a;
    public static final KU1 b = new KU1();
    public static final LL c = new LL(12);
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static LinkedHashSet a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = MS0.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            C7016uc2.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static FS0 b(Class<?> cls) {
        int i;
        FS0 fs0C = c(cls.getName());
        if (d) {
            C7016uc2.a aVar = C7016uc2.a;
            Class<?> cls2 = null;
            if (aVar == null) {
                if (C7016uc2.b) {
                    aVar = null;
                } else {
                    try {
                        aVar = new C7016uc2.a();
                    } catch (SecurityException unused) {
                        aVar = null;
                    }
                    C7016uc2.a = aVar;
                    C7016uc2.b = true;
                }
            }
            if (aVar != null) {
                Class<?>[] classContext = aVar.getClassContext();
                String name = C7016uc2.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                C7016uc2.a("Detected logger name mismatch. Given name: \"" + fs0C.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                C7016uc2.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return fs0C;
    }

    public static FS0 c(String str) {
        InterfaceC6027pt0 interfaceC6027pt0A;
        if (a == 0) {
            synchronized (MS0.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = a;
        if (i == 1) {
            interfaceC6027pt0A = b;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                UP1 up1 = UP1.d;
                if (up1.a) {
                    FM fm = up1.c.a;
                    if (fm == null) {
                        throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
                    }
                    interfaceC6027pt0A = fm.a();
                } else {
                    interfaceC6027pt0A = up1.b;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                interfaceC6027pt0A = c;
            }
        }
        return interfaceC6027pt0A.d(str);
    }

    public static boolean d() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static final void e() {
        LinkedHashSet linkedHashSetA;
        try {
            try {
                if (d()) {
                    linkedHashSetA = null;
                } else {
                    linkedHashSetA = a();
                    h(linkedHashSetA);
                }
                UP1 up1 = UP1.d;
                a = 3;
                g(linkedHashSetA);
            } catch (Throwable th) {
                f();
                throw th;
            }
        } catch (Exception e2) {
            a = 2;
            C7016uc2.b("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            String message = e3.getMessage();
            if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                a = 2;
                C7016uc2.b("Failed to instantiate SLF4J LoggerFactory", e3);
                throw e3;
            }
            a = 4;
            C7016uc2.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            C7016uc2.a("Defaulting to no-operation (NOP) logger implementation");
            C7016uc2.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message2 = e4.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = 2;
                C7016uc2.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C7016uc2.a("Your binding is version 1.5.5 or earlier.");
                C7016uc2.a("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
        f();
        if (a == 3) {
            String[] strArr = e;
            try {
                UP1 up2 = UP1.d;
                boolean z = false;
                for (String str : strArr) {
                    if ("1.7.16".startsWith(str)) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                C7016uc2.a("The requested version 1.7.16 by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                C7016uc2.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            } catch (NoSuchFieldError unused) {
            } catch (Throwable th2) {
                C7016uc2.b("Unexpected problem occured during version sanity check", th2);
            }
        }
    }

    public static void f() {
        KU1 ku1 = b;
        synchronized (ku1) {
            try {
                ku1.d = true;
                for (JU1 ju1 : new ArrayList(ku1.e.values())) {
                    ju1.e = c(ju1.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue<LU1> linkedBlockingQueue = b.g;
        int size = linkedBlockingQueue.size();
        ArrayList<LU1> arrayList = new ArrayList(UserVerificationMethods.USER_VERIFY_PATTERN);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            for (LU1 lu1 : arrayList) {
                if (lu1 != null) {
                    JU1 ju2 = lu1.a;
                    String str = ju2.d;
                    if (ju2.e == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(ju2.e instanceof C5428n21)) {
                        if (!ju2.d()) {
                            C7016uc2.a(str);
                        } else if (ju2.d()) {
                            try {
                                ju2.h.invoke(ju2.e, lu1);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (lu1.a.d()) {
                        C7016uc2.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C7016uc2.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C7016uc2.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(lu1.a.e instanceof C5428n21)) {
                        C7016uc2.a("The following set of substitute loggers may have been accessed");
                        C7016uc2.a("during the initialization phase. Logging calls during this");
                        C7016uc2.a("phase were not honored. However, subsequent logging calls to these");
                        C7016uc2.a("loggers will work as normally expected.");
                        C7016uc2.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        KU1 ku2 = b;
        ku2.e.clear();
        ku2.g.clear();
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        C7016uc2.a("Actual binding is of type [" + UP1.d.c.getClass().getName() + "]");
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            C7016uc2.a("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C7016uc2.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            C7016uc2.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

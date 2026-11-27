package defpackage;

import android.view.View;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: vM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7173vM implements InterfaceC3646em2 {
    public final Object d;

    public /* synthetic */ C7173vM(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC4276hm2
    public /* bridge */ /* synthetic */ Object a() {
        return new Ul2((C3437dm2) ((C3227cm2) this.d).a());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0160  */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x00ff, please report this as an issue */
    public void b() throws Throwable {
        String property;
        String property2;
        URL url;
        File file;
        ClassLoader classLoader;
        InterfaceC5062lJ interfaceC5062lJ;
        String string;
        InterfaceC2939bQ1 v81;
        URL url2 = null;
        try {
            property = System.getProperty("logback.statusListenerClass");
        } catch (SecurityException unused) {
            property = null;
        }
        boolean zM = C8056za.m(property);
        HS0 hs0 = (HS0) this.d;
        if (!zM) {
            if ("SYSOUT".equalsIgnoreCase(property)) {
                v81 = new V81();
            } else {
                try {
                    v81 = (InterfaceC2939bQ1) C8056za.k(property, InterfaceC2939bQ1.class, hs0);
                } catch (Exception e) {
                    e.printStackTrace();
                    v81 = null;
                }
            }
            if (v81 != null) {
                if (v81 instanceof InterfaceC5284mM) {
                    ((InterfaceC5284mM) v81).j(hs0);
                }
                if (hs0.g.b(v81) && (v81 instanceof InterfaceC7183vP0)) {
                    ((InterfaceC7183vP0) v81).start();
                }
            }
        }
        ClassLoader classLoaderA = C6559sR0.a(this);
        try {
            property2 = System.getProperty("logback.configurationFile");
        } catch (SecurityException unused2) {
            property2 = null;
        }
        if (property2 != null) {
            try {
                try {
                    url = new URL(property2);
                } catch (Throwable unused3) {
                    url = null;
                    if (url == null) {
                        try {
                            file = new File(property2);
                            if (file.exists() && file.isFile()) {
                                try {
                                    url = file.toURI().toURL();
                                } catch (MalformedURLException unused4) {
                                    d(property2, classLoaderA, url);
                                    url = null;
                                }
                            }
                            d(property2, classLoaderA, url);
                            url = null;
                            if (url == null) {
                                boolean z = C6559sR0.a;
                                try {
                                    url = classLoaderA.getResource("logback-test.xml");
                                } catch (Throwable unused5) {
                                    url = null;
                                }
                                d("logback-test.xml", classLoaderA, url);
                                if (url == null) {
                                    boolean z2 = C6559sR0.a;
                                    try {
                                        url = classLoaderA.getResource("logback.groovy");
                                    } catch (Throwable unused6) {
                                        url = null;
                                    }
                                    d("logback.groovy", classLoaderA, url);
                                    if (url == null) {
                                        boolean z3 = C6559sR0.a;
                                        try {
                                            url = classLoaderA.getResource("logback.xml");
                                        } catch (Throwable unused7) {
                                            url = null;
                                        }
                                        d("logback.xml", classLoaderA, url);
                                    }
                                }
                            }
                            if (url == null) {
                                string = url.toString();
                                if (string.endsWith("groovy")) {
                                    if (C6706t70.a()) {
                                        C3476e.s(hs0, this, url);
                                        return;
                                    } else {
                                        hs0.g.a(new N70("Groovy classes are not available on the class path. ABORTING INITIALIZATION.", hs0));
                                        return;
                                    }
                                }
                                if (string.endsWith("xml")) {
                                    C4844kG0 c4844kG0 = new C4844kG0();
                                    c4844kG0.j(hs0);
                                    c4844kG0.r(url);
                                } else {
                                    throw new C7192vS0("Unexpected filename extension of file [" + url.toString() + "]. Should be either .groovy or .xml");
                                }
                            }
                            boolean z4 = C6559sR0.a;
                            classLoader = C6706t70.class.getClassLoader();
                            if (classLoader == null) {
                                classLoader = ClassLoader.getSystemClassLoader();
                            }
                            Iterator it = ServiceLoader.load(InterfaceC5062lJ.class, classLoader).iterator();
                            interfaceC5062lJ = (InterfaceC5062lJ) (it.hasNext() ? it.next() : null);
                            if (interfaceC5062lJ == null) {
                                C3240cr c3240cr = new C3240cr();
                                c3240cr.j(hs0);
                                c3240cr.k(hs0);
                                return;
                            } else {
                                try {
                                    interfaceC5062lJ.j(hs0);
                                    interfaceC5062lJ.k(hs0);
                                    return;
                                } catch (Exception e2) {
                                    throw new C7192vS0(C1039Gc0.d("Failed to initialize Configurator: ", interfaceC5062lJ.getClass().getCanonicalName(), " using ServiceLoader"), e2);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            url2 = url;
                            d(property2, classLoaderA, url2);
                            throw th;
                        }
                    }
                }
            } catch (MalformedURLException unused8) {
                url = classLoaderA.getResource(property2);
                if (url == null) {
                    file = new File(property2);
                    if (file.exists()) {
                        url = file.toURI().toURL();
                    }
                    d(property2, classLoaderA, url);
                    url = null;
                    if (url == null) {
                        boolean z5 = C6559sR0.a;
                        url = classLoaderA.getResource("logback-test.xml");
                        d("logback-test.xml", classLoaderA, url);
                        if (url == null) {
                            boolean z6 = C6559sR0.a;
                            url = classLoaderA.getResource("logback.groovy");
                            d("logback.groovy", classLoaderA, url);
                            if (url == null) {
                                boolean z7 = C6559sR0.a;
                                url = classLoaderA.getResource("logback.xml");
                                d("logback.xml", classLoaderA, url);
                            }
                        }
                    }
                    if (url == null) {
                        boolean z8 = C6559sR0.a;
                        classLoader = C6706t70.class.getClassLoader();
                        if (classLoader == null) {
                            classLoader = ClassLoader.getSystemClassLoader();
                        }
                        Iterator it2 = ServiceLoader.load(InterfaceC5062lJ.class, classLoader).iterator();
                        interfaceC5062lJ = (InterfaceC5062lJ) (it2.hasNext() ? it2.next() : null);
                        if (interfaceC5062lJ == null) {
                            interfaceC5062lJ.j(hs0);
                            interfaceC5062lJ.k(hs0);
                            return;
                        } else {
                            C3240cr c3240cr2 = new C3240cr();
                            c3240cr2.j(hs0);
                            c3240cr2.k(hs0);
                            return;
                        }
                    }
                    string = url.toString();
                    if (string.endsWith("groovy")) {
                        if (C6706t70.a()) {
                            C3476e.s(hs0, this, url);
                            return;
                        } else {
                            hs0.g.a(new N70("Groovy classes are not available on the class path. ABORTING INITIALIZATION.", hs0));
                            return;
                        }
                    }
                    if (string.endsWith("xml")) {
                        C4844kG0 c4844kG1 = new C4844kG0();
                        c4844kG1.j(hs0);
                        c4844kG1.r(url);
                    } else {
                        throw new C7192vS0("Unexpected filename extension of file [" + url.toString() + "]. Should be either .groovy or .xml");
                    }
                }
                d(property2, classLoaderA, url);
                if (url == null) {
                    boolean z9 = C6559sR0.a;
                    url = classLoaderA.getResource("logback-test.xml");
                    d("logback-test.xml", classLoaderA, url);
                    if (url == null) {
                        boolean z10 = C6559sR0.a;
                        url = classLoaderA.getResource("logback.groovy");
                        d("logback.groovy", classLoaderA, url);
                        if (url == null) {
                            boolean z11 = C6559sR0.a;
                            url = classLoaderA.getResource("logback.xml");
                            d("logback.xml", classLoaderA, url);
                        }
                    }
                }
                if (url == null) {
                    boolean z12 = C6559sR0.a;
                    classLoader = C6706t70.class.getClassLoader();
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    Iterator it3 = ServiceLoader.load(InterfaceC5062lJ.class, classLoader).iterator();
                    interfaceC5062lJ = (InterfaceC5062lJ) (it3.hasNext() ? it3.next() : null);
                    if (interfaceC5062lJ == null) {
                        interfaceC5062lJ.j(hs0);
                        interfaceC5062lJ.k(hs0);
                        return;
                    } else {
                        C3240cr c3240cr3 = new C3240cr();
                        c3240cr3.j(hs0);
                        c3240cr3.k(hs0);
                        return;
                    }
                }
                string = url.toString();
                if (string.endsWith("groovy")) {
                    if (C6706t70.a()) {
                        C3476e.s(hs0, this, url);
                        return;
                    } else {
                        hs0.g.a(new N70("Groovy classes are not available on the class path. ABORTING INITIALIZATION.", hs0));
                        return;
                    }
                }
                if (string.endsWith("xml")) {
                    C4844kG0 c4844kG2 = new C4844kG0();
                    c4844kG2.j(hs0);
                    c4844kG2.r(url);
                } else {
                    throw new C7192vS0("Unexpected filename extension of file [" + url.toString() + "]. Should be either .groovy or .xml");
                }
            } catch (Throwable th2) {
                th = th2;
                d(property2, classLoaderA, url2);
                throw th;
            }
            d(property2, classLoaderA, url);
        } else {
            url = null;
        }
        if (url == null) {
            boolean z13 = C6559sR0.a;
            url = classLoaderA.getResource("logback-test.xml");
            d("logback-test.xml", classLoaderA, url);
            if (url == null) {
                boolean z14 = C6559sR0.a;
                url = classLoaderA.getResource("logback.groovy");
                d("logback.groovy", classLoaderA, url);
                if (url == null) {
                    boolean z15 = C6559sR0.a;
                    url = classLoaderA.getResource("logback.xml");
                    d("logback.xml", classLoaderA, url);
                }
            }
        }
        if (url == null) {
            boolean z16 = C6559sR0.a;
            classLoader = C6706t70.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Iterator it4 = ServiceLoader.load(InterfaceC5062lJ.class, classLoader).iterator();
            interfaceC5062lJ = (InterfaceC5062lJ) (it4.hasNext() ? it4.next() : null);
            if (interfaceC5062lJ == null) {
                interfaceC5062lJ.j(hs0);
                interfaceC5062lJ.k(hs0);
                return;
            } else {
                C3240cr c3240cr4 = new C3240cr();
                c3240cr4.j(hs0);
                c3240cr4.k(hs0);
                return;
            }
        }
        string = url.toString();
        if (string.endsWith("groovy")) {
            if (C6706t70.a()) {
                C3476e.s(hs0, this, url);
                return;
            } else {
                hs0.g.a(new N70("Groovy classes are not available on the class path. ABORTING INITIALIZATION.", hs0));
                return;
            }
        }
        if (string.endsWith("xml")) {
            C4844kG0 c4844kG3 = new C4844kG0();
            c4844kG3.j(hs0);
            c4844kG3.r(url);
        } else {
            throw new C7192vS0("Unexpected filename extension of file [" + url.toString() + "]. Should be either .groovy or .xml");
        }
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.d;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public void d(String str, ClassLoader classLoader, URL url) {
        HashSet<URL> hashSet;
        HS0 hs0 = (HS0) this.d;
        C4538ir c4538ir = hs0.g;
        if (url == null) {
            c4538ir.a(new C1968Rz0(C1039Gc0.d("Could NOT find resource [", str, "]"), hs0));
            return;
        }
        StringBuilder sbB = C6495s7.b("Found resource [", str, "] at [");
        sbB.append(url.toString());
        sbB.append("]");
        c4538ir.a(new C1968Rz0(sbB.toString(), hs0));
        C4538ir c4538ir2 = hs0.g;
        try {
            boolean z = C6559sR0.a;
            hashSet = new HashSet();
            Enumeration<URL> resources = classLoader.getResources(str);
            while (resources.hasMoreElements()) {
                hashSet.add(resources.nextElement());
            }
        } catch (IOException e) {
            c4538ir2.a(new N70(C1039Gc0.d("Failed to get url list for resource [", str, "]"), e, 2, hs0));
            hashSet = null;
        }
        if (hashSet == null || hashSet.size() <= 1) {
            return;
        }
        c4538ir2.a(new Ff2(C1039Gc0.d("Resource [", str, "] occurs multiple times on the classpath."), hs0));
        for (URL url2 : hashSet) {
            StringBuilder sbB2 = C6495s7.b("Resource [", str, "] occurs at [");
            sbB2.append(url2.toString());
            sbB2.append("]");
            c4538ir2.a(new Ff2(sbB2.toString(), hs0));
        }
    }

    public C7173vM() {
        this.d = new HashMap();
    }
}

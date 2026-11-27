package defpackage;

import android.util.Log;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1903Rd1 {

    @NotNull
    public static volatile C1903Rd1 a;
    public static final Logger b;

    /* JADX INFO: renamed from: Rd1$a */
    public static final class a {
        @NotNull
        public static ArrayList a(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC1298Jk1) obj) != EnumC1298Jk1.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC1298Jk1) it.next()).d);
            }
            return arrayList2;
        }

        @NotNull
        public static byte[] b(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C1481Lu c1481Lu = new C1481Lu();
            for (String str : a(protocols)) {
                c1481Lu.j1(str.length());
                c1481Lu.w1(str);
            }
            return c1481Lu.W(c1481Lu.e);
        }

        public static boolean c() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r1
      0x0071: PHI (r1v3 Rd1) = (r1v1 Rd1), (r1v4 Rd1) binds: [B:65:0x0154, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    static {
        C1903Rd1 c1903Rd1;
        String jvmVersion;
        C1903Rd1 c5264mF0 = null;
        if (a.c()) {
            for (Map.Entry<String, String> entry : C5750ob.b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (C5750ob.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C5960pb.a);
                }
            }
            c1903Rd1 = C1658Oa.d ? new C1658Oa() : null;
            if (c1903Rd1 == null) {
                c5264mF0 = C7430wb.e ? new C7430wb() : null;
                Intrinsics.checkNotNull(c5264mF0);
                c1903Rd1 = c5264mF0;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            c1903Rd1 = C6327rK.d ? new C6327rK() : null;
            if (c1903Rd1 == null) {
                if (!"BC".equals(Security.getProviders()[0].getName())) {
                    if (C7499wu.d) {
                        c1903Rd1 = new C7499wu();
                    } else {
                        c1903Rd1 = null;
                    }
                    if (c1903Rd1 == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            if (N91.d) {
                                c1903Rd1 = new N91();
                            } else {
                                c1903Rd1 = null;
                            }
                            if (c1903Rd1 == null) {
                                if (C5894pF0.c) {
                                    c1903Rd1 = new C5894pF0();
                                } else {
                                    c1903Rd1 = null;
                                }
                                if (c1903Rd1 == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                                        Method removeMethod = cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                                        Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                                        Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                                        Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                                        Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                                        Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                                        c5264mF0 = new C5264mF0(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    }
                                    if (c5264mF0 != null) {
                                        c1903Rd1 = c5264mF0;
                                    } else {
                                        c1903Rd1 = new C1903Rd1();
                                    }
                                }
                            }
                        } else {
                            if (C5894pF0.c) {
                                c1903Rd1 = new C5894pF0();
                            } else {
                                c1903Rd1 = null;
                            }
                            if (c1903Rd1 == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                                    Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                                    Method removeMethod2 = cls3.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                                    Intrinsics.checkNotNullExpressionValue(putMethod2, "putMethod");
                                    Intrinsics.checkNotNullExpressionValue(getMethod2, "getMethod");
                                    Intrinsics.checkNotNullExpressionValue(removeMethod2, "removeMethod");
                                    Intrinsics.checkNotNullExpressionValue(clientProviderClass2, "clientProviderClass");
                                    Intrinsics.checkNotNullExpressionValue(serverProviderClass2, "serverProviderClass");
                                    c5264mF0 = new C5264mF0(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                }
                                if (c5264mF0 != null) {
                                    c1903Rd1 = c5264mF0;
                                } else {
                                    c1903Rd1 = new C1903Rd1();
                                }
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (C5894pF0.c) {
                        c1903Rd1 = new C5894pF0();
                    } else {
                        c1903Rd1 = null;
                    }
                    if (c1903Rd1 == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                            Method removeMethod3 = cls5.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod3, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod3, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod3, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass3, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass3, "serverProviderClass");
                            c5264mF0 = new C5264mF0(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                        }
                        if (c5264mF0 != null) {
                            c1903Rd1 = c5264mF0;
                        } else {
                            c1903Rd1 = new C1903Rd1();
                        }
                    }
                } else {
                    if (N91.d) {
                        c1903Rd1 = new N91();
                    } else {
                        c1903Rd1 = null;
                    }
                    if (c1903Rd1 == null) {
                        if (C5894pF0.c) {
                            c1903Rd1 = new C5894pF0();
                        } else {
                            c1903Rd1 = null;
                        }
                        if (c1903Rd1 == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                                Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                                Method removeMethod4 = cls7.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod4, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod4, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod4, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass4, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass4, "serverProviderClass");
                                c5264mF0 = new C5264mF0(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                            }
                            if (c5264mF0 != null) {
                                c1903Rd1 = c5264mF0;
                            } else {
                                c1903Rd1 = new C1903Rd1();
                            }
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (C7499wu.d) {
                c1903Rd1 = new C7499wu();
            } else {
                c1903Rd1 = null;
            }
            if (c1903Rd1 == null) {
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (C5894pF0.c) {
                        c1903Rd1 = new C5894pF0();
                    } else {
                        c1903Rd1 = null;
                    }
                    if (c1903Rd1 == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                            Method removeMethod5 = cls9.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod5, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod5, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod5, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass5, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass5, "serverProviderClass");
                            c5264mF0 = new C5264mF0(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                        }
                        if (c5264mF0 != null) {
                            c1903Rd1 = c5264mF0;
                        } else {
                            c1903Rd1 = new C1903Rd1();
                        }
                    }
                } else {
                    if (N91.d) {
                        c1903Rd1 = new N91();
                    } else {
                        c1903Rd1 = null;
                    }
                    if (c1903Rd1 == null) {
                        if (C5894pF0.c) {
                            c1903Rd1 = new C5894pF0();
                        } else {
                            c1903Rd1 = null;
                        }
                        if (c1903Rd1 == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                                Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                                Method removeMethod6 = cls11.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod6, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod6, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod6, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass6, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass6, "serverProviderClass");
                                c5264mF0 = new C5264mF0(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                            }
                            if (c5264mF0 != null) {
                                c1903Rd1 = c5264mF0;
                            } else {
                                c1903Rd1 = new C1903Rd1();
                            }
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (C5894pF0.c) {
                c1903Rd1 = new C5894pF0();
            } else {
                c1903Rd1 = null;
            }
            if (c1903Rd1 == null) {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod7, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod7, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod7, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass7, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass7, "serverProviderClass");
                            c5264mF0 = new C5264mF0(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (c5264mF0 != null) {
                    c1903Rd1 = c5264mF0;
                } else {
                    c1903Rd1 = new C1903Rd1();
                }
            }
        } else {
            if (N91.d) {
                c1903Rd1 = new N91();
            } else {
                c1903Rd1 = null;
            }
            if (c1903Rd1 == null) {
                if (C5894pF0.c) {
                    c1903Rd1 = new C5894pF0();
                } else {
                    c1903Rd1 = null;
                }
                if (c1903Rd1 == null) {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                        Intrinsics.checkNotNullExpressionValue(putMethod8, "putMethod");
                        Intrinsics.checkNotNullExpressionValue(getMethod8, "getMethod");
                        Intrinsics.checkNotNullExpressionValue(removeMethod8, "removeMethod");
                        Intrinsics.checkNotNullExpressionValue(clientProviderClass8, "clientProviderClass");
                        Intrinsics.checkNotNullExpressionValue(serverProviderClass8, "serverProviderClass");
                        c5264mF0 = new C5264mF0(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (c5264mF0 != null) {
                        c1903Rd1 = c5264mF0;
                    } else {
                        c1903Rd1 = new C1903Rd1();
                    }
                }
            }
        }
        a = c1903Rd1;
        b = Logger.getLogger(C6711t81.class.getName());
    }

    public static void i(int i, @NotNull String message, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public static /* synthetic */ void j(C1903Rd1 c1903Rd1, String str, int i) {
        int i2 = (i & 2) != 0 ? 4 : 5;
        c1903Rd1.getClass();
        i(i2, str, null);
    }

    public void a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public G1 b(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C3031br(c(trustManager));
    }

    @NotNull
    public InterfaceC6280r52 c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C4757jr((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @Nullable
    public String f(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void k(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Z0.c(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, message, (Throwable) obj);
    }

    @NotNull
    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory m(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @NotNull
    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}

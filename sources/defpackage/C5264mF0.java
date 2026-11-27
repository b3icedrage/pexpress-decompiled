package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5264mF0 extends C1903Rd1 {

    @NotNull
    public final Method c;

    @NotNull
    public final Method d;

    @NotNull
    public final Method e;

    @NotNull
    public final Class<?> f;

    @NotNull
    public final Class<?> g;

    /* JADX INFO: renamed from: mF0$a */
    public static final class a implements InvocationHandler {

        @NotNull
        public final ArrayList a;
        public boolean b;

        @Nullable
        public String c;

        public a(@NotNull ArrayList protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.a = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.a(name, "supports") && Intrinsics.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.a(name, "unsupported") && Intrinsics.a(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            boolean zA = Intrinsics.a(name, "protocols");
            ArrayList arrayList = this.a;
            if (zA && objArr.length == 0) {
                return arrayList;
            }
            if ((Intrinsics.a(name, "selectProtocol") || Intrinsics.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj2 = list.get(i);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (arrayList.contains(str)) {
                                this.c = str;
                                return str;
                            }
                            if (i != size) {
                                i++;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.a(name, "protocolSelected") && !Intrinsics.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.c = (String) obj3;
            return null;
        }
    }

    public C5264mF0(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.c = putMethod;
        this.d = getMethod;
        this.e = removeMethod;
        this.f = clientProviderClass;
        this.g = serverProviderClass;
    }

    @Override // defpackage.C1903Rd1
    public final void a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.e.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.C1903Rd1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
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
        try {
            this.c.invoke(null, sslSocket, Proxy.newProxyInstance(C1903Rd1.class.getClassLoader(), new Class[]{this.f, this.g}, new a(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.C1903Rd1
    @Nullable
    public final String f(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sslSocket));
            Intrinsics.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                C1903Rd1.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}

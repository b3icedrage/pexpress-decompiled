package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class M90 {

    @NotNull
    public final C4282ho1 a;

    @NotNull
    public final C5450n8 b;

    @NotNull
    public final C3233co1 c;

    @NotNull
    public final AbstractC7971z80 d;

    @Nullable
    public C5040lB1.a e;

    @Nullable
    public C5040lB1 f;
    public int g;
    public int h;
    public int i;

    @Nullable
    public C4362iB1 j;

    public M90(@NotNull C4282ho1 connectionPool, @NotNull C5450n8 address, @NotNull C3233co1 call, @NotNull AbstractC7971z80 eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = connectionPool;
        this.b = address;
        this.c = call;
        this.d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0284  */
    /* JADX WARN: Code duplicated, block: B:124:0x029b  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x0309  */
    /* JADX WARN: Code duplicated, block: B:139:0x0323  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    public final C3442do1 a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        C4362iB1 c4362iB1;
        C5040lB1.a aVar;
        C5040lB1 c5040lB1;
        ArrayList arrayList;
        C5040lB1.a aVar2;
        boolean z3;
        C5450n8 c5450n8;
        Proxy proxy;
        String hostname;
        int port;
        List<InetAddress> listC;
        boolean zContains;
        C5040lB1.a aVar3;
        C3442do1 connection;
        C4620jB1 c4620jB1;
        C4362iB1 route;
        Socket socketJ;
        while (!this.c.t) {
            C3442do1 c3442do1 = this.c.n;
            if (c3442do1 != null) {
                synchronized (c3442do1) {
                    try {
                        socketJ = (c3442do1.j || !b(c3442do1.b.a.h)) ? this.c.j() : null;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.n == null) {
                    if (socketJ != null) {
                        C6806tc2.e(socketJ);
                    }
                    this.d.l(this.c, c3442do1);
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        c3442do1 = this.c.n;
                        Intrinsics.checkNotNull(c3442do1);
                        this.d.k(this.c, c3442do1);
                    } else {
                        c4362iB1 = this.j;
                        try {
                            if (c4362iB1 != null) {
                                Intrinsics.checkNotNull(c4362iB1);
                                this.j = null;
                            } else {
                                aVar = this.e;
                                if (aVar != null) {
                                    Intrinsics.checkNotNull(aVar);
                                    if (aVar.a()) {
                                        aVar3 = this.e;
                                        Intrinsics.checkNotNull(aVar3);
                                        if (aVar3.a()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i5 = aVar3.b;
                                        aVar3.b = i5 + 1;
                                        c4362iB1 = (C4362iB1) aVar3.a.get(i5);
                                    }
                                }
                                c5040lB1 = this.f;
                                if (c5040lB1 == null) {
                                    C5450n8 c5450n9 = this.b;
                                    C3233co1 c3233co1 = this.c;
                                    c5040lB1 = new C5040lB1(c5450n9, c3233co1.d.F, c3233co1, this.d);
                                    this.f = c5040lB1;
                                }
                                if (c5040lB1.a()) {
                                    throw new NoSuchElementException();
                                }
                                arrayList = new ArrayList();
                                while (c5040lB1.f < c5040lB1.e.size()) {
                                    if (c5040lB1.f < c5040lB1.e.size()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c5450n8 = c5040lB1.a;
                                    if (z3) {
                                        throw new SocketException("No route to " + c5450n8.h.d + "; exhausted proxy configurations: " + c5040lB1.e);
                                    }
                                    List<? extends Proxy> list = c5040lB1.e;
                                    int i6 = c5040lB1.f;
                                    c5040lB1.f = i6 + 1;
                                    proxy = list.get(i6);
                                    ArrayList arrayList2 = new ArrayList();
                                    c5040lB1.g = arrayList2;
                                    if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                        C1318Jr0 c1318Jr0 = c5450n8.h;
                                        hostname = c1318Jr0.d;
                                        port = c1318Jr0.e;
                                    } else {
                                        SocketAddress proxyAddress = proxy.address();
                                        if (!(proxyAddress instanceof InetSocketAddress)) {
                                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                                        }
                                        Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                                        InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                        Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                                        InetAddress address = inetSocketAddress.getAddress();
                                        if (address == null) {
                                            hostname = inetSocketAddress.getHostName();
                                            Intrinsics.checkNotNullExpressionValue(hostname, "hostName");
                                        } else {
                                            hostname = address.getHostAddress();
                                            Intrinsics.checkNotNullExpressionValue(hostname, "address.hostAddress");
                                        }
                                        port = inetSocketAddress.getPort();
                                    }
                                    if (1 <= port || port >= 65536) {
                                        throw new SocketException("No route to " + hostname + ':' + port + "; port is out of range");
                                    }
                                    if (proxy.type() == Proxy.Type.SOCKS) {
                                        arrayList2.add(InetSocketAddress.createUnresolved(hostname, port));
                                    } else {
                                        byte[] bArr = C6806tc2.a;
                                        Intrinsics.checkNotNullParameter(hostname, "<this>");
                                        if (C6806tc2.f.d(hostname)) {
                                            listC = VE.c(InetAddress.getByName(hostname));
                                        } else {
                                            AbstractC7971z80 abstractC7971z80 = c5040lB1.d;
                                            InterfaceC1023Fx interfaceC1023Fx = c5040lB1.c;
                                            abstractC7971z80.n(interfaceC1023Fx, hostname);
                                            c5450n8.a.getClass();
                                            Intrinsics.checkNotNullParameter(hostname, "hostname");
                                            try {
                                                InetAddress[] allByName = InetAddress.getAllByName(hostname);
                                                Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                                                List<InetAddress> listF = C1526Mj.F(allByName);
                                                if (listF.isEmpty()) {
                                                    throw new UnknownHostException(c5450n8.a + " returned no addresses for " + hostname);
                                                }
                                                abstractC7971z80.m(interfaceC1023Fx, hostname, listF);
                                                listC = listF;
                                            } catch (NullPointerException e) {
                                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                                                unknownHostException.initCause(e);
                                                throw unknownHostException;
                                            }
                                        }
                                        Iterator<InetAddress> it = listC.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(new InetSocketAddress(it.next(), port));
                                        }
                                    }
                                    Iterator it2 = c5040lB1.g.iterator();
                                    while (it2.hasNext()) {
                                        C4362iB1 route2 = new C4362iB1(c5040lB1.a, proxy, (InetSocketAddress) it2.next());
                                        C4620jB1 c4620jB2 = c5040lB1.b;
                                        synchronized (c4620jB2) {
                                            Intrinsics.checkNotNullParameter(route2, "route");
                                            zContains = c4620jB2.a.contains(route2);
                                        }
                                        if (zContains) {
                                            c5040lB1.h.add(route2);
                                        } else {
                                            arrayList.add(route2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        break;
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    C2904bF.o(arrayList, c5040lB1.h);
                                    c5040lB1.h.clear();
                                }
                                aVar2 = new C5040lB1.a(arrayList);
                                this.e = aVar2;
                                if (!this.c.t) {
                                    throw new IOException("Canceled");
                                }
                                if (this.a.a(this.b, this.c, arrayList, false)) {
                                    c3442do1 = this.c.n;
                                    Intrinsics.checkNotNull(c3442do1);
                                    this.d.k(this.c, c3442do1);
                                } else {
                                    if (aVar2.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i7 = aVar2.b;
                                    aVar2.b = i7 + 1;
                                    c4362iB1 = (C4362iB1) arrayList.get(i7);
                                    connection = new C3442do1(this.a, c4362iB1);
                                    this.c.v = connection;
                                    connection.d(i, i2, i3, i4, z, this.c, this.d);
                                    this.c.v = null;
                                    c4620jB1 = this.c.d.F;
                                    route = connection.b;
                                    synchronized (c4620jB1) {
                                        Intrinsics.checkNotNullParameter(route, "route");
                                        c4620jB1.a.remove(route);
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, true)) {
                                        c3442do1 = this.c.n;
                                        Intrinsics.checkNotNull(c3442do1);
                                        this.j = c4362iB1;
                                        Socket socket = connection.d;
                                        Intrinsics.checkNotNull(socket);
                                        C6806tc2.e(socket);
                                        this.d.k(this.c, c3442do1);
                                    } else {
                                        synchronized (connection) {
                                            C4282ho1 c4282ho1 = this.a;
                                            c4282ho1.getClass();
                                            Intrinsics.checkNotNullParameter(connection, "connection");
                                            byte[] bArr2 = C6806tc2.a;
                                            c4282ho1.d.add(connection);
                                            c4282ho1.b.c(c4282ho1.c, 0L);
                                            this.c.b(connection);
                                            Unit unit2 = Unit.a;
                                        }
                                        this.d.k(this.c, connection);
                                        c3442do1 = connection;
                                    }
                                }
                            }
                            connection.d(i, i2, i3, i4, z, this.c, this.d);
                            this.c.v = null;
                            c4620jB1 = this.c.d.F;
                            route = connection.b;
                            synchronized (c4620jB1) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                c4620jB1.a.remove(route);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    c3442do1 = this.c.n;
                                    Intrinsics.checkNotNull(c3442do1);
                                    this.j = c4362iB1;
                                    Socket socket2 = connection.d;
                                    Intrinsics.checkNotNull(socket2);
                                    C6806tc2.e(socket2);
                                    this.d.k(this.c, c3442do1);
                                } else {
                                    synchronized (connection) {
                                        C4282ho1 c4282ho2 = this.a;
                                        c4282ho2.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr3 = C6806tc2.a;
                                        c4282ho2.d.add(connection);
                                        c4282ho2.b.c(c4282ho2.c, 0L);
                                        this.c.b(connection);
                                        Unit unit3 = Unit.a;
                                        this.d.k(this.c, connection);
                                        c3442do1 = connection;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.v = null;
                            throw th2;
                        }
                        arrayList = null;
                        connection = new C3442do1(this.a, c4362iB1);
                        this.c.v = connection;
                    }
                } else if (socketJ != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    c3442do1 = this.c.n;
                    Intrinsics.checkNotNull(c3442do1);
                    this.d.k(this.c, c3442do1);
                } else {
                    c4362iB1 = this.j;
                    if (c4362iB1 != null) {
                        Intrinsics.checkNotNull(c4362iB1);
                        this.j = null;
                    } else {
                        aVar = this.e;
                        if (aVar != null) {
                            Intrinsics.checkNotNull(aVar);
                            if (aVar.a()) {
                                aVar3 = this.e;
                                Intrinsics.checkNotNull(aVar3);
                                if (aVar3.a()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = aVar3.b;
                                aVar3.b = i8 + 1;
                                c4362iB1 = (C4362iB1) aVar3.a.get(i8);
                            }
                        }
                        c5040lB1 = this.f;
                        if (c5040lB1 == null) {
                            C5450n8 c5450n10 = this.b;
                            C3233co1 c3233co2 = this.c;
                            c5040lB1 = new C5040lB1(c5450n10, c3233co2.d.F, c3233co2, this.d);
                            this.f = c5040lB1;
                        }
                        if (c5040lB1.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (c5040lB1.f < c5040lB1.e.size()) {
                            if (c5040lB1.f < c5040lB1.e.size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c5450n8 = c5040lB1.a;
                            if (z3) {
                                throw new SocketException("No route to " + c5450n8.h.d + "; exhausted proxy configurations: " + c5040lB1.e);
                            }
                            List<? extends Proxy> list2 = c5040lB1.e;
                            int i9 = c5040lB1.f;
                            c5040lB1.f = i9 + 1;
                            proxy = list2.get(i9);
                            ArrayList arrayList3 = new ArrayList();
                            c5040lB1.g = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                C1318Jr0 c1318Jr1 = c5450n8.h;
                                hostname = c1318Jr1.d;
                                port = c1318Jr1.e;
                            } else {
                                C1318Jr0 c1318Jr2 = c5450n8.h;
                                hostname = c1318Jr2.d;
                                port = c1318Jr2.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostname + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            C2904bF.o(arrayList, c5040lB1.h);
                            c5040lB1.h.clear();
                        }
                        aVar2 = new C5040lB1.a(arrayList);
                        this.e = aVar2;
                        if (!this.c.t) {
                            throw new IOException("Canceled");
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            c3442do1 = this.c.n;
                            Intrinsics.checkNotNull(c3442do1);
                            this.d.k(this.c, c3442do1);
                        } else {
                            if (aVar2.a()) {
                                throw new NoSuchElementException();
                            }
                            int i10 = aVar2.b;
                            aVar2.b = i10 + 1;
                            c4362iB1 = (C4362iB1) arrayList.get(i10);
                            connection = new C3442do1(this.a, c4362iB1);
                            this.c.v = connection;
                            connection.d(i, i2, i3, i4, z, this.c, this.d);
                            this.c.v = null;
                            c4620jB1 = this.c.d.F;
                            route = connection.b;
                            synchronized (c4620jB1) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                c4620jB1.a.remove(route);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    c3442do1 = this.c.n;
                                    Intrinsics.checkNotNull(c3442do1);
                                    this.j = c4362iB1;
                                    Socket socket3 = connection.d;
                                    Intrinsics.checkNotNull(socket3);
                                    C6806tc2.e(socket3);
                                    this.d.k(this.c, c3442do1);
                                } else {
                                    synchronized (connection) {
                                        C4282ho1 c4282ho3 = this.a;
                                        c4282ho3.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr4 = C6806tc2.a;
                                        c4282ho3.d.add(connection);
                                        c4282ho3.b.c(c4282ho3.c, 0L);
                                        this.c.b(connection);
                                        Unit unit4 = Unit.a;
                                        this.d.k(this.c, connection);
                                        c3442do1 = connection;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    connection = new C3442do1(this.a, c4362iB1);
                    this.c.v = connection;
                    connection.d(i, i2, i3, i4, z, this.c, this.d);
                    this.c.v = null;
                    c4620jB1 = this.c.d.F;
                    route = connection.b;
                    synchronized (c4620jB1) {
                        Intrinsics.checkNotNullParameter(route, "route");
                        c4620jB1.a.remove(route);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            c3442do1 = this.c.n;
                            Intrinsics.checkNotNull(c3442do1);
                            this.j = c4362iB1;
                            Socket socket4 = connection.d;
                            Intrinsics.checkNotNull(socket4);
                            C6806tc2.e(socket4);
                            this.d.k(this.c, c3442do1);
                        } else {
                            synchronized (connection) {
                                C4282ho1 c4282ho4 = this.a;
                                c4282ho4.getClass();
                                Intrinsics.checkNotNullParameter(connection, "connection");
                                byte[] bArr5 = C6806tc2.a;
                                c4282ho4.d.add(connection);
                                c4282ho4.b.c(c4282ho4.c, 0L);
                                this.c.b(connection);
                                Unit unit5 = Unit.a;
                                this.d.k(this.c, connection);
                                c3442do1 = connection;
                            }
                        }
                    }
                }
            }
            if (c3442do1.j(z2)) {
                return c3442do1;
            }
            c3442do1.l();
            if (this.j == null) {
                C5040lB1.a aVar4 = this.e;
                if (aVar4 != null ? aVar4.a() : true) {
                    continue;
                } else {
                    C5040lB1 c5040lB2 = this.f;
                    if (!(c5040lB2 != null ? c5040lB2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(@NotNull C1318Jr0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C1318Jr0 c1318Jr0 = this.b.h;
        return url.e == c1318Jr0.e && Intrinsics.a(url.d, c1318Jr0.d);
    }

    public final void c(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.j = null;
        if ((e instanceof C2945bS1) && ((C2945bS1) e).d == EnumC7967z70.REFUSED_STREAM) {
            this.g++;
        } else if (e instanceof C3757fK) {
            this.h++;
        } else {
            this.i++;
        }
    }
}

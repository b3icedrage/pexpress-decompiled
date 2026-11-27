package io.sentry.okhttp;

import defpackage.AbstractC7971z80;
import defpackage.C0702Bu;
import defpackage.C0857Dt1;
import defpackage.C0916En0;
import defpackage.C1318Jr0;
import defpackage.C3233co1;
import defpackage.C4543is1;
import defpackage.Ec2;
import defpackage.EnumC1298Jk1;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC1023Fx;
import defpackage.InterfaceC2347Wu0;
import defpackage.InterfaceC2919bK;
import defpackage.ML0;
import defpackage.SD1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC7971z80 {

    @NotNull
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    @NotNull
    public final SD1 b;

    @Nullable
    public final ML0 c;

    @Nullable
    public AbstractC7971z80 d;

    public static final class a extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ String d;
        public final /* synthetic */ List<InetAddress> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends InetAddress> list) {
            super(1);
            this.d = str;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            it.m(this.d, "domain_name");
            List<InetAddress> list = this.e;
            if (!list.isEmpty()) {
                it.m(CollectionsKt.J(list, null, null, null, io.sentry.okhttp.c.d, 31), "dns_addresses");
            }
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ List<Proxy> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Proxy> list) {
            super(1);
            this.d = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.d.isEmpty()) {
                it.m(CollectionsKt.J(this.d, null, null, null, io.sentry.okhttp.e.d, 31), "proxies");
            }
            return Unit.a;
        }
    }

    public static final class c extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(1);
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            long j = this.d;
            if (j > 0) {
                it.m(Long.valueOf(j), "http.request_content_length");
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.okhttp.d$d, reason: collision with other inner class name */
    public static final class C0397d extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ IOException d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0397d(IOException iOException) {
            super(1);
            this.d = iOException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.e()) {
                it.o(EnumC4869kO1.INTERNAL_ERROR);
                it.i(this.d);
            }
            return Unit.a;
        }
    }

    public static final class e extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ IOException d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IOException iOException) {
            super(1);
            this.d = iOException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            it.o(EnumC4869kO1.INTERNAL_ERROR);
            it.i(this.d);
            return Unit.a;
        }
    }

    public static final class f extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(1);
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            long j = this.d;
            if (j > 0) {
                it.m(Long.valueOf(j), "http.response_content_length");
            }
            return Unit.a;
        }
    }

    public static final class g extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ IOException d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(IOException iOException) {
            super(1);
            this.d = iOException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.e()) {
                it.o(EnumC4869kO1.INTERNAL_ERROR);
                it.i(this.d);
            }
            return Unit.a;
        }
    }

    public static final class h extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ IOException d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(IOException iOException) {
            super(1);
            this.d = iOException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            it.o(EnumC4869kO1.INTERNAL_ERROR);
            it.i(this.d);
            return Unit.a;
        }
    }

    public static final class i extends ML0 implements Function1<InterfaceC2347Wu0, Unit> {
        public final /* synthetic */ C0857Dt1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C0857Dt1 c0857Dt1) {
            super(1);
            this.d = c0857Dt1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2347Wu0 interfaceC2347Wu0) {
            InterfaceC2347Wu0 it = interfaceC2347Wu0;
            Intrinsics.checkNotNullParameter(it, "it");
            C0857Dt1 c0857Dt1 = this.d;
            it.m(Integer.valueOf(c0857Dt1.h), "http.response.status_code");
            if (it.getStatus() == null) {
                it.o(EnumC4869kO1.fromHttpStatusCode(c0857Dt1.h));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Nullable Function1 function1) {
        SD1 scopes = SD1.a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.b = scopes;
        this.c = (ML0) function1;
    }

    @Override // defpackage.AbstractC7971z80
    public final void A(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.A(call, response);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void B(@NotNull InterfaceC1023Fx call, @Nullable C0916En0 c0916En0) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.B(call, c0916En0);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void C(@NotNull InterfaceC1023Fx call) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.C(call);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connect.secure_connect_ms");
        }
    }

    public final boolean D() {
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 instanceof d) {
            return false;
        }
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(abstractC7971z80 != null ? abstractC7971z80.getClass().getName() : null);
    }

    @Override // defpackage.AbstractC7971z80
    public final void a(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.a(call, cachedResponse);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void b(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.b(call, response);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void c(@NotNull InterfaceC1023Fx call) {
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.c(call);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void d(@NotNull C3233co1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.d(call);
        }
        io.sentry.okhttp.a aVar = (io.sentry.okhttp.a) e.remove(call);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // defpackage.AbstractC7971z80
    public final void e(@NotNull C3233co1 call, @NotNull IOException ioe) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.e(call, ioe);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.remove(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.a(new io.sentry.okhttp.b(ioe));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7971z80
    public final void f(@NotNull C3233co1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ?? r0 = this.c;
        AbstractC7971z80 abstractC7971z80 = r0 != 0 ? (AbstractC7971z80) r0.invoke(call) : null;
        this.d = abstractC7971z80;
        if (abstractC7971z80 != null) {
            abstractC7971z80.f(call);
        }
        if (D()) {
            e.put(call, new io.sentry.okhttp.a(this.b, call.e));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void g(@NotNull C3233co1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.g(call);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void h(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable EnumC1298Jk1 enumC1298Jk1) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.h(call, inetSocketAddress, proxy, enumC1298Jk1);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            String strName = enumC1298Jk1 != null ? enumC1298Jk1.name() : null;
            if (strName != null) {
                aVar.d.f(strName, "protocol");
                InterfaceC2347Wu0 interfaceC2347Wu0 = aVar.e;
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.m(strName, "protocol");
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void i(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @NotNull IOException ioe) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.i(call, inetSocketAddress, proxy, ioe);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connect_ms", new Ec2(ioe, 1));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void j(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.j(call, inetSocketAddress, proxy);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connect_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void k(@NotNull InterfaceC1023Fx call, @NotNull InterfaceC2919bK connection) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.k(call, connection);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connection_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void l(@NotNull InterfaceC1023Fx call, @NotNull InterfaceC2919bK connection) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.l(call, connection);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void m(@NotNull InterfaceC1023Fx call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.m(call, domainName, inetAddressList);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.client.resolve_dns_ms", new a(domainName, inetAddressList));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void n(@NotNull InterfaceC1023Fx call, @NotNull String domainName) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.n(call, domainName);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.client.resolve_dns_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void o(@NotNull InterfaceC1023Fx call, @NotNull C1318Jr0 url, @NotNull List<? extends Proxy> proxies) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.o(call, url, proxies);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.client.proxy_select_ms", new b(proxies));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void p(@NotNull InterfaceC1023Fx call, @NotNull C1318Jr0 url) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.p(call, url);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.client.proxy_select_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void q(@NotNull InterfaceC1023Fx call, long j) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.q(call, j);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.connection.request_body_ms", new c(j));
            if (j > -1) {
                aVar.d.f(Long.valueOf(j), "request_content_length");
                InterfaceC2347Wu0 interfaceC2347Wu0 = aVar.e;
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.m(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void r(@NotNull InterfaceC1023Fx call) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.r(call);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connection.request_body_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void s(@NotNull InterfaceC1023Fx call, @NotNull IOException ioe) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.s(call, ioe);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connection.request_headers_ms", new C0397d(ioe));
            aVar.b("http.connection.request_body_ms", new e(ioe));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void t(@NotNull InterfaceC1023Fx call, @NotNull C4543is1 request) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.t(call, request);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void u(@NotNull InterfaceC1023Fx call) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.u(call);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connection.request_headers_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void v(@NotNull InterfaceC1023Fx call, long j) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.v(call, j);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            if (j > -1) {
                aVar.d.f(Long.valueOf(j), "response_content_length");
                InterfaceC2347Wu0 interfaceC2347Wu0 = aVar.e;
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.m(Long.valueOf(j), "http.response_content_length");
                }
            }
            aVar.b("http.connection.response_body_ms", new f(j));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void w(@NotNull InterfaceC1023Fx call) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.w(call);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connection.response_body_ms");
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void x(@NotNull InterfaceC1023Fx call, @NotNull IOException ioe) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.x(call, ioe);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connection.response_headers_ms", new g(ioe));
            aVar.b("http.connection.response_body_ms", new h(ioe));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void y(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.y(call, response);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            Intrinsics.checkNotNullParameter(response, "response");
            aVar.f = response;
            EnumC1298Jk1 enumC1298Jk1 = response.e;
            String strName = enumC1298Jk1.name();
            C0702Bu c0702Bu = aVar.d;
            c0702Bu.f(strName, "protocol");
            int i2 = response.h;
            c0702Bu.f(Integer.valueOf(i2), "status_code");
            InterfaceC2347Wu0 interfaceC2347Wu0 = aVar.e;
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.m(enumC1298Jk1.name(), "protocol");
            }
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.m(Integer.valueOf(i2), "http.response.status_code");
            }
            aVar.b("http.connection.response_headers_ms", new i(response));
        }
    }

    @Override // defpackage.AbstractC7971z80
    public final void z(@NotNull InterfaceC1023Fx call) {
        io.sentry.okhttp.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        AbstractC7971z80 abstractC7971z80 = this.d;
        if (abstractC7971z80 != null) {
            abstractC7971z80.z(call);
        }
        if (D() && (aVar = (io.sentry.okhttp.a) e.get(call)) != null) {
            aVar.c("http.connection.response_headers_ms");
        }
    }
}

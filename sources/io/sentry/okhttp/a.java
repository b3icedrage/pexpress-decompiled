package io.sentry.okhttp;

import com.google.android.gms.common.internal.ImagesContract;
import defpackage.AbstractC3118cG1;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C0857Dt1;
import defpackage.C1318Jr0;
import defpackage.C3561eO1;
import defpackage.C4543is1;
import defpackage.InterfaceC2347Wu0;
import defpackage.SD1;
import io.sentry.util.C;
import io.sentry.util.r;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public final SD1 a;

    @NotNull
    public final C4543is1 b;

    @NotNull
    public final ConcurrentHashMap c;

    @NotNull
    public final C0702Bu d;

    @Nullable
    public final InterfaceC2347Wu0 e;

    @Nullable
    public C0857Dt1 f;

    @Nullable
    public C0857Dt1 g;

    @Nullable
    public io.sentry.util.network.d h;

    @NotNull
    public final AtomicBoolean i;

    @NotNull
    public String j;

    @NotNull
    public String k;

    public a(@NotNull SD1 scopes, @NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = scopes;
        this.b = request;
        this.c = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        C.a aVarB = C.b(request.a.i);
        Intrinsics.checkNotNullExpressionValue(aVarB, "parse(...)");
        String str = aVarB.a;
        str = str == null ? "unknown" : str;
        Intrinsics.checkNotNullExpressionValue(str, "getUrlOrFallback(...)");
        this.j = str;
        this.k = request.b;
        InterfaceC2347Wu0 interfaceC2347Wu0R = r.a ? scopes.r() : scopes.e();
        InterfaceC2347Wu0 interfaceC2347Wu0T = interfaceC2347Wu0R != null ? interfaceC2347Wu0R.t("http.client") : null;
        this.e = interfaceC2347Wu0T;
        C3561eO1 c3561eO1W = interfaceC2347Wu0T != null ? interfaceC2347Wu0T.w() : null;
        if (c3561eO1W != null) {
            c3561eO1W.m = "auto.http.okhttp";
        }
        C0702Bu c0702Bu = new C0702Bu();
        c0702Bu.i = "http";
        c0702Bu.k = "http";
        c0702Bu.f(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.d = c0702Bu;
        e(request);
    }

    public final void a(@Nullable b bVar) {
        if (this.i.getAndSet(true)) {
            return;
        }
        this.c.clear();
        C0841Do0 c0841Do0 = new C0841Do0();
        c0841Do0.d(this.b, "okHttp:request");
        C0857Dt1 c0857Dt1 = this.f;
        if (c0857Dt1 != null) {
            c0841Do0.d(c0857Dt1, "okHttp:response");
        }
        io.sentry.util.network.d dVar = this.h;
        if (dVar != null) {
            c0841Do0.d(dVar, "sentry:replayNetworkDetails");
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        C0702Bu c0702Bu = this.d;
        c0702Bu.f(lValueOf, "http.end_timestamp");
        SD1 sd1 = this.a;
        sd1.l(c0702Bu, c0841Do0);
        InterfaceC2347Wu0 interfaceC2347Wu0 = this.e;
        if (interfaceC2347Wu0 != null && bVar != null) {
            bVar.invoke(interfaceC2347Wu0);
        }
        C0857Dt1 c0857Dt2 = this.g;
        if (c0857Dt2 != null) {
            i.a(sd1, c0857Dt2.d, c0857Dt2);
        }
        if (interfaceC2347Wu0 != null) {
            interfaceC2347Wu0.l();
        }
    }

    public final void b(@NotNull String event, @Nullable Function1<? super InterfaceC2347Wu0, Unit> function1) {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC3118cG1 abstractC3118cG1 = (AbstractC3118cG1) this.c.remove(event);
        if (abstractC3118cG1 == null || (interfaceC2347Wu0 = this.e) == null) {
            return;
        }
        if (function1 != null) {
            function1.invoke(interfaceC2347Wu0);
        }
        interfaceC2347Wu0.m(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.a.p().getDateProvider().now().e(abstractC3118cG1))), event);
    }

    public final void c(@NotNull String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.e == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        AbstractC3118cG1 abstractC3118cG1Now = this.a.p().getDateProvider().now();
        Intrinsics.checkNotNullExpressionValue(abstractC3118cG1Now, "now(...)");
        concurrentHashMap.put(event, abstractC3118cG1Now);
    }

    public final void d(@Nullable String str) {
        if (str != null) {
            this.d.f(str, "error_message");
            InterfaceC2347Wu0 interfaceC2347Wu0 = this.e;
            if (interfaceC2347Wu0 != null) {
                interfaceC2347Wu0.m(str, "error_message");
            }
        }
    }

    public final void e(@NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C.a aVarB = C.b(request.a.i);
        Intrinsics.checkNotNullExpressionValue(aVarB, "parse(...)");
        String str = aVarB.a;
        String str2 = str == null ? "unknown" : str;
        Intrinsics.checkNotNullExpressionValue(str2, "getUrlOrFallback(...)");
        this.j = str2;
        C1318Jr0 c1318Jr0 = request.a;
        String str3 = c1318Jr0.d;
        String strB = c1318Jr0.b();
        this.k = request.b;
        InterfaceC2347Wu0 interfaceC2347Wu0 = this.e;
        if (interfaceC2347Wu0 != null) {
            interfaceC2347Wu0.q(this.k + ' ' + this.j);
        }
        String str4 = aVarB.c;
        String str5 = aVarB.b;
        if (interfaceC2347Wu0 != null) {
            if (str5 != null) {
                interfaceC2347Wu0.m(str5, "http.query");
            }
            if (str4 != null) {
                interfaceC2347Wu0.m(str4, "http.fragment");
            }
        }
        C0702Bu c0702Bu = this.d;
        c0702Bu.f(str3, "host");
        c0702Bu.f(strB, "path");
        if (str != null) {
            Intrinsics.checkNotNull(str);
            c0702Bu.f(str, ImagesContract.URL);
        }
        String str6 = this.k;
        Locale locale = Locale.ROOT;
        String upperCase = str6.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        c0702Bu.f(upperCase, "method");
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            c0702Bu.f(str5, "http.query");
        }
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            c0702Bu.f(str4, "http.fragment");
        }
        if (interfaceC2347Wu0 != null) {
            interfaceC2347Wu0.m(this.j, ImagesContract.URL);
        }
        if (interfaceC2347Wu0 != null) {
            interfaceC2347Wu0.m(str3, "host");
        }
        if (interfaceC2347Wu0 != null) {
            interfaceC2347Wu0.m(strB, "path");
        }
        if (interfaceC2347Wu0 != null) {
            String upperCase2 = this.k.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            interfaceC2347Wu0.m(upperCase2, "http.request.method");
        }
    }
}

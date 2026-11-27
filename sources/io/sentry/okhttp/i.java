package io.sentry.okhttp;

import defpackage.AbstractC1091Gt1;
import defpackage.AbstractC5395ms1;
import defpackage.C0841Do0;
import defpackage.C0857Dt1;
import defpackage.C2813ao0;
import defpackage.C4543is1;
import defpackage.EG1;
import defpackage.InterfaceC1171Hu0;
import defpackage.ML0;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.protocol.l;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.util.C;
import io.sentry.util.C4529c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    public static final class a extends ML0 implements Function1<Long, Unit> {
        public final /* synthetic */ o d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(1);
            this.d = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.d.l = Long.valueOf(l.longValue());
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<Long, Unit> {
        public final /* synthetic */ p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(1);
            this.d = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.d.h = Long.valueOf(l.longValue());
            return Unit.a;
        }
    }

    public static void a(@NotNull InterfaceC1171Hu0 scopes, @NotNull C4543is1 request, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        C.a aVarB = C.b(request.a.i);
        Intrinsics.checkNotNullExpressionValue(aVarB, "parse(...)");
        l lVar = new l();
        lVar.d = "SentryOkHttpInterceptor";
        EG1 eg1 = new EG1(new io.sentry.exception.a(lVar, new SentryHttpClientException("HTTP Client Error with status code: " + response.h), Thread.currentThread(), true));
        C0841Do0 c0841Do0 = new C0841Do0();
        c0841Do0.d(request, "okHttp:request");
        c0841Do0.d(response, "okHttp:response");
        o oVar = new o();
        oVar.d = aVarB.a;
        oVar.g = aVarB.b;
        oVar.n = aVarB.c;
        boolean zIsSendDefaultPii = scopes.p().isSendDefaultPii();
        C2813ao0 c2813ao0 = request.c;
        oVar.i = zIsSendDefaultPii ? c2813ao0.b("Cookie") : null;
        oVar.e = request.b;
        oVar.j = C4529c.a(b(scopes, c2813ao0));
        AbstractC5395ms1 abstractC5395ms1 = request.d;
        Long lValueOf = abstractC5395ms1 != null ? Long.valueOf(abstractC5395ms1.a()) : null;
        a aVar = new a(oVar);
        if (lValueOf != null && lValueOf.longValue() != -1) {
            aVar.invoke(lValueOf);
        }
        p pVar = new p();
        boolean zIsSendDefaultPii2 = scopes.p().isSendDefaultPii();
        C2813ao0 c2813ao1 = response.j;
        pVar.d = zIsSendDefaultPii2 ? c2813ao1.b("Set-Cookie") : null;
        pVar.e = C4529c.a(b(scopes, c2813ao1));
        pVar.g = Integer.valueOf(response.h);
        AbstractC1091Gt1 abstractC1091Gt1 = response.k;
        Long lValueOf2 = abstractC1091Gt1 != null ? Long.valueOf(abstractC1091Gt1.f()) : null;
        b bVar = new b(pVar);
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            bVar.invoke(lValueOf2);
        }
        eg1.h = oVar;
        eg1.e.u(pVar);
        scopes.w(eg1, c0841Do0);
    }

    public static LinkedHashMap b(InterfaceC1171Hu0 interfaceC1171Hu0, C2813ao0 c2813ao0) {
        if (!interfaceC1171Hu0.p().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = c2813ao0.size();
        for (int i = 0; i < size; i++) {
            String strC = c2813ao0.c(i);
            List<String> list = io.sentry.util.h.a;
            if (!io.sentry.util.h.a.contains(strC.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(strC, c2813ao0.f(i));
            }
        }
        return linkedHashMap;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1092Gu implements UB0 {

    @NotNull
    public final N7 a;

    public C1092Gu(@NotNull N7 cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.a = cookieJar;
    }

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) {
        AbstractC1091Gt1 abstractC1091Gt1;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1 request = chain.e;
        C4543is1.a aVarB = request.b();
        AbstractC5395ms1 abstractC5395ms1 = request.d;
        if (abstractC5395ms1 != null) {
            CY0 cy0B = abstractC5395ms1.b();
            if (cy0B != null) {
                aVarB.d("Content-Type", cy0B.a);
            }
            long jA = abstractC5395ms1.a();
            if (jA != -1) {
                aVarB.d("Content-Length", String.valueOf(jA));
                aVarB.f("Transfer-Encoding");
            } else {
                aVarB.d("Transfer-Encoding", "chunked");
                aVarB.f("Content-Length");
            }
        }
        String strA = request.a("Host");
        boolean z = false;
        C1318Jr0 url = request.a;
        if (strA == null) {
            aVarB.d("Host", C6806tc2.x(url, false));
        }
        if (request.a("Connection") == null) {
            aVarB.d("Connection", "Keep-Alive");
        }
        if (request.a("Accept-Encoding") == null && request.a("Range") == null) {
            aVarB.d("Accept-Encoding", "gzip");
            z = true;
        }
        N7 n7 = this.a;
        n7.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        C5653o60.d.getClass();
        if (request.a("User-Agent") == null) {
            aVarB.d("User-Agent", "okhttp/4.12.0");
        }
        C0857Dt1 c0857Dt1B = chain.b(aVarB.b());
        C2813ao0 c2813ao0 = c0857Dt1B.j;
        C1081Gq0.b(n7, url, c2813ao0);
        C0857Dt1.a aVarK = c0857Dt1B.k();
        Intrinsics.checkNotNullParameter(request, "request");
        aVarK.a = request;
        if (z && "gzip".equalsIgnoreCase(C0857Dt1.f(c0857Dt1B, "Content-Encoding")) && C1081Gq0.a(c0857Dt1B) && (abstractC1091Gt1 = c0857Dt1B.k) != null) {
            C6009pn0 c6009pn0 = new C6009pn0(abstractC1091Gt1.k());
            C2813ao0.a aVarD = c2813ao0.d();
            aVarD.f("Content-Encoding");
            aVarD.f("Content-Length");
            aVarK.c(aVarD.d());
            aVarK.g = new C6223qo1(C0857Dt1.f(c0857Dt1B, "Content-Type"), -1L, Cm2.e(c6009pn0));
        }
        return aVarK.a();
    }
}

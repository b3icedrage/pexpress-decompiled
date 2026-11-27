package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5157ll implements UB0 {

    @NotNull
    public static final Regex a;

    static {
        EnumC4537iq1[] elements = {EnumC4537iq1.IGNORE_CASE, EnumC4537iq1.DOT_MATCHES_ALL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = new Regex(C1526Mj.H(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [long] */
    /* JADX WARN: Type inference failed for: r8v5, types: [xq0] */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws IOException {
        C7698xq0 c7698xq0;
        String strL;
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        ArrayList arrayList;
        Iterator it;
        int i;
        C6367rX0 c6367rX0B;
        List<String> listA;
        String str;
        String string;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1 c4543is1 = chain.e;
        C1078Gp0 c1078Gp0 = (C1078Gp0) c4543is1.c(C1078Gp0.class);
        K90 k90 = chain.d;
        if (c1078Gp0 != null) {
            int iL = (int) b.l(c1078Gp0.a);
            TimeUnit unit = TimeUnit.MILLISECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            if (k90 != null) {
                throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
            }
            C5593no1 c5593no1A = C5593no1.a(chain, 0, null, null, C6806tc2.b("connectTimeout", iL, unit), 0, 0, 55);
            long j = c1078Gp0.b;
            int iL2 = (int) b.l(j);
            Intrinsics.checkNotNullParameter(unit, "unit");
            if (c5593no1A.d != null) {
                throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
            }
            C5593no1 c5593no1A2 = C5593no1.a(c5593no1A, 0, null, null, 0, C6806tc2.b("readTimeout", iL2, unit), 0, 47);
            int iL3 = (int) b.l(j);
            Intrinsics.checkNotNullParameter(unit, "unit");
            if (c5593no1A2.d == null) {
                return C5593no1.a(c5593no1A2, 0, null, null, 0, 0, C6806tc2.b("writeTimeout", iL3, unit), 31).b(c4543is1);
            }
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
        }
        C7698xq0 c7698xq1 = (C7698xq0) c4543is1.c(C7698xq0.class);
        if (c7698xq1 == null) {
            return chain.b(c4543is1);
        }
        long jNanoTime = System.nanoTime();
        Pair pair5 = new Pair("method", c4543is1.b);
        C1318Jr0 c1318Jr0 = c4543is1.a;
        Pair pair6 = new Pair("domain", c1318Jr0.d);
        Regex regex = C6650sr0.a;
        c7698xq1.c(PW0.e(pair5, pair6, new Pair(ImagesContract.URL, C6650sr0.a(c1318Jr0.i)), new Pair("request_id", c4543is1.a("X-Request-Id"))));
        try {
            long j2 = c7698xq1.a;
            c7698xq0 = c7698xq1.b;
            int iL4 = (int) b.l(j2);
            TimeUnit unit2 = TimeUnit.MILLISECONDS;
            Intrinsics.checkNotNullParameter(unit2, "unit");
            try {
                if (k90 != null) {
                    throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
                }
                c7698xq0 = c7698xq1;
                try {
                    C5593no1 c5593no1A3 = C5593no1.a(chain, 0, null, null, C6806tc2.b("connectTimeout", iL4, unit2), 0, 0, 55);
                    int iL5 = (int) b.l(c7698xq0);
                    Intrinsics.checkNotNullParameter(unit2, "unit");
                    if (c5593no1A3.d != null) {
                        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
                    }
                    C5593no1 c5593no1A4 = C5593no1.a(c5593no1A3, 0, null, null, 0, C6806tc2.b("readTimeout", iL5, unit2), 0, 47);
                    int iL6 = (int) b.l(c7698xq0);
                    Intrinsics.checkNotNullParameter(unit2, "unit");
                    if (c5593no1A4.d != null) {
                        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
                    }
                    C0857Dt1 c0857Dt1B = C5593no1.a(c5593no1A4, 0, null, null, 0, 0, C6806tc2.b("writeTimeout", iL6, unit2), 31).b(c4543is1);
                    c7698xq0.b(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime)), "duration_ms");
                    List listP = JH1.p(FH1.e(c0857Dt1B, new C4947kl(0)));
                    Intrinsics.checkNotNullParameter(listP, "<this>");
                    C3460du1 c3460du1 = new C3460du1(listP);
                    try {
                        strL = c0857Dt1B.l(2048L).l();
                        while (true) {
                            ListIterator<T> listIterator = ((C3460du1.a) it).d;
                            if (!listIterator.hasPrevious()) {
                                String strJ = CollectionsKt.J(arrayList, ",", null, null, null, 62);
                                if (strJ.length() == 0) {
                                    strJ = DevicePublicKeyStringDef.NONE;
                                }
                                c7698xq0.c(PW0.e(pair, pair2, pair3, pair4, new Pair("session_cookie_hops", strJ), new Pair("html_title", (strL == null || (c6367rX0B = Regex.b(a, strL)) == null || (listA = c6367rX0B.a()) == null || (str = (String) ((C6367rX0.a) listA).get(1)) == null || (string = StringsKt.d0(str).toString()) == null) ? null : KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, string)), new Pair("body_head", strL != null ? C6650sr0.a(strL) : null)));
                                return c0857Dt1B;
                            }
                            Object objPrevious = listIterator.previous();
                            int i2 = i + 1;
                            if (i < 0) {
                                WE.l();
                                throw null;
                            }
                            C0857Dt1 c0857Dt1 = (C0857Dt1) objPrevious;
                            Integer numValueOf = Integer.valueOf(i);
                            c0857Dt1.getClass();
                            Intrinsics.checkNotNullParameter("set-cookie", AppMeasurementSdk.ConditionalUserProperty.NAME);
                            List<String> listH = c0857Dt1.j.h("set-cookie");
                            if (listH == null || !listH.isEmpty()) {
                                Iterator<T> it2 = listH.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        numValueOf = null;
                                    } else if (d.o((String) it2.next(), "ci_session=", false)) {
                                    }
                                }
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList.add(numValueOf);
                            }
                            i = i2;
                        }
                    } catch (IOException unused) {
                        strL = null;
                    }
                    pair = new Pair("status", Integer.valueOf(c0857Dt1B.h));
                    C1318Jr0 c1318Jr1 = c0857Dt1B.d.a;
                    Regex regex2 = C6650sr0.a;
                    pair2 = new Pair("final_url", C6650sr0.a(c1318Jr1.i));
                    List listB = CollectionsKt.B(c3460du1);
                    List list = !listB.isEmpty() ? listB : null;
                    pair3 = new Pair("redirects", list != null ? CollectionsKt.J(list, " -> ", null, null, new C2222Vg(this, 1), 30) : null);
                    pair4 = new Pair("content_type", C0857Dt1.f(c0857Dt1B, "Content-Type"));
                    arrayList = new ArrayList();
                    it = c3460du1.iterator();
                    i = 0;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            c7698xq0 = c7698xq1;
        }
        c7698xq0.b(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime)), "duration_ms");
        String simpleName = e.getClass().getSimpleName();
        String message = e.getMessage();
        if (message == null) {
            message = "";
        }
        c7698xq0.b(KS1.B(300, simpleName + ": " + message), "io_error");
        throw e;
    }
}

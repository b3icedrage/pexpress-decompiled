package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class W31 extends AbstractC2775ai implements EI1 {
    public static final C6170qb l = C6170qb.d();
    public final List<C5760od1> d;
    public final GaugeManager e;
    public final C2872b52 g;
    public final V31.a h;
    public final WeakReference<EI1> i;
    public String j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public W31(C2872b52 c2872b52) {
        C2567Zh c2567ZhA = C2567Zh.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(c2567ZhA);
        this.h = V31.c0();
        this.i = new WeakReference<>(this);
        this.g = c2872b52;
        this.e = gaugeManager;
        this.d = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // defpackage.EI1
    public final void a(C5760od1 c5760od1) {
        if (c5760od1 == null) {
            l.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        V31.a aVar = this.h;
        if (!((V31) aVar.e).U() || ((V31) aVar.e).a0()) {
            return;
        }
        this.d.add(c5760od1);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.i);
        unregisterForAppState();
        synchronized (this.d) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5760od1 c5760od1 : this.d) {
                    if (c5760od1 != null) {
                        arrayList.add(c5760od1);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        C5970pd1[] c5970pd1ArrB = C5760od1.b(listUnmodifiableList);
        if (c5970pd1ArrB != null) {
            V31.a aVar = this.h;
            List listAsList = Arrays.asList(c5970pd1ArrB);
            aVar.p();
            V31.F((V31) aVar.e, listAsList);
        }
        final V31 v31N = this.h.n();
        String str = this.j;
        if (str == null) {
            Pattern pattern = X31.a;
        } else if (X31.a.matcher(str).matches()) {
            l.a();
            return;
        }
        if (this.k) {
            return;
        }
        final C2872b52 c2872b52 = this.g;
        final EnumC1134Hi appState = getAppState();
        c2872b52.m.execute(new Runnable() { // from class: a52
            @Override // java.lang.Runnable
            public final void run() {
                C2872b52 c2872b53 = c2872b52;
                c2872b53.getClass();
                C5127ld1.a aVarC = C5127ld1.C();
                aVarC.p();
                C5127ld1.z((C5127ld1) aVarC.e, v31N);
                c2872b53.d(aVarC, appState);
            }
        });
        this.k = true;
    }

    public final void c(String str) {
        V31.c cVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    cVar = V31.c.OPTIONS;
                    break;
                case "GET":
                    cVar = V31.c.GET;
                    break;
                case "PUT":
                    cVar = V31.c.PUT;
                    break;
                case "HEAD":
                    cVar = V31.c.HEAD;
                    break;
                case "POST":
                    cVar = V31.c.POST;
                    break;
                case "PATCH":
                    cVar = V31.c.PATCH;
                    break;
                case "TRACE":
                    cVar = V31.c.TRACE;
                    break;
                case "CONNECT":
                    cVar = V31.c.CONNECT;
                    break;
                case "DELETE":
                    cVar = V31.c.DELETE;
                    break;
                default:
                    cVar = V31.c.HTTP_METHOD_UNKNOWN;
                    break;
            }
            V31.a aVar = this.h;
            aVar.p();
            V31.G((V31) aVar.e, cVar);
        }
    }

    public final void d(int i) {
        V31.a aVar = this.h;
        aVar.p();
        V31.y((V31) aVar.e, i);
    }

    public final void e(long j) {
        V31.a aVar = this.h;
        aVar.p();
        V31.H((V31) aVar.e, j);
    }

    public final void f(long j) {
        C5760od1 c5760od1PerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.i);
        V31.a aVar = this.h;
        aVar.p();
        V31.B((V31) aVar.e, j);
        a(c5760od1PerfSession);
        if (c5760od1PerfSession.g) {
            this.e.collectGaugeMetricOnce(c5760od1PerfSession.e);
        }
    }

    public final void g(String str) {
        V31.a aVar = this.h;
        if (str == null) {
            aVar.p();
            V31.A((V31) aVar.e);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            aVar.p();
            V31.z((V31) aVar.e, str);
            return;
        }
        l.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j) {
        V31.a aVar = this.h;
        aVar.p();
        V31.I((V31) aVar.e, j);
    }

    public final void i(long j) {
        V31.a aVar = this.h;
        aVar.p();
        V31.E((V31) aVar.e, j);
        if (SessionManager.getInstance().perfSession().g) {
            this.e.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e);
        }
    }

    public final void j(String str) {
        C1318Jr0 c1318Jr0A;
        int iLastIndexOf;
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C1318Jr0 c1318Jr0A2 = null;
            try {
                Intrinsics.checkNotNullParameter(str, "<this>");
                C1318Jr0.a aVar = new C1318Jr0.a();
                aVar.e(null, str);
                c1318Jr0A = aVar.a();
            } catch (IllegalArgumentException unused) {
                c1318Jr0A = null;
            }
            if (c1318Jr0A != null) {
                C1318Jr0.a aVarF = c1318Jr0A.f();
                Intrinsics.checkNotNullParameter("", "username");
                aVarF.b = C1318Jr0.b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
                Intrinsics.checkNotNullParameter("", "password");
                aVarF.c = C1318Jr0.b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
                aVarF.g = null;
                aVarF.h = null;
                str = aVarF.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) == '/') {
                    str = str.substring(0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                } else {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    try {
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        C1318Jr0.a aVar2 = new C1318Jr0.a();
                        aVar2.e(null, str);
                        c1318Jr0A2 = aVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (c1318Jr0A2 != null && c1318Jr0A2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                }
            }
            V31.a aVar3 = this.h;
            aVar3.p();
            V31.w((V31) aVar3.e, str);
        }
    }
}

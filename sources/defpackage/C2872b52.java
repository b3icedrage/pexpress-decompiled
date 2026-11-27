package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: b52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2872b52 implements C2567Zh.b {
    public static final C6170qb v = C6170qb.d();
    public static final C2872b52 w = new C2872b52();
    public final ConcurrentHashMap d;
    public C1198Id0 h;
    public C4710je0 i;
    public InterfaceC2400Xd0 j;
    public InterfaceC1612Nk1<W42> k;
    public C2988bf0 l;
    public Context n;
    public C8002zI o;
    public C7055um1 p;
    public C2567Zh q;
    public C0822Di.a r;
    public String s;
    public String t;
    public final ConcurrentLinkedQueue<C2981bd1> e = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public boolean u = false;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    public C2872b52() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(InterfaceC5340md1 interfaceC5340md1) {
        if (interfaceC5340md1.h()) {
            I02 i02I = interfaceC5340md1.i();
            long jK = i02I.K();
            Locale locale = Locale.ENGLISH;
            return C4694ja0.a("trace metric: ", i02I.L(), " (duration: ", new DecimalFormat("#.####").format(jK / 1000.0d), "ms)");
        }
        if (interfaceC5340md1.j()) {
            V31 v31K = interfaceC5340md1.k();
            long jR = v31K.a0() ? v31K.R() : 0L;
            String strValueOf = v31K.W() ? String.valueOf(v31K.M()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return C5807oq.b(C5896pG.a("network request trace: ", v31K.T(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jR / 1000.0d), "ms)");
        }
        if (!interfaceC5340md1.g()) {
            return "log";
        }
        C6416rk0 c6416rk0M = interfaceC5340md1.m();
        Locale locale3 = Locale.ENGLISH;
        boolean zE = c6416rk0M.E();
        int iB = c6416rk0M.B();
        int iA = c6416rk0M.A();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zE);
        sb.append(", cpuGaugeCount: ");
        sb.append(iB);
        sb.append(", memoryGaugeCount: ");
        return SK.b(sb, iA, ")");
    }

    public final void b(C5127ld1 c5127ld1) {
        if (c5127ld1.h()) {
            this.q.b("_fstec");
        } else if (c5127ld1.j()) {
            this.q.b("_fsntc");
        }
    }

    public final void c(I02 i02, EnumC1134Hi enumC1134Hi) {
        this.m.execute(new RunnableC3793fW(this, i02, enumC1134Hi, 1));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02db  */
    /* JADX WARN: Code duplicated, block: B:135:0x0333  */
    /* JADX WARN: Code duplicated, block: B:140:0x036d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0377  */
    /* JADX WARN: Code duplicated, block: B:145:0x0392  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x03be A[Catch: all -> 0x03c6, TryCatch #1 {all -> 0x03c6, blocks: (B:158:0x03ba, B:160:0x03be, B:163:0x03c9), top: B:226:0x03ba }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:170:0x0409  */
    /* JADX WARN: Code duplicated, block: B:172:0x0413  */
    /* JADX WARN: Code duplicated, block: B:178:0x0434  */
    /* JADX WARN: Code duplicated, block: B:180:0x0442  */
    /* JADX WARN: Code duplicated, block: B:185:0x0463  */
    /* JADX WARN: Code duplicated, block: B:192:0x048e  */
    /* JADX WARN: Code duplicated, block: B:197:0x049c  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:211:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:213:0x050f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0524  */
    /* JADX WARN: Code duplicated, block: B:218:0x052e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0544  */
    /* JADX WARN: Code duplicated, block: B:222:0x054d  */
    /* JADX WARN: Code duplicated, block: B:223:0x055f  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    public final void d(C5127ld1.a aVar, EnumC1134Hi enumC1134Hi) {
        C7055um1 c7055um1;
        boolean z;
        boolean zB;
        C8002zI c8002zI;
        WI wi;
        C2745aa1<Float> c2745aa1;
        C2745aa1<Float> c2745aa1B;
        SI si;
        C2745aa1<Float> c2745aa2;
        C2745aa1<Float> c2745aa1B2;
        float fFloatValue;
        C4384iJ c4384iJ;
        float fFloatValue2;
        boolean zH;
        C6170qb c6170qb;
        C2988bf0 c2988bf0;
        T42<C5127ld1> t42;
        C6170qb c6170qb2;
        T42<C5127ld1> t43;
        W42 w42;
        String strL;
        String strC;
        String str;
        boolean z2 = true;
        if (!this.g.get()) {
            ConcurrentHashMap concurrentHashMap = this.d;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (aVar.h() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (aVar.j() && iIntValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!aVar.g() || iIntValue3 <= 0) {
                    v.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(aVar), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            v.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(aVar));
            this.e.add(new C2981bd1(aVar, enumC1134Hi));
            return;
        }
        C6170qb c6170qb3 = v;
        if (this.o.o() && (!((C0822Di) this.r.e).E() || this.u)) {
            try {
                str = (String) Tasks.await(this.j.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                c6170qb3.c("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str = null;
            } catch (ExecutionException e2) {
                c6170qb3.c("Unable to retrieve Installation Id: %s", e2.getMessage());
                str = null;
            } catch (TimeoutException e3) {
                c6170qb3.c("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                c6170qb3.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                C0822Di.a aVar2 = this.r;
                aVar2.p();
                C0822Di.z((C0822Di) aVar2.e, str);
            }
        }
        C0822Di.a aVar3 = this.r;
        aVar3.p();
        C0822Di.x((C0822Di) aVar3.e, enumC1134Hi);
        if (aVar.h() || aVar.j()) {
            AbstractC0595Ak0.a aVar4 = (AbstractC0595Ak0.a) aVar3.d.q(AbstractC0595Ak0.e.i);
            C0822Di c0822DiO = aVar3.o();
            aVar4.p();
            AbstractC0595Ak0.a.r(aVar4.e, c0822DiO);
            aVar3 = (C0822Di.a) aVar4;
            if (this.i == null && this.g.get()) {
                C6170qb c6170qb4 = C4710je0.e;
                this.i = (C4710je0) C1198Id0.c().b(C4710je0.class);
            }
            C4710je0 c4710je0 = this.i;
            Object map = c4710je0 != null ? new HashMap(c4710je0.a) : Collections.EMPTY_MAP;
            aVar3.p();
            C0822Di.y((C0822Di) aVar3.e).putAll(map);
        }
        aVar.p();
        C5127ld1.w((C5127ld1) aVar.e, aVar3.n());
        C5127ld1 c5127ld1N = aVar.n();
        if (!this.o.o()) {
            v.e("Performance collection is not enabled, dropping %s", a(c5127ld1N));
        } else if (c5127ld1N.A().E()) {
            Context context = this.n;
            ArrayList arrayList = new ArrayList();
            if (c5127ld1N.h()) {
                arrayList.add(new C4452ie0(c5127ld1N.i()));
            }
            if (c5127ld1N.j()) {
                arrayList.add(new C4032ge0(c5127ld1N.k(), context));
            }
            if (c5127ld1N.B()) {
                arrayList.add(new C3403de0(c5127ld1N.A()));
            }
            if (c5127ld1N.g()) {
                arrayList.add(new C3822fe0(c5127ld1N.m()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        C7055um1 c7055um2 = this.p;
                        c7055um2.getClass();
                        float fFloatValue3 = 1.0f;
                        if (c5127ld1N.h()) {
                            C8002zI c8002zI2 = c7055um2.a;
                            c8002zI2.getClass();
                            synchronized (C4384iJ.class) {
                                try {
                                    if (C4384iJ.e == null) {
                                        C4384iJ.e = new C4384iJ();
                                    }
                                    c4384iJ = C4384iJ.e;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            RemoteConfigManager remoteConfigManager = c8002zI2.a;
                            c4384iJ.getClass();
                            C2745aa1<Float> c2745aa3 = remoteConfigManager.getFloat("fpr_vc_trace_sampling_rate");
                            if (c2745aa3.b() && C8002zI.p(c2745aa3.a().floatValue())) {
                                c8002zI2.c.d("com.google.firebase.perf.TraceSamplingRate", c2745aa3.a().floatValue());
                                fFloatValue2 = c2745aa3.a().floatValue();
                            } else {
                                C2745aa1<Float> c2745aa1B3 = c8002zI2.b(c4384iJ);
                                fFloatValue2 = (c2745aa1B3.b() && C8002zI.p(c2745aa1B3.a().floatValue())) ? c2745aa1B3.a().floatValue() : 1.0f;
                            }
                            if (c7055um2.b >= fFloatValue2 && !C7055um1.a(c5127ld1N.i().M())) {
                                b(c5127ld1N);
                                v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                            } else if (!c5127ld1N.h() && c5127ld1N.i().L().startsWith("_st_") && c5127ld1N.i().F()) {
                                C8002zI c8002zI3 = c7055um2.a;
                                c8002zI3.getClass();
                                synchronized (SI.class) {
                                    try {
                                        if (SI.e == null) {
                                            SI.e = new SI();
                                        }
                                        si = SI.e;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C2745aa1<Float> c2745aa1I = c8002zI3.i(si);
                                if (c2745aa1I.b()) {
                                    fFloatValue = c2745aa1I.a().floatValue() / 100.0f;
                                    if (!C8002zI.p(fFloatValue)) {
                                        c2745aa2 = c8002zI3.a.getFloat("fpr_vc_fragment_sampling_rate");
                                        if (c2745aa2.b() || !C8002zI.p(c2745aa2.a().floatValue())) {
                                            c2745aa1B2 = c8002zI3.b(si);
                                            if (c2745aa1B2.b() || !C8002zI.p(c2745aa1B2.a().floatValue())) {
                                                fFloatValue = 0.0f;
                                            } else {
                                                fFloatValue = c2745aa1B2.a().floatValue();
                                            }
                                        } else {
                                            c8002zI3.c.d("com.google.firebase.perf.FragmentSamplingRate", c2745aa2.a().floatValue());
                                            fFloatValue = c2745aa2.a().floatValue();
                                        }
                                    }
                                } else {
                                    c2745aa2 = c8002zI3.a.getFloat("fpr_vc_fragment_sampling_rate");
                                    if (c2745aa2.b()) {
                                        c2745aa1B2 = c8002zI3.b(si);
                                        if (c2745aa1B2.b()) {
                                            fFloatValue = 0.0f;
                                        } else {
                                            fFloatValue = 0.0f;
                                        }
                                    } else {
                                        c2745aa1B2 = c8002zI3.b(si);
                                        if (c2745aa1B2.b()) {
                                            fFloatValue = 0.0f;
                                        } else {
                                            fFloatValue = 0.0f;
                                        }
                                    }
                                }
                                if (c7055um2.c >= fFloatValue && !C7055um1.a(c5127ld1N.i().M())) {
                                    b(c5127ld1N);
                                    v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                                } else {
                                    if (c5127ld1N.j()) {
                                        c8002zI = c7055um2.a;
                                        c8002zI.getClass();
                                        synchronized (WI.class) {
                                            if (WI.e == null) {
                                                WI.e = new WI();
                                            }
                                            wi = WI.e;
                                            RemoteConfigManager remoteConfigManager2 = c8002zI.a;
                                            wi.getClass();
                                            c2745aa1 = remoteConfigManager2.getFloat("fpr_vc_network_request_sampling_rate");
                                            if (c2745aa1.b()) {
                                                c2745aa1B = c8002zI.b(wi);
                                                if (c2745aa1B.b()) {
                                                    fFloatValue3 = c2745aa1B.a().floatValue();
                                                }
                                            } else {
                                                c2745aa1B = c8002zI.b(wi);
                                                if (c2745aa1B.b()) {
                                                    fFloatValue3 = c2745aa1B.a().floatValue();
                                                }
                                            }
                                            if (c7055um2.b >= fFloatValue3) {
                                                b(c5127ld1N);
                                                v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                                            }
                                        }
                                    }
                                    c7055um1 = this.p;
                                    c7055um1.getClass();
                                    if (c5127ld1N.h()) {
                                        if (c5127ld1N.j()) {
                                            zB = c7055um1.e.b();
                                        } else if (c5127ld1N.h()) {
                                            zB = c7055um1.d.b();
                                        } else {
                                            z = true;
                                        }
                                        z = !zB;
                                    } else {
                                        if (c5127ld1N.j()) {
                                            zB = c7055um1.e.b();
                                        } else if (c5127ld1N.h()) {
                                            zB = c7055um1.d.b();
                                        } else {
                                            z = true;
                                        }
                                        z = !zB;
                                    }
                                    if (z) {
                                        b(c5127ld1N);
                                        v.e("Rate limited (per device) - %s", a(c5127ld1N));
                                    }
                                }
                            } else {
                                if (c5127ld1N.j()) {
                                    c8002zI = c7055um2.a;
                                    c8002zI.getClass();
                                    synchronized (WI.class) {
                                        try {
                                            if (WI.e == null) {
                                                WI.e = new WI();
                                            }
                                            wi = WI.e;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    RemoteConfigManager remoteConfigManager3 = c8002zI.a;
                                    wi.getClass();
                                    c2745aa1 = remoteConfigManager3.getFloat("fpr_vc_network_request_sampling_rate");
                                    if (c2745aa1.b() || !C8002zI.p(c2745aa1.a().floatValue())) {
                                        c2745aa1B = c8002zI.b(wi);
                                        if (c2745aa1B.b() && C8002zI.p(c2745aa1B.a().floatValue())) {
                                            fFloatValue3 = c2745aa1B.a().floatValue();
                                        }
                                    } else {
                                        c8002zI.c.d("com.google.firebase.perf.NetworkRequestSamplingRate", c2745aa1.a().floatValue());
                                        fFloatValue3 = c2745aa1.a().floatValue();
                                    }
                                    if (c7055um2.b >= fFloatValue3 && !C7055um1.a(c5127ld1N.k().N())) {
                                        b(c5127ld1N);
                                        v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                                    }
                                }
                                c7055um1 = this.p;
                                c7055um1.getClass();
                                if ((c5127ld1N.h() || (!(c5127ld1N.i().L().equals("_fs") || c5127ld1N.i().L().equals("_bs")) || c5127ld1N.i().G() <= 0)) && !c5127ld1N.g()) {
                                    if (c5127ld1N.j()) {
                                        zB = c7055um1.e.b();
                                    } else if (c5127ld1N.h()) {
                                        zB = c7055um1.d.b();
                                    } else {
                                        z = true;
                                    }
                                    z = !zB;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    b(c5127ld1N);
                                    v.e("Rate limited (per device) - %s", a(c5127ld1N));
                                }
                            }
                        } else if (!c5127ld1N.h()) {
                            if (c5127ld1N.j()) {
                                c8002zI = c7055um2.a;
                                c8002zI.getClass();
                                synchronized (WI.class) {
                                    if (WI.e == null) {
                                        WI.e = new WI();
                                    }
                                    wi = WI.e;
                                    RemoteConfigManager remoteConfigManager4 = c8002zI.a;
                                    wi.getClass();
                                    c2745aa1 = remoteConfigManager4.getFloat("fpr_vc_network_request_sampling_rate");
                                    if (c2745aa1.b()) {
                                        c2745aa1B = c8002zI.b(wi);
                                        if (c2745aa1B.b()) {
                                            fFloatValue3 = c2745aa1B.a().floatValue();
                                        }
                                    } else {
                                        c2745aa1B = c8002zI.b(wi);
                                        if (c2745aa1B.b()) {
                                            fFloatValue3 = c2745aa1B.a().floatValue();
                                        }
                                    }
                                    if (c7055um2.b >= fFloatValue3) {
                                        b(c5127ld1N);
                                        v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                                    }
                                }
                            }
                            c7055um1 = this.p;
                            c7055um1.getClass();
                            if (c5127ld1N.h()) {
                                if (c5127ld1N.j()) {
                                    zB = c7055um1.e.b();
                                } else if (c5127ld1N.h()) {
                                    zB = c7055um1.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            } else {
                                if (c5127ld1N.j()) {
                                    zB = c7055um1.e.b();
                                } else if (c5127ld1N.h()) {
                                    zB = c7055um1.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            }
                            if (z) {
                                b(c5127ld1N);
                                v.e("Rate limited (per device) - %s", a(c5127ld1N));
                            }
                        } else {
                            if (c5127ld1N.j()) {
                                c8002zI = c7055um2.a;
                                c8002zI.getClass();
                                synchronized (WI.class) {
                                    if (WI.e == null) {
                                        WI.e = new WI();
                                    }
                                    wi = WI.e;
                                    RemoteConfigManager remoteConfigManager5 = c8002zI.a;
                                    wi.getClass();
                                    c2745aa1 = remoteConfigManager5.getFloat("fpr_vc_network_request_sampling_rate");
                                    if (c2745aa1.b()) {
                                        c2745aa1B = c8002zI.b(wi);
                                        if (c2745aa1B.b()) {
                                            fFloatValue3 = c2745aa1B.a().floatValue();
                                        }
                                    } else {
                                        c2745aa1B = c8002zI.b(wi);
                                        if (c2745aa1B.b()) {
                                            fFloatValue3 = c2745aa1B.a().floatValue();
                                        }
                                    }
                                    if (c7055um2.b >= fFloatValue3) {
                                        b(c5127ld1N);
                                        v.e("Event dropped due to device sampling - %s", a(c5127ld1N));
                                    }
                                }
                            }
                            c7055um1 = this.p;
                            c7055um1.getClass();
                            if (c5127ld1N.h()) {
                                if (c5127ld1N.j()) {
                                    zB = c7055um1.e.b();
                                } else if (c5127ld1N.h()) {
                                    zB = c7055um1.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            } else {
                                if (c5127ld1N.j()) {
                                    zB = c7055um1.e.b();
                                } else if (c5127ld1N.h()) {
                                    zB = c7055um1.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            }
                            if (z) {
                                b(c5127ld1N);
                                v.e("Rate limited (per device) - %s", a(c5127ld1N));
                            }
                        }
                    } else if (!((AbstractC5550nd1) it.next()).a()) {
                    }
                    if (z2) {
                        zH = c5127ld1N.h();
                        c6170qb = v;
                        if (zH) {
                            String strA = a(c5127ld1N);
                            strL = c5127ld1N.i().L();
                            if (strL.startsWith("_st_")) {
                                strC = ID.c(LE.h(this.t, this.s), "/troubleshooting/trace/SCREEN_TRACE/", strL, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            } else {
                                strC = ID.c(LE.h(this.t, this.s), "/troubleshooting/trace/DURATION_TRACE/", strL, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            }
                            c6170qb.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA, strC);
                        } else {
                            c6170qb.e("Logging %s", a(c5127ld1N));
                        }
                        c2988bf0 = this.l;
                        t42 = c2988bf0.c;
                        c6170qb2 = C2988bf0.d;
                        if (t42 == null) {
                            w42 = c2988bf0.b.get();
                            if (w42 != null) {
                                c2988bf0.c = w42.a(c2988bf0.a, new H60("proto"), new C1039Gc0(5));
                            } else {
                                c6170qb2.f("Flg TransportFactory is not available at the moment");
                            }
                        }
                        t43 = c2988bf0.c;
                        if (t43 != null) {
                            ((Y42) t43).a(new C6850to(c5127ld1N, EnumC6825th1.d), new C0663Bh());
                        } else {
                            c6170qb2.f("Unable to dispatch event because Flg Transport is not available");
                        }
                        SessionManager.getInstance().updatePerfSessionIfExpired();
                    }
                }
            }
            C6170qb.d().a();
            v.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(c5127ld1N));
        } else {
            v.g("App Instance ID is null or empty, dropping %s", a(c5127ld1N));
        }
        z2 = false;
        if (z2) {
            zH = c5127ld1N.h();
            c6170qb = v;
            if (zH) {
                String strA2 = a(c5127ld1N);
                strL = c5127ld1N.i().L();
                if (strL.startsWith("_st_")) {
                    strC = ID.c(LE.h(this.t, this.s), "/troubleshooting/trace/SCREEN_TRACE/", strL, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                } else {
                    strC = ID.c(LE.h(this.t, this.s), "/troubleshooting/trace/DURATION_TRACE/", strL, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                }
                c6170qb.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA2, strC);
            } else {
                c6170qb.e("Logging %s", a(c5127ld1N));
            }
            c2988bf0 = this.l;
            t42 = c2988bf0.c;
            c6170qb2 = C2988bf0.d;
            if (t42 == null) {
                w42 = c2988bf0.b.get();
                if (w42 != null) {
                    c2988bf0.c = w42.a(c2988bf0.a, new H60("proto"), new C1039Gc0(5));
                } else {
                    c6170qb2.f("Flg TransportFactory is not available at the moment");
                }
            }
            t43 = c2988bf0.c;
            if (t43 != null) {
                ((Y42) t43).a(new C6850to(c5127ld1N, EnumC6825th1.d), new C0663Bh());
            } else {
                c6170qb2.f("Unable to dispatch event because Flg Transport is not available");
            }
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    @Override // defpackage.C2567Zh.b
    public final void onUpdateAppState(EnumC1134Hi enumC1134Hi) {
        this.u = enumC1134Hi == EnumC1134Hi.FOREGROUND;
        if (this.g.get()) {
            this.m.execute(new RunnableC2136Ud0(this, 2));
        }
    }
}

package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.AbstractC2775ai;
import defpackage.AbstractC5550nd1;
import defpackage.C1039Gc0;
import defpackage.C1742Pc;
import defpackage.C2567Zh;
import defpackage.C2707aO;
import defpackage.C2872b52;
import defpackage.C5207m;
import defpackage.C5760od1;
import defpackage.C5807oq;
import defpackage.C6170qb;
import defpackage.C8002zI;
import defpackage.EI1;
import defpackage.J02;
import defpackage.QZ1;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class Trace extends AbstractC2775ai implements Parcelable, EI1 {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final C6170qb q = C6170qb.d();
    public final WeakReference<EI1> d;
    public final Trace e;
    public final GaugeManager g;
    public final String h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final List<C5760od1> k;
    public final ArrayList l;
    public final C2872b52 m;
    public final C5207m n;
    public QZ1 o;
    public QZ1 p;

    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(@NonNull String str, @NonNull C2872b52 c2872b52, @NonNull C5207m c5207m, @NonNull C2567Zh c2567Zh) {
        super(c2567Zh);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.d = new WeakReference<>(this);
        this.e = null;
        this.h = str.trim();
        this.l = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.n = c5207m;
        this.m = c2872b52;
        this.k = Collections.synchronizedList(new ArrayList());
        this.g = gaugeManager;
    }

    @Override // defpackage.EI1
    public final void a(C5760od1 c5760od1) {
        if (c5760od1 == null) {
            q.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.o == null || c()) {
                return;
            }
            this.k.add(c5760od1);
        }
    }

    public final void b(@NonNull String str, @NonNull String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(C5807oq.b(new StringBuilder("Trace '"), this.h, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            AbstractC5550nd1.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    @VisibleForTesting
    public final boolean c() {
        return this.p != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.o != null) && !c()) {
                q.g("Trace '%s' is started but not stopped when it is destructed!", this.h);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.j.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.j);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        C2707aO c2707aO = str != null ? (C2707aO) this.i.get(str.trim()) : null;
        if (c2707aO == null) {
            return 0L;
        }
        return c2707aO.e.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String strC = AbstractC5550nd1.c(str);
        C6170qb c6170qb = q;
        if (strC != null) {
            c6170qb.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z = this.o != null;
        String str2 = this.h;
        if (!z) {
            c6170qb.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            c6170qb.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.i;
        C2707aO c2707aO = (C2707aO) concurrentHashMap.get(strTrim);
        if (c2707aO == null) {
            c2707aO = new C2707aO(strTrim);
            concurrentHashMap.put(strTrim, c2707aO);
        }
        AtomicLong atomicLong = c2707aO.e;
        atomicLong.addAndGet(j);
        c6170qb.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        C6170qb c6170qb = q;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            c6170qb.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.h);
            z = true;
        } catch (Exception e) {
            c6170qb.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.j.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String strC = AbstractC5550nd1.c(str);
        C6170qb c6170qb = q;
        if (strC != null) {
            c6170qb.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        boolean z = this.o != null;
        String str2 = this.h;
        if (!z) {
            c6170qb.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            c6170qb.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.i;
        C2707aO c2707aO = (C2707aO) concurrentHashMap.get(strTrim);
        if (c2707aO == null) {
            c2707aO = new C2707aO(strTrim);
            concurrentHashMap.put(strTrim, c2707aO);
        }
        c2707aO.e.set(j);
        c6170qb.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!c()) {
            this.j.remove(str);
            return;
        }
        C6170qb c6170qb = q;
        if (c6170qb.b) {
            c6170qb.a.getClass();
            b0.c("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    @Keep
    public void start() {
        String str;
        String str2;
        boolean zO = C8002zI.e().o();
        C6170qb c6170qb = q;
        if (!zO) {
            c6170qb.a();
            return;
        }
        String str3 = this.h;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] iArrH = C1039Gc0.h(6);
            int length = iArrH.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrH[i]) {
                        case 1:
                            str2 = "_as";
                            break;
                        case 2:
                            str2 = "_astui";
                            break;
                        case 3:
                            str2 = "_astfd";
                            break;
                        case 4:
                            str2 = "_asti";
                            break;
                        case 5:
                            str2 = "_fs";
                            break;
                        case 6:
                            str2 = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str2.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str = "Trace name must not start with '_'";
                }
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            c6170qb.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.o != null) {
            c6170qb.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.n.getClass();
        this.o = new QZ1();
        registerForAppState();
        C5760od1 c5760od1PerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.d);
        a(c5760od1PerfSession);
        if (c5760od1PerfSession.g) {
            this.g.collectGaugeMetricOnce(c5760od1PerfSession.e);
        }
    }

    @Keep
    public void stop() {
        boolean z = this.o != null;
        String str = this.h;
        C6170qb c6170qb = q;
        if (!z) {
            c6170qb.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            c6170qb.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.d);
        unregisterForAppState();
        this.n.getClass();
        QZ1 qz1 = new QZ1();
        this.p = qz1;
        if (this.e == null) {
            ArrayList arrayList = this.l;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) C1742Pc.c(1, arrayList);
                if (trace.p == null) {
                    trace.p = qz1;
                }
            }
            if (str.isEmpty()) {
                if (c6170qb.b) {
                    c6170qb.a.getClass();
                    b0.c("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.m.c(new J02(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().g) {
                this.g.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeString(this.h);
        parcel.writeList(this.l);
        parcel.writeMap(this.i);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.p, 0);
        synchronized (this.k) {
            parcel.writeList(this.k);
        }
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : C2567Zh.a());
        this.d = new WeakReference<>(this);
        this.e = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.h = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.i = concurrentHashMap;
        this.j = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, C2707aO.class.getClassLoader());
        this.o = (QZ1) parcel.readParcelable(QZ1.class.getClassLoader());
        this.p = (QZ1) parcel.readParcelable(QZ1.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.k = listSynchronizedList;
        parcel.readList(listSynchronizedList, C5760od1.class.getClassLoader());
        if (z) {
            this.m = null;
            this.n = null;
            this.g = null;
        } else {
            this.m = C2872b52.w;
            this.n = new C5207m();
            this.g = GaugeManager.getInstance();
        }
    }
}

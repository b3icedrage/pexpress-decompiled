package defpackage;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class HS0 implements InterfaceC6027pt0, InterfaceC7183vP0, InterfaceC7884yj1 {
    public String e;
    public ScheduledThreadPoolExecutor k;
    public WK0 m;
    public boolean n;
    public final BS0 o;
    public int p;
    public final ArrayList q;
    public final ConcurrentHashMap r;
    public KS0 s;
    public final C7120v52 t;
    public final int u;
    public final ArrayList v;
    public final long d = System.currentTimeMillis();
    public final C4538ir g = new C4538ir();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final C7279vr j = new C7279vr();
    public final ArrayList l = new ArrayList(1);

    public HS0() {
        i(new HashMap(), "FA_FILENAME_COLLISION_MAP");
        i(new HashMap(), "RFA_FILENAME_PATTERN_COLLISION_MAP");
        this.p = 0;
        this.q = new ArrayList();
        this.t = new C7120v52();
        this.u = 8;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.r = concurrentHashMap;
        this.s = new KS0(this);
        BS0 bs0 = new BS0("ROOT", null, this);
        this.o = bs0;
        bs0.h(C5714oP0.k);
        concurrentHashMap.put("ROOT", bs0);
        i(new HashMap(), "EVALUATOR_MAP");
        this.v = new ArrayList();
    }

    @Override // defpackage.InterfaceC7884yj1
    public final String a(String str) {
        if ("CONTEXT_NAME".equals(str)) {
            return this.e;
        }
        boolean zEqualsIgnoreCase = "HOSTNAME".equalsIgnoreCase(str);
        HashMap map = this.h;
        if (!zEqualsIgnoreCase) {
            return (String) map.get(str);
        }
        String strQ = (String) map.get("HOSTNAME");
        if (strQ == null) {
            IM im = new IM(this);
            try {
                strQ = IM.q();
            } catch (SecurityException e) {
                im.m("Failed to get local hostname", e);
                strQ = "UNKNOWN_LOCALHOST";
            } catch (SocketException e2) {
                im.m("Failed to get local hostname", e2);
                strQ = "UNKNOWN_LOCALHOST";
            } catch (UnknownHostException e3) {
                im.m("Failed to get local hostname", e3);
                strQ = "UNKNOWN_LOCALHOST";
            }
            HashMap map2 = this.h;
            if (((String) map2.get("HOSTNAME")) == null) {
                map2.put("HOSTNAME", strQ);
            }
        }
        return strQ;
    }

    public final void b(String str) {
        if (str == null || !str.equals(this.e)) {
            String str2 = this.e;
            if (str2 != null && !"default".equals(str2)) {
                throw new IllegalStateException("Context has been already given a name");
            }
            this.e = str;
        }
        this.s = new KS0(this);
    }

    public final synchronized WK0 c() {
        try {
            if (this.m == null) {
                this.m = new WK0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    @Override // defpackage.InterfaceC6027pt0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final BS0 d(String str) {
        BS0 bs0D;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if ("ROOT".equalsIgnoreCase(str)) {
            return this.o;
        }
        BS0 bs0 = this.o;
        BS0 bs1 = (BS0) this.r.get(str);
        if (bs1 != null) {
            return bs1;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(46, i);
            int iIndexOf2 = str.indexOf(36, i);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                iIndexOf = -1;
            } else if (iIndexOf == -1 || (iIndexOf2 != -1 && iIndexOf >= iIndexOf2)) {
                iIndexOf = iIndexOf2;
            }
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            int i2 = iIndexOf + 1;
            synchronized (bs0) {
                try {
                    CopyOnWriteArrayList copyOnWriteArrayList = bs0.i;
                    BS0 bs2 = null;
                    if (copyOnWriteArrayList != null) {
                        int size = copyOnWriteArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            BS0 bs3 = (BS0) bs0.i.get(i3);
                            if (strSubstring.equals(bs3.d)) {
                                bs2 = bs3;
                                break;
                            }
                        }
                    }
                    if (bs2 == null) {
                        bs0D = bs0.d(strSubstring);
                        this.r.put(strSubstring, bs0D);
                    } else {
                        bs0D = bs2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iIndexOf == -1) {
                return bs0D;
            }
            i = i2;
            bs0 = bs0D;
        }
    }

    public final synchronized ScheduledExecutorService h() {
        if (this.k == null) {
            Z90.a aVar = Z90.a;
            this.k = new ScheduledThreadPoolExecutor(8, Z90.a);
        }
        return this.k;
    }

    public final void i(Object obj, String str) {
        this.i.put(str, obj);
    }

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.n;
    }

    public final void j() {
        ArrayList<InterfaceC2939bQ1> arrayList;
        Thread thread = (Thread) this.i.get("SHUTDOWN_HOOK");
        HashMap map = this.i;
        if (thread != null) {
            map.remove("SHUTDOWN_HOOK");
            try {
                Runtime.getRuntime().removeShutdownHook(thread);
            } catch (IllegalStateException unused) {
            }
        }
        HashSet<InterfaceC7183vP0> hashSet = (HashSet) c().d;
        for (InterfaceC7183vP0 interfaceC7183vP0 : hashSet) {
            if (interfaceC7183vP0.isStarted()) {
                interfaceC7183vP0.stop();
            }
        }
        hashSet.clear();
        this.h.clear();
        map.clear();
        i(new HashMap(), "EVALUATOR_MAP");
        i(new HashMap(), "FA_FILENAME_COLLISION_MAP");
        i(new HashMap(), "RFA_FILENAME_PATTERN_COLLISION_MAP");
        this.o.g();
        C7120v52 c7120v52 = this.t;
        Iterator<AbstractC6910u52> it = c7120v52.iterator();
        while (it.hasNext()) {
            it.next().h = false;
        }
        c7120v52.clear();
        ArrayList arrayList2 = this.l;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((ScheduledFuture) it2.next()).cancel(false);
        }
        arrayList2.clear();
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            ((IS0) it3.next()).h();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<IS0> arrayList4 = this.q;
        for (IS0 is0 : arrayList4) {
            is0.getClass();
            arrayList3.add(is0);
        }
        arrayList4.retainAll(arrayList3);
        C4538ir c4538ir = this.g;
        synchronized (c4538ir.f) {
            arrayList = new ArrayList(c4538ir.e);
        }
        for (InterfaceC2939bQ1 interfaceC2939bQ1 : arrayList) {
            synchronized (c4538ir.f) {
                c4538ir.e.remove(interfaceC2939bQ1);
            }
        }
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        this.n = true;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((IS0) it.next()).getClass();
        }
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        j();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((IS0) it.next()).onStop();
        }
        this.q.clear();
        synchronized (this) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.k;
            if (scheduledThreadPoolExecutor != null) {
                Z90.a aVar = Z90.a;
                scheduledThreadPoolExecutor.shutdownNow();
                this.k = null;
            }
        }
        this.n = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HS0.class.getName());
        sb.append("[");
        return C5807oq.b(sb, this.e, "]");
    }
}

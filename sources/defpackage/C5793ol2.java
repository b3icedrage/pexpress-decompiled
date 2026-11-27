package defpackage;

import java.io.IOException;
import java.util.LinkedList;

/* JADX INFO: renamed from: ol2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5793ol2 extends AbstractC5567nh2 {
    public final LinkedList<C6822tg2> g;
    public final AbstractC4707jd1 h;
    public boolean i;
    public C6822tg2 j;
    public boolean k;

    public C5793ol2(Rf2 rf2) {
        super("WritingThread", rf2, KY1.e);
        this.g = new LinkedList<>();
        this.h = rf2.t;
    }

    @Override // defpackage.AbstractC5567nh2
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            C6193qg2 c6193qg2 = new C6193qg2(EnumC5773og2.P, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
            RQ0 rq0 = this.d.d;
            rq0.b(c6193qg2);
            rq0.f(c6193qg2);
        }
        synchronized (this) {
            this.k = true;
            notifyAll();
        }
        Rf2 rf2 = this.d;
        C6822tg2 c6822tg2 = this.j;
        synchronized (rf2.g) {
            try {
                rf2.r = true;
                rf2.s = c6822tg2;
                if (rf2.q) {
                    rf2.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() throws C6193qg2 {
        try {
            this.d.i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            C6193qg2 c6193qg2 = new C6193qg2(EnumC5773og2.E, "Flushing frames to the server failed: " + e.getMessage(), e);
            RQ0 rq0 = this.d.d;
            rq0.b(c6193qg2);
            rq0.c(c6193qg2, null);
            throw c6193qg2;
        }
    }

    public final void c() {
        boolean z;
        char c;
        Rf2 rf2 = this.d;
        synchronized (rf2.g) {
            rf2.p = true;
            z = rf2.o;
        }
        rf2.a();
        if (z) {
            rf2.e.b();
            rf2.f.b();
        }
        while (true) {
            synchronized (this) {
                try {
                    if (!this.i) {
                        if (this.j == null) {
                            if (this.g.size() == 0) {
                                try {
                                    wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            if (!this.i) {
                                c = this.g.size() == 0 ? (char) 2 : (char) 0;
                            }
                        }
                    }
                    c = 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c == 1) {
                break;
            }
            if (c == 3) {
                try {
                    this.d.i.flush();
                } catch (IOException unused2) {
                }
            } else if (c == 2) {
                continue;
            } else {
                try {
                    d(false);
                } catch (C6193qg2 unused3) {
                    try {
                        d(true);
                    } catch (C6193qg2 unused4) {
                        return;
                    }
                }
            }
        }
        d(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r3 = r9.h;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        r5 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r5 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r5 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r2.a != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r2.b == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        r5 = r2.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        if (r5.length != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        r3 = r3.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:
    
        r3 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r10) throws defpackage.C6193qg2 {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5793ol2.d(boolean):void");
    }
}

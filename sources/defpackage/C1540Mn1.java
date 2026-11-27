package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: Mn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1540Mn1 extends AbstractC5567nh2 {
    public boolean g;
    public C6822tg2 h;
    public final ArrayList i;
    public final AbstractC4707jd1 j;
    public final Object k;
    public Timer l;
    public a m;
    public long n;
    public boolean o;

    /* JADX INFO: renamed from: Mn1$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                Socket socket = C1540Mn1.this.d.a.f;
                if (socket != null) {
                    socket.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C1540Mn1(Rf2 rf2) {
        super("ReadingThread", rf2, KY1.d);
        this.i = new ArrayList();
        this.k = new Object();
        this.j = rf2.t;
    }

    @Override // defpackage.AbstractC5567nh2
    public final void a() {
        try {
            e();
        } catch (Throwable th) {
            C6193qg2 c6193qg2 = new C6193qg2(EnumC5773og2.O, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
            RQ0 rq0 = this.d.d;
            rq0.b(c6193qg2);
            rq0.f(c6193qg2);
        }
        Rf2 rf2 = this.d;
        synchronized (rf2.g) {
            try {
                rf2.q = true;
                if (rf2.r) {
                    rf2.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(byte[] bArr) {
        RQ0 rq0 = this.d.d;
        for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
            try {
                interfaceC7873yg2.getClass();
            } catch (Throwable th) {
                rq0.a(interfaceC7873yg2, th);
            }
        }
    }

    public final void c(byte[] bArr) {
        Rf2 rf2 = this.d;
        rf2.getClass();
        RQ0 rq0 = rf2.d;
        try {
            SecureRandom secureRandom = C6889u01.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg2.c(str);
                } catch (Throwable th) {
                    rq0.a(interfaceC7873yg2, th);
                }
            }
        } catch (Throwable th2) {
            rf2.d.b(new C6193qg2(EnumC5773og2.N, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            for (InterfaceC7873yg2 interfaceC7873yg3 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg3.getClass();
                } catch (Throwable th3) {
                    rq0.a(interfaceC7873yg3, th3);
                }
            }
        }
    }

    public final byte[] d(byte[] bArr) {
        try {
            return this.j.b(bArr);
        } catch (C6193qg2 e) {
            Rf2 rf2 = this.d;
            rf2.d.b(e);
            RQ0 rq0 = rf2.d;
            for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg2.getClass();
                } catch (Throwable th) {
                    rq0.a(interfaceC7873yg2, th);
                }
            }
            rf2.g(C6822tg2.a(1003, e.getMessage()));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1540Mn1.e():void");
    }

    public final void f() {
        synchronized (this.k) {
            Timer timer = this.l;
            if (timer != null) {
                timer.cancel();
                this.l = null;
            }
            a aVar = this.m;
            if (aVar != null) {
                aVar.cancel();
                this.m = null;
            }
            this.m = new a();
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.l = timer2;
            timer2.schedule(this.m, this.n);
        }
    }

    public final void g(C6822tg2 c6822tg2) throws C6193qg2 {
        byte[] bArr;
        int i;
        this.d.getClass();
        EnumC5773og2 enumC5773og2 = EnumC5773og2.F;
        if ((this.j == null || !((i = c6822tg2.e) == 1 || i == 2)) && c6822tg2.b) {
            throw new C6193qg2(enumC5773og2, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (c6822tg2.c) {
            throw new C6193qg2(enumC5773og2, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (c6822tg2.d) {
            throw new C6193qg2(enumC5773og2, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i2 = c6822tg2.e;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            switch (i2) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new C6193qg2(EnumC5773og2.H, "A frame has an unknown opcode: 0x" + Integer.toHexString(c6822tg2.e));
            }
        }
        if (c6822tg2.f) {
            throw new C6193qg2(EnumC5773og2.G, "A frame from the server is masked.");
        }
        if (8 > i2 || i2 > 15) {
            boolean z = this.i.size() != 0;
            if (c6822tg2.e == 0) {
                if (!z) {
                    throw new C6193qg2(EnumC5773og2.J, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z) {
                throw new C6193qg2(EnumC5773og2.K, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!c6822tg2.a) {
            throw new C6193qg2(EnumC5773og2.I, "A control frame is fragmented.");
        }
        int i3 = c6822tg2.e;
        if (8 > i3 || i3 > 15 || (bArr = c6822tg2.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new C6193qg2(EnumC5773og2.L, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}

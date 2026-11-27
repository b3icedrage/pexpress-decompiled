package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C4527a;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YU implements JH {

    @NotNull
    public final ArrayList d;

    @NotNull
    public final ArrayList e;
    public final boolean f;

    @NotNull
    public final SentryAndroidOptions g;

    @NotNull
    public final C4527a a = new C4527a();

    @Nullable
    public volatile Timer b = null;

    @NotNull
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    @NotNull
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = 0;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Iterator it = YU.this.d.iterator();
            while (it.hasNext()) {
                ((InterfaceC6030pu0) it.next()).a();
            }
        }
    }

    public class b extends TimerTask {
        public final /* synthetic */ ArrayList d;

        public b(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            YU yu = YU.this;
            if (jCurrentTimeMillis - yu.i <= 10) {
                return;
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            yu.i = jCurrentTimeMillis;
            C6180qd1 c6180qd1 = new C6180qd1(yu.g.getDateProvider().now().i());
            Iterator it = yu.d.iterator();
            while (it.hasNext()) {
                ((InterfaceC6030pu0) it.next()).c(c6180qd1);
            }
            for (c cVar : yu.c.values()) {
                cVar.a.add(c6180qd1);
                C7581xH1 c7581xH1 = cVar.b;
                if (c7581xH1 != null && YU.this.g.getDateProvider().now().i() > TimeUnit.MILLISECONDS.toNanos(30000L) + cVar.c) {
                    arrayList.add(c7581xH1);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                yu.a((InterfaceC4302hv0) it2.next());
            }
        }
    }

    public class c {

        @NotNull
        public final ArrayList a = new ArrayList();

        @Nullable
        public final C7581xH1 b;
        public final long c;

        public c(C7581xH1 c7581xH1) {
            this.b = c7581xH1;
            this.c = YU.this.g.getDateProvider().now().i();
        }
    }

    public YU(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        p.b(sentryAndroidOptions, "The options object is required.");
        this.g = sentryAndroidOptions;
        this.d = new ArrayList();
        this.e = new ArrayList();
        for (InterfaceC5610nu0 interfaceC5610nu0 : sentryAndroidOptions.getPerformanceCollectors()) {
            if (interfaceC5610nu0 instanceof InterfaceC6030pu0) {
                this.d.add((InterfaceC6030pu0) interfaceC5610nu0);
            }
            if (interfaceC5610nu0 instanceof InterfaceC5820ou0) {
                this.e.add((InterfaceC5820ou0) interfaceC5610nu0);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.JH
    @Nullable
    public final List<C6180qd1> a(@NotNull InterfaceC4302hv0 interfaceC4302hv0) {
        this.g.getLogger().a(NG1.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC4302hv0.getName(), interfaceC4302hv0.w().d.toString());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5820ou0) it.next()).b(interfaceC4302hv0);
        }
        return c(interfaceC4302hv0.s().toString());
    }

    @Override // defpackage.JH
    public final void b(@NotNull String str) {
        if (this.f) {
            this.g.getLogger().a(NG1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new c(null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        C4527a.C0404a c0404aA = this.a.a();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new a(), 0L);
            this.b.scheduleAtFixedRate(new b(new ArrayList()), 100L, 100L);
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.JH
    @Nullable
    public final List<C6180qd1> c(@NotNull String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        c cVar = (c) concurrentHashMap.remove(str);
        this.g.getLogger().a(NG1.DEBUG, C5491nL.c("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // defpackage.JH
    public final void close() {
        this.g.getLogger().a(NG1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5820ou0) it.next()).clear();
        }
        if (this.h.getAndSet(false)) {
            C4527a.C0404a c0404aA = this.a.a();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.JH
    public final void d(@NotNull C7581xH1 c7581xH1) {
        if (this.f) {
            this.g.getLogger().a(NG1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5820ou0) it.next()).e(c7581xH1);
        }
        String string = c7581xH1.a.toString();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new c(c7581xH1));
        }
        b(string);
    }

    @Override // defpackage.JH
    public final void e(@NotNull C3352dO1 c3352dO1) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5820ou0) it.next()).e(c3352dO1);
        }
    }

    @Override // defpackage.JH
    public final void f(@NotNull C3352dO1 c3352dO1) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5820ou0) it.next()).b(c3352dO1);
        }
    }
}

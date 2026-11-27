package io.sentry.transport;

import defpackage.C2688aH1;
import defpackage.EnumC5932pS;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Closeable {

    @NotNull
    public final c d;

    @NotNull
    public final C2688aH1 e;

    @NotNull
    public final ConcurrentHashMap g;

    @NotNull
    public final CopyOnWriteArrayList h;

    @Nullable
    public Timer i;

    @NotNull
    public final C4527a j;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            Iterator it = lVar.h.iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(lVar);
            }
        }
    }

    public interface b {
        void l(@NotNull l lVar);
    }

    public l(@NotNull C2688aH1 c2688aH1) {
        c cVar = c.a;
        this.g = new ConcurrentHashMap();
        this.h = new CopyOnWriteArrayList();
        this.i = null;
        this.j = new C4527a();
        this.d = cVar;
        this.e = c2688aH1;
    }

    public final void c(@NotNull EnumC5932pS enumC5932pS, @NotNull Date date) {
        ConcurrentHashMap concurrentHashMap = this.g;
        Date date2 = (Date) concurrentHashMap.get(enumC5932pS);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC5932pS, date);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(this);
            }
            C4527a.C0404a c0404aA = this.j.a();
            try {
                if (this.i == null) {
                    this.i = new Timer(true);
                }
                this.i.schedule(new a(), date);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            Timer timer = this.i;
            if (timer != null) {
                timer.cancel();
                this.i = null;
            }
            c0404aA.close();
            this.h.clear();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean f(@NotNull EnumC5932pS enumC5932pS) {
        Date date;
        this.d.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.g;
        Date date3 = (Date) concurrentHashMap.get(EnumC5932pS.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC5932pS.Unknown.equals(enumC5932pS) || (date = (Date) concurrentHashMap.get(enumC5932pS)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}

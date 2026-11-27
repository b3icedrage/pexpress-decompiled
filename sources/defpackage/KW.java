package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class KW implements Sj2, Vk2.a {
    public final Context d;
    public final int e;
    public final C3429dk2 g;
    public final OW1 h;
    public final Tj2 i;
    public final Object j;
    public int k;
    public final TH1 l;
    public final C4946kk2.a m;
    public PowerManager.WakeLock n;
    public boolean o;
    public final C6135qP1 p;

    static {
        AS0.d("DelayMetCommandHandler");
    }

    public KW(@NonNull Context context, int i, @NonNull OW1 ow1, @NonNull C6135qP1 c6135qP1) {
        this.d = context;
        this.e = i;
        this.h = ow1;
        this.g = c6135qP1.a;
        this.p = c6135qP1;
        Q02 q02 = ow1.i.j;
        C4946kk2 c4946kk2 = ow1.e;
        this.l = c4946kk2.a;
        this.m = c4946kk2.c;
        this.i = new Tj2(q02, this);
        this.o = false;
        this.k = 0;
        this.j = new Object();
    }

    public static void b(KW kw) {
        C3429dk2 c3429dk2 = kw.g;
        if (kw.k >= 2) {
            AS0.c().getClass();
            return;
        }
        kw.k = 2;
        AS0.c().getClass();
        String str = C5683oF.i;
        Context context = kw.d;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C5683oF.d(intent, c3429dk2);
        OW1 ow1 = kw.h;
        int i = kw.e;
        OW1.b bVar = new OW1.b(i, ow1, intent);
        C4946kk2.a aVar = kw.m;
        aVar.execute(bVar);
        if (!ow1.h.d(c3429dk2.a)) {
            AS0.c().getClass();
            return;
        }
        AS0.c().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C5683oF.d(intent2, c3429dk2);
        aVar.execute(new OW1.b(i, ow1, intent2));
    }

    @Override // Vk2.a
    public final void a(@NonNull C3429dk2 c3429dk2) {
        AS0 as0C = AS0.c();
        Objects.toString(c3429dk2);
        as0C.getClass();
        this.l.execute(new JW(this, 0));
    }

    public final void c() {
        synchronized (this.j) {
            try {
                this.i.c();
                this.h.g.a(this.g);
                PowerManager.WakeLock wakeLock = this.n;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AS0 as0C = AS0.c();
                    Objects.toString(this.n);
                    Objects.toString(this.g);
                    as0C.getClass();
                    this.n.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Sj2
    public final void d(@NonNull ArrayList arrayList) {
        this.l.execute(new JW(this, 0));
    }

    public final void e() {
        C3429dk2 c3429dk2 = this.g;
        StringBuilder sb = new StringBuilder();
        String str = c3429dk2.a;
        sb.append(str);
        sb.append(" (");
        this.n = Bf2.a(this.d, SK.b(sb, this.e, ")"));
        AS0 as0C = AS0.c();
        Objects.toString(this.n);
        as0C.getClass();
        this.n.acquire();
        Bk2 bk2O = this.h.i.c.u().o(str);
        if (bk2O == null) {
            this.l.execute(new JW(this, 0));
            return;
        }
        boolean zB = bk2O.b();
        this.o = zB;
        if (zB) {
            this.i.b(Collections.singletonList(bk2O));
        } else {
            AS0.c().getClass();
            f(Collections.singletonList(bk2O));
        }
    }

    @Override // defpackage.Sj2
    public final void f(@NonNull List<Bk2> list) {
        Iterator<Bk2> it = list.iterator();
        while (it.hasNext()) {
            if (ED.i(it.next()).equals(this.g)) {
                this.l.execute(new RunnableC7146vD(this, 2));
                return;
            }
        }
    }

    public final void g(boolean z) {
        AS0 as0C = AS0.c();
        C3429dk2 c3429dk2 = this.g;
        Objects.toString(c3429dk2);
        as0C.getClass();
        c();
        int i = this.e;
        OW1 ow1 = this.h;
        C4946kk2.a aVar = this.m;
        Context context = this.d;
        if (z) {
            String str = C5683oF.i;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C5683oF.d(intent, c3429dk2);
            aVar.execute(new OW1.b(i, ow1, intent));
        }
        if (this.o) {
            String str2 = C5683oF.i;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new OW1.b(i, ow1, intent2));
        }
    }
}

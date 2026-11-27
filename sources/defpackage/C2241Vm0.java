package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2241Vm0 implements InterfaceC5046lD1, Sj2, R90 {
    public final Context d;
    public final C4736jk2 e;
    public final Tj2 g;
    public final NW i;
    public boolean j;
    public Boolean m;
    public final HashSet h = new HashSet();
    public final C6344rP1 l = new C6344rP1();
    public final Object k = new Object();

    static {
        AS0.d("GreedyScheduler");
    }

    public C2241Vm0(@NonNull Context context, @NonNull a aVar, @NonNull Q02 q02, @NonNull C4736jk2 c4736jk2) {
        this.d = context;
        this.e = c4736jk2;
        this.g = new Tj2(q02, this);
        this.i = new NW(this, aVar.e);
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        this.l.b(c3429dk2);
        synchronized (this.k) {
            try {
                for (Bk2 bk2 : this.h) {
                    if (ED.i(bk2).equals(c3429dk2)) {
                        AS0 as0C = AS0.c();
                        Objects.toString(c3429dk2);
                        as0C.getClass();
                        this.h.remove(bk2);
                        this.g.b(this.h);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5046lD1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.InterfaceC5046lD1
    public final void c(@NonNull String str) {
        Runnable runnable;
        Boolean bool = this.m;
        C4736jk2 c4736jk2 = this.e;
        if (bool == null) {
            this.m = Boolean.valueOf(C0587Ah1.a(this.d, c4736jk2.b));
        }
        if (!this.m.booleanValue()) {
            AS0.c().getClass();
            return;
        }
        if (!this.j) {
            c4736jk2.f.b(this);
            this.j = true;
        }
        AS0.c().getClass();
        NW nw = this.i;
        if (nw != null && (runnable = (Runnable) nw.c.remove(str)) != null) {
            ((Handler) nw.b.d).removeCallbacks(runnable);
        }
        Iterator<C6135qP1> it = this.l.c(str).iterator();
        while (it.hasNext()) {
            c4736jk2.d.a(new JQ1(c4736jk2, it.next(), false));
        }
    }

    @Override // defpackage.Sj2
    public final void d(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3429dk2 c3429dk2I = ED.i((Bk2) it.next());
            AS0 as0C = AS0.c();
            c3429dk2I.toString();
            as0C.getClass();
            C6135qP1 c6135qP1B = this.l.b(c3429dk2I);
            if (c6135qP1B != null) {
                C4736jk2 c4736jk2 = this.e;
                c4736jk2.d.a(new JQ1(c4736jk2, c6135qP1B, false));
            }
        }
    }

    @Override // defpackage.InterfaceC5046lD1
    public final void e(@NonNull Bk2... bk2Arr) {
        if (this.m == null) {
            this.m = Boolean.valueOf(C0587Ah1.a(this.d, this.e.b));
        }
        if (!this.m.booleanValue()) {
            AS0.c().getClass();
            return;
        }
        if (!this.j) {
            this.e.f.b(this);
            this.j = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Bk2 spec : bk2Arr) {
            if (!this.l.a(ED.i(spec))) {
                long jA = spec.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (spec.b == EnumC3638ek2.d) {
                    if (jCurrentTimeMillis < jA) {
                        NW nw = this.i;
                        if (nw != null) {
                            HashMap map = nw.c;
                            Runnable runnable = (Runnable) map.remove(spec.a);
                            OV ov = nw.b;
                            if (runnable != null) {
                                ((Handler) ov.d).removeCallbacks(runnable);
                            }
                            MW mw = new MW(nw, spec);
                            map.put(spec.a, mw);
                            ((Handler) ov.d).postDelayed(mw, spec.a() - System.currentTimeMillis());
                        }
                    } else if (spec.b()) {
                        VK vk = spec.j;
                        if (vk.c) {
                            AS0 as0C = AS0.c();
                            spec.toString();
                            as0C.getClass();
                        } else if (vk.h.isEmpty()) {
                            hashSet.add(spec);
                            hashSet2.add(spec.a);
                        } else {
                            AS0 as0C2 = AS0.c();
                            spec.toString();
                            as0C2.getClass();
                        }
                    } else if (!this.l.a(ED.i(spec))) {
                        AS0.c().getClass();
                        C4736jk2 c4736jk2 = this.e;
                        C6344rP1 c6344rP1 = this.l;
                        c6344rP1.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        c4736jk2.f(c6344rP1.d(ED.i(spec)), null);
                    }
                }
            }
        }
        synchronized (this.k) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    AS0.c().getClass();
                    this.h.addAll(hashSet);
                    this.g.b(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Sj2
    public final void f(@NonNull List<Bk2> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C3429dk2 c3429dk2I = ED.i((Bk2) it.next());
            C6344rP1 c6344rP1 = this.l;
            if (!c6344rP1.a(c3429dk2I)) {
                AS0 as0C = AS0.c();
                c3429dk2I.toString();
                as0C.getClass();
                this.e.f(c6344rP1.d(c3429dk2I), null);
            }
        }
    }
}

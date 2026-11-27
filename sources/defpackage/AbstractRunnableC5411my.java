package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: my, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC5411my implements Runnable {
    public final R91 d = new R91();

    public static void a(C4736jk2 c4736jk2, String str) {
        RunnableC2790al2 runnableC2790al2;
        boolean z;
        WorkDatabase workDatabase = c4736jk2.c;
        Ck2 ck2U = workDatabase.u();
        InterfaceC7627xX interfaceC7627xXP = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            EnumC3638ek2 enumC3638ek2N = ck2U.n(str2);
            if (enumC3638ek2N != EnumC3638ek2.g && enumC3638ek2N != EnumC3638ek2.h) {
                ck2U.h(EnumC3638ek2.j, str2);
            }
            linkedList.addAll(interfaceC7627xXP.a(str2));
        }
        C0743Ch1 c0743Ch1 = c4736jk2.f;
        synchronized (c0743Ch1.p) {
            try {
                AS0.c().getClass();
                c0743Ch1.n.add(str);
                runnableC2790al2 = (RunnableC2790al2) c0743Ch1.j.remove(str);
                z = runnableC2790al2 != null;
                if (runnableC2790al2 == null) {
                    runnableC2790al2 = (RunnableC2790al2) c0743Ch1.k.remove(str);
                }
                if (runnableC2790al2 != null) {
                    c0743Ch1.l.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0743Ch1.c(runnableC2790al2);
        if (z) {
            c0743Ch1.i();
        }
        Iterator<InterfaceC5046lD1> it = c4736jk2.e.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        R91 r91 = this.d;
        try {
            b();
            r91.a(P91.a);
        } catch (Throwable th) {
            r91.a(new P91.a.C0114a(th));
        }
    }
}

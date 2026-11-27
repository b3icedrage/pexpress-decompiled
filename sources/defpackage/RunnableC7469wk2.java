package defpackage;

import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: renamed from: wk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7469wk2 implements Runnable {
    public final /* synthetic */ UUID d;
    public final /* synthetic */ b e;
    public final /* synthetic */ C6117qJ1 g;
    public final /* synthetic */ C7679xk2 h;

    public RunnableC7469wk2(C7679xk2 c7679xk2, UUID uuid, b bVar, C6117qJ1 c6117qJ1) {
        this.h = c7679xk2;
        this.d = uuid;
        this.e = bVar;
        this.g = c6117qJ1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6117qJ1 c6117qJ1 = this.g;
        UUID uuid = this.d;
        String string = uuid.toString();
        AS0 as0C = AS0.c();
        String str = C7679xk2.c;
        Objects.toString(uuid);
        b bVar = this.e;
        Objects.toString(bVar);
        as0C.getClass();
        C7679xk2 c7679xk2 = this.h;
        WorkDatabase workDatabase = c7679xk2.a;
        WorkDatabase workDatabase2 = c7679xk2.a;
        workDatabase.c();
        try {
            Bk2 bk2O = workDatabase2.u().o(string);
            if (bk2O == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (bk2O.b == EnumC3638ek2.e) {
                workDatabase2.t().b(new C6209qk2(string, bVar));
            } else {
                AS0.c().e(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            c6117qJ1.j(null);
            workDatabase2.n();
            workDatabase2.j();
        } catch (Throwable th) {
            try {
                AS0.c().b(C7679xk2.c, "Error updating Worker progress", th);
                c6117qJ1.k(th);
            } finally {
                workDatabase2.j();
            }
        }
    }
}

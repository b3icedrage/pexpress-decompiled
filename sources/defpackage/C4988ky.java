package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: renamed from: ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4988ky extends AbstractRunnableC5411my {
    public final /* synthetic */ C4736jk2 e;
    public final /* synthetic */ UUID g;

    public C4988ky(C4736jk2 c4736jk2, UUID uuid) {
        this.e = c4736jk2;
        this.g = uuid;
    }

    @Override // defpackage.AbstractRunnableC5411my
    public final void b() {
        C4736jk2 c4736jk2 = this.e;
        WorkDatabase workDatabase = c4736jk2.c;
        workDatabase.c();
        try {
            AbstractRunnableC5411my.a(c4736jk2, this.g.toString());
            workDatabase.n();
            workDatabase.j();
            C6308rD1.a(c4736jk2.b, c4736jk2.c, c4736jk2.e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}

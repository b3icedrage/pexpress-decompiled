package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: renamed from: ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5201ly extends AbstractRunnableC5411my {
    public final /* synthetic */ C4736jk2 e;
    public final /* synthetic */ String g;

    public C5201ly(C4736jk2 c4736jk2, String str) {
        this.e = c4736jk2;
        this.g = str;
    }

    @Override // defpackage.AbstractRunnableC5411my
    public final void b() {
        C4736jk2 c4736jk2 = this.e;
        WorkDatabase workDatabase = c4736jk2.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().m(this.g).iterator();
            while (it.hasNext()) {
                AbstractRunnableC5411my.a(c4736jk2, (String) it.next());
            }
            workDatabase.n();
        } finally {
            workDatabase.j();
        }
    }
}

package defpackage;

import androidx.annotation.NonNull;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: rD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6308rD1 {
    public static final /* synthetic */ int a = 0;

    static {
        AS0.d("Schedulers");
    }

    public static void a(@NonNull a aVar, @NonNull WorkDatabase workDatabase, List<InterfaceC5046lD1> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Ck2 ck2U = workDatabase.u();
        workDatabase.c();
        try {
            ArrayList arrayListG = ck2U.g(aVar.h);
            ArrayList arrayListB = ck2U.b();
            if (arrayListG.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    ck2U.d(((Bk2) it.next()).a, jCurrentTimeMillis);
                }
            }
            workDatabase.n();
            workDatabase.j();
            if (arrayListG.size() > 0) {
                Bk2[] bk2Arr = (Bk2[]) arrayListG.toArray(new Bk2[arrayListG.size()]);
                for (InterfaceC5046lD1 interfaceC5046lD1 : list) {
                    if (interfaceC5046lD1.b()) {
                        interfaceC5046lD1.e(bk2Arr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                Bk2[] bk2Arr2 = (Bk2[]) arrayListB.toArray(new Bk2[arrayListB.size()]);
                for (InterfaceC5046lD1 interfaceC5046lD2 : list) {
                    if (!interfaceC5046lD2.b()) {
                        interfaceC5046lD2.e(bk2Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}

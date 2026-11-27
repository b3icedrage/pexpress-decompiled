package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Uk2 implements Sk2 {
    public final WorkDatabase_Impl a;
    public final C6401rg1 b;

    public Uk2(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new C6401rg1(database, 1);
        new Tk2(database);
    }

    @Override // defpackage.Sk2
    public final ArrayList a(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkTagDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    @Override // defpackage.Sk2
    public final void b(String id, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            Rk2 rk2 = new Rk2((String) it.next(), id);
            InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
            InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkTagDao") : null;
            WorkDatabase_Impl workDatabase_Impl = this.a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                this.b.f(rk2);
                workDatabase_Impl.n();
                if (interfaceC2347Wu0Y != null) {
                    interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
                }
                workDatabase_Impl.j();
                if (interfaceC2347Wu0Y != null) {
                    interfaceC2347Wu0Y.l();
                }
            } catch (Throwable th) {
                workDatabase_Impl.j();
                if (interfaceC2347Wu0Y != null) {
                    interfaceC2347Wu0Y.l();
                }
                throw th;
            }
        }
    }
}

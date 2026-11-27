package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8047zX implements InterfaceC7627xX {
    public final Object a;
    public final Object b;

    public C8047zX() {
        this.a = new AtomicReference();
        this.b = new C8092zj();
    }

    @Override // defpackage.InterfaceC7627xX
    public ArrayList a(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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

    @Override // defpackage.InterfaceC7627xX
    public boolean b(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            boolean z = false;
            if (cursorF.moveToFirst()) {
                z = cursorF.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    @Override // defpackage.InterfaceC7627xX
    public void c(C6786tX c6786tX) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C7837yX) this.b).f(c6786tX);
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
        }
    }

    @Override // defpackage.InterfaceC7627xX
    public boolean d(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            boolean z = false;
            if (cursorF.moveToFirst()) {
                z = cursorF.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    public C8047zX(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new C7837yX(database);
    }
}

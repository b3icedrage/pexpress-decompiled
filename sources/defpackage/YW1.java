package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class YW1 implements VW1 {
    public final WorkDatabase_Impl a;
    public final C7550x8 b;
    public final WW1 c;
    public final XW1 d;

    public YW1(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new C7550x8(database, 1);
        this.c = new WW1(database);
        this.d = new XW1(database);
    }

    @Override // defpackage.VW1
    public final ArrayList a() {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        SA1 sa1G = SA1.g(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
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

    @Override // defpackage.VW1
    public final UW1 b(C3429dk2 id) {
        Intrinsics.checkNotNullParameter(id, "id");
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        UW1 uw1 = null;
        String string = null;
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        SA1 sa1G = SA1.g(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = id.a;
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        sa1G.n0(2, id.b);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "work_spec_id");
            int iN2 = UE.n(cursorF, "generation");
            int iN3 = UE.n(cursorF, "system_id");
            if (cursorF.moveToFirst()) {
                if (!cursorF.isNull(iN)) {
                    string = cursorF.getString(iN);
                }
                uw1 = new UW1(string, cursorF.getInt(iN2), cursorF.getInt(iN3));
            }
            return uw1;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    @Override // defpackage.VW1
    public final void c(C3429dk2 id) {
        Intrinsics.checkNotNullParameter(id, "id");
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        WW1 ww1 = this.c;
        InterfaceC4005gW1 interfaceC4005gW1A = ww1.a();
        String str = id.a;
        if (str == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.F(1, str);
        }
        interfaceC4005gW1A.n0(2, id.b);
        workDatabase_Impl.c();
        try {
            interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            ww1.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.VW1
    public final void d(UW1 uw1) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.f(uw1);
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

    @Override // defpackage.VW1
    public final void e(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        XW1 xw1 = this.d;
        InterfaceC4005gW1 interfaceC4005gW1A = xw1.a();
        if (str == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.F(1, str);
        }
        workDatabase_Impl.c();
        try {
            interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            xw1.d(interfaceC4005gW1A);
        }
    }
}

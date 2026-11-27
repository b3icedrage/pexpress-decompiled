package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class X81 implements InterfaceC6192qg1 {
    public final Object a;
    public final Object b;

    public X81() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
    }

    @Override // defpackage.InterfaceC6192qg1
    public Long a(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        Long lValueOf = null;
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.PreferenceDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT long_value FROM Preference where `key`=?");
        sa1G.F(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    @Override // defpackage.InterfaceC6192qg1
    public void b(C5562ng1 c5562ng1) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.PreferenceDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C6401rg1) this.b).f(c5562ng1);
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

    public X81(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new C6401rg1(database, 0);
    }
}

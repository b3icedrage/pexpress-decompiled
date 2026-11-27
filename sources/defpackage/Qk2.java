package defpackage;

import android.database.Cursor;
import androidx.work.b;
import androidx.work.impl.WorkDatabase_Impl;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Qk2 implements Ck2 {
    public final WorkDatabase_Impl a;
    public final Hk2 b;
    public final Jk2 c;
    public final Kk2 d;
    public final Lk2 e;
    public final Mk2 f;
    public final Nk2 g;
    public final Ok2 h;
    public final Pk2 i;
    public final Dk2 j;
    public final Ek2 k;

    public Qk2(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new Hk2(database);
        Intrinsics.checkNotNullParameter(database, "database");
        new Ik2(database);
        this.c = new Jk2(database);
        this.d = new Kk2(database);
        this.e = new Lk2(database);
        this.f = new Mk2(database);
        this.g = new Nk2(database);
        this.h = new Ok2(database);
        this.i = new Pk2(database);
        this.j = new Dk2(database);
        this.k = new Ek2(database);
        new Fk2(database);
        new Gk2(database);
    }

    @Override // defpackage.Ck2
    public final void a(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Jk2 jk2 = this.c;
        InterfaceC4005gW1 interfaceC4005gW1A = jk2.a();
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
            jk2.d(interfaceC4005gW1A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0252  */
    @Override // defpackage.Ck2
    public final ArrayList b() throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        sa1G.n0(1, HttpPlatformResponse.MAX_MESSAGE_LENGTH);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    int i = iN14;
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string = cursorF.isNull(iN) ? null : cursorF.getString(iN);
                        EnumC3638ek2 enumC3638ek2R = C5027l8.r(cursorF.getInt(iN2));
                        String string2 = cursorF.isNull(iN3) ? null : cursorF.getString(iN3);
                        String string3 = cursorF.isNull(iN4) ? null : cursorF.getString(iN4);
                        b bVarA = b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5));
                        b bVarA2 = b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6));
                        long j = cursorF.getLong(iN7);
                        long j2 = cursorF.getLong(iN8);
                        long j3 = cursorF.getLong(iN9);
                        int i2 = cursorF.getInt(iN10);
                        EnumC1544Mp enumC1544MpO = C5027l8.o(cursorF.getInt(iN11));
                        long j4 = cursorF.getLong(iN12);
                        long j5 = cursorF.getLong(iN13);
                        int i3 = i;
                        long j6 = cursorF.getLong(i3);
                        int i4 = iN;
                        int i5 = iN15;
                        long j7 = cursorF.getLong(i5);
                        iN15 = i5;
                        int i6 = iN16;
                        boolean z = cursorF.getInt(i6) != 0;
                        iN16 = i6;
                        int i7 = iN17;
                        EnumC7428wa1 enumC7428wa1Q = C5027l8.q(cursorF.getInt(i7));
                        iN17 = i7;
                        int i8 = iN18;
                        int i9 = cursorF.getInt(i8);
                        iN18 = i8;
                        int i10 = iN19;
                        int i11 = cursorF.getInt(i10);
                        iN19 = i10;
                        int i12 = iN20;
                        EnumC4593j41 enumC4593j41P = C5027l8.p(cursorF.getInt(i12));
                        iN20 = i12;
                        int i13 = iN21;
                        boolean z2 = cursorF.getInt(i13) != 0;
                        iN21 = i13;
                        int i14 = iN22;
                        boolean z3 = cursorF.getInt(i14) != 0;
                        iN22 = i14;
                        int i15 = iN23;
                        boolean z4 = cursorF.getInt(i15) != 0;
                        iN23 = i15;
                        int i16 = iN24;
                        boolean z5 = cursorF.getInt(i16) != 0;
                        iN24 = i16;
                        int i17 = iN25;
                        long j8 = cursorF.getLong(i17);
                        iN25 = i17;
                        int i18 = iN26;
                        long j9 = cursorF.getLong(i18);
                        iN26 = i18;
                        int i19 = iN27;
                        iN27 = i19;
                        arrayList.add(new Bk2(string, enumC3638ek2R, string2, string3, bVarA, bVarA2, j, j2, j3, new VK(enumC4593j41P, z2, z3, z4, z5, j8, j9, C5027l8.h(cursorF.isNull(i19) ? null : cursorF.getBlob(i19))), i2, enumC1544MpO, j4, j5, j6, j7, z, enumC7428wa1Q, i9, i11));
                        iN = i4;
                        i = i3;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    @Override // defpackage.Ck2
    public final void c(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Lk2 lk2 = this.e;
        InterfaceC4005gW1 interfaceC4005gW1A = lk2.a();
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
            lk2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.Ck2
    public final int d(String str, long j) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Dk2 dk2 = this.j;
        InterfaceC4005gW1 interfaceC4005gW1A = dk2.a();
        interfaceC4005gW1A.n0(1, j);
        if (str == null) {
            interfaceC4005gW1A.P0(2);
        } else {
            interfaceC4005gW1A.F(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iM = interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
            return iM;
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            dk2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.Ck2
    public final ArrayList e(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
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
                String id = cursorF.isNull(0) ? null : cursorF.getString(0);
                EnumC3638ek2 state = C5027l8.r(cursorF.getInt(1));
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                Bk2.a aVar = new Bk2.a();
                aVar.a = id;
                aVar.b = state;
                arrayList.add(aVar);
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

    /* JADX WARN: Code duplicated, block: B:78:0x0251  */
    @Override // defpackage.Ck2
    public final ArrayList f(long j) throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        sa1G.n0(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    int i = iN14;
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string = cursorF.isNull(iN) ? null : cursorF.getString(iN);
                        EnumC3638ek2 enumC3638ek2R = C5027l8.r(cursorF.getInt(iN2));
                        String string2 = cursorF.isNull(iN3) ? null : cursorF.getString(iN3);
                        String string3 = cursorF.isNull(iN4) ? null : cursorF.getString(iN4);
                        b bVarA = b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5));
                        b bVarA2 = b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6));
                        long j2 = cursorF.getLong(iN7);
                        long j3 = cursorF.getLong(iN8);
                        long j4 = cursorF.getLong(iN9);
                        int i2 = cursorF.getInt(iN10);
                        EnumC1544Mp enumC1544MpO = C5027l8.o(cursorF.getInt(iN11));
                        long j5 = cursorF.getLong(iN12);
                        long j6 = cursorF.getLong(iN13);
                        int i3 = i;
                        long j7 = cursorF.getLong(i3);
                        int i4 = iN;
                        int i5 = iN15;
                        long j8 = cursorF.getLong(i5);
                        iN15 = i5;
                        int i6 = iN16;
                        boolean z = cursorF.getInt(i6) != 0;
                        iN16 = i6;
                        int i7 = iN17;
                        EnumC7428wa1 enumC7428wa1Q = C5027l8.q(cursorF.getInt(i7));
                        iN17 = i7;
                        int i8 = iN18;
                        int i9 = cursorF.getInt(i8);
                        iN18 = i8;
                        int i10 = iN19;
                        int i11 = cursorF.getInt(i10);
                        iN19 = i10;
                        int i12 = iN20;
                        EnumC4593j41 enumC4593j41P = C5027l8.p(cursorF.getInt(i12));
                        iN20 = i12;
                        int i13 = iN21;
                        boolean z2 = cursorF.getInt(i13) != 0;
                        iN21 = i13;
                        int i14 = iN22;
                        boolean z3 = cursorF.getInt(i14) != 0;
                        iN22 = i14;
                        int i15 = iN23;
                        boolean z4 = cursorF.getInt(i15) != 0;
                        iN23 = i15;
                        int i16 = iN24;
                        boolean z5 = cursorF.getInt(i16) != 0;
                        iN24 = i16;
                        int i17 = iN25;
                        long j9 = cursorF.getLong(i17);
                        iN25 = i17;
                        int i18 = iN26;
                        long j10 = cursorF.getLong(i18);
                        iN26 = i18;
                        int i19 = iN27;
                        iN27 = i19;
                        arrayList.add(new Bk2(string, enumC3638ek2R, string2, string3, bVarA, bVarA2, j2, j3, j4, new VK(enumC4593j41P, z2, z3, z4, z5, j9, j10, C5027l8.h(cursorF.isNull(i19) ? null : cursorF.getBlob(i19))), i2, enumC1544MpO, j5, j6, j7, j8, z, enumC7428wa1Q, i9, i11));
                        iN = i4;
                        i = i3;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0252  */
    @Override // defpackage.Ck2
    public final ArrayList g(int i) throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        sa1G.n0(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    int i2 = iN14;
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string = cursorF.isNull(iN) ? null : cursorF.getString(iN);
                        EnumC3638ek2 enumC3638ek2R = C5027l8.r(cursorF.getInt(iN2));
                        String string2 = cursorF.isNull(iN3) ? null : cursorF.getString(iN3);
                        String string3 = cursorF.isNull(iN4) ? null : cursorF.getString(iN4);
                        b bVarA = b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5));
                        b bVarA2 = b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6));
                        long j = cursorF.getLong(iN7);
                        long j2 = cursorF.getLong(iN8);
                        long j3 = cursorF.getLong(iN9);
                        int i3 = cursorF.getInt(iN10);
                        EnumC1544Mp enumC1544MpO = C5027l8.o(cursorF.getInt(iN11));
                        long j4 = cursorF.getLong(iN12);
                        long j5 = cursorF.getLong(iN13);
                        int i4 = i2;
                        long j6 = cursorF.getLong(i4);
                        int i5 = iN;
                        int i6 = iN15;
                        long j7 = cursorF.getLong(i6);
                        iN15 = i6;
                        int i7 = iN16;
                        boolean z = cursorF.getInt(i7) != 0;
                        iN16 = i7;
                        int i8 = iN17;
                        EnumC7428wa1 enumC7428wa1Q = C5027l8.q(cursorF.getInt(i8));
                        iN17 = i8;
                        int i9 = iN18;
                        int i10 = cursorF.getInt(i9);
                        iN18 = i9;
                        int i11 = iN19;
                        int i12 = cursorF.getInt(i11);
                        iN19 = i11;
                        int i13 = iN20;
                        EnumC4593j41 enumC4593j41P = C5027l8.p(cursorF.getInt(i13));
                        iN20 = i13;
                        int i14 = iN21;
                        boolean z2 = cursorF.getInt(i14) != 0;
                        iN21 = i14;
                        int i15 = iN22;
                        boolean z3 = cursorF.getInt(i15) != 0;
                        iN22 = i15;
                        int i16 = iN23;
                        boolean z4 = cursorF.getInt(i16) != 0;
                        iN23 = i16;
                        int i17 = iN24;
                        boolean z5 = cursorF.getInt(i17) != 0;
                        iN24 = i17;
                        int i18 = iN25;
                        long j8 = cursorF.getLong(i18);
                        iN25 = i18;
                        int i19 = iN26;
                        long j9 = cursorF.getLong(i19);
                        iN26 = i19;
                        int i20 = iN27;
                        iN27 = i20;
                        arrayList.add(new Bk2(string, enumC3638ek2R, string2, string3, bVarA, bVarA2, j, j2, j3, new VK(enumC4593j41P, z2, z3, z4, z5, j8, j9, C5027l8.h(cursorF.isNull(i20) ? null : cursorF.getBlob(i20))), i3, enumC1544MpO, j4, j5, j6, j7, z, enumC7428wa1Q, i10, i12));
                        iN = i5;
                        i2 = i4;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    @Override // defpackage.Ck2
    public final int h(EnumC3638ek2 enumC3638ek2, String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Kk2 kk2 = this.d;
        InterfaceC4005gW1 interfaceC4005gW1A = kk2.a();
        interfaceC4005gW1A.n0(1, C5027l8.x(enumC3638ek2));
        if (str == null) {
            interfaceC4005gW1A.P0(2);
        } else {
            interfaceC4005gW1A.F(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iM = interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
            return iM;
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            kk2.d(interfaceC4005gW1A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x024c  */
    @Override // defpackage.Ck2
    public final ArrayList i() throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    int i = iN14;
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string = cursorF.isNull(iN) ? null : cursorF.getString(iN);
                        EnumC3638ek2 enumC3638ek2R = C5027l8.r(cursorF.getInt(iN2));
                        String string2 = cursorF.isNull(iN3) ? null : cursorF.getString(iN3);
                        String string3 = cursorF.isNull(iN4) ? null : cursorF.getString(iN4);
                        b bVarA = b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5));
                        b bVarA2 = b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6));
                        long j = cursorF.getLong(iN7);
                        long j2 = cursorF.getLong(iN8);
                        long j3 = cursorF.getLong(iN9);
                        int i2 = cursorF.getInt(iN10);
                        EnumC1544Mp enumC1544MpO = C5027l8.o(cursorF.getInt(iN11));
                        long j4 = cursorF.getLong(iN12);
                        long j5 = cursorF.getLong(iN13);
                        int i3 = i;
                        long j6 = cursorF.getLong(i3);
                        int i4 = iN;
                        int i5 = iN15;
                        long j7 = cursorF.getLong(i5);
                        iN15 = i5;
                        int i6 = iN16;
                        boolean z = cursorF.getInt(i6) != 0;
                        iN16 = i6;
                        int i7 = iN17;
                        EnumC7428wa1 enumC7428wa1Q = C5027l8.q(cursorF.getInt(i7));
                        iN17 = i7;
                        int i8 = iN18;
                        int i9 = cursorF.getInt(i8);
                        iN18 = i8;
                        int i10 = iN19;
                        int i11 = cursorF.getInt(i10);
                        iN19 = i10;
                        int i12 = iN20;
                        EnumC4593j41 enumC4593j41P = C5027l8.p(cursorF.getInt(i12));
                        iN20 = i12;
                        int i13 = iN21;
                        boolean z2 = cursorF.getInt(i13) != 0;
                        iN21 = i13;
                        int i14 = iN22;
                        boolean z3 = cursorF.getInt(i14) != 0;
                        iN22 = i14;
                        int i15 = iN23;
                        boolean z4 = cursorF.getInt(i15) != 0;
                        iN23 = i15;
                        int i16 = iN24;
                        boolean z5 = cursorF.getInt(i16) != 0;
                        iN24 = i16;
                        int i17 = iN25;
                        long j8 = cursorF.getLong(i17);
                        iN25 = i17;
                        int i18 = iN26;
                        long j9 = cursorF.getLong(i18);
                        iN26 = i18;
                        int i19 = iN27;
                        iN27 = i19;
                        arrayList.add(new Bk2(string, enumC3638ek2R, string2, string3, bVarA, bVarA2, j, j2, j3, new VK(enumC4593j41P, z2, z3, z4, z5, j8, j9, C5027l8.h(cursorF.isNull(i19) ? null : cursorF.getBlob(i19))), i2, enumC1544MpO, j4, j5, j6, j7, z, enumC7428wa1Q, i9, i11));
                        iN = i4;
                        i = i3;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    @Override // defpackage.Ck2
    public final void j(String str, b bVar) throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Mk2 mk2 = this.f;
        InterfaceC4005gW1 interfaceC4005gW1A = mk2.a();
        byte[] bArrC = b.c(bVar);
        if (bArrC == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.v0(1, bArrC);
        }
        if (str == null) {
            interfaceC4005gW1A.P0(2);
        } else {
            interfaceC4005gW1A.F(2, str);
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
            mk2.d(interfaceC4005gW1A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x024c  */
    @Override // defpackage.Ck2
    public final ArrayList k() throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    int i = iN14;
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string = cursorF.isNull(iN) ? null : cursorF.getString(iN);
                        EnumC3638ek2 enumC3638ek2R = C5027l8.r(cursorF.getInt(iN2));
                        String string2 = cursorF.isNull(iN3) ? null : cursorF.getString(iN3);
                        String string3 = cursorF.isNull(iN4) ? null : cursorF.getString(iN4);
                        b bVarA = b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5));
                        b bVarA2 = b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6));
                        long j = cursorF.getLong(iN7);
                        long j2 = cursorF.getLong(iN8);
                        long j3 = cursorF.getLong(iN9);
                        int i2 = cursorF.getInt(iN10);
                        EnumC1544Mp enumC1544MpO = C5027l8.o(cursorF.getInt(iN11));
                        long j4 = cursorF.getLong(iN12);
                        long j5 = cursorF.getLong(iN13);
                        int i3 = i;
                        long j6 = cursorF.getLong(i3);
                        int i4 = iN;
                        int i5 = iN15;
                        long j7 = cursorF.getLong(i5);
                        iN15 = i5;
                        int i6 = iN16;
                        boolean z = cursorF.getInt(i6) != 0;
                        iN16 = i6;
                        int i7 = iN17;
                        EnumC7428wa1 enumC7428wa1Q = C5027l8.q(cursorF.getInt(i7));
                        iN17 = i7;
                        int i8 = iN18;
                        int i9 = cursorF.getInt(i8);
                        iN18 = i8;
                        int i10 = iN19;
                        int i11 = cursorF.getInt(i10);
                        iN19 = i10;
                        int i12 = iN20;
                        EnumC4593j41 enumC4593j41P = C5027l8.p(cursorF.getInt(i12));
                        iN20 = i12;
                        int i13 = iN21;
                        boolean z2 = cursorF.getInt(i13) != 0;
                        iN21 = i13;
                        int i14 = iN22;
                        boolean z3 = cursorF.getInt(i14) != 0;
                        iN22 = i14;
                        int i15 = iN23;
                        boolean z4 = cursorF.getInt(i15) != 0;
                        iN23 = i15;
                        int i16 = iN24;
                        boolean z5 = cursorF.getInt(i16) != 0;
                        iN24 = i16;
                        int i17 = iN25;
                        long j8 = cursorF.getLong(i17);
                        iN25 = i17;
                        int i18 = iN26;
                        long j9 = cursorF.getLong(i18);
                        iN26 = i18;
                        int i19 = iN27;
                        iN27 = i19;
                        arrayList.add(new Bk2(string, enumC3638ek2R, string2, string3, bVarA, bVarA2, j, j2, j3, new VK(enumC4593j41P, z2, z3, z4, z5, j8, j9, C5027l8.h(cursorF.isNull(i19) ? null : cursorF.getBlob(i19))), i2, enumC1544MpO, j4, j5, j6, j7, z, enumC7428wa1Q, i9, i11));
                        iN = i4;
                        i = i3;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    @Override // defpackage.Ck2
    public final boolean l() {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        boolean z = false;
        SA1 sa1G = SA1.g(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            if (cursorF.moveToFirst() && cursorF.getInt(0) != 0) {
                z = true;
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

    @Override // defpackage.Ck2
    public final ArrayList m(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
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

    @Override // defpackage.Ck2
    public final EnumC3638ek2 n(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        EnumC3638ek2 enumC3638ek2R = null;
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    enumC3638ek2R = C5027l8.r(numValueOf.intValue());
                }
            }
            return enumC3638ek2R;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x021f  */
    @Override // defpackage.Ck2
    public final Bk2 o(String str) throws Throwable {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        SA1 sa1;
        Bk2 bk2;
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            sa1G.P0(1);
        } else {
            sa1G.F(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorF = C3043bv.f(workDatabase_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, "state");
            int iN3 = UE.n(cursorF, "worker_class_name");
            int iN4 = UE.n(cursorF, "input_merger_class_name");
            int iN5 = UE.n(cursorF, "input");
            int iN6 = UE.n(cursorF, "output");
            int iN7 = UE.n(cursorF, "initial_delay");
            int iN8 = UE.n(cursorF, "interval_duration");
            int iN9 = UE.n(cursorF, "flex_duration");
            int iN10 = UE.n(cursorF, "run_attempt_count");
            int iN11 = UE.n(cursorF, "backoff_policy");
            int iN12 = UE.n(cursorF, "backoff_delay_duration");
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
            try {
                int iN13 = UE.n(cursorF, "last_enqueue_time");
                sa1 = sa1G;
                try {
                    int iN14 = UE.n(cursorF, "minimum_retention_duration");
                    int iN15 = UE.n(cursorF, "schedule_requested_at");
                    int iN16 = UE.n(cursorF, "run_in_foreground");
                    int iN17 = UE.n(cursorF, "out_of_quota_policy");
                    int iN18 = UE.n(cursorF, "period_count");
                    int iN19 = UE.n(cursorF, "generation");
                    int iN20 = UE.n(cursorF, "required_network_type");
                    int iN21 = UE.n(cursorF, "requires_charging");
                    int iN22 = UE.n(cursorF, "requires_device_idle");
                    int iN23 = UE.n(cursorF, "requires_battery_not_low");
                    int iN24 = UE.n(cursorF, "requires_storage_not_low");
                    int iN25 = UE.n(cursorF, "trigger_content_update_delay");
                    int iN26 = UE.n(cursorF, "trigger_max_content_delay");
                    int iN27 = UE.n(cursorF, "content_uri_triggers");
                    if (cursorF.moveToFirst()) {
                        bk2 = new Bk2(cursorF.isNull(iN) ? null : cursorF.getString(iN), C5027l8.r(cursorF.getInt(iN2)), cursorF.isNull(iN3) ? null : cursorF.getString(iN3), cursorF.isNull(iN4) ? null : cursorF.getString(iN4), b.a(cursorF.isNull(iN5) ? null : cursorF.getBlob(iN5)), b.a(cursorF.isNull(iN6) ? null : cursorF.getBlob(iN6)), cursorF.getLong(iN7), cursorF.getLong(iN8), cursorF.getLong(iN9), new VK(C5027l8.p(cursorF.getInt(iN20)), cursorF.getInt(iN21) != 0, cursorF.getInt(iN22) != 0, cursorF.getInt(iN23) != 0, cursorF.getInt(iN24) != 0, cursorF.getLong(iN25), cursorF.getLong(iN26), C5027l8.h(cursorF.isNull(iN27) ? null : cursorF.getBlob(iN27))), cursorF.getInt(iN10), C5027l8.o(cursorF.getInt(iN11)), cursorF.getLong(iN12), cursorF.getLong(iN13), cursorF.getLong(iN14), cursorF.getLong(iN15), cursorF.getInt(iN16) != 0, C5027l8.q(cursorF.getInt(iN17)), cursorF.getInt(iN18), cursorF.getInt(iN19));
                    } else {
                        bk2 = null;
                    }
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    return bk2;
                } catch (Throwable th) {
                    th = th;
                    cursorF.close();
                    if (interfaceC2347Wu0 != null) {
                        interfaceC2347Wu0.l();
                    }
                    sa1.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sa1 = sa1G;
                cursorF.close();
                if (interfaceC2347Wu0 != null) {
                    interfaceC2347Wu0.l();
                }
                sa1.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2347Wu0 = interfaceC2347Wu0Y;
        }
    }

    @Override // defpackage.Ck2
    public final int p(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Pk2 pk2 = this.i;
        InterfaceC4005gW1 interfaceC4005gW1A = pk2.a();
        if (str == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.F(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iM = interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
            return iM;
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            pk2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.Ck2
    public final void q(String str, long j) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Nk2 nk2 = this.g;
        InterfaceC4005gW1 interfaceC4005gW1A = nk2.a();
        interfaceC4005gW1A.n0(1, j);
        if (str == null) {
            interfaceC4005gW1A.P0(2);
        } else {
            interfaceC4005gW1A.F(2, str);
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
            nk2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.Ck2
    public final void r(Bk2 bk2) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.f(bk2);
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

    @Override // defpackage.Ck2
    public final ArrayList s(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        SA1 sa1G = SA1.g(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
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
                arrayList.add(b.a(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
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

    @Override // defpackage.Ck2
    public final int t(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Ok2 ok2 = this.h;
        InterfaceC4005gW1 interfaceC4005gW1A = ok2.a();
        if (str == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.F(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iM = interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
            return iM;
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            ok2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.Ck2
    public final int u() {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Ek2 ek2 = this.k;
        InterfaceC4005gW1 interfaceC4005gW1A = ek2.a();
        workDatabase_Impl.c();
        try {
            int iM = interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
            return iM;
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            ek2.d(interfaceC4005gW1A);
        }
    }
}

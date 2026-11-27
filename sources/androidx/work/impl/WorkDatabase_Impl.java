package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C3043bv;
import defpackage.C3057c;
import defpackage.C3213cj0;
import defpackage.C4428iX1;
import defpackage.C4787k01;
import defpackage.C4882kT;
import defpackage.C5999pk2;
import defpackage.C7258vk2;
import defpackage.C7775yC0;
import defpackage.C8047zX;
import defpackage.Ck2;
import defpackage.InterfaceC2324Wm1;
import defpackage.InterfaceC3376dW1;
import defpackage.InterfaceC5579nk2;
import defpackage.InterfaceC6192qg1;
import defpackage.InterfaceC6418rk2;
import defpackage.InterfaceC7627xX;
import defpackage.QA1;
import defpackage.Qk2;
import defpackage.RA1;
import defpackage.Sk2;
import defpackage.Uk2;
import defpackage.VW1;
import defpackage.X81;
import defpackage.YW1;
import defpackage.Yj2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile Qk2 l;
    public volatile C8047zX m;
    public volatile Uk2 n;
    public volatile YW1 o;
    public volatile C5999pk2 p;
    public volatile C7258vk2 q;
    public volatile X81 r;

    public class a extends RA1.a {
        public a() {
            super(16);
        }

        @Override // RA1.a
        public final void a(C3213cj0 c3213cj0) {
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c3213cj0.E("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c3213cj0.E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // RA1.a
        public final void b(C3213cj0 db) {
            db.E("DROP TABLE IF EXISTS `Dependency`");
            db.E("DROP TABLE IF EXISTS `WorkSpec`");
            db.E("DROP TABLE IF EXISTS `WorkTag`");
            db.E("DROP TABLE IF EXISTS `SystemIdInfo`");
            db.E("DROP TABLE IF EXISTS `WorkName`");
            db.E("DROP TABLE IF EXISTS `WorkProgress`");
            db.E("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            ArrayList arrayList = workDatabase_Impl.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) workDatabase_Impl.f.get(i)).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // RA1.a
        public final void c(C3213cj0 db) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            ArrayList arrayList = workDatabase_Impl.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) workDatabase_Impl.f.get(i)).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // RA1.a
        public final void d(C3213cj0 c3213cj0) {
            WorkDatabase_Impl.this.a = c3213cj0;
            c3213cj0.E("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.k(c3213cj0);
            ArrayList arrayList = WorkDatabase_Impl.this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) WorkDatabase_Impl.this.f.get(i)).a(c3213cj0);
                }
            }
        }

        @Override // RA1.a
        public final void e(C3213cj0 c3213cj0) throws IOException {
            C3043bv.d(c3213cj0);
        }

        @Override // RA1.a
        public final RA1.b f(C3213cj0 c3213cj0) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C4428iX1.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new C4428iX1.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C4428iX1.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new C4428iX1.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            C4428iX1 c4428iX1 = new C4428iX1("Dependency", map, hashSet, hashSet2);
            C4428iX1 c4428iX1A = C4428iX1.a(c3213cj0, "Dependency");
            if (!c4428iX1.equals(c4428iX1A)) {
                return new RA1.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c4428iX1 + "\n Found:\n" + c4428iX1A);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new C4428iX1.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new C4428iX1.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new C4428iX1.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new C4428iX1.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new C4428iX1.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new C4428iX1.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new C4428iX1.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new C4428iX1.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new C4428iX1.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new C4428iX1.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new C4428iX1.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new C4428iX1.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new C4428iX1.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new C4428iX1.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new C4428iX1.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new C4428iX1.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new C4428iX1.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new C4428iX1.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new C4428iX1.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("required_network_type", new C4428iX1.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new C4428iX1.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new C4428iX1.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new C4428iX1.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new C4428iX1.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new C4428iX1.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new C4428iX1.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new C4428iX1.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C4428iX1.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new C4428iX1.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            C4428iX1 c4428iX2 = new C4428iX1("WorkSpec", map2, hashSet3, hashSet4);
            C4428iX1 c4428iX1A2 = C4428iX1.a(c3213cj0, "WorkSpec");
            if (!c4428iX2.equals(c4428iX1A2)) {
                return new RA1.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c4428iX2 + "\n Found:\n" + c4428iX1A2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new C4428iX1.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new C4428iX1.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C4428iX1.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C4428iX1 c4428iX3 = new C4428iX1("WorkTag", map3, hashSet5, hashSet6);
            C4428iX1 c4428iX1A3 = C4428iX1.a(c3213cj0, "WorkTag");
            if (!c4428iX3.equals(c4428iX1A3)) {
                return new RA1.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c4428iX3 + "\n Found:\n" + c4428iX1A3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new C4428iX1.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new C4428iX1.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new C4428iX1.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C4428iX1 c4428iX4 = new C4428iX1("SystemIdInfo", map4, hashSet7, new HashSet(0));
            C4428iX1 c4428iX1A4 = C4428iX1.a(c3213cj0, "SystemIdInfo");
            if (!c4428iX4.equals(c4428iX1A4)) {
                return new RA1.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c4428iX4 + "\n Found:\n" + c4428iX1A4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new C4428iX1.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new C4428iX1.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C4428iX1.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C4428iX1 c4428iX5 = new C4428iX1("WorkName", map5, hashSet8, hashSet9);
            C4428iX1 c4428iX1A5 = C4428iX1.a(c3213cj0, "WorkName");
            if (!c4428iX5.equals(c4428iX1A5)) {
                return new RA1.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c4428iX5 + "\n Found:\n" + c4428iX1A5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C4428iX1.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new C4428iX1.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C4428iX1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C4428iX1 c4428iX6 = new C4428iX1("WorkProgress", map6, hashSet10, new HashSet(0));
            C4428iX1 c4428iX1A6 = C4428iX1.a(c3213cj0, "WorkProgress");
            if (!c4428iX6.equals(c4428iX1A6)) {
                return new RA1.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c4428iX6 + "\n Found:\n" + c4428iX1A6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new C4428iX1.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new C4428iX1.a("long_value", "INTEGER", false, 0, null, 1));
            C4428iX1 c4428iX7 = new C4428iX1("Preference", map7, new HashSet(0), new HashSet(0));
            C4428iX1 c4428iX1A7 = C4428iX1.a(c3213cj0, "Preference");
            if (c4428iX7.equals(c4428iX1A7)) {
                return new RA1.b(true, null);
            }
            return new RA1.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c4428iX7 + "\n Found:\n" + c4428iX1A7);
        }
    }

    @Override // defpackage.QA1
    public final C7775yC0 d() {
        return new C7775yC0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.QA1
    public final InterfaceC3376dW1 e(C4882kT c4882kT) {
        RA1 callback = new RA1(c4882kT, new a(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = c4882kT.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return c4882kT.c.a(new InterfaceC3376dW1.b(context, c4882kT.b, callback, false, false));
    }

    @Override // defpackage.QA1
    public final List f(@NonNull LinkedHashMap linkedHashMap) {
        return Arrays.asList(new Yj2(13, 14), new C4787k01());
    }

    @Override // defpackage.QA1
    public final Set<Class<? extends C3057c>> h() {
        return new HashSet();
    }

    @Override // defpackage.QA1
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(Ck2.class, list);
        map.put(InterfaceC7627xX.class, list);
        map.put(Sk2.class, list);
        map.put(VW1.class, list);
        map.put(InterfaceC5579nk2.class, list);
        map.put(InterfaceC6418rk2.class, list);
        map.put(InterfaceC6192qg1.class, list);
        map.put(InterfaceC2324Wm1.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC7627xX p() {
        C8047zX c8047zX;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new C8047zX(this);
                }
                c8047zX = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8047zX;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6192qg1 q() {
        X81 x81;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new X81(this);
                }
                x81 = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x81;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final VW1 r() {
        YW1 yw1;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new YW1(this);
                }
                yw1 = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yw1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC5579nk2 s() {
        C5999pk2 c5999pk2;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new C5999pk2(this);
                }
                c5999pk2 = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5999pk2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6418rk2 t() {
        C7258vk2 c7258vk2;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new C7258vk2(this);
                }
                c7258vk2 = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7258vk2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Ck2 u() {
        Qk2 qk2;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new Qk2(this);
                }
                qk2 = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qk2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Sk2 v() {
        Uk2 uk2;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new Uk2(this);
                }
                uk2 = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uk2;
    }
}

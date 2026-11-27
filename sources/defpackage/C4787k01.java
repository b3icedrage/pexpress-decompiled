package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4787k01 extends AbstractC3899g01 {

    @NotNull
    public static final C4787k01 d = new C4787k01(11, 12);
    public final /* synthetic */ int c = 1;

    public /* synthetic */ C4787k01(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.AbstractC3899g01
    public final void a(C3213cj0 db) {
        switch (this.c) {
            case 0:
                Intrinsics.checkNotNullParameter(db, "db");
                db.E("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                db.E("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                db.E("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                db.E("DROP TABLE `WorkSpec`");
                db.E("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                db.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                db.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                Intrinsics.checkNotNullParameter(db, "db");
                db.E("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues values = new ContentValues(1);
                values.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                db.getClass();
                Intrinsics.checkNotNullParameter("WorkSpec", "table");
                Intrinsics.checkNotNullParameter(values, "values");
                if (values.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size = values.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(C3213cj0.g[3]);
                sb.append("WorkSpec SET ");
                int i = 0;
                for (String str : values.keySet()) {
                    sb.append(i > 0 ? "," : "");
                    sb.append(str);
                    objArr2[i] = values.get(str);
                    sb.append("=?");
                    i++;
                }
                for (int i2 = size; i2 < length; i2++) {
                    objArr2[i2] = objArr[i2 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                InterfaceC4005gW1 statement = db.N(string);
                Intrinsics.checkNotNullParameter(statement, "statement");
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    i3++;
                    if (obj == null) {
                        statement.P0(i3);
                    } else if (obj instanceof byte[]) {
                        statement.v0(i3, (byte[]) obj);
                    } else if (obj instanceof Float) {
                        statement.T(i3, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        statement.T(i3, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        statement.n0(i3, ((Number) obj).longValue());
                    } else if (obj instanceof Integer) {
                        statement.n0(i3, ((Number) obj).intValue());
                    } else if (obj instanceof Short) {
                        statement.n0(i3, ((Number) obj).shortValue());
                    } else if (obj instanceof Byte) {
                        statement.n0(i3, ((Number) obj).byteValue());
                    } else if (obj instanceof String) {
                        statement.F(i3, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        statement.n0(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
                    }
                }
                ((C4052gj0) statement).e.executeUpdateDelete();
                return;
        }
    }

    public C4787k01() {
        super(14, 15);
    }
}

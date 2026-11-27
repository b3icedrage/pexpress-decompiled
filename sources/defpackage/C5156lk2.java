package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5156lk2 extends AbstractC3899g01 {

    @NotNull
    public final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156lk2(@NotNull Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.c = context;
    }

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "db");
        sqLiteDatabase.E("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sqLiteDatabase.x();
            try {
                sqLiteDatabase.c(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sqLiteDatabase.c(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.p0();
                sqLiteDatabase.F0();
            } catch (Throwable th) {
                sqLiteDatabase.F0();
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.x();
            try {
                sqLiteDatabase.c(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sqLiteDatabase.c(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                sqLiteDatabase.p0();
            } finally {
                sqLiteDatabase.F0();
            }
        }
    }
}

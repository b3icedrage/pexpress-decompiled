package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ga1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"LGa1;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "upgradeOutcomeTableRevision1To2", "(Landroid/database/sqlite/SQLiteDatabase;)V", "upgradeOutcomeTableRevision2To3", "upgradeOutcomeTableRevision3To4", "upgradeCacheOutcomeTableRevision1To2", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1034Ga1 {
    public final void upgradeCacheOutcomeTableRevision1To2(@NotNull SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            db.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification;");
            db.execSQL("UPDATE cached_unique_outcome SET channel_type = '" + EnumC1420Kz0.NOTIFICATION + "';");
            db.execSQL("DROP TABLE cached_unique_outcome_notification;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision1To2(@NotNull SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
            db.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
            db.execSQL("DROP TABLE outcome;");
            db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            db.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
            db.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision2To3(@NotNull SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
            db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            db.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux;");
            db.execSQL("DROP TABLE outcome_aux;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision3To4(@NotNull SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("ALTER TABLE outcome ADD COLUMN session_time INTEGER DEFAULT 1;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }
}

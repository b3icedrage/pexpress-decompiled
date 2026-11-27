package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FD1 extends SQLiteOpenHelper {
    public static final String g = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int h = 5;
    public static final List<a> i = Arrays.asList(new AD1(), new BD1(), new CD1(), new DD1(), new ED1());
    public final int d;
    public boolean e;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public FD1(Context context, int i2, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.e = false;
        this.d = i2;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = i;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                list.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.e) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, i2, i3);
    }
}

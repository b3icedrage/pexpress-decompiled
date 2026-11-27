package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.b0;
import io.sentry.android.sqlite.b;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: nT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5515nT extends SQLiteOpenHelper {

    @NotNull
    public final DS0 d;

    @NotNull
    public final File e;
    public boolean g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5515nT(@NotNull Context context, @NotNull String databaseName, @NotNull DS0 logger) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.d = logger;
        File databasePath = context.getDatabasePath(databaseName);
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(databaseName)");
        this.e = databasePath;
        this.g = true;
        this.h = 4;
    }

    public static void f(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!d.o(message, "Cursor window allocation of", false) && !d.o(message, "Could not allocate CursorWindow", false)) {
            throw runtimeException;
        }
        throw new C3988gR(message);
    }

    public final void c() {
        C7823yS0 c7823yS0 = C7823yS0.a;
        try {
            close();
        } catch (Exception e) {
            c7823yS0.error("close failed: " + e.getMessage());
        }
    }

    @Nullable
    public final synchronized Long g(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) l("long_store", key);
    }

    @Nullable
    public final synchronized String k(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) l(Payload.TYPE_STORE, key);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ac A[PHI: r2
      0x00ac: PHI (r2v7 android.database.Cursor) = (r2v5 android.database.Cursor), (r2v6 android.database.Cursor), (r2v8 android.database.Cursor) binds: [B:61:0x00dc, B:53:0x00aa, B:68:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:14:0x0047, B:16:0x0050, B:18:0x0059, B:30:0x0070, B:50:0x00a3, B:51:0x00a6, B:52:0x00a7, B:56:0x00b3, B:58:0x00d2, B:59:0x00d7, B:64:0x00e4, B:66:0x0103, B:67:0x0106), top: B:75:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        String str3;
        String str4;
        String str5;
        String str6;
        String message;
        DS0.a aVar = DS0.a.h;
        DS0.a aVar2 = DS0.a.e;
        b bVar = 0;
        Object string = null;
        if (this.e.exists()) {
            try {
                try {
                    try {
                        try {
                            SQLiteDatabase db = getReadableDatabase();
                            try {
                                if (!this.g) {
                                    close();
                                    return null;
                                }
                                Intrinsics.checkNotNullExpressionValue(db, "db");
                                str3 = "Amplitude";
                                str4 = "getValue from ";
                                str5 = str;
                                try {
                                    cursorQuery = db.query(str5, new String[]{"key", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "key = ?", new String[]{str2}, null, null, null, null);
                                    try {
                                        Intrinsics.checkNotNull(cursorQuery);
                                        if (cursorQuery.moveToFirst()) {
                                            string = str5.equals(Payload.TYPE_STORE) ? cursorQuery.getString(1) : Long.valueOf(cursorQuery.getLong(1));
                                        }
                                        cursorQuery.close();
                                        close();
                                        return string;
                                    } catch (SQLiteException e) {
                                        e = e;
                                    } catch (IllegalStateException e2) {
                                        e = e2;
                                        p(e);
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        close();
                                        return null;
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        f(e);
                                        throw null;
                                    } catch (StackOverflowError e4) {
                                        e = e4;
                                        message = str4 + str5 + " failed: " + e.getMessage();
                                        Intrinsics.checkNotNullParameter(message, "message");
                                        if (aVar2.compareTo(aVar) <= 0) {
                                            b0.c(str3, message);
                                        }
                                        c();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        close();
                                        return null;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    cursorQuery = null;
                                } catch (StackOverflowError e6) {
                                    e = e6;
                                    cursorQuery = null;
                                    message = str4 + str5 + " failed: " + e.getMessage();
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    if (aVar2.compareTo(aVar) <= 0) {
                                        b0.c(str3, message);
                                    }
                                    c();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    close();
                                    return null;
                                }
                            } catch (SQLiteException e7) {
                                e = e7;
                                str3 = "Amplitude";
                                str4 = "getValue from ";
                                str5 = str;
                            }
                            cursorQuery = null;
                            str6 = str3;
                        } catch (Throwable th) {
                            th = th;
                            bVar = "getValue from ";
                            if (bVar != 0) {
                                bVar.close();
                            }
                            close();
                            throw th;
                        }
                    } catch (SQLiteException e8) {
                        e = e8;
                        str6 = "Amplitude";
                        str4 = "getValue from ";
                        str5 = str;
                        cursorQuery = null;
                    }
                } catch (StackOverflowError e9) {
                    e = e9;
                    str3 = "Amplitude";
                    str4 = "getValue from ";
                    str5 = str;
                }
            } catch (IllegalStateException e10) {
                e = e10;
                cursorQuery = null;
            } catch (RuntimeException e11) {
                e = e11;
            } catch (Throwable th2) {
                th = th2;
                if (bVar != 0) {
                    bVar.close();
                }
                close();
                throw th;
            }
            String message2 = str4 + str5 + " failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message2, "message");
            if (aVar2.compareTo(aVar) <= 0) {
                b0.c(str6, message2);
            }
            c();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            close();
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.g = false;
        this.d.error("Attempt to re-create existing legacy database file " + this.e.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@Nullable SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.h = i;
    }

    public final void p(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !StringsKt.C(message, "Couldn't read", false) || !StringsKt.C(message, "CursorWindow", false)) {
            throw illegalStateException;
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d8 A[PHI: r12 r16
      0x00d8: PHI (r12v6 java.util.LinkedList) = (r12v4 java.util.LinkedList), (r12v5 java.util.LinkedList), (r12v8 java.util.LinkedList) binds: [B:67:0x010d, B:59:0x00d6, B:72:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r16v5 android.database.Cursor) = (r16v3 android.database.Cursor), (r16v4 android.database.Cursor), (r16v6 android.database.Cursor) binds: [B:67:0x010d, B:59:0x00d6, B:72:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractList q(String str) throws Throwable {
        String str2;
        DS0.a aVar;
        LinkedList linkedList;
        String str3;
        String str4;
        String str5;
        DS0.a aVar2;
        DS0.a aVar3 = DS0.a.h;
        DS0.a aVar4 = DS0.a.e;
        if (!this.e.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList2 = new LinkedList();
        b bVar = 0;
        cursor = null;
        cursor = null;
        cursor = null;
        cursor = null;
        cursor = null;
        cursor = null;
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        try {
                            SQLiteDatabase db = getReadableDatabase();
                            try {
                                if (!this.g) {
                                    ArrayList arrayList = new ArrayList();
                                    close();
                                    return arrayList;
                                }
                                Intrinsics.checkNotNullExpressionValue(db, "db");
                                str2 = "Amplitude";
                                aVar = aVar3;
                                linkedList = linkedList2;
                                str3 = "read events from ";
                                str4 = str;
                                try {
                                    Cursor cursorQuery = db.query(str4, new String[]{"id", "event"}, null, null, null, null, "id ASC", null);
                                    while (true) {
                                        try {
                                            Intrinsics.checkNotNull(cursorQuery);
                                            if (!cursorQuery.moveToNext()) {
                                                cursorQuery.close();
                                                close();
                                                return linkedList;
                                            }
                                            long j = cursorQuery.getLong(0);
                                            String string = cursorQuery.getString(1);
                                            if (string != null && string.length() != 0) {
                                                JSONObject jSONObject = new JSONObject(string);
                                                jSONObject.put("$rowId", j);
                                                linkedList.add(jSONObject);
                                            }
                                        } catch (SQLiteException e) {
                                            e = e;
                                            cursor = cursorQuery;
                                            str5 = str2;
                                            aVar2 = aVar;
                                            String message = str3 + str4 + " failed: " + e.getMessage();
                                            Intrinsics.checkNotNullParameter(message, "message");
                                            if (aVar4.compareTo(aVar2) <= 0) {
                                                b0.c(str5, message);
                                            }
                                            c();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                            cursor = cursorQuery;
                                            p(e);
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        } catch (RuntimeException e3) {
                                            e = e3;
                                            f(e);
                                            throw null;
                                        } catch (StackOverflowError e4) {
                                            e = e4;
                                            cursor = cursorQuery;
                                            String message2 = str3 + str4 + " failed: " + e.getMessage();
                                            Intrinsics.checkNotNullParameter(message2, "message");
                                            if (aVar4.compareTo(aVar) <= 0) {
                                                b0.c(str2, message2);
                                            }
                                            c();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        }
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                } catch (IllegalStateException e6) {
                                    e = e6;
                                } catch (StackOverflowError e7) {
                                    e = e7;
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                                str2 = "Amplitude";
                                aVar = aVar3;
                                linkedList = linkedList2;
                                str3 = "read events from ";
                                str4 = str;
                            }
                        } catch (Throwable th) {
                            th = th;
                            bVar = "read events from ";
                            if (bVar != 0) {
                                bVar.close();
                            }
                            close();
                            throw th;
                        }
                    } catch (RuntimeException e9) {
                        e = e9;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = "read events from ";
                    str5 = "Amplitude";
                    aVar2 = aVar3;
                    linkedList = linkedList2;
                    str4 = str;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                linkedList = linkedList2;
            } catch (StackOverflowError e12) {
                e = e12;
                str2 = "Amplitude";
                aVar = aVar3;
                linkedList = linkedList2;
                str3 = "read events from ";
                str4 = str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void t(String str, long j) {
        DS0.a aVar = DS0.a.h;
        DS0.a aVar2 = DS0.a.e;
        try {
            getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j)});
        } catch (StackOverflowError e) {
            String message = "remove events from " + str + " failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (aVar2.compareTo(aVar) <= 0) {
                b0.c("Amplitude", message);
            }
            c();
        } catch (SQLiteException e2) {
            String message2 = "remove events from " + str + " failed: " + e2.getMessage();
            Intrinsics.checkNotNullParameter(message2, "message");
            if (aVar2.compareTo(aVar) <= 0) {
                b0.c("Amplitude", message2);
            }
            c();
        } finally {
            close();
        }
    }

    public final synchronized void u(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        v(key);
    }

    public final void v(String str) {
        DS0.a aVar = DS0.a.h;
        DS0.a aVar2 = DS0.a.e;
        try {
            getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
        } catch (SQLiteException e) {
            String message = "remove value from long_store failed: " + e.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            if (aVar2.compareTo(aVar) <= 0) {
                b0.c("Amplitude", message);
            }
            c();
        } catch (StackOverflowError e2) {
            String message2 = "remove value from long_store failed: " + e2.getMessage();
            Intrinsics.checkNotNullParameter(message2, "message");
            if (aVar2.compareTo(aVar) <= 0) {
                b0.c("Amplitude", message2);
            }
            c();
        } finally {
            close();
        }
    }
}

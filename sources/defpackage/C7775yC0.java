package defpackage;

import android.database.sqlite.SQLiteException;
import io.sentry.android.core.b0;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7775yC0 {

    @NotNull
    public static final String[] m = {"UPDATE", "DELETE", "INSERT"};

    @NotNull
    public final QA1 a;

    @NotNull
    public final HashMap b;

    @NotNull
    public final LinkedHashMap c;

    @NotNull
    public final String[] d;

    @NotNull
    public final AtomicBoolean e;
    public volatile boolean f;

    @Nullable
    public volatile InterfaceC4005gW1 g;

    @NotNull
    public final b h;

    @NotNull
    public final C3945gC1<c, d> i;

    @NotNull
    public final Object j;

    @NotNull
    public final Object k;

    @NotNull
    public final RunnableC7985zC0 l;

    /* JADX INFO: renamed from: yC0$a */
    public static final class a {
        @NotNull
        public static String a(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* JADX INFO: renamed from: yC0$b */
    public static final class b {

        @NotNull
        public final long[] a;

        @NotNull
        public final boolean[] b;

        @NotNull
        public final int[] c;
        public boolean d;

        public b(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        @Nullable
        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: yC0$c */
    public static abstract class c {
        public abstract void a(@NotNull Set<String> set);
    }

    /* JADX INFO: renamed from: yC0$d */
    public static final class d {
    }

    public C7775yC0(@NotNull QA1 database, @NotNull HashMap shadowTablesMap, @NotNull HashMap viewTables, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = database;
        this.b = shadowTablesMap;
        this.e = new AtomicBoolean(false);
        this.h = new b(tableNames.length);
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new C3945gC1<>();
        this.j = new Object();
        this.k = new Object();
        this.c = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = tableNames[i];
            Locale locale = Locale.US;
            String strG = C4564j.g(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.c.put(strG, Integer.valueOf(i));
            String str2 = (String) this.b.get(tableNames[i]);
            String strG2 = str2 != null ? C4564j.g(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (strG2 != null) {
                strG = strG2;
            }
            strArr[i] = strG;
        }
        this.d = strArr;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strG3 = C4564j.g(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.c.containsKey(strG3)) {
                String strG4 = C4564j.g(locale2, "US", (String) entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.c;
                linkedHashMap.put(strG4, PW0.d(linkedHashMap, strG3));
            }
        }
        this.l = new RunnableC7985zC0(this);
    }

    public final boolean a() {
        C3213cj0 c3213cj0 = this.a.a;
        if (!Intrinsics.a(c3213cj0 != null ? Boolean.valueOf(c3213cj0.d.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f) {
            this.a.g().A0();
        }
        if (this.f) {
            return true;
        }
        b0.c("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(InterfaceC3166cW1 interfaceC3166cW1, int i) {
        interfaceC3166cW1.E("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.d[i];
        String[] strArr = m;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC3166cW1.E(str3);
        }
    }

    public final void c(@NotNull InterfaceC3166cW1 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.T0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.h.readLock();
            Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    int[] iArrA = this.h.a();
                    if (iArrA != null) {
                        Intrinsics.checkNotNullParameter(database, "database");
                        if (database.e1()) {
                            database.r0();
                        } else {
                            database.x();
                        }
                        try {
                            int length = iArrA.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = iArrA[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    b(database, i2);
                                } else if (i3 == 2) {
                                    String str = this.d[i2];
                                    String[] strArr = m;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + a.a(str, strArr[i5]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.E(str2);
                                    }
                                }
                                i++;
                                i2 = i4;
                            }
                            database.p0();
                            database.F0();
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            database.F0();
                            throw th;
                        }
                    }
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (SQLiteException e) {
            b0.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            b0.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}

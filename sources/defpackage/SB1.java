package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SB1 implements T80, JW1, LD {
    public static final H60 j = new H60("proto");
    public final FD1 d;
    public final InterfaceC3529eE e;
    public final InterfaceC3529eE g;
    public final U80 h;
    public final InterfaceC1531Mk1<String> i;

    public interface a<T, U> {
        U apply(T t);
    }

    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public SB1(InterfaceC3529eE interfaceC3529eE, InterfaceC3529eE interfaceC3529eE2, U80 u80, FD1 fd1, InterfaceC1531Mk1<String> interfaceC1531Mk1) {
        this.d = fd1;
        this.e = interfaceC3529eE;
        this.g = interfaceC3529eE2;
        this.h = u80;
        this.i = interfaceC1531Mk1;
    }

    public static Long p(SQLiteDatabase sQLiteDatabase, C1778Po c1778Po) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1778Po.a, String.valueOf(C7456wh1.a(c1778Po.c))));
        byte[] bArr = c1778Po.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String u(Iterable<AbstractC6809td1> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC6809td1> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T v(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // defpackage.T80
    public final C0918Eo V(final C1778Po c1778Po, final AbstractC6081q80 abstractC6081q80) {
        abstractC6081q80.g();
        if (Log.isLoggable(OS0.c("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(c1778Po.c);
        }
        long jLongValue = ((Long) q(new a() { // from class: OB1
            @Override // SB1.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SB1 sb1 = this.d;
                long jSimpleQueryForLong = sb1.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * sb1.l().compileStatement("PRAGMA page_count").simpleQueryForLong();
                U80 u80 = sb1.h;
                long jE = u80.e();
                AbstractC6081q80 abstractC6081q81 = abstractC6081q80;
                if (jSimpleQueryForLong >= jE) {
                    sb1.k(1L, C5090lS0.a.CACHE_FULL, abstractC6081q81.g());
                    return -1L;
                }
                C1778Po c1778Po2 = c1778Po;
                Long lP = SB1.p(sQLiteDatabase, c1778Po2);
                if (lP != null) {
                    jInsert = lP.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c1778Po2.a);
                    contentValues.put("priority", Integer.valueOf(C7456wh1.a(c1778Po2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c1778Po2.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = u80.d();
                byte[] bArr2 = abstractC6081q81.d().b;
                boolean z = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", abstractC6081q81.g());
                contentValues2.put("timestamp_ms", Long.valueOf(abstractC6081q81.e()));
                contentValues2.put("uptime_ms", Long.valueOf(abstractC6081q81.h()));
                contentValues2.put("payload_encoding", abstractC6081q81.d().a.a);
                contentValues2.put("code", abstractC6081q81.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iD));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iD, Math.min(i * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(abstractC6081q81.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new C0918Eo(jLongValue, c1778Po, abstractC6081q80);
    }

    @Override // defpackage.LD
    public final void c() {
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            sQLiteDatabaseL.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseL.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.e.d()).execute();
            sQLiteDatabaseL.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.LD
    public final UD f() {
        int i = UD.e;
        UD.a aVar = new UD.a();
        aVar.a = null;
        aVar.b = new ArrayList();
        aVar.c = null;
        aVar.d = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            UD ud = (UD) v(sQLiteDatabaseL.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new RB1(this, map, aVar));
            sQLiteDatabaseL.setTransactionSuccessful();
            return ud;
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }

    @Override // defpackage.T80
    public final Iterable<V42> f0() {
        return (Iterable) q(new C4694ja0(3));
    }

    @Override // defpackage.T80
    public final Iterable f1(final C1778Po c1778Po) {
        return (Iterable) q(new a() { // from class: NB1
            @Override // SB1.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SB1 sb1 = this.d;
                U80 u80 = sb1.h;
                int iC = u80.c();
                C1778Po c1778Po2 = c1778Po;
                ArrayList arrayListT = sb1.t(sQLiteDatabase, c1778Po2, iC);
                for (EnumC6825th1 enumC6825th1 : EnumC6825th1.values()) {
                    if (enumC6825th1 != c1778Po2.c) {
                        int iC2 = u80.c() - arrayListT.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListT.addAll(sb1.t(sQLiteDatabase, c1778Po2.d(enumC6825th1), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayListT.size(); i++) {
                    sb.append(((AbstractC6809td1) arrayListT.get(i)).b());
                    if (i < arrayListT.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        long j2 = cursorQuery.getLong(0);
                        Set hashSet = (Set) map.get(Long.valueOf(j2));
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(Long.valueOf(j2), hashSet);
                        }
                        hashSet.add(new SB1.b(cursorQuery.getString(1), cursorQuery.getString(2)));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                ListIterator listIterator = arrayListT.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC6809td1 abstractC6809td1 = (AbstractC6809td1) listIterator.next();
                    if (map.containsKey(Long.valueOf(abstractC6809td1.b()))) {
                        C7060uo.a aVarI = abstractC6809td1.a().i();
                        for (SB1.b bVar : (Set) map.get(Long.valueOf(abstractC6809td1.b()))) {
                            aVarI.a(bVar.a, bVar.b);
                        }
                        listIterator.set(new C0918Eo(abstractC6809td1.b(), abstractC6809td1.c(), aVarI.b()));
                    }
                }
                return arrayListT;
            }
        });
    }

    @Override // defpackage.JW1
    public final <T> T g(JW1.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        InterfaceC3529eE interfaceC3529eE = this.g;
        long jD = interfaceC3529eE.d();
        while (true) {
            try {
                sQLiteDatabaseL.beginTransaction();
                try {
                    T tC = aVar.c();
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return tC;
                } finally {
                    sQLiteDatabaseL.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3529eE.d() >= ((long) this.h.a()) + jD) {
                    throw new IW1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.T80
    public final int j() {
        long jD = this.e.d() - this.h.b();
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jD)};
            Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    k(cursorRawQuery.getInt(0), C5090lS0.a.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseL.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseL.setTransactionSuccessful();
            sQLiteDatabaseL.endTransaction();
            return iDelete;
        } catch (Throwable th2) {
            sQLiteDatabaseL.endTransaction();
            throw th2;
        }
    }

    @Override // defpackage.T80
    public final long j0(V42 v42) {
        Cursor cursorRawQuery = l().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{v42.a(), String.valueOf(C7456wh1.a(v42.c()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // defpackage.LD
    public final void k(final long j2, final C5090lS0.a aVar, final String str) {
        q(new a() { // from class: QB1
            @Override // SB1.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i = aVar.d;
                String string = Integer.toString(i);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j3 = j2;
                    if (z) {
                        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.T80
    public final boolean k0(C1778Po c1778Po) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            Long lP = p(sQLiteDatabaseL, c1778Po);
            if (lP == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lP.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseL.setTransactionSuccessful();
            sQLiteDatabaseL.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseL.endTransaction();
            throw th2;
        }
    }

    public final SQLiteDatabase l() {
        FD1 fd1 = this.d;
        Objects.requireNonNull(fd1);
        InterfaceC3529eE interfaceC3529eE = this.g;
        long jD = interfaceC3529eE.d();
        while (true) {
            try {
                return fd1.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3529eE.d() >= ((long) this.h.a()) + jD) {
                    throw new IW1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.T80
    public final void n1(Iterable<AbstractC6809td1> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + u(iterable);
            SQLiteDatabase sQLiteDatabaseL = l();
            sQLiteDatabaseL.beginTransaction();
            try {
                sQLiteDatabaseL.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        k(cursorRawQuery.getInt(0), C5090lS0.a.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseL.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseL.setTransactionSuccessful();
                sQLiteDatabaseL.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseL.endTransaction();
                throw th2;
            }
        }
    }

    public final <T> T q(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseL);
            sQLiteDatabaseL.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }

    public final ArrayList t(SQLiteDatabase sQLiteDatabase, C1778Po c1778Po, int i) {
        ArrayList arrayList = new ArrayList();
        Long lP = p(sQLiteDatabase, c1778Po);
        if (lP == null) {
            return arrayList;
        }
        v(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lP.toString()}, null, null, null, String.valueOf(i)), new C7259vl(this, arrayList, c1778Po));
        return arrayList;
    }

    @Override // defpackage.T80
    public final void w(final long j2, final C1778Po c1778Po) {
        q(new a() { // from class: PB1
            @Override // SB1.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                C1778Po c1778Po2 = c1778Po;
                EnumC6825th1 enumC6825th1 = c1778Po2.c;
                String strValueOf = String.valueOf(C7456wh1.a(enumC6825th1));
                String str = c1778Po2.a;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, strValueOf}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(C7456wh1.a(enumC6825th1)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.T80
    public final void z(Iterable<AbstractC6809td1> iterable) {
        if (iterable.iterator().hasNext()) {
            l().compileStatement("DELETE FROM events WHERE _id in " + u(iterable)).execute();
        }
    }
}

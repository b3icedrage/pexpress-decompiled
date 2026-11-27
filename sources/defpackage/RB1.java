package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RB1 implements SB1.a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RB1(Object obj, Object obj2, Object obj3) {
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }

    @Override // SB1.a
    public Object apply(Object obj) {
        HashMap map;
        Cursor cursor = (Cursor) obj;
        SB1 sb1 = (SB1) this.d;
        sb1.getClass();
        while (true) {
            boolean zMoveToNext = cursor.moveToNext();
            map = (HashMap) this.e;
            if (!zMoveToNext) {
                break;
            }
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            C5090lS0.a aVar = C5090lS0.a.REASON_UNKNOWN;
            if (i != 0) {
                if (i == 1) {
                    aVar = C5090lS0.a.MESSAGE_TOO_OLD;
                } else if (i == 2) {
                    aVar = C5090lS0.a.CACHE_FULL;
                } else if (i == 3) {
                    aVar = C5090lS0.a.PAYLOAD_TOO_BIG;
                } else if (i == 4) {
                    aVar = C5090lS0.a.MAX_RETRIES_REACHED;
                } else if (i == 5) {
                    aVar = C5090lS0.a.INVALID_PAYLOD;
                } else if (i == 6) {
                    aVar = C5090lS0.a.SERVER_ERROR;
                } else {
                    OS0.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
                }
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new C5090lS0(j, aVar));
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            UD.a aVar2 = (UD.a) this.g;
            if (!zHasNext) {
                long jD = sb1.e.d();
                SQLiteDatabase sQLiteDatabaseL = sb1.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        BZ1 bz1 = new BZ1(cursorRawQuery.getLong(0), jD);
                        cursorRawQuery.close();
                        sQLiteDatabaseL.setTransactionSuccessful();
                        sQLiteDatabaseL.endTransaction();
                        aVar2.a = bz1;
                        aVar2.c = new C5795om0(new PQ1(sb1.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * sb1.l().compileStatement("PRAGMA page_count").simpleQueryForLong(), U80.a.b));
                        aVar2.d = sb1.i.get();
                        return new UD(aVar2.a, Collections.unmodifiableList(aVar2.b), aVar2.c, aVar2.d);
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseL.endTransaction();
                    throw th2;
                }
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = C6352rS0.c;
            new ArrayList();
            aVar2.b.add(new C6352rS0((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
    }
}

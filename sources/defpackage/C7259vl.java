package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7259vl implements MD1, SB1.a {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C7259vl(Object obj, Object obj2, Object obj3) {
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }

    @Override // SB1.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        SB1 sb1 = (SB1) this.d;
        sb1.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            C7060uo.a aVar = new C7060uo.a();
            aVar.f = new HashMap();
            String string = cursor.getString(1);
            if (string == null) {
                throw new NullPointerException("Null transportName");
            }
            aVar.a = string;
            aVar.d = Long.valueOf(cursor.getLong(2));
            aVar.e = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string2 = cursor.getString(4);
                aVar.c = new B60(string2 == null ? SB1.j : new H60(string2), cursor.getBlob(5));
            } else {
                String string3 = cursor.getString(4);
                H60 h60 = string3 == null ? SB1.j : new H60(string3);
                Cursor cursorQuery = sb1.l().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = 0;
                    while (cursorQuery.moveToNext()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        arrayList.add(blob);
                        length += blob.length;
                    }
                    byte[] bArr = new byte[length];
                    int length2 = 0;
                    for (int i = 0; i < arrayList.size(); i++) {
                        byte[] bArr2 = (byte[]) arrayList.get(i);
                        System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                        length2 += bArr2.length;
                    }
                    cursorQuery.close();
                    aVar.c = new B60(h60, bArr);
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!cursor.isNull(6)) {
                aVar.b = Integer.valueOf(cursor.getInt(6));
            }
            ((ArrayList) this.e).add(new C0918Eo(j, (C1778Po) this.g, aVar.b()));
        }
        return null;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C0831Dl.a aVar = (C0831Dl.a) this.d;
        scope.B(aVar.d);
        C3849fl c3849fl = (C3849fl) this.e;
        scope.h(c3849fl.a);
        scope.b("auth.stuck_step", (String) this.g);
        scope.b("auth.attempt_id", aVar.b);
        scope.m(c3849fl.b);
    }
}

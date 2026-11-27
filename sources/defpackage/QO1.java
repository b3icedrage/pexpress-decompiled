package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public final class QO1 {
    public static final boolean a;
    public static final a b;
    public static final b c;
    public static final NO1.a d;
    public static final OO1.a e;
    public static final PO1.a f;

    public class a extends C3161cV.a<Date> {
        @Override // defpackage.C3161cV.a
        public final java.util.Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends C3161cV.a<Timestamp> {
        @Override // defpackage.C3161cV.a
        public final java.util.Date a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(Date.class);
            c = new b(Timestamp.class);
            d = NO1.b;
            e = OO1.b;
            f = PO1.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}

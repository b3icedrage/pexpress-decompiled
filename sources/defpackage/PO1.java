package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class PO1 extends T52<Timestamp> {
    public static final a b = new a();
    public final T52<Date> a;

    public class a implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            gson.getClass();
            return new PO1(gson.f(TypeToken.get(Date.class)));
        }
    }

    public PO1(T52 t52) {
        this.a = t52;
    }

    @Override // defpackage.T52
    public final Timestamp a(C7790yH0 c7790yH0) {
        Date dateA = this.a.a(c7790yH0);
        if (dateA != null) {
            return new Timestamp(dateA.getTime());
        }
        return null;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Timestamp timestamp) {
        this.a.b(zh0, timestamp);
    }
}

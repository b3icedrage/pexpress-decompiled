package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class NO1 extends T52<Date> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new NO1();
            }
            return null;
        }
    }

    @Override // defpackage.T52
    public final Date a(C7790yH0 c7790yH0) throws IOException {
        java.util.Date date;
        if (c7790yH0.G() == JH0.m) {
            c7790yH0.A();
            return null;
        }
        String strB = c7790yH0.B();
        try {
            synchronized (this) {
                date = this.a.parse(strB);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as SQL Date; at path ");
            sbB.append(c7790yH0.p());
            throw new HH0(sbB.toString(), e);
        }
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            zh0.l();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date2);
        }
        zh0.C(str);
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class OO1 extends T52<Time> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new OO1();
            }
            return null;
        }
    }

    @Override // defpackage.T52
    public final Time a(C7790yH0 c7790yH0) throws IOException {
        Time time;
        if (c7790yH0.G() == JH0.m) {
            c7790yH0.A();
            return null;
        }
        String strB = c7790yH0.B();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(strB).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as SQL Time; at path ");
            sbB.append(c7790yH0.p());
            throw new HH0(sbB.toString(), e);
        }
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Time time) throws IOException {
        String str;
        Time time2 = time;
        if (time2 == null) {
            zh0.l();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time2);
        }
        zh0.C(str);
    }
}

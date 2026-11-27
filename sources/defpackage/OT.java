package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OT extends T52<Date> {
    public static final a b = new a();
    public final ArrayList a;

    public class a implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new OT();
            }
            return null;
        }
    }

    public OT() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4163hF0.a >= 9) {
            arrayList.add(C6561sS.i(2, 2));
        }
    }

    @Override // defpackage.T52
    public final Date a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() == JH0.m) {
            c7790yH0.A();
            return null;
        }
        String strB = c7790yH0.B();
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strB);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return C0937Eu0.b(strB, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as Date; at path ");
                    sbB.append(c7790yH0.p());
                    throw new HH0(sbB.toString(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date2);
        }
        zh0.C(str);
    }
}

package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3161cV<T extends Date> extends T52<T> {
    public final a<T> a;
    public final ArrayList b;

    public C3161cV(a aVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(aVar);
        this.a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C4163hF0.a >= 9) {
            arrayList.add(C6561sS.i(i, i2));
        }
    }

    @Override // defpackage.T52
    public final Object a(C7790yH0 c7790yH0) throws IOException {
        Date dateB;
        if (c7790yH0.G() == JH0.m) {
            c7790yH0.A();
            return null;
        }
        String strB = c7790yH0.B();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    try {
                        dateB = ((DateFormat) it.next()).parse(strB);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    dateB = C0937Eu0.b(strB, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as Date; at path ");
                    sbB.append(c7790yH0.p());
                    throw new HH0(sbB.toString(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.a(dateB);
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            zh0.l();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        zh0.C(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* JADX INFO: renamed from: cV$a */
    public static abstract class a<T extends Date> {
        public static final C0263a b = new C0263a(Date.class);
        public final Class<T> a;

        public a(Class<T> cls) {
            this.a = cls;
        }

        public abstract T a(Date date);

        /* JADX INFO: renamed from: cV$a$a, reason: collision with other inner class name */
        public class C0263a extends a<Date> {
            @Override // defpackage.C3161cV.a
            public final Date a(Date date) {
                return date;
            }
        }
    }
}

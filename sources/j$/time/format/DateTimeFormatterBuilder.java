package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    private static final a f = new a();
    public static final /* synthetic */ int g = 0;
    private DateTimeFormatterBuilder a;
    private final DateTimeFormatterBuilder b;
    private final ArrayList c;
    private final boolean d;
    private int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.a;
        map.put('Q', rVar);
        map.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }

    public final void n() {
        d(m.SENSITIVE);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        d(m.INSENSITIVE);
        return this;
    }

    public final void p() {
        d(m.STRICT);
    }

    public final void o() {
        d(m.LENIENT);
    }

    public final void i(j$.time.temporal.r rVar, int i) {
        Objects.requireNonNull(rVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        h(new i(rVar, i, i, x.NOT_NEGATIVE));
    }

    public final void j(j$.time.temporal.r rVar, int i, int i2, x xVar) {
        if (i == i2 && xVar == x.NOT_NEGATIVE) {
            i(rVar, i2);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(xVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        h(new i(rVar, i, i2, xVar));
    }

    private void h(i iVar) {
        i iVarC;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i = dateTimeFormatterBuilder.e;
        if (i >= 0) {
            i iVar2 = (i) dateTimeFormatterBuilder.c.get(i);
            int i2 = iVar.b;
            int i3 = iVar.c;
            if (i2 == i3 && iVar.d == x.NOT_NEGATIVE) {
                iVarC = iVar2.d(i3);
                d(iVar.c());
                this.a.e = i;
            } else {
                iVarC = iVar2.c();
                this.a.e = d(iVar);
            }
            this.a.c.set(i, iVarC);
            return;
        }
        dateTimeFormatterBuilder.e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.A().g()) {
            d(gVar);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    public final void g(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y yVar = y.FULL;
        d(new o(aVar, yVar, new b(new t(Collections.singletonMap(yVar, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        d(j.e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        d(new j(str, str2));
        return this;
    }

    public final void k() {
        d(new n(f, 1));
    }

    public final void e(char c) {
        d(new d(c));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(str, 0));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.e());
    }

    public final void m() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.e = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void l() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            e eVar = new e(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
            this.a = this.a.b;
            d(eVar);
            return;
        }
        this.a = this.a.b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.getClass();
        dateTimeFormatterBuilder.c.add(fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.e = -1;
        return dateTimeFormatterBuilder2.c.size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return r(Locale.getDefault(), w.SMART, null);
    }

    final DateTimeFormatter q(w wVar, j$.time.chrono.s sVar) {
        return r(Locale.getDefault(), wVar, sVar);
    }

    private DateTimeFormatter r(Locale locale, w wVar, j$.time.chrono.s sVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            l();
        }
        e eVar = new e(this.c, false);
        u uVar = u.a;
        return new DateTimeFormatter(eVar, locale, wVar, sVar);
    }
}

package j$.time.format;

import com.google.android.gms.actions.SearchIntents;
import j$.time.DateTimeException;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    private final e a;
    private final Locale b;
    private final u c;
    private final w d;
    private final j$.time.chrono.s e;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        x xVar = x.EXCEEDS_PAD;
        dateTimeFormatterBuilder.j(aVar, 4, 10, xVar);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.i(aVar2, 2);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.i(aVar3, 2);
        w wVar = w.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(wVar, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterQ);
        caseInsensitive.appendOffsetId().q(wVar, sVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterQ);
        caseInsensitive2.m();
        caseInsensitive2.appendOffsetId().q(wVar, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.i(aVar4, 2);
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.i(aVar5, 2);
        dateTimeFormatterBuilder2.m();
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.i(aVar6, 2);
        dateTimeFormatterBuilder2.m();
        dateTimeFormatterBuilder2.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder2.q(wVar, null);
        f = dateTimeFormatterQ2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterQ2);
        caseInsensitive3.appendOffsetId().q(wVar, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterQ2);
        caseInsensitive4.m();
        caseInsensitive4.appendOffsetId().q(wVar, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterQ);
        caseInsensitive5.e('T');
        caseInsensitive5.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = caseInsensitive5.q(wVar, sVar);
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterQ3);
        caseInsensitive6.o();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId.p();
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilderAppendOffsetId.q(wVar, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder3.m();
        dateTimeFormatterBuilder3.e('[');
        dateTimeFormatterBuilder3.n();
        dateTimeFormatterBuilder3.k();
        dateTimeFormatterBuilder3.e(']');
        dateTimeFormatterBuilder3.q(wVar, sVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder4.m();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.m();
        dateTimeFormatterBuilderAppendOffsetId2.e('[');
        dateTimeFormatterBuilderAppendOffsetId2.n();
        dateTimeFormatterBuilderAppendOffsetId2.k();
        dateTimeFormatterBuilderAppendOffsetId2.e(']');
        dateTimeFormatterBuilderAppendOffsetId2.q(wVar, sVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.j(aVar, 4, 10, xVar);
        caseInsensitive7.e('-');
        caseInsensitive7.i(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.m();
        caseInsensitive7.appendOffsetId().q(wVar, sVar);
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.j(j$.time.temporal.j.c, 4, 10, xVar);
        caseInsensitive8.f("-W");
        caseInsensitive8.i(j$.time.temporal.j.b, 2);
        caseInsensitive8.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.i(aVar7, 1);
        caseInsensitive8.m();
        caseInsensitive8.appendOffsetId().q(wVar, sVar);
        DateTimeFormatterBuilder caseInsensitive9 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.c();
        ISO_INSTANT = caseInsensitive9.q(wVar, null);
        DateTimeFormatterBuilder caseInsensitive10 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.i(aVar, 4);
        caseInsensitive10.i(aVar2, 2);
        caseInsensitive10.i(aVar3, 2);
        caseInsensitive10.m();
        caseInsensitive10.o();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.p();
        dateTimeFormatterBuilderAppendOffset.q(wVar, sVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive11 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.o();
        caseInsensitive11.m();
        caseInsensitive11.g(aVar7, map);
        caseInsensitive11.f(", ");
        caseInsensitive11.l();
        caseInsensitive11.j(aVar3, 1, 2, x.NOT_NEGATIVE);
        caseInsensitive11.e(' ');
        caseInsensitive11.g(aVar2, map2);
        caseInsensitive11.e(' ');
        caseInsensitive11.i(aVar, 4);
        caseInsensitive11.e(' ');
        caseInsensitive11.i(aVar4, 2);
        caseInsensitive11.e(':');
        caseInsensitive11.i(aVar5, 2);
        caseInsensitive11.m();
        caseInsensitive11.e(':');
        caseInsensitive11.i(aVar6, 2);
        caseInsensitive11.l();
        caseInsensitive11.e(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").q(w.SMART, sVar);
    }

    DateTimeFormatter(e eVar, Locale locale, w wVar, j$.time.chrono.s sVar) {
        u uVar = u.a;
        this.a = eVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        this.c = uVar;
        Objects.requireNonNull(wVar, "resolverStyle");
        this.d = wVar;
        this.e = sVar;
    }

    public final Locale c() {
        return this.b;
    }

    public final u b() {
        return this.c;
    }

    public final j$.time.chrono.l a() {
        return this.e;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.a.p(new r(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, SearchIntents.EXTRA_QUERY);
        try {
            return (T) ((v) d(charSequence)).b(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    private TemporalAccessor d(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        p pVar = new p(this);
        int iR = this.a.r(pVar, charSequence, parsePosition.getIndex());
        if (iR < 0) {
            parsePosition.setErrorIndex(~iR);
            pVar = null;
        } else {
            parsePosition.setIndex(iR);
        }
        if (pVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        return pVar.s(this.d);
    }

    final e e() {
        return this.a.a();
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}

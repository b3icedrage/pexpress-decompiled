package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class p {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;

    p(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = dateTimeFormatter;
        arrayList.add(new v());
    }

    final p c() {
        p pVar = new p(this.a);
        pVar.b = this.b;
        pVar.c = this.c;
        return pVar;
    }

    final Locale h() {
        return this.a.c();
    }

    final u f() {
        return this.a.b();
    }

    final j$.time.chrono.l g() {
        j$.time.chrono.l lVar = d().c;
        if (lVar != null) {
            return lVar;
        }
        j$.time.chrono.l lVarA = this.a.a();
        return lVarA == null ? j$.time.chrono.s.d : lVarA;
    }

    final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    final boolean j() {
        return this.b;
    }

    final void l(boolean z) {
        this.b = z;
    }

    final boolean r(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    final boolean k() {
        return this.c;
    }

    final void p(boolean z) {
        this.c = z;
    }

    final void q() {
        ArrayList arrayList = this.d;
        v vVarD = d();
        vVarD.getClass();
        v vVar = new v();
        vVar.a.putAll(vVarD.a);
        vVar.b = vVarD.b;
        vVar.c = vVarD.c;
        vVar.d = vVarD.d;
        arrayList.add(vVar);
    }

    final void e(boolean z) {
        ArrayList arrayList = this.d;
        if (z) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private v d() {
        ArrayList arrayList = this.d;
        return (v) arrayList.get(arrayList.size() - 1);
    }

    final TemporalAccessor s(w wVar) {
        v vVarD = d();
        vVarD.c = g();
        ZoneId zoneId = vVarD.b;
        if (zoneId == null) {
            this.a.getClass();
            zoneId = null;
        }
        vVarD.b = zoneId;
        vVarD.r(wVar);
        return vVarD;
    }

    final Long i(j$.time.temporal.a aVar) {
        return (Long) d().a.get(aVar);
    }

    final int n(j$.time.temporal.r rVar, long j, int i, int i2) {
        Objects.requireNonNull(rVar, "field");
        Long l = (Long) d().a.put(rVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().b = zoneId;
    }

    final void o() {
        d().d = true;
    }

    public final String toString() {
        return d().toString();
    }
}

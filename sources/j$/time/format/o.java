package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class o implements f {
    private final j$.time.temporal.a a;
    private final y b;
    private final b c;
    private volatile i d;

    o(j$.time.temporal.a aVar, y yVar, b bVar) {
        this.a = aVar;
        this.b = yVar;
        this.c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean p(r rVar, StringBuilder sb) {
        String strA;
        Long lE = rVar.e(this.a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) rVar.d().b(j$.time.temporal.s.a());
        if (lVar == null || lVar == j$.time.chrono.s.d) {
            long jLongValue = lE.longValue();
            y yVar = this.b;
            rVar.c();
            strA = this.c.a.a(jLongValue, yVar);
        } else {
            long jLongValue2 = lE.longValue();
            y yVar2 = this.b;
            rVar.c();
            strA = this.c.a.a(jLongValue2, yVar2);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.p(rVar, sb);
    }

    @Override // j$.time.format.f
    public final int r(p pVar, CharSequence charSequence, int i) {
        Iterator itB;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        y yVar = pVar.k() ? this.b : null;
        j$.time.chrono.l lVarG = pVar.g();
        b bVar = this.c;
        j$.time.temporal.a aVar = this.a;
        if (lVarG == null || lVarG == j$.time.chrono.s.d) {
            pVar.h();
            itB = bVar.a.b(yVar);
        } else {
            pVar.h();
            itB = bVar.a.b(yVar);
        }
        Iterator it = itB;
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (pVar.r(str, 0, charSequence, i, str.length())) {
                    return pVar.n(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (aVar == j$.time.temporal.a.ERA && !pVar.k()) {
                for (j$.time.chrono.m mVar : lVarG.B()) {
                    String string = mVar.toString();
                    if (pVar.r(string, 0, charSequence, i, string.length())) {
                        return pVar.n(this.a, mVar.p(), i, string.length() + i);
                    }
                }
            }
            if (pVar.k()) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.r(pVar, charSequence, i);
    }

    public final String toString() {
        y yVar = y.FULL;
        j$.time.temporal.a aVar = this.a;
        y yVar2 = this.b;
        if (yVar2 == yVar) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + yVar2 + ")";
    }
}

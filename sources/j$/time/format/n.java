package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class n implements f {
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.time.format.f
    public final boolean p(r rVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                sb.append((String) this.b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) rVar.f((a) this.b);
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.getId());
                return true;
        }
    }

    @Override // j$.time.format.f
    public final int r(p pVar, CharSequence charSequence, int i) {
        int i2;
        switch (this.a) {
            case 0:
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.b;
                return !pVar.r(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt != '+' && cCharAt != '-') {
                        int i3 = i + 2;
                        if (length >= i3) {
                            char cCharAt2 = charSequence.charAt(i + 1);
                            if (pVar.a(cCharAt, 'U') && pVar.a(cCharAt2, 'T')) {
                                int i4 = i + 3;
                                if (length >= i4 && pVar.a(charSequence.charAt(i3), 'C')) {
                                    return a(pVar, charSequence, i, i4, j.f);
                                }
                                return a(pVar, charSequence, i, i3, j.f);
                            }
                            if (pVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && pVar.a(cCharAt2, 'M') && pVar.a(charSequence.charAt(i3), 'T')) {
                                int i5 = i + 4;
                                if (length >= i5 && pVar.a(charSequence.charAt(i2), '0')) {
                                    pVar.m(ZoneId.A("GMT0"));
                                    return i5;
                                }
                                return a(pVar, charSequence, i, i2, j.f);
                            }
                        }
                        Set setA = j$.time.zone.j.a();
                        int size = setA.size();
                        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = pVar.j() ? c : d;
                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                            synchronized (this) {
                                try {
                                    simpleImmutableEntry = pVar.j() ? c : d;
                                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(setA, pVar));
                                        if (pVar.j()) {
                                            c = simpleImmutableEntry;
                                        } else {
                                            d = simpleImmutableEntry;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        l lVar = (l) simpleImmutableEntry.getValue();
                        ParsePosition parsePosition = new ParsePosition(i);
                        String strC = lVar.c(charSequence, parsePosition);
                        if (strC == null) {
                            if (pVar.a(cCharAt, 'Z')) {
                                pVar.m(ZoneOffset.UTC);
                                return i + 1;
                            }
                        } else {
                            pVar.m(ZoneId.A(strC));
                            return parsePosition.getIndex();
                        }
                    } else {
                        return a(pVar, charSequence, i, i, j.e);
                    }
                    break;
                }
                return ~i;
        }
    }

    private static int a(p pVar, CharSequence charSequence, int i, int i2, j jVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            pVar.m(ZoneId.A(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || pVar.a(charSequence.charAt(i2), 'Z')) {
            pVar.m(ZoneId.A(upperCase));
            return i2;
        }
        p pVarC = pVar.c();
        int iR = jVar.r(pVarC, charSequence, i2);
        try {
            if (iR < 0) {
                if (jVar == j.e) {
                    return ~i;
                }
                pVar.m(ZoneId.A(upperCase));
                return i2;
            }
            pVar.m(ZoneId.Q(upperCase, ZoneOffset.ofTotalSeconds((int) pVarC.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            return iR;
        } catch (DateTimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "'" + ((String) this.b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}

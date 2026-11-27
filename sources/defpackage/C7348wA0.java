package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: wA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7348wA0 {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final C5473nF d;
    public String e;
    public int f;
    public C5527nX g;
    public C0624Au h;

    /* JADX INFO: renamed from: wA0$a */
    public static class a {
        public final int a;
        public final boolean b;
        public final boolean c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.c = z;
            this.b = z2;
        }
    }

    public C7348wA0(C5473nF c5473nF) {
        ArrayList arrayList = (ArrayList) c5473nF.b;
        HashMap map = new HashMap();
        b(Arrays.asList(new C6835tk('*'), new C7553x82('_')), map);
        b(arrayList, map);
        this.c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = c5473nF;
    }

    public static void a(char c, InterfaceC5737oX interfaceC5737oX, HashMap map) {
        if (((InterfaceC5737oX) map.put(Character.valueOf(c), interfaceC5737oX)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(List list, HashMap map) {
        ZO1 zo1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5737oX interfaceC5737oX = (InterfaceC5737oX) it.next();
            char cE = interfaceC5737oX.e();
            char cB = interfaceC5737oX.b();
            if (cE == cB) {
                InterfaceC5737oX interfaceC5737oX2 = (InterfaceC5737oX) map.get(Character.valueOf(cE));
                if (interfaceC5737oX2 == null || interfaceC5737oX2.e() != interfaceC5737oX2.b()) {
                    a(cE, interfaceC5737oX, map);
                } else {
                    if (interfaceC5737oX2 instanceof ZO1) {
                        zo1 = (ZO1) interfaceC5737oX2;
                    } else {
                        ZO1 zo2 = new ZO1(cE);
                        zo2.f(interfaceC5737oX2);
                        zo1 = zo2;
                    }
                    zo1.f(interfaceC5737oX);
                    map.put(Character.valueOf(cE), zo1);
                }
            } else {
                a(cE, interfaceC5737oX, map);
                a(cB, interfaceC5737oX, map);
            }
        }
    }

    public static void d(RX1 rx1, RX1 rx2, int i2) {
        if (rx1 == null || rx2 == null || rx1 == rx2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(rx1.f);
        AbstractC6909u51 abstractC6909u51 = rx1.e;
        AbstractC6909u51 abstractC6909u52 = rx2.e;
        while (abstractC6909u51 != abstractC6909u52) {
            sb.append(((RX1) abstractC6909u51).f);
            AbstractC6909u51 abstractC6909u53 = abstractC6909u51.e;
            abstractC6909u51.f();
            abstractC6909u51 = abstractC6909u53;
        }
        rx1.f = sb.toString();
    }

    public static void e(AbstractC6909u51 abstractC6909u51, AbstractC6909u51 abstractC6909u52) {
        RX1 rx1 = null;
        RX1 rx2 = null;
        int length = 0;
        while (abstractC6909u51 != null) {
            if (abstractC6909u51 instanceof RX1) {
                rx2 = (RX1) abstractC6909u51;
                if (rx1 == null) {
                    rx1 = rx2;
                }
                length = rx2.f.length() + length;
            } else {
                d(rx1, rx2, length);
                rx1 = null;
                rx2 = null;
                length = 0;
            }
            if (abstractC6909u51 == abstractC6909u52) {
                break;
            } else {
                abstractC6909u51 = abstractC6909u51.e;
            }
        }
        d(rx1, rx2, length);
    }

    public final String c(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f4 A[PHI: r10
      0x01f4: PHI (r10v27 char) = (r10v26 char), (r10v28 char), (r10v29 char) binds: [B:112:0x01ea, B:114:0x01ee, B:117:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x0242  */
    /* JADX WARN: Code duplicated, block: B:142:0x024c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0267  */
    /* JADX WARN: Code duplicated, block: B:158:0x0289  */
    /* JADX WARN: Code duplicated, block: B:159:0x0291  */
    /* JADX WARN: Code duplicated, block: B:161:0x0295  */
    /* JADX WARN: Code duplicated, block: B:162:0x029e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f1 A[LOOP:3: B:173:0x02ef->B:174:0x02f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0304  */
    /* JADX WARN: Code duplicated, block: B:181:0x0312 A[ADDED_TO_REGION, LOOP:4: B:181:0x0312->B:185:0x031b, LOOP_START, PHI: r2
      0x0312: PHI (r2v71 Au) = (r2v70 Au), (r2v72 Au) binds: [B:180:0x0310, B:185:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0314  */
    /* JADX WARN: Code duplicated, block: B:184:0x0318  */
    /* JADX WARN: Code duplicated, block: B:186:0x031e  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:231:0x0463  */
    /* JADX WARN: Code duplicated, block: B:233:0x046b  */
    /* JADX WARN: Code duplicated, block: B:260:0x050f  */
    /* JADX WARN: Code duplicated, block: B:278:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [RX1] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [u51] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v62, types: [u51] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v26 */
    public final void f(String str, AbstractC6909u51 abstractC6909u51) {
        int i2;
        AbstractC6909u51 rn1;
        ?? r10;
        int i3;
        ?? rx1;
        AbstractC6909u51 rx2;
        ?? rx3;
        RX1 rx4;
        C5717oQ0 c5717oQ0;
        AbstractC6909u51 rx5;
        String strA;
        String strA2;
        int i4;
        boolean z;
        AbstractC6909u51 abstractC6909u52;
        AbstractC6909u51 abstractC6909u53;
        AbstractC6909u51 abstractC6909u54;
        C0624Au c0624Au;
        int i5;
        int i6;
        String strSubstring;
        C5927pQ0 c5927pQ0;
        int iN;
        int iO;
        int i7;
        Object rx6;
        ?? r5;
        ?? r9;
        a aVar;
        int i8 = 1;
        this.e = str.trim();
        int i9 = 0;
        this.f = 0;
        a aVar2 = null;
        this.g = null;
        this.h = null;
        ?? r6 = 0;
        while (true) {
            char cG = g();
            if (cG == 0) {
                i3 = i8;
                i2 = i9;
                rx1 = aVar2;
            } else {
                if (cG == '\n') {
                    this.f++;
                    if (r6 instanceof RX1) {
                        RX1 rx7 = (RX1) r6;
                        if (rx7.f.endsWith(" ")) {
                            String str2 = rx7.f;
                            Matcher matcher = t.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (iEnd > 0) {
                                i2 = 0;
                                rx7.f = str2.substring(0, str2.length() - iEnd);
                            } else {
                                i2 = 0;
                            }
                            rn1 = iEnd >= 2 ? new C1072Gn0() : new RN1();
                        } else {
                            i2 = 0;
                            rn1 = new RN1();
                        }
                    } else {
                        i2 = 0;
                        rn1 = new RN1();
                    }
                    r10 = rn1;
                } else if (cG == '!') {
                    int i10 = this.f + 1;
                    this.f = i10;
                    if (g() == '[') {
                        this.f++;
                        rx3 = new RX1("![");
                        C0624Au c0624Au2 = this.h;
                        C0624Au c0624Au3 = new C0624Au(rx3, i10, c0624Au2, this.g, true);
                        if (c0624Au2 != null) {
                            c0624Au2.g = true;
                        }
                        this.h = c0624Au3;
                    } else {
                        rx2 = new RX1("!");
                        rx3 = rx2;
                    }
                    i2 = 0;
                    r10 = rx3;
                } else if (cG == '&') {
                    String strC = c(l);
                    if (strC != null) {
                        rx4 = new RX1(C5385mp0.a(strC));
                        rx3 = rx4;
                    } else {
                        rx3 = 0;
                    }
                    i2 = 0;
                    r10 = rx3;
                } else if (cG == '<') {
                    String strC2 = c(o);
                    if (strC2 != null) {
                        String strSubstring2 = strC2.substring(1, strC2.length() - 1);
                        c5717oQ0 = new C5717oQ0(C5491nL.c("mailto:", strSubstring2), null);
                        c5717oQ0.b(new RX1(strSubstring2));
                    } else {
                        String strC3 = c(p);
                        if (strC3 != null) {
                            String strSubstring3 = strC3.substring(1, strC3.length() - 1);
                            c5717oQ0 = new C5717oQ0(strSubstring3, null);
                            c5717oQ0.b(new RX1(strSubstring3));
                        } else {
                            rx3 = 0;
                        }
                        if (rx3 == 0) {
                            if (c(j) != null) {
                                rx2 = new C6015pp0();
                                rx3 = rx2;
                            } else {
                                rx3 = 0;
                            }
                        }
                        i2 = 0;
                        r10 = rx3;
                    }
                    rx3 = c5717oQ0;
                    if (rx3 == 0) {
                        if (c(j) != null) {
                            rx2 = new C6015pp0();
                            rx3 = rx2;
                        } else {
                            rx3 = 0;
                        }
                    }
                    i2 = 0;
                    r10 = rx3;
                } else if (cG != '`') {
                    switch (cG) {
                        case '[':
                            int i11 = this.f;
                            this.f = i11 + 1;
                            rx4 = new RX1("[");
                            C0624Au c0624Au4 = this.h;
                            C0624Au c0624Au5 = new C0624Au(rx4, i11, c0624Au4, this.g, false);
                            if (c0624Au4 != null) {
                                c0624Au4.g = true;
                            }
                            this.h = c0624Au5;
                            rx3 = rx4;
                            i2 = 0;
                            r10 = rx3;
                            break;
                        case '\\':
                            this.f++;
                            if (g() == '\n') {
                                rx2 = new C1072Gn0();
                                this.f++;
                            } else {
                                if (this.f < this.e.length()) {
                                    String str3 = this.e;
                                    int i12 = this.f;
                                    if (k.matcher(str3.substring(i12, i12 + 1)).matches()) {
                                        String str4 = this.e;
                                        int i13 = this.f;
                                        rx5 = new RX1(str4.substring(i13, i13 + 1));
                                        this.f++;
                                        rx3 = rx5;
                                        i2 = 0;
                                        r10 = rx3;
                                    }
                                }
                                rx2 = new RX1("\\");
                            }
                            rx3 = rx2;
                            i2 = 0;
                            r10 = rx3;
                            break;
                        case ']':
                            int i14 = this.f + i8;
                            this.f = i14;
                            C0624Au c0624Au6 = this.h;
                            if (c0624Au6 == null) {
                                rx5 = new RX1("]");
                            } else if (c0624Au6.f) {
                                if (g() == '(') {
                                    this.f += i8;
                                    Pattern pattern = q;
                                    c(pattern);
                                    int iM = C6561sS.m(this.f, this.e);
                                    if (iM == -1) {
                                        i8 = i8;
                                        strA = null;
                                    } else {
                                        String strSubstring4 = g() == '<' ? this.e.substring(this.f + i8, iM - 1) : this.e.substring(this.f, iM);
                                        this.f = iM;
                                        strA = T70.a(strSubstring4);
                                    }
                                    if (strA != null) {
                                        c(pattern);
                                        String str5 = this.e;
                                        int i15 = this.f;
                                        if (s.matcher(str5.substring(i15 - 1, i15)).matches()) {
                                            String str6 = this.e;
                                            int i16 = this.f;
                                            if (i16 >= str6.length()) {
                                                i7 = -1;
                                            } else {
                                                char cCharAt = str6.charAt(i16);
                                                char c = '\"';
                                                if (cCharAt != '\"') {
                                                    c = '\'';
                                                    if (cCharAt == '\'') {
                                                        iO = C6561sS.o(str6, i16 + 1, c);
                                                        if (iO == -1 && iO < str6.length() && str6.charAt(iO) == c) {
                                                            i7 = iO + 1;
                                                        } else {
                                                            i7 = -1;
                                                        }
                                                    } else if (cCharAt != '(') {
                                                        i7 = -1;
                                                    } else {
                                                        c = ')';
                                                        iO = C6561sS.o(str6, i16 + 1, c);
                                                        if (iO == -1) {
                                                            i7 = -1;
                                                        } else {
                                                            i7 = iO + 1;
                                                        }
                                                    }
                                                } else {
                                                    iO = C6561sS.o(str6, i16 + 1, c);
                                                    if (iO == -1) {
                                                        i7 = -1;
                                                    } else {
                                                        i7 = iO + 1;
                                                    }
                                                }
                                            }
                                            if (i7 == -1) {
                                                strA2 = null;
                                            } else {
                                                String strSubstring5 = this.e.substring(this.f + 1, i7 - 1);
                                                this.f = i7;
                                                strA2 = T70.a(strSubstring5);
                                            }
                                            c(pattern);
                                        } else {
                                            strA2 = null;
                                        }
                                        if (g() == ')') {
                                            this.f++;
                                            i4 = i8;
                                        } else {
                                            this.f = i14;
                                        }
                                        if (i4 == 0) {
                                            i5 = this.f;
                                            if (i5 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                int i17 = this.f + 1;
                                                iN = C6561sS.n(i17, this.e);
                                                int i18 = iN - i17;
                                                if (iN != -1 && i18 <= 999 && iN < this.e.length() && this.e.charAt(iN) == ']') {
                                                    this.f = iN + 1;
                                                }
                                            }
                                            i6 = this.f - i5;
                                            if (i6 > 2) {
                                                strSubstring = this.e.substring(i5, i6 + i5);
                                            } else if (c0624Au6.g) {
                                                strSubstring = null;
                                            } else {
                                                strSubstring = this.e.substring(c0624Au6.b, i14);
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern2 = T70.a;
                                                c5927pQ0 = (C5927pQ0) ((Map) this.d.a).get(T70.c.matcher(strSubstring.substring(i8, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (c5927pQ0 != null) {
                                                    strA = c5927pQ0.g;
                                                    strA2 = c5927pQ0.h;
                                                    i4 = 1;
                                                }
                                            }
                                        }
                                        if (i4 == 0) {
                                            this.f = i14;
                                            this.h = this.h.d;
                                            rx2 = new RX1("]");
                                            rx3 = rx2;
                                            i2 = 0;
                                            r10 = rx3;
                                        } else {
                                            z = c0624Au6.c;
                                            if (z) {
                                                C4095gw0 c4095gw0 = new C4095gw0();
                                                c4095gw0.f = strA;
                                                c4095gw0.g = strA2;
                                                rx5 = c4095gw0;
                                            } else {
                                                rx5 = new C5717oQ0(strA, strA2);
                                            }
                                            RX1 rx8 = c0624Au6.a;
                                            abstractC6909u52 = rx8.e;
                                            while (abstractC6909u52 != null) {
                                                AbstractC6909u51 abstractC6909u55 = abstractC6909u52.e;
                                                rx5.b(abstractC6909u52);
                                                abstractC6909u52 = abstractC6909u55;
                                            }
                                            h(c0624Au6.e);
                                            abstractC6909u53 = rx5.b;
                                            abstractC6909u54 = rx5.c;
                                            if (abstractC6909u53 != abstractC6909u54) {
                                                e(abstractC6909u53, abstractC6909u54);
                                            }
                                            rx8.f();
                                            c0624Au = this.h.d;
                                            this.h = c0624Au;
                                            if (!z) {
                                                while (c0624Au != null) {
                                                    if (!c0624Au.c) {
                                                        c0624Au.f = false;
                                                    }
                                                    c0624Au = c0624Au.d;
                                                }
                                            }
                                        }
                                    }
                                    i4 = 0;
                                    if (i4 == 0) {
                                        i5 = this.f;
                                        if (i5 < this.e.length()) {
                                            int i19 = this.f + 1;
                                            iN = C6561sS.n(i19, this.e);
                                            int i110 = iN - i19;
                                            if (iN != -1) {
                                                this.f = iN + 1;
                                            }
                                        }
                                        i6 = this.f - i5;
                                        if (i6 > 2) {
                                            strSubstring = this.e.substring(i5, i6 + i5);
                                        } else if (c0624Au6.g) {
                                            strSubstring = this.e.substring(c0624Au6.b, i14);
                                        } else {
                                            strSubstring = null;
                                        }
                                        if (strSubstring != null) {
                                            Pattern pattern3 = T70.a;
                                            c5927pQ0 = (C5927pQ0) ((Map) this.d.a).get(T70.c.matcher(strSubstring.substring(i8, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (c5927pQ0 != null) {
                                                strA = c5927pQ0.g;
                                                strA2 = c5927pQ0.h;
                                                i4 = 1;
                                            }
                                        }
                                    }
                                    if (i4 == 0) {
                                        this.f = i14;
                                        this.h = this.h.d;
                                        rx2 = new RX1("]");
                                        rx3 = rx2;
                                        i2 = 0;
                                        r10 = rx3;
                                    } else {
                                        z = c0624Au6.c;
                                        if (z) {
                                            C4095gw0 c4095gw1 = new C4095gw0();
                                            c4095gw1.f = strA;
                                            c4095gw1.g = strA2;
                                            rx5 = c4095gw1;
                                        } else {
                                            rx5 = new C5717oQ0(strA, strA2);
                                        }
                                        RX1 rx9 = c0624Au6.a;
                                        abstractC6909u52 = rx9.e;
                                        while (abstractC6909u52 != null) {
                                            AbstractC6909u51 abstractC6909u56 = abstractC6909u52.e;
                                            rx5.b(abstractC6909u52);
                                            abstractC6909u52 = abstractC6909u56;
                                        }
                                        h(c0624Au6.e);
                                        abstractC6909u53 = rx5.b;
                                        abstractC6909u54 = rx5.c;
                                        if (abstractC6909u53 != abstractC6909u54) {
                                            e(abstractC6909u53, abstractC6909u54);
                                        }
                                        rx9.f();
                                        c0624Au = this.h.d;
                                        this.h = c0624Au;
                                        if (!z) {
                                            while (c0624Au != null) {
                                                if (!c0624Au.c) {
                                                    c0624Au.f = false;
                                                }
                                                c0624Au = c0624Au.d;
                                            }
                                        }
                                    }
                                } else {
                                    i8 = i8;
                                    strA = null;
                                }
                                strA2 = null;
                                i4 = 0;
                                if (i4 == 0) {
                                    i5 = this.f;
                                    if (i5 < this.e.length()) {
                                        int i111 = this.f + 1;
                                        iN = C6561sS.n(i111, this.e);
                                        int i112 = iN - i111;
                                        if (iN != -1) {
                                            this.f = iN + 1;
                                        }
                                    }
                                    i6 = this.f - i5;
                                    if (i6 > 2) {
                                        strSubstring = this.e.substring(i5, i6 + i5);
                                    } else if (c0624Au6.g) {
                                        strSubstring = this.e.substring(c0624Au6.b, i14);
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (strSubstring != null) {
                                        Pattern pattern4 = T70.a;
                                        c5927pQ0 = (C5927pQ0) ((Map) this.d.a).get(T70.c.matcher(strSubstring.substring(i8, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                        if (c5927pQ0 != null) {
                                            strA = c5927pQ0.g;
                                            strA2 = c5927pQ0.h;
                                            i4 = 1;
                                        }
                                    }
                                }
                                if (i4 == 0) {
                                    this.f = i14;
                                    this.h = this.h.d;
                                    rx2 = new RX1("]");
                                    rx3 = rx2;
                                    i2 = 0;
                                    r10 = rx3;
                                } else {
                                    z = c0624Au6.c;
                                    if (z) {
                                        C4095gw0 c4095gw2 = new C4095gw0();
                                        c4095gw2.f = strA;
                                        c4095gw2.g = strA2;
                                        rx5 = c4095gw2;
                                    } else {
                                        rx5 = new C5717oQ0(strA, strA2);
                                    }
                                    RX1 rx10 = c0624Au6.a;
                                    abstractC6909u52 = rx10.e;
                                    while (abstractC6909u52 != null) {
                                        AbstractC6909u51 abstractC6909u57 = abstractC6909u52.e;
                                        rx5.b(abstractC6909u52);
                                        abstractC6909u52 = abstractC6909u57;
                                    }
                                    h(c0624Au6.e);
                                    abstractC6909u53 = rx5.b;
                                    abstractC6909u54 = rx5.c;
                                    if (abstractC6909u53 != abstractC6909u54) {
                                        e(abstractC6909u53, abstractC6909u54);
                                    }
                                    rx10.f();
                                    c0624Au = this.h.d;
                                    this.h = c0624Au;
                                    if (!z) {
                                        while (c0624Au != null) {
                                            if (!c0624Au.c) {
                                                c0624Au.f = false;
                                            }
                                            c0624Au = c0624Au.d;
                                        }
                                    }
                                }
                            } else {
                                this.h = c0624Au6.d;
                                rx5 = new RX1("]");
                            }
                            rx3 = rx5;
                            i2 = 0;
                            r10 = rx3;
                            break;
                        default:
                            if (this.b.get(cG)) {
                                InterfaceC5737oX interfaceC5737oX = (InterfaceC5737oX) this.c.get(Character.valueOf(cG));
                                int i20 = this.f;
                                int i21 = i9;
                                while (g() == cG) {
                                    i21 += i8;
                                    this.f += i8;
                                }
                                if (i21 < interfaceC5737oX.c()) {
                                    this.f = i20;
                                    aVar = aVar2;
                                } else {
                                    String strSubstring6 = i20 == 0 ? "\n" : this.e.substring(i20 - 1, i20);
                                    char cG2 = g();
                                    String strValueOf = cG2 != 0 ? String.valueOf(cG2) : "\n";
                                    Pattern pattern5 = i;
                                    boolean zMatches = pattern5.matcher(strSubstring6).matches();
                                    Pattern pattern6 = r;
                                    boolean zMatches2 = pattern6.matcher(strSubstring6).matches();
                                    boolean zMatches3 = pattern5.matcher(strValueOf).matches();
                                    boolean zMatches4 = pattern6.matcher(strValueOf).matches();
                                    int i22 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i9 : i8;
                                    int i23 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i9 : i8;
                                    if (cG == '_') {
                                        int i24 = (i22 == 0 || !(i23 == 0 || zMatches)) ? i9 : i8;
                                        if (i23 == 0 || !(i22 == 0 || zMatches3)) {
                                            r9 = i9;
                                            r5 = i24;
                                        } else {
                                            r9 = i8;
                                            r5 = i24;
                                        }
                                    } else {
                                        int i25 = (i22 == 0 || cG != interfaceC5737oX.e()) ? i9 : i8;
                                        int i26 = (i23 == 0 || cG != interfaceC5737oX.b()) ? i9 : i8;
                                        r5 = i25;
                                        r9 = i26;
                                    }
                                    this.f = i20;
                                    aVar = new a(i21, r5, r9);
                                }
                                if (aVar == null) {
                                    rx6 = aVar2;
                                } else {
                                    int i27 = this.f;
                                    int i28 = aVar.a;
                                    int i29 = i27 + i28;
                                    this.f = i29;
                                    RX1 rx11 = new RX1(this.e.substring(i27, i29));
                                    C5527nX c5527nX = this.g;
                                    C5527nX c5527nX2 = new C5527nX(rx11, cG, aVar.c, aVar.b, c5527nX);
                                    this.g = c5527nX2;
                                    c5527nX2.g = i28;
                                    c5527nX2.h = i28;
                                    if (c5527nX != null) {
                                        c5527nX.f = c5527nX2;
                                    }
                                    rx6 = rx11;
                                }
                            } else {
                                int i30 = this.f;
                                int length = this.e.length();
                                while (true) {
                                    int i31 = this.f;
                                    if (i31 != length && !this.a.get(this.e.charAt(i31))) {
                                        this.f += i8;
                                    }
                                }
                                int i32 = this.f;
                                if (i30 != i32) {
                                    rx6 = new RX1(this.e.substring(i30, i32));
                                } else {
                                    rx6 = aVar2;
                                }
                            }
                            i2 = i9;
                            r10 = rx6;
                            break;
                    }
                } else {
                    String strC4 = c(n);
                    if (strC4 == null) {
                        rx3 = 0;
                    } else {
                        int i33 = this.f;
                        while (true) {
                            String strC5 = c(m);
                            if (strC5 == null) {
                                this.f = i33;
                                rx4 = new RX1(strC4);
                                rx3 = rx4;
                            } else if (strC5.equals(strC4)) {
                                C7359wE c7359wE = new C7359wE();
                                String strReplace = this.e.substring(i33, this.f - strC4.length()).replace('\n', ' ');
                                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                    int length2 = strReplace.length();
                                    if (U0.m(' ', 0, length2, strReplace) != length2) {
                                        strReplace = strReplace.substring(1, strReplace.length() - 1);
                                    }
                                }
                                c7359wE.f = strReplace;
                                rx3 = c7359wE;
                            }
                        }
                    }
                    i2 = 0;
                    r10 = rx3;
                }
                if (r10 != 0) {
                    rx1 = r10;
                    i3 = 1;
                } else {
                    i3 = 1;
                    this.f++;
                    rx1 = new RX1(String.valueOf(cG));
                }
            }
            if (rx1 == 0) {
                h(null);
                AbstractC6909u51 abstractC6909u58 = abstractC6909u51.b;
                AbstractC6909u51 abstractC6909u59 = abstractC6909u51.c;
                if (abstractC6909u58 == abstractC6909u59) {
                    return;
                }
                e(abstractC6909u58, abstractC6909u59);
                return;
            }
            abstractC6909u51.b(rx1);
            i9 = i2;
            i8 = i3;
            aVar2 = null;
            r6 = rx1;
        }
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(C5527nX c5527nX) {
        boolean z;
        AbstractC6909u51 abstractC6909u51;
        HashMap map = new HashMap();
        C5527nX c5527nX2 = this.g;
        while (c5527nX2 != null) {
            C5527nX c5527nX3 = c5527nX2.e;
            if (c5527nX3 == c5527nX) {
                break;
            } else {
                c5527nX2 = c5527nX3;
            }
        }
        while (c5527nX2 != null) {
            HashMap map2 = this.c;
            char c = c5527nX2.b;
            InterfaceC5737oX interfaceC5737oX = (InterfaceC5737oX) map2.get(Character.valueOf(c));
            if (!c5527nX2.d || interfaceC5737oX == null) {
                c5527nX2 = c5527nX2.f;
            } else {
                char cE = interfaceC5737oX.e();
                C5527nX c5527nX4 = c5527nX2.e;
                int iD = 0;
                boolean z2 = false;
                while (true) {
                    if (c5527nX4 == null || c5527nX4 == c5527nX || c5527nX4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (c5527nX4.c && c5527nX4.b == cE) {
                        iD = interfaceC5737oX.d(c5527nX4, c5527nX2);
                        z2 = true;
                        if (iD > 0) {
                            z = true;
                            break;
                        }
                    }
                    c5527nX4 = c5527nX4.e;
                }
                if (z2) {
                    RX1 rx1 = c5527nX4.a;
                    c5527nX4.g -= iD;
                    c5527nX2.g -= iD;
                    String str = rx1.f;
                    rx1.f = str.substring(0, str.length() - iD);
                    RX1 rx2 = c5527nX2.a;
                    String str2 = rx2.f;
                    rx2.f = str2.substring(0, str2.length() - iD);
                    C5527nX c5527nX5 = c5527nX2.e;
                    while (c5527nX5 != null && c5527nX5 != c5527nX4) {
                        C5527nX c5527nX6 = c5527nX5.e;
                        i(c5527nX5);
                        c5527nX5 = c5527nX6;
                    }
                    if (rx1 != rx2 && (abstractC6909u51 = rx1.e) != rx2) {
                        e(abstractC6909u51, rx2.d);
                    }
                    interfaceC5737oX.a(rx1, rx2, iD);
                    if (c5527nX4.g == 0) {
                        c5527nX4.a.f();
                        i(c5527nX4);
                    }
                    if (c5527nX2.g == 0) {
                        C5527nX c5527nX7 = c5527nX2.f;
                        rx2.f();
                        i(c5527nX2);
                        c5527nX2 = c5527nX7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), c5527nX2.e);
                        if (!c5527nX2.c) {
                            i(c5527nX2);
                        }
                    }
                    c5527nX2 = c5527nX2.f;
                }
            }
        }
        while (true) {
            C5527nX c5527nX8 = this.g;
            if (c5527nX8 == null || c5527nX8 == c5527nX) {
                return;
            } else {
                i(c5527nX8);
            }
        }
    }

    public final void i(C5527nX c5527nX) {
        C5527nX c5527nX2 = c5527nX.e;
        if (c5527nX2 != null) {
            c5527nX2.f = c5527nX.f;
        }
        C5527nX c5527nX3 = c5527nX.f;
        if (c5527nX3 == null) {
            this.g = c5527nX2;
        } else {
            c5527nX3.e = c5527nX2;
        }
    }
}

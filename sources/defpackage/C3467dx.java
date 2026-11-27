package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3467dx {
    public boolean a;

    /* JADX INFO: renamed from: dx$a */
    public static class a {
        public final String a;
        public final b b;
        public final String c;

        public a(String str, b bVar, String str2) {
            this.a = str;
            this.b = bVar;
            this.c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: dx$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final /* synthetic */ b[] i;

        static {
            b bVar = new b("EXISTS", 0);
            d = bVar;
            b bVar2 = new b("EQUALS", 1);
            e = bVar2;
            b bVar3 = new b("INCLUDES", 2);
            g = bVar3;
            b bVar4 = new b("DASHMATCH", 3);
            h = bVar4;
            i = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) i.clone();
        }
    }

    /* JADX INFO: renamed from: dx$c */
    public static class c extends C2673aC1.h {

        /* JADX INFO: renamed from: dx$c$a */
        public static class a {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        public c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.a.charAt(this.b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i = 1; i <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb.append((char) iR2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb.toString();
        }

        public final String t() {
            int i;
            int i2;
            boolean zF = f();
            String str = this.a;
            if (zF) {
                i2 = this.b;
            } else {
                int i3 = this.b;
                int iCharAt = str.charAt(i3);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i = i3;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i = this.b;
                }
                this.b = i3;
                i2 = i;
            }
            int i4 = this.b;
            if (i2 == i4) {
                return null;
            }
            String strSubstring = str.substring(i4, i2);
            this.b = i2;
            return strSubstring;
        }

        /* JADX WARN: Code duplicated, block: B:129:0x01de  */
        /* JADX WARN: Code duplicated, block: B:195:0x0300  */
        /* JADX WARN: Code duplicated, block: B:249:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:258:0x040b  */
        /* JADX WARN: Code duplicated, block: B:263:0x0427  */
        /* JADX WARN: Code duplicated, block: B:265:0x042b  */
        /* JADX WARN: Code duplicated, block: B:269:0x0441  */
        /* JADX WARN: Code duplicated, block: B:26:0x0052  */
        /* JADX WARN: Code duplicated, block: B:273:0x0450  */
        /* JADX WARN: Code duplicated, block: B:289:0x044a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:290:0x043d A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [dx$b] */
        /* JADX WARN: Type inference failed for: r11v68 */
        /* JADX WARN: Type inference failed for: r11v69 */
        /* JADX WARN: Type inference failed for: r12v26 */
        /* JADX WARN: Type inference failed for: r12v27 */
        /* JADX WARN: Type inference failed for: r12v28, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v32 */
        /* JADX WARN: Type inference failed for: r12v33 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [dx$d] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v9, types: [dx$c$a] */
        /* JADX WARN: Type inference failed for: r9v10, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v13, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v14, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v15, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v16, types: [dx$r] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v5, types: [int] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [dx$r] */
        public final ArrayList u() throws C3258cx {
            ArrayList arrayList;
            ?? r6;
            ?? rVar;
            String strK;
            char c;
            int i;
            LB0 lb0A;
            a aVar;
            ?? r7;
            a aVar2;
            Object obj;
            g gVar;
            Object obj2;
            Object obj3;
            ArrayList arrayListU;
            ArrayList arrayList2;
            ArrayList arrayList3;
            k kVar;
            String str = null;
            if (f()) {
                return null;
            }
            ?? r3 = 1;
            ArrayList arrayList4 = new ArrayList(1);
            q qVar = new q();
            while (!f() && !f()) {
                int i2 = this.b;
                ArrayList arrayList5 = qVar.a;
                boolean z = false;
                char c2 = '+';
                if (((arrayList5 == null || arrayList5.isEmpty()) ? r3 : 0) != 0) {
                    r6 = str;
                } else if (d('>')) {
                    d dVar = d.e;
                    q();
                    r6 = dVar;
                } else if (d('+')) {
                    d dVar2 = d.g;
                    q();
                    r6 = dVar2;
                } else {
                    r6 = str;
                }
                if (d('*')) {
                    rVar = new r(r6, str);
                } else {
                    String strT = t();
                    if (strT != null) {
                        r rVar2 = new r(r6, strT);
                        qVar.b += r3;
                        rVar = rVar2;
                    } else {
                        rVar = str;
                    }
                }
                while (!f()) {
                    boolean zD = d(JwtParser.SEPARATOR_CHAR);
                    b bVar = b.e;
                    if (zD) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        String strT2 = t();
                        if (strT2 == null) {
                            throw new C3258cx("Invalid \".class\" simpleSelectors");
                        }
                        rVar.a("class", bVar, strT2);
                        qVar.a();
                    } else if (d('#')) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        String strT3 = t();
                        if (strT3 == null) {
                            throw new C3258cx("Invalid \"#id\" simpleSelectors");
                        }
                        rVar.a("id", bVar, strT3);
                        qVar.b += 1000000;
                    } else if (d('[')) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        q();
                        String strT4 = t();
                        if (strT4 == null) {
                            throw new C3258cx("Invalid attribute simpleSelectors");
                        }
                        q();
                        Object obj4 = bVar;
                        if (!d('=')) {
                            if (e("~=")) {
                                obj4 = b.g;
                            } else {
                                obj4 = e("|=") ? b.h : str;
                            }
                        }
                        if (obj4 != null) {
                            q();
                            if (f()) {
                                strK = str;
                            } else {
                                strK = k();
                                if (strK == null) {
                                    strK = t();
                                }
                            }
                            if (strK == null) {
                                throw new C3258cx("Invalid attribute simpleSelectors");
                            }
                            q();
                        } else {
                            strK = str;
                        }
                        ?? r11 = obj4;
                        if (!d(']')) {
                            throw new C3258cx("Invalid attribute simpleSelectors");
                        }
                        if (obj4 == null) {
                            r11 = b.d;
                        }
                        rVar.a(strT4, r11, strK);
                        qVar.a();
                    } else {
                        rVar = rVar;
                        if (d(':')) {
                            if (rVar == 0) {
                                rVar = new r(r6, str);
                            }
                            String strT5 = t();
                            if (strT5 == null) {
                                throw new C3258cx("Invalid pseudo class");
                            }
                            i iVar = (i) i.i.get(strT5);
                            if (iVar == null) {
                                iVar = i.h;
                            }
                            switch (iVar.ordinal()) {
                                case 0:
                                    c = c2;
                                    n nVar = new n();
                                    qVar.a();
                                    obj = nVar;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 1:
                                    c = c2;
                                    m mVar = new m();
                                    qVar.a();
                                    obj = mVar;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    boolean z2 = (iVar == i.d || iVar == i.e) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                    boolean z3 = (iVar == i.e || iVar == i.g) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                    if (f()) {
                                        r7 = str;
                                        c = '+';
                                    } else {
                                        int i3 = this.b;
                                        if (d('(')) {
                                            q();
                                            if (e("odd")) {
                                                aVar = new a(2, r3 == true ? 1 : 0);
                                            } else {
                                                if (e("even")) {
                                                    aVar = new a(2, z ? 1 : 0);
                                                } else {
                                                    int i4 = (!d('+') && d('-')) ? -1 : r3 == true ? 1 : 0;
                                                    int i5 = this.b;
                                                    String str2 = this.a;
                                                    int i6 = this.c;
                                                    LB0 lb0A2 = LB0.a(i5, i6, str2);
                                                    if (lb0A2 != null) {
                                                        this.b = lb0A2.a;
                                                    }
                                                    if (d('n') || d('N')) {
                                                        if (lb0A2 == null) {
                                                            lb0A2 = new LB0(this.b, 1L);
                                                        }
                                                        q();
                                                        c = '+';
                                                        boolean zD2 = d('+');
                                                        i = (zD2 || !(zD2 = d('-'))) ? 1 : -1;
                                                        if (zD2) {
                                                            q();
                                                            lb0A = LB0.a(this.b, i6, str2);
                                                            if (lb0A != null) {
                                                                this.b = lb0A.a;
                                                            } else {
                                                                this.b = i3;
                                                            }
                                                        } else {
                                                            lb0A = null;
                                                        }
                                                    } else {
                                                        lb0A = lb0A2;
                                                        i = i4 == true ? 1 : 0;
                                                        lb0A2 = null;
                                                        c = '+';
                                                        i4 = 1;
                                                    }
                                                    aVar2 = new a(lb0A2 == null ? 0 : i4 * ((int) lb0A2.b), lb0A == null ? 0 : i * ((int) lb0A.b));
                                                    q();
                                                    r7 = aVar2;
                                                    if (!d(')')) {
                                                        this.b = i3;
                                                    }
                                                }
                                                r7 = 0;
                                            }
                                            aVar2 = aVar;
                                            c = '+';
                                            q();
                                            r7 = aVar2;
                                            if (!d(')')) {
                                                this.b = i3;
                                                r7 = 0;
                                            }
                                        } else {
                                            r7 = str;
                                            c = '+';
                                        }
                                    }
                                    if (r7 == 0) {
                                        throw new C3258cx("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    g gVar2 = new g(r7.a, r7.b, rVar.b, z2, z3);
                                    qVar.a();
                                    obj = gVar2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                    break;
                                case 6:
                                    gVar = new g(0, 1, null, true, false);
                                    qVar.a();
                                    obj2 = gVar;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 7:
                                    g gVar3 = new g(0, 1, null, false, false);
                                    qVar.a();
                                    obj3 = gVar3;
                                    obj2 = obj3;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 8:
                                    g gVar4 = new g(0, 1, rVar.b, true, true);
                                    qVar.a();
                                    obj2 = gVar4;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 9:
                                    gVar = new g(0, 1, rVar.b, false, true);
                                    qVar.a();
                                    obj2 = gVar;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 10:
                                    l lVar = new l(z, str);
                                    qVar.a();
                                    obj3 = lVar;
                                    obj2 = obj3;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 11:
                                    l lVar2 = new l(r3, rVar.b);
                                    qVar.a();
                                    obj3 = lVar2;
                                    obj2 = obj3;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    h hVar = new h();
                                    qVar.a();
                                    obj3 = hVar;
                                    obj2 = obj3;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 13:
                                    if (f()) {
                                        arrayListU = str;
                                    } else {
                                        int i7 = this.b;
                                        if (d('(')) {
                                            q();
                                            arrayListU = u();
                                            if (arrayListU != null && d(')')) {
                                                Iterator it = arrayListU.iterator();
                                                while (it.hasNext() && (arrayList2 = ((q) it.next()).a) != null) {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((r) it2.next()).d) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((f) it3.next()) instanceof j) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.b = i7;
                                            }
                                            arrayListU = str;
                                        } else {
                                            arrayListU = str;
                                        }
                                    }
                                    if (arrayListU == null) {
                                        throw new C3258cx("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    j jVar = new j();
                                    jVar.a = arrayListU;
                                    Iterator it4 = arrayListU.iterator();
                                    int i8 = Integer.MIN_VALUE;
                                    while (it4.hasNext()) {
                                        int i9 = ((q) it4.next()).b;
                                        if (i9 > i8) {
                                            i8 = i9;
                                        }
                                    }
                                    qVar.b = i8;
                                    obj3 = jVar;
                                    obj2 = obj3;
                                    c = '+';
                                    obj = obj2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                    break;
                                case 14:
                                    if (!f()) {
                                        int i10 = this.b;
                                        if (d('(')) {
                                            q();
                                            ?? arrayList6 = str;
                                            while (true) {
                                                String strT6 = t();
                                                arrayList6 = arrayList6;
                                                if (strT6 == null) {
                                                    this.b = i10;
                                                } else {
                                                    if (arrayList6 == 0) {
                                                        arrayList6 = new ArrayList();
                                                    }
                                                    arrayList6.add(strT6);
                                                    q();
                                                    if (!p()) {
                                                        if (!d(')')) {
                                                            this.b = i10;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    kVar = new k(strT5);
                                    qVar.a();
                                    obj = kVar;
                                    c = c2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                case 15:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                case 19:
                                case 20:
                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                case 22:
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    kVar = new k(strT5);
                                    qVar.a();
                                    obj = kVar;
                                    c = c2;
                                    if (rVar.d == null) {
                                        rVar.d = new ArrayList();
                                    }
                                    rVar.d.add(obj);
                                    c2 = c;
                                    str = null;
                                    r3 = 1;
                                    z = false;
                                    break;
                                default:
                                    throw new C3258cx("Unsupported pseudo class: ".concat(strT5));
                            }
                        } else {
                            if (rVar != 0) {
                                this.b = i2;
                                arrayList = qVar.a;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    arrayList4.add(qVar);
                                }
                                return arrayList4;
                            }
                            if (qVar.a == null) {
                                qVar.a = new ArrayList();
                            }
                            qVar.a.add(rVar);
                            if (!p()) {
                                arrayList4.add(qVar);
                                qVar = new q();
                            }
                            str = null;
                            r3 = 1;
                        }
                    }
                }
                if (rVar != 0) {
                    this.b = i2;
                    arrayList = qVar.a;
                    if (arrayList != null) {
                        arrayList4.add(qVar);
                    }
                    return arrayList4;
                }
                if (qVar.a == null) {
                    qVar.a = new ArrayList();
                }
                qVar.a.add(rVar);
                if (!p()) {
                    arrayList4.add(qVar);
                    qVar = new q();
                }
                str = null;
                r3 = 1;
            }
            arrayList = qVar.a;
            if (arrayList != null) {
                arrayList4.add(qVar);
            }
            return arrayList4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: dx$d */
    public static final class d {
        public static final d d;
        public static final d e;
        public static final d g;
        public static final /* synthetic */ d[] h;

        static {
            d dVar = new d("DESCENDANT", 0);
            d = dVar;
            d dVar2 = new d("CHILD", 1);
            e = dVar2;
            d dVar3 = new d("FOLLOWS", 2);
            g = dVar3;
            h = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: dx$e */
    public static final class e {
        public static final e d;
        public static final e e;
        public static final /* synthetic */ e[] g;

        static {
            e eVar = new e("all", 0);
            d = eVar;
            e eVar2 = new e("aural", 1);
            e eVar3 = new e("braille", 2);
            e eVar4 = new e("embossed", 3);
            e eVar5 = new e("handheld", 4);
            e eVar6 = new e("print", 5);
            e eVar7 = new e("projection", 6);
            e eVar8 = new e("screen", 7);
            e = eVar8;
            g = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, new e("speech", 8), new e("tty", 9), new e("tv", 10)};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) g.clone();
        }
    }

    /* JADX INFO: renamed from: dx$f */
    public interface f {
        boolean a(XB1.K k);
    }

    /* JADX INFO: renamed from: dx$g */
    public static class g implements f {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;

        public g(int i, int i2, String str, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            int i;
            int i2;
            boolean z = this.d;
            String strN = this.e;
            if (z && strN == null) {
                strN = k.n();
            }
            XB1.I i3 = k.b;
            if (i3 != null) {
                Iterator<XB1.M> it = i3.c().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    XB1.K k2 = (XB1.K) it.next();
                    if (k2 == k) {
                        i2 = i;
                    }
                    if (strN == null || k2.n().equals(strN)) {
                        i++;
                    }
                }
            } else {
                i = 1;
                i2 = 0;
            }
            int i4 = this.c ? i2 + 1 : i - i2;
            int i5 = this.a;
            int i6 = this.b;
            if (i5 == 0) {
                if (i4 == i6) {
                    return true;
                }
                return false;
            }
            int i7 = i4 - i6;
            if (i7 % i5 == 0 && (Integer.signum(i7) == 0 || Integer.signum(i7) == Integer.signum(i5))) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String str = this.c ? "" : "last-";
            boolean z = this.d;
            int i = this.b;
            int i2 = this.a;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: dx$h */
    public static class h implements f {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            return !(k instanceof XB1.I) || ((XB1.I) k).c().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: dx$i */
    public static final class i {
        public static final i d;
        public static final i e;
        public static final i g;
        public static final i h;
        public static final HashMap i;
        public static final /* synthetic */ i[] j;

        /* JADX INFO: Fake field, exist only in values array */
        i EF1;

        static {
            i iVar = new i("target", 0);
            i iVar2 = new i("root", 1);
            i iVar3 = new i("nth_child", 2);
            d = iVar3;
            i iVar4 = new i("nth_last_child", 3);
            i iVar5 = new i("nth_of_type", 4);
            e = iVar5;
            i iVar6 = new i("nth_last_of_type", 5);
            g = iVar6;
            i iVar7 = new i("first_child", 6);
            i iVar8 = new i("last_child", 7);
            i iVar9 = new i("first_of_type", 8);
            i iVar10 = new i("last_of_type", 9);
            i iVar11 = new i("only_child", 10);
            i iVar12 = new i("only_of_type", 11);
            i iVar13 = new i("empty", 12);
            i iVar14 = new i("not", 13);
            i iVar15 = new i("lang", 14);
            i iVar16 = new i("link", 15);
            i iVar17 = new i("visited", 16);
            i iVar18 = new i("hover", 17);
            i iVar19 = new i(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            i iVar20 = new i("focus", 19);
            i iVar21 = new i("enabled", 20);
            i iVar22 = new i("disabled", 21);
            i iVar23 = new i("checked", 22);
            i iVar24 = new i("indeterminate", 23);
            i iVar25 = new i("UNSUPPORTED", 24);
            h = iVar25;
            j = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25};
            i = new HashMap();
            for (i iVar26 : values()) {
                if (iVar26 != h) {
                    i.put(iVar26.name().replace('_', '-'), iVar26);
                }
            }
        }

        public i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) j.clone();
        }
    }

    /* JADX INFO: renamed from: dx$j */
    public static class j implements f {
        public List<q> a;

        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            Iterator<q> it = this.a.iterator();
            while (it.hasNext()) {
                if (C3467dx.g(it.next(), k)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return "not(" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: dx$k */
    public static class k implements f {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            return false;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: dx$l */
    public static class l implements f {
        public final boolean a;
        public final String b;

        public l(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            int i;
            boolean z = this.a;
            String strN = this.b;
            if (z && strN == null) {
                strN = k.n();
            }
            XB1.I i2 = k.b;
            if (i2 != null) {
                Iterator<XB1.M> it = i2.c().iterator();
                i = 0;
                while (it.hasNext()) {
                    XB1.K k2 = (XB1.K) it.next();
                    if (strN == null || k2.n().equals(strN)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.a ? C5807oq.b(new StringBuilder("only-of-type <"), this.b, ">") : "only-child";
        }
    }

    /* JADX INFO: renamed from: dx$m */
    public static class m implements f {
        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            return k.b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* JADX INFO: renamed from: dx$n */
    public static class n implements f {
        @Override // defpackage.C3467dx.f
        public final boolean a(XB1.K k) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    /* JADX INFO: renamed from: dx$o */
    public static class o {
        public q a;
        public XB1.D b;
        public s c;

        public final String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    /* JADX INFO: renamed from: dx$p */
    public static class p {
        public ArrayList a = null;

        public final void a(o oVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (((o) this.a.get(i)).a.b > oVar.a.b) {
                    this.a.add(i, oVar);
                    return;
                }
            }
            this.a.add(oVar);
        }

        public final void b(p pVar) {
            if (pVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(pVar.a.size());
            }
            Iterator it = pVar.a.iterator();
            while (it.hasNext()) {
                a((o) it.next());
            }
        }

        public final String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(((o) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: dx$q */
    public static class q {
        public ArrayList a = null;
        public int b = 0;

        public final void a() {
            this.b += CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append((r) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: dx$r */
    public static class r {
        public final d a;
        public final String b;
        public ArrayList c = null;
        public ArrayList d = null;

        public r(d dVar, String str) {
            this.a = null;
            this.b = null;
            this.a = dVar == null ? d.d : dVar;
            this.b = str;
        }

        public final void a(String str, b bVar, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new a(str, bVar, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            d dVar = d.e;
            d dVar2 = this.a;
            if (dVar2 == dVar) {
                sb.append("> ");
            } else if (dVar2 == d.g) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            ArrayList<a> arrayList = this.c;
            if (arrayList != null) {
                for (a aVar : arrayList) {
                    sb.append('[');
                    sb.append(aVar.a);
                    int iOrdinal = aVar.b.ordinal();
                    String str2 = aVar.c;
                    if (iOrdinal == 1) {
                        sb.append('=');
                        sb.append(str2);
                    } else if (iOrdinal == 2) {
                        sb.append("~=");
                        sb.append(str2);
                    } else if (iOrdinal == 3) {
                        sb.append("|=");
                        sb.append(str2);
                    }
                    sb.append(']');
                }
            }
            ArrayList<f> arrayList2 = this.d;
            if (arrayList2 != null) {
                for (f fVar : arrayList2) {
                    sb.append(':');
                    sb.append(fVar);
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: dx$s */
    public static final class s {
        public static final s d;
        public static final /* synthetic */ s[] e;

        static {
            s sVar = new s("Document", 0);
            d = sVar;
            e = new s[]{sVar, new s("RenderOptions", 1)};
        }

        public s() {
            throw null;
        }

        public static s valueOf(String str) {
            return (s) Enum.valueOf(s.class, str);
        }

        public static s[] values() {
            return (s[]) e.clone();
        }
    }

    public static int a(ArrayList arrayList, int i2, XB1.K k2) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i2);
        XB1.I i4 = k2.b;
        if (obj != i4) {
            return -1;
        }
        Iterator<XB1.M> it = i4.c().iterator();
        while (it.hasNext()) {
            if (it.next() == k2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static ArrayList c(c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.f()) {
            String strSubstring = null;
            if (!cVar.f()) {
                int i2 = cVar.b;
                String str = cVar.a;
                char cCharAt = str.charAt(i2);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cVar.b = i2;
                } else {
                    int iA = cVar.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = cVar.a();
                    }
                    strSubstring = str.substring(i2, cVar.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(e.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(q qVar, int i2, ArrayList arrayList, int i3, XB1.K k2) {
        r rVar = (r) qVar.a.get(i2);
        if (!i(rVar, k2)) {
            return false;
        }
        d dVar = d.d;
        d dVar2 = rVar.a;
        if (dVar2 == dVar) {
            if (i2 != 0) {
                while (i3 >= 0) {
                    if (!h(qVar, i2 - 1, arrayList, i3)) {
                        i3--;
                    }
                }
                return false;
            }
            return true;
        }
        if (dVar2 == d.e) {
            return h(qVar, i2 - 1, arrayList, i3);
        }
        int iA = a(arrayList, i3, k2);
        if (iA <= 0) {
            return false;
        }
        return f(qVar, i2 - 1, arrayList, i3, (XB1.K) k2.b.c().get(iA - 1));
    }

    public static boolean g(q qVar, XB1.K k2) {
        ArrayList arrayList = new ArrayList();
        Object obj = k2.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((XB1.M) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = qVar.a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return i((r) qVar.a.get(0), k2);
        }
        ArrayList arrayList3 = qVar.a;
        return f(qVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, k2);
    }

    public static boolean h(q qVar, int i2, ArrayList arrayList, int i3) {
        r rVar = (r) qVar.a.get(i2);
        XB1.K k2 = (XB1.K) arrayList.get(i3);
        if (!i(rVar, k2)) {
            return false;
        }
        d dVar = d.d;
        d dVar2 = rVar.a;
        if (dVar2 == dVar) {
            if (i2 != 0) {
                while (i3 > 0) {
                    i3--;
                    if (h(qVar, i2 - 1, arrayList, i3)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (dVar2 == d.e) {
            return h(qVar, i2 - 1, arrayList, i3 - 1);
        }
        int iA = a(arrayList, i3, k2);
        if (iA <= 0) {
            return false;
        }
        return f(qVar, i2 - 1, arrayList, i3, (XB1.K) k2.b.c().get(iA - 1));
    }

    public static boolean i(r rVar, XB1.K k2) {
        ArrayList arrayList;
        String str = rVar.b;
        if (str != null && !str.equals(k2.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<a> arrayList2 = rVar.c;
        if (arrayList2 != null) {
            for (a aVar : arrayList2) {
                String str2 = aVar.a;
                String str3 = aVar.c;
                if (str2.equals("id")) {
                    if (!str3.equals(k2.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = k2.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = rVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).a(k2)) {
                return false;
            }
        }
        return true;
    }

    public final void b(p pVar, c cVar) throws C3258cx {
        int iIntValue;
        int iR;
        String strT = cVar.t();
        cVar.q();
        if (strT == null) {
            throw new C3258cx("Invalid '@' rule");
        }
        int i2 = 0;
        if (!this.a && strT.equals("media")) {
            ArrayList arrayListC = c(cVar);
            if (!cVar.d('{')) {
                throw new C3258cx("Invalid @media rule: missing rule set");
            }
            cVar.q();
            e eVar = e.e;
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e(cVar);
                    break;
                }
                e eVar2 = (e) it.next();
                if (eVar2 == e.d || eVar2 == eVar) {
                    this.a = true;
                    pVar.b(e(cVar));
                    this.a = false;
                    break;
                }
            }
            if (!cVar.f() && !cVar.d('}')) {
                throw new C3258cx("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.a || !strT.equals("import")) {
            b0.e("AndroidSVG CSSParser", "Ignoring @" + strT + " rule");
            while (!cVar.f() && ((iIntValue = cVar.h().intValue()) != 59 || i2 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i2 > 0 && (i2 = i2 - 1) == 0) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
        } else {
            String strS = null;
            if (!cVar.f()) {
                int i3 = cVar.b;
                if (cVar.e("url(")) {
                    cVar.q();
                    String strS2 = cVar.s();
                    if (strS2 == null) {
                        StringBuilder sb = new StringBuilder();
                        while (!cVar.f()) {
                            int i4 = cVar.b;
                            String str = cVar.a;
                            char cCharAt = str.charAt(i4);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C2673aC1.h.g(cCharAt) || Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            cVar.b++;
                            if (cCharAt == '\\') {
                                if (!cVar.f()) {
                                    int i5 = cVar.b;
                                    cVar.b = i5 + 1;
                                    cCharAt = str.charAt(i5);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = c.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i6 = 1; i6 <= 5 && !cVar.f() && (iR = c.r(str.charAt(cVar.b))) != -1; i6++) {
                                                cVar.b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strS2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strS2 == null) {
                        cVar.b = i3;
                    } else {
                        cVar.q();
                        if (cVar.f() || cVar.e(")")) {
                            strS = strS2;
                        } else {
                            cVar.b = i3;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = cVar.s();
            }
            if (strS == null) {
                throw new C3258cx("Invalid @import rule: expected string or url()");
            }
            cVar.q();
            c(cVar);
            if (!cVar.f() && !cVar.d(';')) {
                throw new C3258cx("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.q();
    }

    public final boolean d(p pVar, c cVar) throws C3258cx {
        ArrayList<q> arrayListU = cVar.u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!cVar.d('{')) {
            throw new C3258cx("Malformed rule block: expected '{'");
        }
        cVar.q();
        XB1.D d2 = new XB1.D();
        do {
            String strT = cVar.t();
            cVar.q();
            if (!cVar.d(':')) {
                throw new C3258cx("Expected ':'");
            }
            cVar.q();
            String strSubstring = null;
            if (!cVar.f()) {
                int i2 = cVar.b;
                String str = cVar.a;
                int iCharAt = str.charAt(i2);
                int i3 = i2;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C2673aC1.h.g(iCharAt)) {
                        i3 = cVar.b + 1;
                    }
                    iCharAt = cVar.a();
                }
                if (cVar.b > i2) {
                    strSubstring = str.substring(i2, i3);
                } else {
                    cVar.b = i2;
                }
            }
            if (strSubstring == null) {
                throw new C3258cx("Expected property value");
            }
            cVar.q();
            if (cVar.d('!')) {
                cVar.q();
                if (!cVar.e("important")) {
                    throw new C3258cx("Malformed rule set: found unexpected '!'");
                }
                cVar.q();
            }
            cVar.d(';');
            C2673aC1.D(d2, strT, strSubstring);
            cVar.q();
            if (cVar.f()) {
                break;
            }
        } while (!cVar.d('}'));
        cVar.q();
        for (q qVar : arrayListU) {
            o oVar = new o();
            oVar.a = qVar;
            oVar.b = d2;
            oVar.c = s.d;
            pVar.a(oVar);
        }
        return true;
    }

    public final p e(c cVar) {
        p pVar = new p();
        while (!cVar.f()) {
            try {
                if (!cVar.e("<!--") && !cVar.e("-->")) {
                    if (!cVar.d('@')) {
                        if (!d(pVar, cVar)) {
                            break;
                        }
                    } else {
                        b(pVar, cVar);
                    }
                }
            } catch (C3258cx e2) {
                b0.c("AndroidSVG CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
            }
        }
        return pVar;
    }
}

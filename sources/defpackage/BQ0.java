package defpackage;

import com.appsflyer.share.attribution.RequestError;

/* JADX INFO: loaded from: classes3.dex */
public final class BQ0 extends M {
    public final AQ0 a;
    public boolean b;
    public int c;

    public static class a extends N {
        /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Switch 'out' block B:40:0x0091 for B:25:0x0057 already processed. Defaulting to fallback option. */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            StringBuilder sb;
            char c;
            c cVar;
            char cCharAt;
            b bVar;
            char c2;
            int i;
            char cCharAt2;
            InterfaceC2024Ss interfaceC2024Ss = aVar.a;
            int i2 = n20.g;
            if (i2 < 4) {
                int i3 = n20.e;
                int i4 = n20.c + i2;
                if (interfaceC2024Ss instanceof C1427Lb1) {
                    sb = ((C1427Lb1) interfaceC2024Ss).b.b;
                    if (sb.length() == 0) {
                        sb = null;
                    }
                } else {
                    sb = null;
                }
                boolean z = sb != null;
                CharSequence charSequence = n20.a;
                char cCharAt3 = charSequence.charAt(i3);
                if (cCharAt3 == '*' || cCharAt3 == '+' || cCharAt3 == '-') {
                    c = 0;
                    int i5 = i3 + 1;
                    if (i5 >= charSequence.length() || (cCharAt = charSequence.charAt(i5)) == '\t' || cCharAt == ' ') {
                        C1329Jv c1329Jv = new C1329Jv();
                        c1329Jv.g = cCharAt3;
                        cVar = new c(c1329Jv, i5);
                    } else {
                        cVar = null;
                    }
                } else {
                    int length = charSequence.length();
                    int i6 = i3;
                    int i7 = 0;
                    while (true) {
                        if (i6 < length) {
                            char cCharAt4 = charSequence.charAt(i6);
                            c = 0;
                            if (cCharAt4 != ')' && cCharAt4 != '.') {
                                switch (cCharAt4) {
                                    case '0':
                                    case '1':
                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i7++;
                                        if (i7 <= 9) {
                                            i6++;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            } else if (i7 >= 1 && ((i = i6 + 1) >= charSequence.length() || (cCharAt2 = charSequence.charAt(i)) == '\t' || cCharAt2 == ' ')) {
                                String string = charSequence.subSequence(i3, i6).toString();
                                C4905ka1 c4905ka1 = new C4905ka1();
                                c4905ka1.g = Integer.parseInt(string);
                                c4905ka1.h = cCharAt4;
                                cVar = new c(c4905ka1, i);
                            }
                        } else {
                            c = 0;
                        }
                        cVar = null;
                    }
                }
                if (cVar == null) {
                    bVar = null;
                } else {
                    int i8 = cVar.b;
                    int i9 = (i8 - i3) + i4;
                    int length2 = charSequence.length();
                    int i10 = i9;
                    while (true) {
                        if (i8 >= length2) {
                            c2 = c;
                        } else {
                            char cCharAt5 = charSequence.charAt(i8);
                            if (cCharAt5 == '\t') {
                                i10 = (4 - (i10 % 4)) + i10;
                            } else if (cCharAt5 == ' ') {
                                i10++;
                            } else {
                                c2 = 1;
                            }
                            i8++;
                        }
                    }
                    AQ0 aq0 = cVar.a;
                    if (!z || ((!(aq0 instanceof C4905ka1) || ((C4905ka1) aq0).g == 1) && c2 != 0)) {
                        if (c2 == 0 || i10 - i9 > 4) {
                            i10 = i9 + 1;
                        }
                        bVar = new b(aq0, i10);
                    } else {
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    int i11 = n20.c;
                    int i12 = bVar.b;
                    JQ0 jq0 = new JQ0(i12 - i11);
                    boolean z2 = interfaceC2024Ss instanceof BQ0;
                    AQ0 aq1 = bVar.a;
                    if (z2) {
                        AQ0 aq2 = ((BQ0) interfaceC2024Ss).a;
                        if ((((aq2 instanceof C1329Jv) && (aq1 instanceof C1329Jv)) ? Character.valueOf(((C1329Jv) aq2).g).equals(Character.valueOf(((C1329Jv) aq1).g)) : ((aq2 instanceof C4905ka1) && (aq1 instanceof C4905ka1)) ? Character.valueOf(((C4905ka1) aq2).h).equals(Character.valueOf(((C4905ka1) aq1).h)) : c) != 0) {
                            InterfaceC2024Ss[] interfaceC2024SsArr = new InterfaceC2024Ss[1];
                            interfaceC2024SsArr[c] = jq0;
                            C3037bt c3037bt = new C3037bt(interfaceC2024SsArr);
                            c3037bt.c = i12;
                            return c3037bt;
                        }
                    }
                    BQ0 bq0 = new BQ0(aq1);
                    aq1.f = true;
                    InterfaceC2024Ss[] interfaceC2024SsArr2 = new InterfaceC2024Ss[2];
                    interfaceC2024SsArr2[c] = bq0;
                    interfaceC2024SsArr2[1] = jq0;
                    C3037bt c3037bt2 = new C3037bt(interfaceC2024SsArr2);
                    c3037bt2.c = i12;
                    return c3037bt2;
                }
            }
            return null;
        }
    }

    public static class b {
        public final AQ0 a;
        public final int b;

        public b(AQ0 aq0, int i) {
            this.a = aq0;
            this.b = i;
        }
    }

    public static class c {
        public final AQ0 a;
        public final int b;

        public c(AQ0 aq0, int i) {
            this.a = aq0;
            this.b = i;
        }
    }

    public BQ0(AQ0 aq0) {
        this.a = aq0;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final boolean a() {
        return true;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        if (n20.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return C1946Rs.a(n20.b);
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final boolean e(AbstractC1634Ns abstractC1634Ns) {
        if (!(abstractC1634Ns instanceof IQ0)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.f = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }
}

package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Lb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1427Lb1 extends M {
    public final C1349Kb1 a = new C1349Kb1();
    public final C6137qQ0 b = new C6137qQ0();

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void b() {
        if (this.b.b.length() == 0) {
            this.a.f();
        }
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        if (n20.h) {
            return null;
        }
        return C1946Rs.a(n20.b);
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void g(C7348wA0 c7348wA0) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            c7348wA0.f(sb.toString(), this.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void h(CharSequence charSequence) {
        int iN;
        int i;
        C6137qQ0 c6137qQ0 = this.b;
        StringBuilder sb = c6137qQ0.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iN2 = 0;
        while (iN2 < charSequence.length()) {
            int iOrdinal = c6137qQ0.a.ordinal();
            if (iOrdinal == 0) {
                int iN3 = U0.n(charSequence, iN2, charSequence.length());
                if (iN3 >= charSequence.length() || charSequence.charAt(iN3) != '[') {
                    iN2 = -1;
                } else {
                    c6137qQ0.a = C6137qQ0.a.e;
                    c6137qQ0.d = new StringBuilder();
                    iN2 = iN3 + 1;
                    if (iN2 >= charSequence.length()) {
                        c6137qQ0.d.append('\n');
                    }
                }
            } else if (iOrdinal == 1) {
                iN = C6561sS.n(iN2, charSequence);
                if (iN == -1) {
                    iN2 = -1;
                } else {
                    c6137qQ0.d.append(charSequence, iN2, iN);
                    if (iN >= charSequence.length()) {
                        c6137qQ0.d.append('\n');
                        iN2 = iN;
                    } else if (charSequence.charAt(iN) != ']' || (i = iN + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || c6137qQ0.d.length() > 999) {
                        iN2 = -1;
                    } else {
                        String string = c6137qQ0.d.toString();
                        Pattern pattern = T70.a;
                        String strReplaceAll = T70.c.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iN2 = -1;
                        } else {
                            c6137qQ0.e = strReplaceAll;
                            c6137qQ0.a = C6137qQ0.a.g;
                            iN2 = U0.n(charSequence, iN + 2, charSequence.length());
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                C6137qQ0.a aVar = C6137qQ0.a.d;
                if (iOrdinal == 3) {
                    iN2 = U0.n(charSequence, iN2, charSequence.length());
                    if (iN2 >= charSequence.length()) {
                        c6137qQ0.a = aVar;
                    } else {
                        c6137qQ0.g = (char) 0;
                        char cCharAt = charSequence.charAt(iN2);
                        if (cCharAt == '\"' || cCharAt == '\'') {
                            c6137qQ0.g = cCharAt;
                        } else if (cCharAt == '(') {
                            c6137qQ0.g = ')';
                        }
                        if (c6137qQ0.g != 0) {
                            c6137qQ0.a = C6137qQ0.a.i;
                            c6137qQ0.h = new StringBuilder();
                            iN2++;
                            if (iN2 == charSequence.length()) {
                                c6137qQ0.h.append('\n');
                            }
                        } else {
                            c6137qQ0.a();
                            c6137qQ0.a = aVar;
                        }
                    }
                } else if (iOrdinal == 4) {
                    iN = C6561sS.o(charSequence, iN2, c6137qQ0.g);
                    if (iN == -1) {
                        iN2 = -1;
                    } else {
                        c6137qQ0.h.append(charSequence.subSequence(iN2, iN));
                        if (iN >= charSequence.length()) {
                            c6137qQ0.h.append('\n');
                            iN2 = iN;
                        } else {
                            iN2 = U0.n(charSequence, iN + 1, charSequence.length());
                            if (iN2 != charSequence.length()) {
                                iN2 = -1;
                            } else {
                                c6137qQ0.i = true;
                                c6137qQ0.a();
                                sb.setLength(0);
                                c6137qQ0.a = aVar;
                            }
                        }
                    }
                } else if (iOrdinal == 5) {
                    return;
                }
            } else {
                int iN4 = U0.n(charSequence, iN2, charSequence.length());
                int iM = C6561sS.m(iN4, charSequence);
                if (iM != -1) {
                    c6137qQ0.f = charSequence.charAt(iN4) == '<' ? charSequence.subSequence(iN4 + 1, iM - 1).toString() : charSequence.subSequence(iN4, iM).toString();
                    iN2 = U0.n(charSequence, iM, charSequence.length());
                    if (iN2 >= charSequence.length()) {
                        c6137qQ0.i = true;
                        sb.setLength(0);
                    } else if (iN2 == iM) {
                        iN2 = -1;
                    }
                    c6137qQ0.a = C6137qQ0.a.h;
                } else {
                    iN2 = -1;
                }
            }
            if (iN2 == -1) {
                c6137qQ0.a = C6137qQ0.a.j;
                return;
            }
        }
    }
}

package defpackage;

/* JADX INFO: renamed from: ho0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4281ho0 extends M {
    public final C4071go0 a;
    public final String b;

    /* JADX INFO: renamed from: ho0$a */
    public static class a extends N {
        /* JADX WARN: Code duplicated, block: B:43:0x0094  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            C4281ho0 c4281ho0;
            int i;
            StringBuilder sb;
            if (n20.g < 4) {
                CharSequence charSequence = n20.a;
                int i2 = n20.e;
                int iM = U0.m('#', i2, charSequence.length(), charSequence) - i2;
                if (iM == 0 || iM > 6) {
                    c4281ho0 = null;
                } else {
                    int i3 = i2 + iM;
                    if (i3 >= charSequence.length()) {
                        c4281ho0 = new C4281ho0(iM, "");
                    } else {
                        char cCharAt = charSequence.charAt(i3);
                        if (cCharAt == ' ' || cCharAt == '\t') {
                            int length = charSequence.length() - 1;
                            while (true) {
                                if (length >= i3) {
                                    char cCharAt2 = charSequence.charAt(length);
                                    if (cCharAt2 != '\t' && cCharAt2 != ' ') {
                                        break;
                                    }
                                    length--;
                                } else {
                                    length = i3 - 1;
                                    break;
                                }
                            }
                            int i4 = length;
                            while (true) {
                                if (i4 < i3) {
                                    i4 = i3 - 1;
                                    break;
                                }
                                if (charSequence.charAt(i4) != '#') {
                                    break;
                                }
                                i4--;
                            }
                            int i5 = i4;
                            while (true) {
                                if (i5 >= i3) {
                                    char cCharAt3 = charSequence.charAt(i5);
                                    if (cCharAt3 != '\t' && cCharAt3 != ' ') {
                                        break;
                                    }
                                    i5--;
                                } else {
                                    i5 = i3 - 1;
                                    break;
                                }
                            }
                            c4281ho0 = i5 != i4 ? new C4281ho0(iM, charSequence.subSequence(i3, i5 + 1).toString()) : new C4281ho0(iM, charSequence.subSequence(i3, length + 1).toString());
                        } else {
                            c4281ho0 = null;
                        }
                    }
                }
                if (c4281ho0 != null) {
                    C3037bt c3037bt = new C3037bt(c4281ho0);
                    c3037bt.b = charSequence.length();
                    return c3037bt;
                }
                char cCharAt4 = charSequence.charAt(i2);
                if (cCharAt4 == '-') {
                    if (U0.n(charSequence, U0.m('-', i2 + 1, charSequence.length(), charSequence), charSequence.length()) >= charSequence.length()) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                } else if (cCharAt4 != '=') {
                    i = 0;
                } else if (U0.n(charSequence, U0.m('=', i2 + 1, charSequence.length(), charSequence), charSequence.length()) >= charSequence.length()) {
                    i = 1;
                } else if (U0.n(charSequence, U0.m('-', i2 + 1, charSequence.length(), charSequence), charSequence.length()) >= charSequence.length()) {
                    i = 2;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    InterfaceC2024Ss interfaceC2024Ss = aVar.a;
                    if (interfaceC2024Ss instanceof C1427Lb1) {
                        sb = ((C1427Lb1) interfaceC2024Ss).b.b;
                        if (sb.length() == 0) {
                            sb = null;
                        }
                    } else {
                        sb = null;
                    }
                    if (sb != null) {
                        C3037bt c3037bt2 = new C3037bt(new C4281ho0(i, sb.toString()));
                        c3037bt2.b = charSequence.length();
                        c3037bt2.d = true;
                        return c3037bt2;
                    }
                }
            }
            return null;
        }
    }

    public C4281ho0(int i, String str) {
        C4071go0 c4071go0 = new C4071go0();
        this.a = c4071go0;
        c4071go0.f = i;
        this.b = str;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        return null;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void g(C7348wA0 c7348wA0) {
        c7348wA0.f(this.b, this.a);
    }
}

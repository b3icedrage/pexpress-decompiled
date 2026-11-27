package defpackage;

/* JADX INFO: renamed from: bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2976bc0 extends M {
    public final C2752ac0 a;
    public String b;
    public final StringBuilder c;

    /* JADX INFO: renamed from: bc0$a */
    public static class a extends N {
        /* JADX WARN: Code duplicated, block: B:32:0x0054  */
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            C2976bc0 c2976bc0;
            int i = n20.g;
            if (i < 4) {
                int i2 = n20.e;
                CharSequence charSequence = n20.a;
                int length = charSequence.length();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = i2; i5 < length; i5++) {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt == '`') {
                        i3++;
                    } else {
                        if (cCharAt != '~') {
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 >= 3 && i4 == 0) {
                    int i6 = i2 + i3;
                    int length2 = charSequence.length();
                    while (true) {
                        if (i6 >= length2) {
                            i6 = -1;
                            break;
                        }
                        if (charSequence.charAt(i6) == '`') {
                            break;
                        }
                        i6++;
                    }
                    if (i6 != -1) {
                        c2976bc0 = null;
                    } else {
                        c2976bc0 = new C2976bc0('`', i3, i);
                    }
                } else if (i4 < 3 || i3 != 0) {
                    c2976bc0 = null;
                } else {
                    c2976bc0 = new C2976bc0('~', i4, i);
                }
                if (c2976bc0 != null) {
                    C3037bt c3037bt = new C3037bt(c2976bc0);
                    c3037bt.b = i2 + c2976bc0.a.g;
                    return c3037bt;
                }
            }
            return null;
        }
    }

    public C2976bc0(char c, int i, int i2) {
        C2752ac0 c2752ac0 = new C2752ac0();
        this.a = c2752ac0;
        this.c = new StringBuilder();
        c2752ac0.f = c;
        c2752ac0.g = i;
        c2752ac0.h = i2;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void b() {
        String strA = T70.a(this.b.trim());
        C2752ac0 c2752ac0 = this.a;
        c2752ac0.i = strA;
        c2752ac0.j = this.c.toString();
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        int i = n20.e;
        int i2 = n20.b;
        CharSequence charSequence = n20.a;
        int i3 = n20.g;
        C2752ac0 c2752ac0 = this.a;
        if (i3 < 4) {
            char c = c2752ac0.f;
            int i4 = c2752ac0.g;
            int iM = U0.m(c, i, charSequence.length(), charSequence) - i;
            if (iM >= i4 && U0.n(charSequence, i + iM, charSequence.length()) == charSequence.length()) {
                return new C1946Rs(-1, true, -1);
            }
        }
        int length = charSequence.length();
        for (int i5 = c2752ac0.h; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C1946Rs.a(i2);
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void h(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }
}

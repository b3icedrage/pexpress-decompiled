package defpackage;

/* JADX INFO: renamed from: rY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6371rY1 extends M {
    public final C6162qY1 a = new C6162qY1();

    /* JADX INFO: renamed from: rY1$a */
    public static class a extends N {
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            if (n20.g >= 4) {
                return null;
            }
            CharSequence charSequence = n20.a;
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = n20.e; i4 < length; i4++) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt != '\t' && cCharAt != ' ') {
                    if (cCharAt == '*') {
                        i3++;
                    } else if (cCharAt == '-') {
                        i++;
                    } else {
                        if (cCharAt != '_') {
                            return null;
                        }
                        i2++;
                    }
                }
            }
            if ((i < 3 || i2 != 0 || i3 != 0) && ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0))) {
                return null;
            }
            C3037bt c3037bt = new C3037bt(new C6371rY1());
            c3037bt.b = charSequence.length();
            return c3037bt;
        }
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        return null;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }
}

package defpackage;

/* JADX INFO: renamed from: Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2258Vs extends M {
    public final C2180Us a = new C2180Us();

    /* JADX INFO: renamed from: Vs$a */
    public static class a extends N {
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            char cCharAt;
            int i = n20.e;
            if (!C2258Vs.i(n20, i)) {
                return null;
            }
            int i2 = n20.c + n20.g;
            int i3 = i2 + 1;
            CharSequence charSequence = n20.a;
            int i4 = i + 1;
            if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
                i3 = i2 + 2;
            }
            C3037bt c3037bt = new C3037bt(new C2258Vs());
            c3037bt.c = i3;
            return c3037bt;
        }
    }

    public static boolean i(N20 n20, int i) {
        CharSequence charSequence = n20.a;
        return n20.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        char cCharAt;
        int i = n20.e;
        if (!i(n20, i)) {
            return null;
        }
        int i2 = n20.c + n20.g;
        int i3 = i2 + 1;
        CharSequence charSequence = n20.a;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new C1946Rs(-1, false, i3);
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }
}
